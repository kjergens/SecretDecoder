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
 * 4. Commas replaced spaces and spaces replaced commas. E.g. "this i know"
 * became "this,i,know"
 * 
 * 5. All "nn" became "Xd".
 * 
 * 6. Appended "yy" at end of every word.
 * 
 * 
 * @author YOUR NAME
 *
 */
public class MessageDecoder {

    /**
     * Take in input file, decode the messages in it and print
     * them.
     * 
     * @param args
     *            - not used
     */
    public static void main(String[] args) {
        Scanner scan;
        String msg = "";

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

            // TODO:
            // 
            // 1. Write a function below called "decode" that takes in an encoded
            // message as a String and returns a decoded message as a String.
            //
            // 2. Call that function here, e.g. msg = decode(msg);
            //
            
            msg = decode(msg);

            // Display message
            System.out.println(msg);
        }

        // Clean up
        scan.close();

    }
    
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
     * 4. Commas replaced spaces and spaces replaced commas. E.g. "this i know"
     * became "this,i,know"
     * 
     * 5. All "nn" became "Xd".
     * 
     * 6. Appended "yy" at end of every word.
     * 
     * 
     * @author YOUR NAME
     *
     */
    public static String decode(String msg) {
    	String dec = msg;
    	
    	// 6. yy
    	dec = dec.replaceAll("yy\\b", "");
    	
    	// 5. nn
    	dec = dec.replaceAll("Xd", "nn");
    	
    	// 4. commas
    	dec = dec.replaceAll(" ", "COMMA");
        dec = dec.replaceAll(",", " ");
        dec = dec.replaceAll("COMMA", ",");
    	
    	// 3. faspr
    	dec = dec.replaceAll("f(\\ws\\w)r", "$1");
    	
    	// 2. shift vowels
    	dec = dec.replaceAll("a", "_U_"); 
        dec = dec.replaceAll("e", "_A_");
        dec = dec.replaceAll("i", "_E_");
        dec = dec.replaceAll("o", "_I_");
        dec = dec.replaceAll("u", "_O_");

        dec = dec.replaceAll("_E_", "e");
        dec = dec.replaceAll("_I_", "i");
        dec = dec.replaceAll("_O_", "o");
        dec = dec.replaceAll("_U_", "u");
        dec = dec.replaceAll("_A_", "a");
        
        // 1. two vowels together get v on either side, e.g. either -> veivther
        dec = dec.replaceAll("v([aeiouAEIOU]{2})v", "$1");
        
        
    	return dec;
    }
}
