package com.arp.work;

public class DeleteWithInO1 {
	ListNode head, second, third, fourth, tail;

	private void init() {
		head = new ListNode(1);
		second = new ListNode(2);
		third = new ListNode(3);
		fourth = new ListNode(4);
		tail = new ListNode(5);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = tail;
	}
	
	public static void main(String[] args) {
		DeleteWithInO1 object = new DeleteWithInO1();
		object.init();
		object.deleteWithInO1(object.head, object.head);
		ListNode head = object.head;
		while(head != null) {
			System.out.println(head.key);
			head = head.next;
		}
	}

	public void deleteWithInO1(ListNode head, ListNode deleted) {
		if (head == null || deleted == null)
			return;
		if (deleted.next != null) {
			ListNode temp = deleted.next;
			deleted.key = temp.key;
			deleted.next = temp.next;
		} else if (head == deleted) {
			head = null;
		} else {
			ListNode temp = head;
			while (temp.next != deleted) {
				temp = temp.next;
			}
			temp.next = null;
		}
	}
	
}
