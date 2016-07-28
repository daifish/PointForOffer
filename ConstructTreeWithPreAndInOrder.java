package com.arp.work;

import java.util.Stack;

/**
 * 
 * @author daiyu 根据前序中序构建二叉树
 */
public class ConstructTreeWithPreAndInOrder {
	private int[] preOrder = { 1, 2, 4, 7, 3, 5, 6, 8 };
	private int[] inOrder = { 4, 7, 2, 1, 5, 3, 8, 6 };

	public static void main(String[] args) {
		ConstructTreeWithPreAndInOrder object = new ConstructTreeWithPreAndInOrder();
		BinaryTreeNode root = object.construct(object.preOrder, object.inOrder);
		object.preTraverse(root);
	}

	public BinaryTreeNode construct(int[] preOrder, int[] inOrder) {
		if (preOrder == null || preOrder.length == 0)
			return null;

		BinaryTreeNode root = new BinaryTreeNode(preOrder[0]);
		int leftLength = getLeftLength(inOrder, root);

		int[] leftPreTree = constructArray(preOrder, 1, leftLength);
		int[] leftInTree = constructArray(inOrder, 0, leftLength);
		int[] rightPreTree = constructArray(preOrder, leftLength + 1, preOrder.length - leftLength - 1);
		int[] rightInTree = constructArray(inOrder, leftLength + 1, preOrder.length - leftLength - 1);

		root.left = construct(leftPreTree, leftInTree);
		root.right = construct(rightPreTree, rightInTree);

		return root;
	}

	private int[] constructArray(int[] origin, int originIndex, int length) {
		int[] array = new int[length];
		System.arraycopy(origin, originIndex, array, 0, length);
		return array;
	}

	private int getLeftLength(int[] inOrder, BinaryTreeNode root) {
		int leftLength = 0;

		for (int i = 0; i < inOrder.length; i++) {
			if (inOrder[i] == root.value)
				break;
			else
				leftLength++;
		}

		return leftLength;
	}

	private void preTraverse(BinaryTreeNode root) {
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		stack.push(root);

		while (!stack.isEmpty()) {
			BinaryTreeNode binaryTree = (BinaryTreeNode) stack.pop();
			System.out.print(binaryTree.value + " ");
			if (binaryTree.right != null)
				stack.push(binaryTree.right);
			if (binaryTree.left != null)
				stack.push(binaryTree.left);
		}
	}

}
