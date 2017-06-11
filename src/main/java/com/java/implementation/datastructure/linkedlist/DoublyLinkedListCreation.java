package com.java.implementation.datastructure.linkedlist;

import java.util.Scanner;

public class DoublyLinkedListCreation {

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
			while (true) {
				System.out.println(
						linkedList.getPreviousNode() + " " + linkedList.getData() + " " + linkedList.getNextNode());
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

	public static DoubleLinkedListNode createNode(DoubleLinkedListNode previousNode, String data) {
		DoubleLinkedListNode node = new DoubleLinkedListNode();
		node.setPreviousNode(previousNode);
		node.setData(data);
		node.setNextNode(null);
		return node;
	}

}
