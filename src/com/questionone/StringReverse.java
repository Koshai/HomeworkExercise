package com.questionone;

public class StringReverse {

	public static void reverseEverything(String s) {
		String str = s;
		
		char[] strArray = str.toCharArray();
		
		for (int i = strArray.length - 1; i >= 0; i--){
			System.out.print(strArray[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseEverything("hope you are doing well");
	}

}
