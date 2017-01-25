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
 * 1. All h's not at the beginning of the word became X’s.
 * 
 * 2. All two adjacent vowels were surrounded by v's. e.g. either became
 * veivther
 * 
 * 3. Lowercase vowels shifted over: a became e, e became i, i became o, o
 * became u, u became a.
 * 
 * 4. Every 3-letter combination with an s in the middle was surrounded by f and
 * r. E.g. asp became faspr
 * 
 * 5. Commas replaced spaces and spaces replaced commas. E.g. this i know became
 * this,i,know
 * 
 * 6. Inserted y as second letter of each word.
 * 
 * @author YOUR NAME
 *
 */
public class MessageDecoder {

    /**
     * Main method takes in input file named encoded, decodes the messages in it
     * and prints them.
     * 
     * @param args
     *            - not used
     */
    public static void main(String[] args) {
	Scanner scan;
	String message = "";
	int messageNo = 1;

	// Get input
	try {
	    // Attempt to open file named "encoded"
	    FileReader file = new FileReader("encoded");
	    scan = new Scanner(file);
	} catch (FileNotFoundException e) {
	    // If can't find file, take input from the console.
	    System.out.println("Could not open file. Enter data in console.");
	    scan = new Scanner(System.in);
	}

	// Process each line of input
	while (scan.hasNext()) {
	    message = scan.nextLine();

	    // TODO: Decode the message
	    // You should write a function below and call it here.

	    System.out.println(messageNo++ + ". " + message + "\n");
	}

	// Clean up
	scan.close();

    }
}
