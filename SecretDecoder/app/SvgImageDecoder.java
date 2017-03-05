package app;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Summary:
 * 
 * Decodes svg images by swapping all the x,y coordinates.
 * 
 * Background:
 * 
 * The images in this project were encoded by switching all the x,y coordinates,
 * e.g. 0.646,2.49 became 2.49,0.646. It ignored negative numbers.
 * 
 * @author YOUR NAME
 *
 */
public class SvgImageDecoder {

	public static void main(String[] args) throws Exception {
		Scanner scan;
		int count = 0;

		// Make array of image files
		File file1 = new File("secret_image1.svg");
		File file2 = new File("secret_image2.svg");
		File file3 = new File("secret_image3.svg");
		File[] files = { file1, file2, file3 };

		// Process each image
		for (File file : files) {

			// Scan the svg and save to a String
			scan = new Scanner(file);
			String svg = "";

			// Add contents of the file to the String svg
			while (scan.hasNextLine()) {
				svg += scan.nextLine();
			}

			// Decode the svg
			// TODO: write code here to decode the svg. HINT: it can be done in
			// one line.

			// Display new svg as text
			System.out.println(svg);

			// Create a new file
			File output = new File("decoded_image" + ++count + ".svg");
			output.createNewFile();

			// Write the contents of new svg into the file
			FileWriter writer = new FileWriter(output);
			writer.write(svg);
			writer.close();

			System.out.println("Successfully created file " + output.getPath() + "\n");
			scan.close();

		}
	}
}
