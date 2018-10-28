package com.cracking.ch1;

public class RotationOfMatrix {

	
	public void rotateMatrix(int[][] matrix){
		
		
		for(int i=0;i<matrix.length/2;i++){
			int[] temp = matrix[i];
			matrix[i] = matrix[matrix.length - i];
			matrix[matrix.length-i] = temp;
		}
		
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<i;j++){
				matrix[i][j] = matrix[j][i];
			}
		}
		
		
	}
	
	
	
}
