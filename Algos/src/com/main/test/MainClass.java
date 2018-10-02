package com.main.test;

import com.cracking.ch1.CheckIfAllUniqueCharacters;

public class MainClass {

	
	public static void main(String args[]){
		
		CheckIfAllUniqueCharacters ch = new CheckIfAllUniqueCharacters();
		
		String str = "Helo";
		
		
		if(ch.checkAllUniqueChars(str)){
			System.out.println("passed");
		}else{
			System.out.println("failed");
		}
		
		
	}
	
}
