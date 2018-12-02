package hw10_2;

import java.util.LinkedList;
import java.util.Queue;

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
	private boolean[] visited;


	public UndirectedListGraph(int n) {
		list = new Node[n];
		this.n = n;
		visited = new boolean[n];
	}


	public boolean hasEdge(int v1, int v2) {
		Node temp = list[v1];
		while(temp != null) {
			if(temp.vertex == v2) {
				return true;
			}
			else {
				temp = temp.link;
			}
		}
		return false;
	}

	private boolean isValid(int v) {
		if (v >= 0 && v < n) {
			return true;
		}
		else
			return false;
	}

	public void addEdge(int v1, int v2) {
		if(!isValid(v1) || !isValid(v2))
			System.out.println("잘못된 정점 번호입니다.");
		else if(hasEdge(v1, v2))
			System.out.println("간선 삽입 오류 - 이미 존재하는 간선입니다. ("+v1+", "+v2+")");
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

	public void breadthFirstSearch(int v) {
		if (!isValid(v)) {
			System.out.println("잘못된 정점 번호 입니다.");		
		}
		visited = new boolean[n];
		bts(v);
		System.out.println();
	}

	private void bts(int v) {
		visited[v] = true;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(v);
		while(!queue.isEmpty()) {
			Node temp = list[queue.poll()];
			while(temp != null) {
				if(!visited[temp.vertex]) {
					queue.offer(temp.vertex);
					visited[temp.vertex] = true;
					System.out.print(temp.vertex + " ");
				}
				temp = temp.link;
			}
		}
	}
}
