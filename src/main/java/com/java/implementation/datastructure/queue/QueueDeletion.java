package com.java.implementation.datastructure.queue;

import java.util.Scanner;

public class QueueDeletion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter queue size : ");
			int queueSize = scanner.nextInt();
			Queue front = new Queue();
			System.out.println("Enter data for queue : ");
			String data[] = new String[queueSize];
			for (int i = 0; i < queueSize; i++) {
				data[i] = scanner.next();
			}
			Queue q = new Queue();
			Queue nextElement = new Queue();
			int count = 0;
			for (int i = 0; i < queueSize; i++) {
				if (i == 0) {
					q.setNext(null);
					q.setData(data[i]);
					front = q;
				} else {
					nextElement = insert(q, data[i]);
					q = nextElement;
				}
			}
			System.out.println("Enter the data for deletion from queue: ");
			String element = scanner.next();
			boolean isElementFound = false;
			while (count < queueSize) {
				if (front.getData().equals(element)) {
					isElementFound = true;
					break;
				}
				front = front.getNext();
				count++;
			}
			if (isElementFound) {
				System.out.println("Data found at : " + count);
			} else {
				System.out.println("No data found!");
			}
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			scanner.close();
		}
	}

	public static Queue insert(Queue previous, String data) {
		Queue q = new Queue();
		q.setData(data);
		previous.setNext(q);
		return q;
	}

}
