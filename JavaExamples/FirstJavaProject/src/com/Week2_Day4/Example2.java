package com.Week2_Day4;

import java.io.File;

public class Example2 {

	public static void main(String[] args) {
		File f = new File("D:\\Github\\Java-HCL-Training\\JavaExamples\\FirstJavaProject\\src\\com\\day9\\Example2.java");
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParent());
		System.out.println(f.exists());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.isHidden());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.lastModified());
		System.out.println(f.length());
		System.out.println(f.isAbsolute());
	}

//	Example2.java
//	D:\Github\Java-HCL-Training\JavaExamples\FirstJavaProject\src\com\day9\Example2.java
//	D:\Github\Java-HCL-Training\JavaExamples\FirstJavaProject\src\com\day9\Example2.java
//	D:\Github\Java-HCL-Training\JavaExamples\FirstJavaProject\src\com\day9
//	true
//	true
//	true
//	false
//	true
//	false
//	1616045549011
//	903
//	true

}
