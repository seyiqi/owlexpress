package model;

/**
 * Class that represents a search result
 * */
public class Results {
    private String college;
    private String email;
    private String firstName;
    private String lastName;
    private String netid;
    
    public Results(String college, String email, String firstName, String lastName, String netid){
    	setCollege(college);
    	setEmail(email);
    	setFirstName(firstName);
    	setLastName(lastName);
    	setNetid(netid);
    	
    }

    public String getCollege() {
        return this.college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
    
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNetid() {
        return this.netid;
    }

    public void setNetid(String netid) {
        this.netid = netid;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public int hashCode(){
		return netid.hashCode();
	}
	
	@Override
	public boolean equals(Object o){
		return o.hashCode() == this.hashCode();
	}
	
	
	@Override
	public String toString(){
		return firstName + " " + lastName;
	}
}
