# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.0

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list

# Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /opt/local/bin/cmake

# The command to remove a file.
RM = /opt/local/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build

# Include any dependencies generated for this target.
include modules/highgui/CMakeFiles/opencv_highgui.dir/depend.make

# Include the progress variables for this target.
include modules/highgui/CMakeFiles/opencv_highgui.dir/progress.make

# Include the compile flags for this target's objects.
include modules/highgui/CMakeFiles/opencv_highgui.dir/flags.make

modules/highgui/CMakeFiles/opencv_highgui.dir/src/window.cpp.o: modules/highgui/CMakeFiles/opencv_highgui.dir/flags.make
modules/highgui/CMakeFiles/opencv_highgui.dir/src/window.cpp.o: ../modules/highgui/src/window.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/CMakeFiles $(CMAKE_PROGRESS_1)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object modules/highgui/CMakeFiles/opencv_highgui.dir/src/window.cpp.o"
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/highgui && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/opencv_highgui.dir/src/window.cpp.o -c /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/modules/highgui/src/window.cpp

modules/highgui/CMakeFiles/opencv_highgui.dir/src/window.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/opencv_highgui.dir/src/window.cpp.i"
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/highgui && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/modules/highgui/src/window.cpp > CMakeFiles/opencv_highgui.dir/src/window.cpp.i

modules/highgui/CMakeFiles/opencv_highgui.dir/src/window.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/opencv_highgui.dir/src/window.cpp.s"
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/highgui && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/modules/highgui/src/window.cpp -o CMakeFiles/opencv_highgui.dir/src/window.cpp.s

modules/highgui/CMakeFiles/opencv_highgui.dir/src/window.cpp.o.requires:
.PHONY : modules/highgui/CMakeFiles/opencv_highgui.dir/src/window.cpp.o.requires

modules/highgui/CMakeFiles/opencv_highgui.dir/src/window.cpp.o.provides: modules/highgui/CMakeFiles/opencv_highgui.dir/src/window.cpp.o.requires
	$(MAKE) -f modules/highgui/CMakeFiles/opencv_highgui.dir/build.make modules/highgui/CMakeFiles/opencv_highgui.dir/src/window.cpp.o.provides.build
.PHONY : modules/highgui/CMakeFiles/opencv_highgui.dir/src/window.cpp.o.provides

modules/highgui/CMakeFiles/opencv_highgui.dir/src/window.cpp.o.provides.build: modules/highgui/CMakeFiles/opencv_highgui.dir/src/window.cpp.o

modules/highgui/CMakeFiles/opencv_highgui.dir/src/window_cocoa.mm.o: modules/highgui/CMakeFiles/opencv_highgui.dir/flags.make
modules/highgui/CMakeFiles/opencv_highgui.dir/src/window_cocoa.mm.o: ../modules/highgui/src/window_cocoa.mm
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/CMakeFiles $(CMAKE_PROGRESS_2)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object modules/highgui/CMakeFiles/opencv_highgui.dir/src/window_cocoa.mm.o"
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/highgui && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/opencv_highgui.dir/src/window_cocoa.mm.o -c /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/modules/highgui/src/window_cocoa.mm

modules/highgui/CMakeFiles/opencv_highgui.dir/src/window_cocoa.mm.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/opencv_highgui.dir/src/window_cocoa.mm.i"
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/highgui && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/modules/highgui/src/window_cocoa.mm > CMakeFiles/opencv_highgui.dir/src/window_cocoa.mm.i

modules/highgui/CMakeFiles/opencv_highgui.dir/src/window_cocoa.mm.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/opencv_highgui.dir/src/window_cocoa.mm.s"
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/highgui && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/modules/highgui/src/window_cocoa.mm -o CMakeFiles/opencv_highgui.dir/src/window_cocoa.mm.s

modules/highgui/CMakeFiles/opencv_highgui.dir/src/window_cocoa.mm.o.requires:
.PHONY : modules/highgui/CMakeFiles/opencv_highgui.dir/src/window_cocoa.mm.o.requires

modules/highgui/CMakeFiles/opencv_highgui.dir/src/window_cocoa.mm.o.provides: modules/highgui/CMakeFiles/opencv_highgui.dir/src/window_cocoa.mm.o.requires
	$(MAKE) -f modules/highgui/CMakeFiles/opencv_highgui.dir/build.make modules/highgui/CMakeFiles/opencv_highgui.dir/src/window_cocoa.mm.o.provides.build
.PHONY : modules/highgui/CMakeFiles/opencv_highgui.dir/src/window_cocoa.mm.o.provides

modules/highgui/CMakeFiles/opencv_highgui.dir/src/window_cocoa.mm.o.provides.build: modules/highgui/CMakeFiles/opencv_highgui.dir/src/window_cocoa.mm.o

# Object files for target opencv_highgui
opencv_highgui_OBJECTS = \
"CMakeFiles/opencv_highgui.dir/src/window.cpp.o" \
"CMakeFiles/opencv_highgui.dir/src/window_cocoa.mm.o"

# External object files for target opencv_highgui
opencv_highgui_EXTERNAL_OBJECTS =

lib/libopencv_highgui.a: modules/highgui/CMakeFiles/opencv_highgui.dir/src/window.cpp.o
lib/libopencv_highgui.a: modules/highgui/CMakeFiles/opencv_highgui.dir/src/window_cocoa.mm.o
lib/libopencv_highgui.a: modules/highgui/CMakeFiles/opencv_highgui.dir/build.make
lib/libopencv_highgui.a: modules/highgui/CMakeFiles/opencv_highgui.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --red --bold "Linking CXX static library ../../lib/libopencv_highgui.a"
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/highgui && $(CMAKE_COMMAND) -P CMakeFiles/opencv_highgui.dir/cmake_clean_target.cmake
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/highgui && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/opencv_highgui.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
modules/highgui/CMakeFiles/opencv_highgui.dir/build: lib/libopencv_highgui.a
.PHONY : modules/highgui/CMakeFiles/opencv_highgui.dir/build

modules/highgui/CMakeFiles/opencv_highgui.dir/requires: modules/highgui/CMakeFiles/opencv_highgui.dir/src/window.cpp.o.requires
modules/highgui/CMakeFiles/opencv_highgui.dir/requires: modules/highgui/CMakeFiles/opencv_highgui.dir/src/window_cocoa.mm.o.requires
.PHONY : modules/highgui/CMakeFiles/opencv_highgui.dir/requires

modules/highgui/CMakeFiles/opencv_highgui.dir/clean:
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/highgui && $(CMAKE_COMMAND) -P CMakeFiles/opencv_highgui.dir/cmake_clean.cmake
.PHONY : modules/highgui/CMakeFiles/opencv_highgui.dir/clean

modules/highgui/CMakeFiles/opencv_highgui.dir/depend:
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/modules/highgui /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/highgui /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/highgui/CMakeFiles/opencv_highgui.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : modules/highgui/CMakeFiles/opencv_highgui.dir/depend

