package app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Grading Guide:
 * 
 * 72 pts for on time
 * 
 * 12 pts for base assignment (2 pts for each decoding rule)
 * 
 * 3 pts for documentation including name!
 * 
 * 3 pts for style
 * 
 * 5 pts for being able to also decode the images in ImageDecoder.java
 * 
 */

/**
 * Decodes messages that have been encoded in the following way:
 * 
 * 1. All two adjacent vowels were surrounded by v's. e.g. either became
 * veivther
 * 
 * 2. Lowercase vowels shifted over: a became e, e became i, i became o, o
 * became u, u became a.
 * 
 * 3. Every 3-letter combination with an s in the middle was surrounded by f and
 * r. E.g. "asp" became "faspr"
 * 
 * 4. Commas replaced spaces and spaces replaced commas. E.g. "this i know" became
 * "this,i,know"
 * 
 * 5. All "nn" became "Xd".
 * 
 * 6. Appended "yy" at end of every word.
 * 
 * @author YOUR NAME
 *
 */
public class MessageDecoder {

    /**
     * Main method takes in input file, decodes the messages in it
     * and prints them.
     * 
     * @param args
     *            - not used
     */
    public static void main(String[] args) {
	Scanner scan;
	String msg = "";
	int msgNum = 1;

	// Get input
	try {
	    // Attempt to open file
	    FileReader file = new FileReader("secret_messages.txt");
	    scan = new Scanner(file);
	} catch (FileNotFoundException e) {
	    // If can't find file, take input from the console.
	    System.out.println("Could not open file. Enter messages in console.");
	    scan = new Scanner(System.in);
	}

	// Process each message
	while (scan.hasNext()) {
	    msg = scan.nextLine();

	    // TODO: Decode the message

	    // Display message
	    System.out.println(msg);
	}

	// Clean up
	scan.close();

    }
}
