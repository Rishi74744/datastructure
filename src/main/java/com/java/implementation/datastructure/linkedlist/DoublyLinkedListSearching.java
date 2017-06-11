package com.java.implementation.datastructure.linkedlist;

import java.util.Scanner;

public class DoublyLinkedListSearching {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter total nodes");
			int linkedListSize = scanner.nextInt();
			String nodeData[] = new String[linkedListSize];
			System.out.println("Enter data for each node");
			for (int i = 0; i < linkedListSize; i++) {
				nodeData[i] = scanner.next();
			}
			DoubleLinkedListNode prevNode = null;
			DoubleLinkedListNode linkedList = null;
			for (int i = 0; i < linkedListSize; i++) {
				if (i == 0) {
					prevNode = createNode(null, nodeData[i]);
					linkedList = prevNode;
				} else {
					DoubleLinkedListNode node = createNode(prevNode, nodeData[i]);
					prevNode.setNextNode(node);
					prevNode = node;
				}
			}
			System.out.println("Enter element you want to search");
			String element = scanner.next();
			boolean isElementFound = false;
			int index = 1;
			while (true) {
				if (linkedList.getData().equals(element)) {
					isElementFound = true;
					break;
				}
				if (linkedList.getNextNode() != null) {
					linkedList = linkedList.getNextNode();
				} else {
					break;
				}
				index++;
			}
			if (isElementFound) {
				System.out.println("Element found at node : " + index);
			} else {
				System.out.println("Element not found!");
			}
		} catch (

		Exception e) {
			System.err.println(e);
		} finally {
			scanner.close();
		}
	}

	public static DoubleLinkedListNode createNode(DoubleLinkedListNode previousNode, String data) {
		DoubleLinkedListNode node = new DoubleLinkedListNode();
		node.setPreviousNode(previousNode);
		node.setData(data);
		node.setNextNode(null);
		return node;
	}

}
