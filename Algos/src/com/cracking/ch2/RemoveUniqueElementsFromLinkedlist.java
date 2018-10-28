package com.cracking.ch2;

public class RemoveUniqueElementsFromLinkedlist {

	
	
	
	public void removeUniqueElements(LinkelistNode n){
	
		Node current=n;
		

		while(current!=null){
			
			Node runner = current;
			while(runner.next!=null){
				
				if(current.data==runner.next.data){
					runner.next = runner.next.next;
				}else{
					runner = runner.next;
				}
			}
			
			current = current.next;
			
		}
		
		
		
	}
	
	
	
	
	
	
}
