package com.cracking.ch1;

public class CheckIfAllUniqueCharacters {

	
	public boolean checkAllUniqueChars(String s){
		//Time Complexity : O(n)
		//Space Complexity: O(n)
		
		
		//Because more than 256 chars not possible
		boolean char_set[] =  new boolean[256];
		
		if(s.length() >256  ) return false;
		
		for(int i=0;i<s.length();i++){
			
			if(char_set[s.charAt(i)]){
				return false;
			}
			
			char_set[s.charAt(i)] = true;
		}
		
		return true;
		
	}
	
	
	
	
	
}
