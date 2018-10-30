package com.cracking.ch2;

import java.util.HashSet;
import java.util.Set;

public class RemoveUniqueElementsFromLinkedlist {

	
	
	public Node removeUniqueElementUsingHashset(Node n){
		 Node current  = n;
		 Set<Integer> set = new HashSet<Integer>();
		 
		 Node previous = current;
		 
		 while(current!=null){
			 if(!set.add(current.getValue())){
				 previous.next = current.next;
			 }else{
				 previous = current;
			 }
			 
			 current = current.next;			 
		 }
		 
		 return n;
	}
	
	
	
	
	
	public void removeUniqueElements(Node n){
	
		Node current=n;
		

		while(current!=null){
			
			Node runner = current;
			while(runner.next!=null){
				
				if(current.value==runner.next.value){
					runner.next = runner.next.next;
				}else{
					runner = runner.next;
				}
			}
			
			current = current.next;
			
		}
		
		
		
	}
	
	
	
	
	
	
}
