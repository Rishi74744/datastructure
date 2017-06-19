package com.java.implementation.datastructure.queue;

public class Queue {

	private Queue next;
	private Object data;

	public Queue getNext() {
		return next;
	}

	public void setNext(Queue next) {
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
