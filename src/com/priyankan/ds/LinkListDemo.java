package com.priyankan.ds;

public class LinkListDemo {

	public static void main(String[] args) {
		Node<String> head = new Node<String>("A");
		Node<String> b = new Node<String>("B");
		head.setNext(b);
		b.setPrevious(head);
		Node<String> c = new Node<String>("C");
		b.setNext(c);
		c.setPrevious(b);
		Node<String> d = new Node<String>("D");
		c.setNext(d);
		d.setPrevious(c);
		Node<String> e = new Node<String>("E");
		d.setNext(e);
		e.setPrevious(d);
		
		LinkListUtil<String> linkListUtil = new LinkListUtil<String>();
		linkListUtil.printList(head);
		System.out.println("--------------");
		linkListUtil.printConsecutiveNodesInList(head);
		System.out.println("--------------");
		linkListUtil.reverseLinkedList(e);
		
		
		
	}
}
