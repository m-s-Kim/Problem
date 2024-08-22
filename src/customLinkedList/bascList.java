package customLinkedList;

import java.util.LinkedList;

public class bascList {
	public static void main(String[] args) {
		
		linkedList ll = new linkedList();
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.append(2);
		ll.append(6);
		ll.append(6);
		ll.append(2);
		ll.delete(2);
		//ll.retrieve();;
		ll.retrieve();;
		ll.removeDups();
		ll.retrieve();;
		
	}
}



class linkedList{
	Node header;
	
	static class Node {
		int data;
		Node next = null;
	}
	
	linkedList(){
		header = new Node(); 
	}
	void append(int d) {
		Node end = new Node();
		end.data = d;
		Node n = header;
		while(n.next !=null) {
			n = n.next;
		}
		n.next=end;
	}
	
	void delete(int d) {
		Node n = header;
		while(n.next !=null) {
			if(n.next.data == d) {
				n.next = n.next.next;
			}else {
				n = n.next;
			}
		}
	}
	//header 다음부분을 n에 할당
	void retrieve() {
		Node n = header.next;
		while(n.next !=null) {
			System.out.print(n.data+" -> ");
			n = n.next;
		}
		System.out.print(n.data);
	}
	void removeDups() {
		Node n = header;
		while(n != null && n.next !=null) {
			Node r = n;
			while(r.next !=null ) {
				if(n.data == r.next.data) {
					r.next = r.next.next;
				}else {
					r = r.next;
				}
			}
			n = n.next;
		}
	}
	
	
}
