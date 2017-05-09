package com.hclA;

public class ReverseStr {

    private String stringreverse(String s)
    {
    	char ch[]=new char[s.length()];
    	int i;
    	
    	int startIndex = s.length()- 1;
    	/*
    	 * string is parsed in reverse order
    	 * while characters are copied to character array
    	 */
    	for(i=startIndex ;i >= 0; i--) {
    		ch[startIndex - i]=s.charAt(i);
    	}
		
		return new String(ch);
    }

	public static void main(String[] args) {
		String input = " we may also take input using Scanner if we want";
		System.out.println("input String:" + input);
		String reverseInput = new ReverseStr().stringreverse(input);
		System.out.println("reverse String:" + reverseInput);
	}

}
