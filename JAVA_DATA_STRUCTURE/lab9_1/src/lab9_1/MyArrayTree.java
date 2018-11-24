package lab9_1;

public class MyArrayTree {
	private int[] treeArray; // 트리를 구현한 배열
	private int number;   // 트리의 원소 수

	// 공백 트리로 초기화 하는 생성자
	public MyArrayTree() {
		number = 0;
		treeArray = new int[100];
	}

	// 매개변수로 받은 배열로 트리를 초기화하는 생성자
	public MyArrayTree(int[] array) {
		number = array.length;
		treeArray = new int[number];
		for(int i = 0; i < number; i++) {
			treeArray[i] = array[i];
		}
	}

	// 트리 전체를 전위 순회하며 노드의 데이터를 출력
	public void printPreorder() {
		preorder(0);
		System.out.println();
	}

	// 인덱스 index인 노드를 루트로 하는 트리를 전위 순회하는 메소드
	private void preorder(int index) {
		if(treeArray[index] != 0) {
			System.out.print(treeArray[index] + " ");
			if(2 * index + 1 < treeArray.length)
				preorder(2 * index + 1);
			if(2 * index + 2 < treeArray.length)
				preorder(2 * index + 2);
		}
	}

	// 트리 전체를 중위 순회하며 노드의 데이터를 출력
	public void printInorder() {
		inorder(0);
		System.out.println();
	}

	// 인덱스 index인 노드를 루트로 하는 트리를 중위 순회하는 메소드
	private void inorder(int index) {
		if(treeArray[index] != 0) {
			if(2 * index + 1 < treeArray.length)
				inorder(2 * index + 1);
			System.out.print(treeArray[index] + " ");
			if(2 * index + 2 < treeArray.length)
				inorder(2 * index + 2);
		}
	}

	// 루트노드부터 리프노드에 이르기까지 왼쪽 자식들을 출력하는 메소드
	public void printLeft() {
		int i = 0;
		while(i <= treeArray.length) {
			if(treeArray[i] != 0) {				
				System.out.print(treeArray[i] + " ");
				i = 2 * i + 1;
			}
			else
				break;
		}
		System.out.println();
		System.out.println();
	}
}
