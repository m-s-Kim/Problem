package study;
public class MakeTree {
	public static void main(String[] args) {
		// 이진트리 자식이 최대 2개가 붙는 트리
		// binarySearch Tree  는 root를 기준으로 왼쪽이 작은값 오른쪽이 큰값
		int[] a = new int[10];
		
		for(int i = 0; i < a.length; i++) {
			a[i]=i;
		}
		Tree t = new Tree();
		t.makeTree(a);
		t.searchBtree(t.root, 2);
	}
}

class Tree{
	class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
		
	}
	Node root;
	public void makeTree(int[] a) {
		root = makeTreeR(a,0,a.length-1);
	}
	public Node makeTreeR(int[] a, int start, int end) {
		if (start > end) return null;
		int mid = (start+end)/2;
		Node node = new Node(a[mid]);
		node.left= makeTreeR(a, start, mid-1);
		node.right = makeTreeR(a, mid+1, end);
		return node;
	}
	
	public void searchBtree(Node n, int find) {
		if(find <n.data) {
			System.out.println("DATA is smaller than "+ n.data);
			searchBtree(n.left, find);
		}else if( find > n.data) {
			System.out.println("DATA is bigger than "+n.data);
			searchBtree(n.right, find);
		}else {
			System.out.println("DATA found");
		}
	}
	
}
