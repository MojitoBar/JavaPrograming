package lab9_1;

public class MyArrayTree {
	private int[] treeArray; // Ʈ���� ������ �迭
	private int number;   // Ʈ���� ���� ��

	// ���� Ʈ���� �ʱ�ȭ �ϴ� ������
	public MyArrayTree() {
		number = 0;
		treeArray = new int[100];
	}

	// �Ű������� ���� �迭�� Ʈ���� �ʱ�ȭ�ϴ� ������
	public MyArrayTree(int[] array) {
		number = array.length;
		treeArray = new int[number];
		for(int i = 0; i < number; i++) {
			treeArray[i] = array[i];
		}
	}

	// Ʈ�� ��ü�� ���� ��ȸ�ϸ� ����� �����͸� ���
	public void printPreorder() {
		preorder(0);
		System.out.println();
	}

	// �ε��� index�� ��带 ��Ʈ�� �ϴ� Ʈ���� ���� ��ȸ�ϴ� �޼ҵ�
	private void preorder(int index) {
		if(treeArray[index] != 0) {
			System.out.print(treeArray[index] + " ");
			if(2 * index + 1 < treeArray.length)
				preorder(2 * index + 1);
			if(2 * index + 2 < treeArray.length)
				preorder(2 * index + 2);
		}
	}

	// Ʈ�� ��ü�� ���� ��ȸ�ϸ� ����� �����͸� ���
	public void printInorder() {
		inorder(0);
		System.out.println();
	}

	// �ε��� index�� ��带 ��Ʈ�� �ϴ� Ʈ���� ���� ��ȸ�ϴ� �޼ҵ�
	private void inorder(int index) {
		if(treeArray[index] != 0) {
			if(2 * index + 1 < treeArray.length)
				inorder(2 * index + 1);
			System.out.print(treeArray[index] + " ");
			if(2 * index + 2 < treeArray.length)
				inorder(2 * index + 2);
		}
		}
	
		// ��Ʈ������ ������忡 �̸������ ���� �ڽĵ��� ����ϴ� �޼ҵ�
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
