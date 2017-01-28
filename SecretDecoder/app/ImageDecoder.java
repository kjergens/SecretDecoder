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
 * The images in this project were encoded by switching all the x,y coordinates,
 * e.g. 0.646,2.49 became 2.49,0.646.
 * 
 * 
 * Instructions:
 * 
 * Open the secret images. (Control-click on secret_image1.svg, Open With, Other..., Internal Web
 * Browser, select the 2 check boxes, select OK. Now all the images will open in a new tab.)
 * 
 * Run program and open decoded images. (They will look the same at first.)
 * 
 * Fix this program so that it decodes the images. (HINT: Decode the images by
 * switching all the x,y coordinates.)
 * 
 * Run the program again and decoded images should be fixed.
 * 
 * 
 * @author YOUR NAME
 *
 */
public class ImageDecoder {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;

        /*
         * Attempt to open image files
         */
        try {
            FileReader file1 = new FileReader("secret_image1.svg");
            FileReader file2 = new FileReader("secret_image2.svg");
            FileReader file3 = new FileReader("secret_image3.svg");
            FileReader[] images = { file1, file2, file3 };

            // Process each image
            for (FileReader image : images) {

                /*
                 * Scan the svg and save to a String
                 */
                scan = new Scanner(image);
                String svg = "";
                while (scan.hasNextLine()) {
                    svg += scan.nextLine();
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

                File output = new File("decoded_image" + ++count + ".svg");
                try {
                    // creates the file
                    output.createNewFile();

                    FileWriter writer = new FileWriter(output);

                    writer.write(svg);
                    writer.close();

                    System.out.println("Successfully created file " + output.getPath() + "\n");
                } catch (Exception e) {
                    System.out.println("Could not create file.");
                    System.out.println(e.getStackTrace());
                }
            }
        } catch (FileNotFoundException e) {
            // If can't find files
            System.out.println("Could not open image files.");
            System.out.println(e.getStackTrace());
        }

        scan.close();
    }

}
