package com.arp.work;

import java.util.Stack;
/**
 * 
 * @author daiyu
 * 树的镜像
 */
public class MirrorTree {
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
	

	public static void main(String[] args) {
		MirrorTree object = new MirrorTree();
		object.init();
		object.change(object.a);
		object.preOrder(object.a);
	}
	
	public void change(BinaryTreeNode root) {
		if (root == null) return;
		if (root.left == null && root.right == null) return;
		
		BinaryTreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		if (root.left != null) change(root.left);
		if (root.right != null) change(root.right);
	}
	
	private void preOrder(BinaryTreeNode root) {
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			BinaryTreeNode node = stack.peek();
			System.out.print(node.value);
			stack.pop();
			
			if (node.right != null) stack.push(node.right);
			if (node.left != null) stack.push(node.left);
		}
	}
}
