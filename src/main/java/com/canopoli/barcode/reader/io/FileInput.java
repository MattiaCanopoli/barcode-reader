package com.canopoli.barcode.reader.io;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileInput {

	public static File getFile() {

		File inputFile = null;
		try {
			String homeDirectory = System.getenv("HOME");

			JFileChooser fileChooser = new JFileChooser();

			FileNameExtensionFilter filter = new FileNameExtensionFilter("Text files", "csv", "txt");

			fileChooser.setFileFilter(filter);
			fileChooser.setCurrentDirectory(new File(homeDirectory));

			int result = fileChooser.showOpenDialog(null);

			System.out.println("result=" + result);

			if (result == JFileChooser.APPROVE_OPTION) {
				inputFile = new File(fileChooser.getSelectedFile().getAbsolutePath());
			}

			// return true;
		} catch (Exception e) {
			System.out.println(e);

		}

		return inputFile;
	}

}
