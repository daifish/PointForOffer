package com.arp.work;

public class DepthForTree {
	BinaryTreeNode a, b, c, d, e, f, g, h, i, j, k;
	
	private void init() {
		a = new BinaryTreeNode(8);
		b = new BinaryTreeNode(8);
		c = new BinaryTreeNode(9);
		d = new BinaryTreeNode(2);
		e = new BinaryTreeNode(4);
		f = new BinaryTreeNode(7);
		g = new BinaryTreeNode(7);
		
		a.left = b;
		a.right = g;
		b.left = c;
		b.right = d;
		d.left = e;
		d.right = f;
	}
	
	public int getDepth(BinaryTreeNode root) {
		if (root == null) return 0;
		
		int depthLeft = getDepth(root.left);
		int depthRight = getDepth(root.right);
		
		return (depthLeft > depthRight) ? (depthLeft + 1) : (depthRight + 1);
	}
	
	public static void main(String[] args) {
		DepthForTree test = new DepthForTree();
		test.init();
		System.out.println(test.getDepth(test.a));
	}
}
