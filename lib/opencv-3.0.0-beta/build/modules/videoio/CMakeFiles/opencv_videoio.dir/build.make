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
include modules/videoio/CMakeFiles/opencv_videoio.dir/depend.make

# Include the progress variables for this target.
include modules/videoio/CMakeFiles/opencv_videoio.dir/progress.make

# Include the compile flags for this target's objects.
include modules/videoio/CMakeFiles/opencv_videoio.dir/flags.make

modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap.cpp.o: modules/videoio/CMakeFiles/opencv_videoio.dir/flags.make
modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap.cpp.o: ../modules/videoio/src/cap.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/CMakeFiles $(CMAKE_PROGRESS_1)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap.cpp.o"
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/videoio && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/opencv_videoio.dir/src/cap.cpp.o -c /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/modules/videoio/src/cap.cpp

modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/opencv_videoio.dir/src/cap.cpp.i"
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/videoio && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/modules/videoio/src/cap.cpp > CMakeFiles/opencv_videoio.dir/src/cap.cpp.i

modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/opencv_videoio.dir/src/cap.cpp.s"
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/videoio && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/modules/videoio/src/cap.cpp -o CMakeFiles/opencv_videoio.dir/src/cap.cpp.s

modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap.cpp.o.requires:
.PHONY : modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap.cpp.o.requires

modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap.cpp.o.provides: modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap.cpp.o.requires
	$(MAKE) -f modules/videoio/CMakeFiles/opencv_videoio.dir/build.make modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap.cpp.o.provides.build
.PHONY : modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap.cpp.o.provides

modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap.cpp.o.provides.build: modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap.cpp.o

modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_images.cpp.o: modules/videoio/CMakeFiles/opencv_videoio.dir/flags.make
modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_images.cpp.o: ../modules/videoio/src/cap_images.cpp
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/CMakeFiles $(CMAKE_PROGRESS_2)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_images.cpp.o"
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/videoio && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/opencv_videoio.dir/src/cap_images.cpp.o -c /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/modules/videoio/src/cap_images.cpp

modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_images.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/opencv_videoio.dir/src/cap_images.cpp.i"
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/videoio && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/modules/videoio/src/cap_images.cpp > CMakeFiles/opencv_videoio.dir/src/cap_images.cpp.i

modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_images.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/opencv_videoio.dir/src/cap_images.cpp.s"
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/videoio && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/modules/videoio/src/cap_images.cpp -o CMakeFiles/opencv_videoio.dir/src/cap_images.cpp.s

modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_images.cpp.o.requires:
.PHONY : modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_images.cpp.o.requires

modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_images.cpp.o.provides: modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_images.cpp.o.requires
	$(MAKE) -f modules/videoio/CMakeFiles/opencv_videoio.dir/build.make modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_images.cpp.o.provides.build
.PHONY : modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_images.cpp.o.provides

modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_images.cpp.o.provides.build: modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_images.cpp.o

modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_qtkit.mm.o: modules/videoio/CMakeFiles/opencv_videoio.dir/flags.make
modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_qtkit.mm.o: ../modules/videoio/src/cap_qtkit.mm
	$(CMAKE_COMMAND) -E cmake_progress_report /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/CMakeFiles $(CMAKE_PROGRESS_3)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building CXX object modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_qtkit.mm.o"
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/videoio && /usr/bin/c++   $(CXX_DEFINES) $(CXX_FLAGS) -o CMakeFiles/opencv_videoio.dir/src/cap_qtkit.mm.o -c /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/modules/videoio/src/cap_qtkit.mm

modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_qtkit.mm.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/opencv_videoio.dir/src/cap_qtkit.mm.i"
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/videoio && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -E /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/modules/videoio/src/cap_qtkit.mm > CMakeFiles/opencv_videoio.dir/src/cap_qtkit.mm.i

modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_qtkit.mm.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/opencv_videoio.dir/src/cap_qtkit.mm.s"
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/videoio && /usr/bin/c++  $(CXX_DEFINES) $(CXX_FLAGS) -S /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/modules/videoio/src/cap_qtkit.mm -o CMakeFiles/opencv_videoio.dir/src/cap_qtkit.mm.s

modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_qtkit.mm.o.requires:
.PHONY : modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_qtkit.mm.o.requires

modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_qtkit.mm.o.provides: modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_qtkit.mm.o.requires
	$(MAKE) -f modules/videoio/CMakeFiles/opencv_videoio.dir/build.make modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_qtkit.mm.o.provides.build
.PHONY : modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_qtkit.mm.o.provides

modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_qtkit.mm.o.provides.build: modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_qtkit.mm.o

# Object files for target opencv_videoio
opencv_videoio_OBJECTS = \
"CMakeFiles/opencv_videoio.dir/src/cap.cpp.o" \
"CMakeFiles/opencv_videoio.dir/src/cap_images.cpp.o" \
"CMakeFiles/opencv_videoio.dir/src/cap_qtkit.mm.o"

# External object files for target opencv_videoio
opencv_videoio_EXTERNAL_OBJECTS =

lib/libopencv_videoio.a: modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap.cpp.o
lib/libopencv_videoio.a: modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_images.cpp.o
lib/libopencv_videoio.a: modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_qtkit.mm.o
lib/libopencv_videoio.a: modules/videoio/CMakeFiles/opencv_videoio.dir/build.make
lib/libopencv_videoio.a: modules/videoio/CMakeFiles/opencv_videoio.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --red --bold "Linking CXX static library ../../lib/libopencv_videoio.a"
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/videoio && $(CMAKE_COMMAND) -P CMakeFiles/opencv_videoio.dir/cmake_clean_target.cmake
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/videoio && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/opencv_videoio.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
modules/videoio/CMakeFiles/opencv_videoio.dir/build: lib/libopencv_videoio.a
.PHONY : modules/videoio/CMakeFiles/opencv_videoio.dir/build

modules/videoio/CMakeFiles/opencv_videoio.dir/requires: modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap.cpp.o.requires
modules/videoio/CMakeFiles/opencv_videoio.dir/requires: modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_images.cpp.o.requires
modules/videoio/CMakeFiles/opencv_videoio.dir/requires: modules/videoio/CMakeFiles/opencv_videoio.dir/src/cap_qtkit.mm.o.requires
.PHONY : modules/videoio/CMakeFiles/opencv_videoio.dir/requires

modules/videoio/CMakeFiles/opencv_videoio.dir/clean:
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/videoio && $(CMAKE_COMMAND) -P CMakeFiles/opencv_videoio.dir/cmake_clean.cmake
.PHONY : modules/videoio/CMakeFiles/opencv_videoio.dir/clean

modules/videoio/CMakeFiles/opencv_videoio.dir/depend:
	cd /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/modules/videoio /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/videoio /Users/Melancardie/Dropbox/Documents/code/Java/OwlExpress/lib/opencv-3.0.0-beta/build/modules/videoio/CMakeFiles/opencv_videoio.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : modules/videoio/CMakeFiles/opencv_videoio.dir/depend

