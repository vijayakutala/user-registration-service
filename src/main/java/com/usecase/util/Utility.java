package com.usecase.util;

import java.util.Random;

public class Utility {
	static String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static String Small_chars = "abcdefghijklmnopqrstuvwxyz";
	static String numbers = "0123456789";
	static String symbols = "!@#$%^&*_=+-/.?<>)(~^&";
	public static char[] generatePassword() {
		String values = Capital_chars + Small_chars +
				numbers + symbols;
		Random random = new Random();
		char[] password = new char[8];
		for (int i = 0; i < 8; i++)
		{
			password[i] =
					values.charAt(random.nextInt(values.length()));
		}
		return password;
	}
}
