package lab10_1;


public class DirectedMatrixGraph {
	private int arr[][];
	private int n; // ���� ��

	public DirectedMatrixGraph(int n) {
		arr = new int[n][n];
		this.n = n;
	}
	
	
	public boolean hasEdge(int v1, int v2) {
		if(arr[v1][v2] == 1) {
			return true;
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
			System.out.println("�߸��� ���� ��ȣ�Դϴ�. ("+v1+", "+v2+")");
		else if(hasEdge(v1, v2))
			System.out.println("���� ���� ���� - �̹� �����ϴ� �����Դϴ�. ("+v1+", "+v2+")");
		else {
			arr[v1][v2] = 1;
		}
	}
	
	public void printAdjacentVertices(int v) {
		for(int i=0; i<n; i++) {
			if(arr[v][i] != 0)
				System.out.print(i + " ");
		}
	}
}
