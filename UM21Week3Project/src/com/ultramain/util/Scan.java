package com.ultramain.util;

import java.util.Scanner;

/**
 * @author Sangeethkumar
 *
 */
public class Scan {
	/**
	 * @return
	 */
	public static Scanner getScannerInstance(){
		Scanner scan = new Scanner(System.in);
		return scan;
	}
}