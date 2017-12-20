package model;

import java.util.Random;

public class RandomCodeGenerator {
	
	public RandomCodeGenerator() {
		
	}
	
	public String generateCode() {
		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		String code = sb.toString();
		return code;
	}

}
