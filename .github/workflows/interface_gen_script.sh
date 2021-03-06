#!/usr/bin/bash

# Generate Matlab interface using swig matlab
mkdir build_matlab
pushd build_matlab || exit
cmake -DBUILD_MATLAB_INTERFACE=ON -DHELICS_SWIG_GENERATE_INTERFACE_FILES_ONLY=ON -DHELICS_OVERWRITE_INTERFACE_FILES=ON -DHELICS_BUILD_EXAMPLES=OFF -DENABLE_ZMQ_CORE=OFF -DHELICS_BUILD_TESTS=OFF -DHELICS_BUILD_APP_EXECUTABLES=OFF -DHELICS_DISABLE_BOOST=ON -DHELICS_ENABLE_SWIG=ON -DSWIG_EXECUTABLE=/root/swig-matlab/bin/swig ..
make -j2 mfile_overwrite
popd || exit

# Generate Python and Java interfaces
mkdir build_interface
pushd build_interface || exit
cmake -DBUILD_PYTHON_INTERFACE=ON -DBUILD_JAVA_INTERFACE=ON -DHELICS_SWIG_GENERATE_INTERFACE_FILES_ONLY=ON -DHELICS_OVERWRITE_INTERFACE_FILES=ON -DHELICS_BUILD_EXAMPLES=OFF -DENABLE_ZMQ_CORE=OFF -DHELICS_BUILD_TESTS=OFF -DHELICS_BUILD_APP_EXECUTABLES=OFF -DHELICS_DISABLE_BOOST=ON -DHELICS_ENABLE_SWIG=ON ..
make -j2 pyfile_overwrite
make -j2 javafile_overwrite
popd || exit
