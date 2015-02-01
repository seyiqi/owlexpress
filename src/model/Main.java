package model;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;


/**
 * Main Class
 * */
public class Main {
	
	/**
	 * Execution method
	 * @throws Exception 
	 * */
	public static void main(String args[]) throws Exception{
		
		/* Input Parse */
		if (args.length != 2) {
			System.err.println("Illegal argument: java xxx.class <url> <outputPath>");
		}
		String url = args[0];
		String outputPath = args[1];
		
		/* Cache url */
		URL website = new URL(url);
		ReadableByteChannel rbc = Channels.newChannel(website.openStream());
		FileOutputStream fos = new FileOutputStream("input.JPG");
		fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		
		ImageMatcher matcher = new ImageMatcher();
		String res = matcher.parseImage("input.JPG");
		System.out.println("res = " + res);
		fos.close();
		
		/* Reformat to JSON style */
		String output = "{\"success\":true,\"img\":\"" + url +"\",\"value\":\"" + res +"\"}";
		System.out.println("output = " + output);
		
		/* Save to output.txt */
		PrintWriter out = new PrintWriter(outputPath);
		out.println(res);
		out.close();
	}
}