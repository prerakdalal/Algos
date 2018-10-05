package com.cracking.ch1;

public class CompressAString {

	
	public boolean compressAString(String s){
		
		int count = 0;
		
		char lastChar = s.charAt(0);
		String newStr = "";
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==lastChar){
				count+=1;
			}else{
				newStr+=lastChar+count;
				count = 1;
				lastChar = s.charAt(i);
			}
		}
		
		
		if(newStr.length() >= s.length()){
			return false;
		}
		
		return true;
	}
	
	
	
}
