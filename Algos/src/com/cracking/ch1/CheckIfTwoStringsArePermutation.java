package com.cracking.ch1;

public class CheckIfTwoStringsArePermutation {

	public boolean checkIfTwoSTringsArePermutation(String s, String t){
		
		char[] letters = new char[256];
		
		for(int i=0;i<s.length();i++){
			letters[s.charAt(i)]++;
		}
		
		
		for(int i=0;i<t.length();i++){
			char c = t.charAt(i);
			if(letters[c]-- < 0){
				return false;
			}
		}
		
		
		
		return true;
		
	}
	
	
}
