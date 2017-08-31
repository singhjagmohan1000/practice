class Node{
	int n;
	Node next;
	Node(int n, Node next){
		this.n=n;
		this.next=next;
	}
	
}

public class ReverseLinked {
	
	static void reverse(Node head){
		Node current=head,next=null,prev=null;
		
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
		while(head!=null){
			System.out.println(head.n);
			head=head.next;
		}
	}
	
	public static void main(String[] args) {
		Node n = new Node(1,null);
		Node n1 = new Node(2,n);
		Node n2 = new Node(3,n1);
		Node n3 = new Node(4,n2);
		Node n4 = new Node(5,n3);
		Node n5 = new Node(6,n4);
		Node head = n5;
//		while(head!=null){
//			System.out.println(head.n);
//			head=head.next;
//		}
		reverse(n5);
		
		
	}

}
