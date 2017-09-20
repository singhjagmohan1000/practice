package com.practice.amazon;

class DList{
	int data;
	DList prev;
	DList next;
	DList(int data){
		this.data=data;
		prev=null;
		next=null;
	}

}
class BTNode{
	int data;
	BTNode left;
	BTNode right;
	BTNode(int data){
		this.data=data;
		left=null;
		right=null;
	}
}
public class VerticalSumBinaryTree {

	static void verticalSum(BTNode node){

		DList dList = new DList(0);

		verticalSum(node,dList);

		while(dList.prev != null)
			dList=dList.prev;

		while(dList!=null)
		{
			System.out.print(dList.data+" ");
			dList=dList.next;
		}

	}
	static void verticalSum(BTNode node,DList dlist){

		dlist.data=dlist.data+node.data;
		if(node.left!=null){
			if(dlist.prev==null){
				dlist.prev=new DList(0);
				dlist.prev.next=dlist;
			}
			verticalSum(node.left,dlist.prev);
		}
		if(node.right!=null){
			if(dlist.next==null){
				dlist.next=new DList(0);
				dlist.next.prev=dlist;
			}
			verticalSum(node.right,dlist.next);
		}

	}

	public static void main(String[] args) {


		BTNode root = new BTNode(1);
		root.left = new BTNode(2);
		root.right = new BTNode(3);
		root.left.left = new BTNode(4);
		root.left.right = new BTNode(5);
		root.right.left = new BTNode(6);
		root.right.right = new BTNode(7);

		verticalSum(root);

	}

}
