package DataStrucre;
class Node{
	int n;
	Node next;
	Node(int n, Node next){
		this.n=n;
		this.next=next;
	}
	
}

public class LinkedList {
	
	static void reverse(Node node){
		
		Node prevNode=null;
		Node nextNode=null;
		while(node!=null){
			nextNode = node.next;
			node.next = prevNode;
			prevNode = node;
			node = nextNode;
		}
		
		Node temp = prevNode;
		while(temp!=null){
			System.out.print(temp.n+" ");
			temp=temp.next;
		}
		
	}
	
	static Node isLoopExist(Node node){
		
		Node slowPtr = node;
		Node fastPtr = node;
		boolean loopexist=false;
		while(slowPtr!=null && fastPtr!=null){
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
			if(slowPtr==fastPtr){
				loopexist=true;
				break;
			}
			
		}
		if(loopexist){
			slowPtr=node;
			while(slowPtr!=fastPtr){
				slowPtr=slowPtr.next;
				fastPtr=fastPtr.next.next;
				
			}
			return fastPtr;
				
			
		}
		return null;
	}
	
	static Node mergePoint(Node node1,Node node2){
		
		
		Node head1=node1;
		Node head2=node2;
		int l1=0,l2=0;
		while(head1!=null)
		{l1++;
		head1=head1.next;
		
			
		}
		while(head2!=null)
		{l2++;
		head2=head2.next;
			
		}
		head1=node1;
		head2=node2;
		if(l1>l2){
			for(int i=0;i<l1-l2;i++){
				head1=head1.next;
				
			}
			
		}
		else{
			for(int i=0;i<l2-l1;i++){
				head2=head2.next;
			}
			
		}
		while(head1!=head2){
			head1=head1.next;
			head2=head2.next;
		}
		
		return head1;
		
	}
	public static void main(String[] args) {
		int i = 0;
		
	
		Node n = new Node(1,null);
		Node n1 = new Node(2,n);
		Node n2 = new Node(3,n1);
		Node n3 = new Node(4,n2);
		Node n4 = new Node(5,n3);
		Node n5 = new Node(6,n4);
		Node n6 = new Node(7,n5);
		Node n7 = new Node(8,n6);
		Node p = new Node(11,n3);
		Node p1 = new Node(12,p);

		//n.next=n3;
		Node head = n7;
		while(head!=null){
			System.out.print(head.n+" ");
			head=head.next;
			
		}
		System.out.println("");
		Node head1=p1;
		while(head1!=null){
			System.out.print(head1.n+" ");
			head1=head1.next;
			
		}
		System.out.println("");
//		reverse(n5);
		System.out.println(mergePoint(n7, p1).n);
		
		
	}

}
