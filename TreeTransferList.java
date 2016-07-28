package com.arp.work;
/**
 * 返回值有问题
 * @author daiyu
 *
 */
public class TreeTransferList {
	BinaryTreeNode a, b, c, d, e, f, g, h, i, j, k;
	BinaryTreeNode preV;
	
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
	
	public static void main(String[] args) {
		TreeTransferList object = new TreeTransferList();
		object.init();
		BinaryTreeNode head = object.convert(object.a);
		while (head != null)
			System.out.println(head.value);
	}
	
	public BinaryTreeNode convert(BinaryTreeNode root) {
		convert(root, preV);
		
		BinaryTreeNode result = preV;
		while(result != null && result.left != null)
			result = result.left;
		
		return result;
	}
	
	private BinaryTreeNode convert(BinaryTreeNode root, BinaryTreeNode preV) {
		if (root == null) return preV;
		
		BinaryTreeNode current = root;
		
		if (current.left != null)
			convert(current.left, preV);
		
		current.left = preV;
		
		if (preV != null)
			preV.right = current;
		
		preV = current;
		
		if (current.right != null)
			convert(current.right, preV);
		
		return preV;
	}
	
}
