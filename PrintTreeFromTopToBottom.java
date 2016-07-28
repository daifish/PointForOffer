package com.arp.work;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author daiyu 
 * 二叉树的层次遍历
 */
public class PrintTreeFromTopToBottom {
	BinaryTreeNode a, b, c, d, e, f, g, h, i, j, k;

	private Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();

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
		PrintTreeFromTopToBottom object = new PrintTreeFromTopToBottom();
		object.init();
		object.print();
	}

	public void print() {
		queue.offer(a);

		while (!queue.isEmpty()) {
			BinaryTreeNode node = queue.poll();
			System.out.println(node.value);
			if (node.left != null)
				queue.offer(node.left);
			if (node.right != null)
				queue.offer(node.right);
		}
	}
}
