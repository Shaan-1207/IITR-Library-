package com.apnacollage.binarytrees;

public class BinaryTrees {
	static class Node {

		int data;
		Node left;
		Node right;
		
		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
			

		}
	}

	static class BinaryTree {
		static int indx = -1;

		public Node buildTree(int nodes[]) {
			indx++;

			if (nodes[indx] == -1) {
				return null;
			}

			Node newNodes = new Node(nodes[indx]);
			newNodes.left = buildTree(nodes);
			newNodes.right = buildTree(nodes);

			return newNodes;

		}

	}
	
	//preOrder traversal
	public static void preOrder(Node root) {
		if (root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	

	//postOrder traversal
	public static void postOrder(Node root) {
		if (root == null) {
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
	
	//inOrder traversal
	public static void inOrder(Node root) {
		if (root == null) {
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	public static void main(String[] args) {
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);

//		preOrder(root);
//		postOrder(root);
		inOrder(root);
	}

}
