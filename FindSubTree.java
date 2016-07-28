package com.arp.work;

public class FindSubTree {
	BinaryTreeNode a, b, c, d, e, f, g, h, i, j, k;
	
	private void init() {
		a = new BinaryTreeNode(8);
		b = new BinaryTreeNode(8);
		c = new BinaryTreeNode(9);
		d = new BinaryTreeNode(2);
		e = new BinaryTreeNode(4);
		f = new BinaryTreeNode(7);
		g = new BinaryTreeNode(7);
		
		h = new BinaryTreeNode(8);
		g = new BinaryTreeNode(9);
		i = new BinaryTreeNode(2);
		
		a.left = b;
		a.right = g;
		b.left = c;
		b.right = d;
		d.left = e;
		d.right = f;
		
		h.left = g;
		h.right = i;
	}
	
	public static void main(String[] args) {
		FindSubTree object = new FindSubTree();
		object.init();
		System.out.println(object.hasSubTree(object.a, object.h));
	}
	
	public boolean hasSubTree(BinaryTreeNode root1, BinaryTreeNode root2) {
		boolean result = false;
		
		if (root1 != null && root2 != null) {
			if (root1.value == root2.value)
				result = treeHasAnotherTree(root1, root2);
			if (!result)
				result = hasSubTree(root1.left, root2);
			if (!result)
				result = hasSubTree(root1.right, root2);
		}
		
		return result;
	}
	
	private boolean treeHasAnotherTree(BinaryTreeNode root1, BinaryTreeNode root2) {
		if (root2 == null) return true;
		if (root1 == null) return false;
		if (root1.value != root2.value) return false;
		return treeHasAnotherTree(root1.left, root2.left) && treeHasAnotherTree(root1.right, root2.right);
	}
	
	
}
