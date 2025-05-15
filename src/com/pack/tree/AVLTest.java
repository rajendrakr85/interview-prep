package com.pack.tree;

class AVLNode{
	int val, height;
	AVLNode left,right;
	
	public AVLNode(int d) {
		this.val=d;
		this.height=1;
	}
}

class AVLTree{
	AVLNode root;
	
	int height(AVLNode node) {
		if(node==null) {
			return 0;
		}
		return node.height;
	}
	
	int getBalance(AVLNode node) {
		if(node==null) {
			return 0;
		}
		return height(node.left)-height(node.right);
	}
	
	AVLNode rightRotate(AVLNode y) {
		AVLNode x= y.left;
		AVLNode t2= x.right;
		
		x.right=y;
		y.left=t2;
		
		y.height=Math.max(height(y.left), height(y.right))+1;
		x.height=Math.max(height(x.left), height(x.right))+1;
		
		return x;
	}
	
	AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }
	
	 AVLNode insert(AVLNode node, int val) {
	        if (node == null)
	            return new AVLNode(val);

	        if (val < node.val)
	            node.left = insert(node.left, val);
	        else if (val > node.val)
	            node.right = insert(node.right, val);
	        else
	            return node; // no duplicates

	        node.height = 1 + Math.max(height(node.left), height(node.right));

	        int balance = getBalance(node);

	        // Left Left Case
	        if (balance > 1 && val < node.left.val)
	            return rightRotate(node);

	        // Right Right Case
	        if (balance < -1 && val > node.right.val)
	            return leftRotate(node);

	        // Left Right Case
	        if (balance > 1 && val > node.left.val) {
	            node.left = leftRotate(node.left);
	            return rightRotate(node);
	        }

	        // Right Left Case
	        if (balance < -1 && val < node.right.val) {
	            node.right = rightRotate(node.right);
	            return leftRotate(node);
	        }

	        return node;
	    }

	    // Inorder traversal
	    void inOrder(AVLNode node) {
	        if (node != null) {
	            inOrder(node.left);
	            System.out.print(node.val + " ");
	            inOrder(node.right);
	        }
	    }
}

public class AVLTest {

	public static void main(String[] args) {
		 AVLTree tree = new AVLTree();

	        int[] values = {10, 20, 30, 40, 50, 25};
	        for (int val : values) {
	            tree.root = tree.insert(tree.root, val);
	        }

	        System.out.print("Inorder traversal of AVL tree: ");
	        tree.inOrder(tree.root); 
	}

}
