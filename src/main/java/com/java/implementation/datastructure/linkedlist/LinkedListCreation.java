package com.java.implementation.datastructure.linkedlist;

import java.util.Scanner;

public class LinkedListCreation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter total nodes");
			int linkedListSize = scanner.nextInt();
			String nodeData[] = new String[linkedListSize];
			System.out.println("Enter data for nodes");
			for (int i = 0; i < linkedListSize; i++) {
				nodeData[i] = scanner.next();
			}
			LinkedListNode prevNode = null;
			LinkedListNode linkedList = null;
			for (int i = 0; i < linkedListSize; i++) {
				if (i == 0) {
					prevNode = createNode(nodeData[i]);
					linkedList = prevNode;
				} else {
					LinkedListNode node = createNode(nodeData[i]);
					prevNode.setNextNode(node);
					prevNode = node;
				}
			}
			while (true) {
				System.out.println(linkedList.getData() + " ");
				linkedList = linkedList.getNextNode();
				if (linkedList == null) {
					break;
				}
			}
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			scanner.close();
		}
	}

	public static LinkedListNode createNode(String data) {
		LinkedListNode node = new LinkedListNode();
		node.setData(data);
		node.setNextNode(null);
		return node;
	}

}
