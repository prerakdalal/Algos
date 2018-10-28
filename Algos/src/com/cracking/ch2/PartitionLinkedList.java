package com.cracking.ch2;

public class PartitionLinkedList {

	
	public Node partitionALinkedList(Node n,int x){
		
		Node beforeStart = null;
		Node afterStart = null;
		
		while(n!=null){
			Node nextNode = n.next;
			
			if(n.value < x){
				n.next = beforeStart;
				beforeStart = n;
			}else if(n.value > x){
				n.next = afterStart;
				afterStart = n;
			}			
			n = nextNode;
		}
		
		
		if(beforeStart == null){
			return afterStart;
		}		
	
		Node returnNode = beforeStart;
		
		while(beforeStart.next!=null){
			beforeStart = beforeStart.next;
		}
		
		beforeStart.next = afterStart;
		
		return returnNode;
	}
	
	
	
}
