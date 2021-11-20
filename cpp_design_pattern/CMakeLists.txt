project(cppPattern) # 项目名称
file(GLOB SRC_FILE *.c) # 建立变量SRC_FILE为目录下.c文件列表
add_executable (cppPattern ./AbstractFactory/AbstractFactoryPattern.cpp)