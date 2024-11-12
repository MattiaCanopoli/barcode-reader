package com.canopoli.barcode.reader.utility;

import javax.swing.JLabel;

public class LabelMsgUtils {

	public static void labelSuccessGreen (JLabel label, String message) {
		label.setForeground(new java.awt.Color(0, 222, 0));
		label.setText(message);
		label.setVisible(true);
	}

	public static void labelFailRed (JLabel label,String message) {
		label.setForeground(new java.awt.Color(255, 0, 0));
		label.setText(message);
		label.setVisible(true);
	}

	public static void labelStandardBlue (JLabel label,String message) {
		label.setForeground(new java.awt.Color(0, 0, 204));
		label.setVisible(true);
		label.setText(message);
	}

}
