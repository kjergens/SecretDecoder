package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Decode svg images by swapping all the x,y coordinates.
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
            FileReader file = new FileReader("c.svg"); // also try h.svg and t.svg
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
        
        /*
         * Save decoded to an output file
         */
        File output = new File("svg-out.svg");
        try {
            // creates the file
            output.createNewFile();

            FileWriter writer = new FileWriter(output);

            writer.write(svg);
            writer.close();
        } catch (Exception e) {
            System.out.println("Could not create file.");
            System.out.println(e.getStackTrace());
        }
        
        scan.close();
    }

}
