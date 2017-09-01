package tree;

class Node{
	Node left;
	int data;
	Node right;
	public Node(Node left,Node right,int val){
		this.left=left;
		this.right=right;
		this.data=val;
	}
	
	
}

public class LeastCommonAncestor {
	
	
	public static Node insertNode(Node node,int val){
		
		if(node == null){
			node = new Node(null,null,val);
			}
		
		else
			if(node.data<val)
				node.right=insertNode(node.right, val);
			else
				node.left=insertNode(node.left, val);
		return node;
	}
	
	public static Node leastCommonAncestor(Node node, int val1,int val2){
		if(node == null)
			return null;
		while(node!=null)
		{
			if(node.data < val2 && node.data < val1)
				node=node.right;
			else if(node.data > val2 && node.data > val1)
					node = node.left;
				else return node;
		}
		return null;
	}
	public static void main(String[] args) {
		
		Node n = new Node(null,null,20);
	
		n=insertNode(n, 8);
		n=insertNode(n, 4);
		n=insertNode(n, 12);
		n=insertNode(n, 10);
		n=insertNode(n, 14);
		n=insertNode(n, 22);
		System.out.println("Least Common Ancestor is: "+leastCommonAncestor(n, 12, 8).data);
		
		
		
		
	}
	

}
