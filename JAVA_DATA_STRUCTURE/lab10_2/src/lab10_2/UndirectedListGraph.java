package lab10_2;

public class UndirectedListGraph {
	private class Node{
		int vertex;
		Node link;
		Node(int vertex){
			this.vertex = vertex;
		}
	}

	private Node[] list;
	private int n; // 정점 수

	public UndirectedListGraph(int n) {
		list = new Node[n];
		this.n = n;
	}
	
	
	public boolean hasEdge(int v1, int v2) {
		return false;
	}
	
	private boolean isValid(int v) {
		if (v > 0 && v < n) {
			return true;
		}
		else
			return false;
	}
	
	public void addEdge(int v1, int v2) {
		if(!isValid(v1) || !isValid(v2))
			System.out.println("잘못된 정점 번호입니다.");
		else if(hasEdge(v1, v2))
			System.out.println("이미 존재하는 간선입니다.");
		else {
			Node newNode1 = new Node(v2);
			newNode1.link = list[v1];
			list[v1] = newNode1;
			
			Node newNode2 = new Node(v1);
			newNode2.link = list[v2];
			list[v2] = newNode2;
		}
	}
	
	public void printAdjacentVertices(int v) {
		Node temp = list[v];
		while(temp != null) {
			System.out.print(temp.vertex + " ");
			temp = temp.link;
		}
	}
}
