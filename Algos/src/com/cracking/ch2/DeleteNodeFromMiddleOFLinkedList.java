package com.cracking.ch2;

public class DeleteNodeFromMiddleOFLinkedList {

	
	public void deleteFromMiddleOfLinkedList(Node n){
		
		
		if(n==null || n.next==null){
			return;
		}
		
		Node nextNode = n.next;
		n.value = n.next.value;
		
		
		n.next = nextNode.next;		
		
		
	}
	
	
	
	
}
