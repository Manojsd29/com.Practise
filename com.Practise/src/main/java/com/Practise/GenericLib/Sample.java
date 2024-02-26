package com.Practise.GenericLib;

import java.io.File;

public class Sample {



	    public static void main(String[] args) {
	        // Specify the relative path to your file
	        String filePath = ".\\Testdata\\commondata.properties";

	        // Print out the absolute path
	        File file = new File(filePath);
	        System.out.println("Absolute Path: " + file.getAbsolutePath());

	        // Now try to open the file
	        // Your code to open the file goes here...
	    }
	}

