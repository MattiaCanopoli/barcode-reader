package com.canopoli.barcode.reader.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileOutput {

	public static void saveFile (List<String> barcodes) throws IOException {

		JFileChooser dirChooser = new JFileChooser();
		//dirChooser .setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		dirChooser.setAcceptAllFileFilterUsed(false);
		FileNameExtensionFilter filter = new FileNameExtensionFilter(".txt","Text files");

		dirChooser.setFileFilter(filter);
		dirChooser.showSaveDialog(dirChooser);

		File file = dirChooser.getSelectedFile();

		FileWriter fileWriter = new FileWriter(file);

		BufferedWriter writer = new BufferedWriter(fileWriter);
		for (String barcode : barcodes) {
			writer.write(barcode + "\n");
		}

		writer.close();
		fileWriter.close();

	}


//	public static void saveFile (String[] barcodes, String outputFile ) throws IOException {
//		BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
//		for (String barcode : barcodes) {
//			writer.write(barcode + "\n");
//		}
//		writer.close();
//	}

}
