package com.java.implementation.datastructure.linkedlist;

public class DoubleLinkedListNode {

	private DoubleLinkedListNode previousNode;
	private Object data;
	private DoubleLinkedListNode nextNode;

	public DoubleLinkedListNode getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(DoubleLinkedListNode previousNode) {
		this.previousNode = previousNode;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public DoubleLinkedListNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(DoubleLinkedListNode nextNode) {
		this.nextNode = nextNode;
	}

}
