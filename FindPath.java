package com.arp.work;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author daiyu
 * 找出二叉树中的某个路径和为target
 */
public class FindPath {
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
		FindPath object = new FindPath();
		object.init();
		object.findPath(object.a, 15);
	}
	
	public void findPath(BinaryTreeNode root, int expectedNum) {
		if (root == null) return;
		ArrayList<Integer> path = new ArrayList<Integer>();
		
		findPath(root, expectedNum, path, 0);
	}
	
	private void findPath(BinaryTreeNode root, int expectedNum, List<Integer> path, int currentSum) {
		currentSum += root.value;
		path.add(root.value);
		
		boolean isLeaf = root.left == null && root.right == null;
		
		if (currentSum == expectedNum && isLeaf) {
			for (Integer i : path)
				System.out.print(i + " ");
		}
		
		if (root.left != null)
			findPath(root.left, expectedNum, path, currentSum);
		
		if (root.right != null)
			findPath(root.right, expectedNum, path, currentSum);
		
		path.remove(path.size() - 1);
	}
}
