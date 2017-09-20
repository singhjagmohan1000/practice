package com.practice.amazon;
class Node{
	
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}
}

public class AlternateLinkedList {
	
	 void printNode(Node node){
		while(node!=null){
			System.out.print(node.data+" ");
			node=node.next;
		}
		System.out.println();
	}
	 Node reverseList(Node node){
		Node pre=null;
		Node next=null;
		Node curr=node;
		while(curr!=null){
			next=curr.next;
			curr.next=pre;
			pre=curr;
			curr=next;
		}
		return pre;
	}
	 Node alternateList(Node node){
		
		Node slow=node;
		Node fast=node.next;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		Node rev=reverseList(slow.next);
		slow.next=null;
		Node temp=new Node(0);
		Node alt=temp;
		
		 while (node != null || rev != null) {
			 
	            // First add the element from first list
	            if (node != null) {
	                temp.next = node;
	                temp = temp.next;
	                node = node.next;
	            }
	 
	            // Then add the element from second list
	            if (rev != null) {
	                temp.next = rev;
	                temp = temp.next;
	                rev = rev.next;
	            }
	        }
	
		return alt.next;
	}
	public static void main(String[] args) {
		Node head;
		 head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		AlternateLinkedList linkList= new AlternateLinkedList();
		//linkList.printNode(head);
		
		Node alt=linkList.alternateList(head);
		linkList.printNode(alt);
		
	}

}
