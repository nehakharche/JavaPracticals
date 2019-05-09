package com.neha.ConvertNumberToWord;

import java.util.HashMap;

public class ConvertNumberToWord {

	public String unitPlace(String key) {
		HashMap<String, String> h = new HashMap();
		h.put("0", "Zero");
		h.put("1", "One");
		h.put("2", "Two");
		h.put("3", "Three");
		h.put("4", "Four");
		h.put("5", "Five");
		h.put("6", "Six");
		h.put("7", "Seven");
		h.put("8", "Eight");
		h.put("9", "Nine");
		h.put("10", "ten");
		h.put("11", "eleven ");
		h.put("12", "Twevlve");
		h.put("13", "Thirteen");
		h.put("14", "fourteen ");
		h.put("15", "Fifteen");
		h.put("16", "Sixteen");
		h.put("17", "Seventeen");
		h.put("18", "Eighteen");
		h.put("19", "Nineteen");
		return h.get(key);
	}

	public String twoDigit(String key) {
		HashMap<String, String> h = new HashMap();

		return h.get(key);
	}

	public String tenPlace(String key) {
		HashMap<String, String> h = new HashMap();
		h.put("1", "");
		h.put("2", "Twenty");
		h.put("3", "Thirty");
		h.put("4", "Fourty");
		h.put("5", "Fifty");
		h.put("6", "Sixty");
		h.put("7", "Seventy");
		h.put("8", "Eighty");
		h.put("9", "Ninety");
		h.put("0", "");
		return h.get(key);

	}

	public void convertNumber(String number) {
		String word = "";
		String ch = Character.toString(number.charAt(0));
		int length = number.length();
		if (length / 2 == 1) {
			if (Character.toString(number.charAt(0)).equals("1")) {
				System.out.print(this.unitPlace(number));
			} else {
				if (!Character.toString(number.charAt(0)).equals("0"))
					System.out.print(this.tenPlace(Character.toString(number.charAt(0))) + "\t");
				if (!Character.toString(number.charAt(1)).equals("1"))
					System.out.print(this.unitPlace(Character.toString(number.charAt(1))) + "\t");
			}

		}
	}

	public static void main(String[] args) {

		ConvertNumberToWord objConvertNumberToWord = new ConvertNumberToWord();
		objConvertNumberToWord.convertNumber("22");
	}

}
