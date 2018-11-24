package hw9_1;

/*
 * ���ϸ�: MyBinarySearchTree.java
 * �ۼ���: 2018.11.15
 * �ۼ���: �ֵ���
 * ����: int�� Ű�� �����ϴ� ����Ž��Ʈ���� �����ڷᱸ���� ������ Ŭ����
 */

import java.util.NoSuchElementException;

public class MyBinarySearchTree {
	// (1) Ʈ���� ��带 ǥ���ϴ� private Ŭ���� Node - �ʵ�(int�� key, leftChild, rightChild), ������(key���� �Ű������� �޾� �ʱ�ȭ)
	private class Node {
		int key;
		Node leftChild;
		Node rightChild;
		
		Node(int key){
			this.key = key;
		}
	}
	
	// (2) private �ν��Ͻ� ���� Ʈ���� ��Ʈ ��带 ��ų ����(root)�� �����ϰ� null�� �ʱ�ȭ
	Node root = null;

	// Ʈ���� Ű�� key�� �����ϴ� �޼ҵ�
	public void insert(int key) {
		root = insertKey(root, key);
	}

	// p�� ��Ʈ�� �ϴ� Ʈ���� Ű�� key�� �����ϰ�, ���� �� ��Ʈ�� �����ϴ� �޼ҵ�(��� �˰���)
	private Node insertKey(Node p, int key) {
		if(p == null) {  
			Node newNode = new Node(key);
			return newNode; 
		}
		else if(key < p.key) {
			p.leftChild = insertKey(p.leftChild, key);
			return p;  // ��Ʈ �Һ�
		}
		else if(key > p.key) {
			p.rightChild = insertKey(p.rightChild, key);
			return p;  // ��Ʈ �Һ�       
		}
		else {  // key = p.key �� ��� ���� ����
			System.out.println("���� ����. �ߺ��� Ű���� �����մϴ�: " + key);
			return p;   // ��Ʈ �Һ�
		}
	}  

	// Ʈ���� ������ȸ�ϸ� ����ϴ� �޼ҵ�
	public void printInorder() {
		inorder(root);
		System.out.println();
	}

	// (3) p�� ��Ʈ�� �ϴ� Ʈ���� ���� ��ȸ�ϸ� Ű���� ����ϴ� �޼ҵ�(��� �˰���)
	private void inorder(Node p) {
		if(p != null) {
			inorder(p.leftChild);
			System.out.print(p.key);
			inorder(p.rightChild);
		}
	}

	// (4) Ʈ���� �ִ� Ű���� �����ϴ� �޼ҵ�(�ݺ� �˰���) - ���� Ʈ���� ��� NoSuchElementException ���� �߻�
	public int max() {
		if(root == null) {
			throw new NoSuchElementException();
		}
		else {
			Node p = root;
			while(p.rightChild != null) {
				p = p.rightChild;
			}
			return p.key;
		}
	}

	// Ʈ���� Ű�� key�� �����ϴ��� ���θ� �����ϴ� �޼ҵ�
	public boolean contains(int key) {
		return search(root, key);
	}

	// (5) p�� ��Ʈ�� �ϴ� Ʈ���� Ű�� key�� �����ϴ��� ���θ� �����ϴ� �޼ҵ�(��� �˰���)
	private boolean search(Node p, int key) {
		if(p == null) {
			return false;
		}
		else {
			if(p.key == key) {
				return true;
			}
			else if(key < p.key) {
				return search(p.leftChild, key);
			}
			else {
				return search(p.rightChild, key);
			}
		}
	}

	// (6) Ʈ���� Ű�� key�� �����ϴ� �޼ҵ�(�ݺ� �˰���) - ���� ��������(true/false)�� ����
	public boolean add(int key) {
		Node temp2 = null;
		if(root == null) {
			Node newNode = new Node(key);
			root = newNode;
			return true;
		}
		else {
			Node temp = root;
			while(temp != null) {
				temp2 = temp;
				if(key < temp.key) {
					temp = temp.leftChild;
				}
				else if(key > temp.key) {
					temp = temp.rightChild;
				}
				else {
					return false;
				}
			}
			Node newNode = new Node(key);
			if (temp2.key < newNode.key) {
				temp2.rightChild = newNode;
			}
			else {
				temp2.leftChild = newNode;
			}
			return true;
		}
	}
}