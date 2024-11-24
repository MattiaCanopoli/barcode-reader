package com.canopoli.barcode.reader.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileInput {

	public static File getFile() {

		File inputFile = null;
		try {
			//String homeDirectory = System.getenv("HOME");

			JFileChooser fileChooser = new JFileChooser();

			FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "csv", "txt");

			fileChooser.setAcceptAllFileFilterUsed(false);
			fileChooser.setFileFilter(filter);

			int result = fileChooser.showOpenDialog(null);

			//System.out.println("result=" + result);

			if (result == JFileChooser.APPROVE_OPTION) {
				inputFile = new File(fileChooser.getSelectedFile().getAbsolutePath());
			}

			// return true;
		} catch (Exception e) {
			System.out.println(e);

		}

		return inputFile;
	}

	public static List<String> getBarcodes(File inputFile) throws FileNotFoundException {
		List<String> barcodes = new ArrayList<>();

		Scanner reader = new Scanner(inputFile);

		while (reader.hasNext()) {
			String barcode = reader.nextLine().replace(";", "");
			barcodes.add(barcode);
		}
		
		reader.close();
		return barcodes;
	}

}
