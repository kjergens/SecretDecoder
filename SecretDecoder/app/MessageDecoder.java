package app;

import java.io.File;
import java.util.Scanner;

/**
 * Decodes messages that have been encoded.
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
    public static void main(String[] args) throws Exception {
       
        Scanner scan = new Scanner(new File("secret_messages.txt"));
        String msg = "";

        // Process each message
        while (scan.hasNext()) {
            msg = scan.nextLine();

            // TODO: 1. Add a function called "decode" that takes in an encoded
            // message returns a decoded message.
  
            // TODO 2. Call that function here, e.g. msg = decode(msg);

            // Display message
            System.out.println(msg);
        }

        // Clean up
        scan.close();

    }

    // Here is where you add the function from TODO #1.
}