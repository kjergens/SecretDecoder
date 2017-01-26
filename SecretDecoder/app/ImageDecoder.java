package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Summary:
 * 
 * Decodes svg images by swapping all the x,y coordinates.
 * 
 * 
 * Background:
 * 
 * The images in this project were encoded by switching all the x,y coordinates, e.g.
 * 0.646,2.49 became 2.49,0.646.
 * 
 * 
 * Instructions:
 * 
 * Run this program and Refresh the project.
 * 
 * Open decoded_image.svg. It will look the same as the original.
 * 
 * Decode the images by switching all the x,y coordinates back to where they
 * belong.
 * 
 * Run the program again and decoded.svg will be the decoded image.
 * 
 * 
 * @author YOUR NAME
 *
 */
public class ImageDecoder {

    public static void main(String[] args) {
	Scanner scan;
	String svg = "";

	/*
	 * Open image to an output file
	 */
	try {
	    // Attempt to open file
	    FileReader file = new FileReader("secret_image1.svg"); 
	    scan = new Scanner(file);
	} catch (FileNotFoundException e) {
	    // If can't find file, take input from the console.
	    System.out.println("Could not open file. Paste svg here:");
	    System.out.println(e.getStackTrace());
	    scan = new Scanner(System.in);
	}

	/*
	 * Save svg info to a String
	 */
	while (scan.hasNextLine()) {
	    svg += scan.nextLine();
	    svg += "\n";
	}

	/*
	 * Decode the svg
	 */
	// TODO: write code here to decode the svg
	// HINT: it can be done in one line.

	System.out.println(svg);

	/*
	 * Save decoded to an output file
	 */
	File output = new File("decoded_image.svg");
	try {
	    // creates the file
	    output.createNewFile();

	    FileWriter writer = new FileWriter(output);

	    writer.write(svg);
	    writer.close();

	    System.out.println("Successfully created file " + output.getAbsolutePath());
	} catch (Exception e) {
	    System.out.println("Could not create file.");
	    System.out.println(e.getStackTrace());
	}

	scan.close();
    }

}
