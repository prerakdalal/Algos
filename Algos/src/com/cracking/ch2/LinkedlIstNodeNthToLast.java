package com.cracking.ch2;

public class LinkedlIstNodeNthToLast {

	
	
	public Node GetNthtoLast(int k,Node head){
		
		if(k<=0) return null;
		
		Node p1 = head;
		Node p2 = head;
		
		for(int i=0;i<k-1;i++){
			if(p2==null) return null;
			
			p2 = p2.next;
		}
		
	
		if(p2==null) return null;
		
		
		
		while(p2!=null){
			p1=p1.next;
			p2=p2.next;
		}
		
		
		return p1;
	}
	
	
	
	
	
}
