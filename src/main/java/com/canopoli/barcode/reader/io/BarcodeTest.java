package com.canopoli.barcode.reader.io;

import java.util.List;

public class BarcodeTest {
	
	public static boolean barcodeTest(String barcode, List<String> barcodes) {
				
		if (barcodes.contains(barcode)) {
			return true;
		} else {
			return false;
		}
	}

}
