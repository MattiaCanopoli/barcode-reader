package com.canopoli.barcode.reader.io;

import java.io.File;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JTextField;

import com.canopoli.barcode.reader.utility.LabelMsgUtils;

public class BarcodeTest {

	public static boolean barcodeTest(String barcode, List<String> barcodes) {

		if (barcodes.contains(barcode)) {
			return true;
		} else {
			return false;
		}
	}

	public static void barcodeTestAndAdd(File inputFile, JTextField txtBarcode, JLabel lblMessage,
			List<String> inputBarcodes, List<String> outputBarcodes) {

		String barcode = txtBarcode.getText();
		boolean barcodeExist = false;

		if (inputFile == null) {
			LabelMsgUtils.labelFailRed(lblMessage, "NESSUN FILE!");
		} else if (barcode == null || barcode.equals("") || barcode.isBlank() || barcode.isEmpty()) {
			LabelMsgUtils.labelFailRed(lblMessage, "NESSUN BARCODE");
		} else if (barcode != null && !barcode.equals("") && !barcode.isBlank() && !barcode.isEmpty()) {
			barcodeExist = BarcodeTest.barcodeTest(barcode, inputBarcodes);
			if (barcodeExist) {
				outputBarcodes.add(barcode);
				txtBarcode.setText("");
				LabelMsgUtils.labelSuccessGreen(lblMessage, "OK!");
			} else {
				LabelMsgUtils.labelFailRed(lblMessage, "NON RICONOSCIUTO!");
			}
		}
	}

}
