package com.pack.tree;

class BinaryTree{
	TreeNode root;
	
	public void insert(int val) {
		this.root=insertRecursion(root, val);
	}
	
	public void nodeTreversal(TreeNode node) {
		if(node==null) return;
		nodeTreversal(node.left);
		System.out.println(node.val+" ");
		nodeTreversal(node.right);
	}
	
	private TreeNode insertRecursion(TreeNode node, int val) {
		if(node==null) {
			return new TreeNode(val);
		}
		if(val<node.val) {
			node.left=insertRecursion(node.left, val);
		}else {
			node.right=insertRecursion(node.right, val);
		}
	return node;
	}
}
public class BinaryTreeTest {
	public static void main(String...ar) {
		BinaryTree bt=new BinaryTree();
		bt.insert(20);
		bt.insert(13);
		bt.insert(56);
		bt.insert(90);
		bt.insert(29);
		bt.insert(46);
		bt.insert(29);
		bt.insert(79);
		bt.insert(21);
		bt.insert(66);
		
		bt.nodeTreversal(bt.root);
	}
}
