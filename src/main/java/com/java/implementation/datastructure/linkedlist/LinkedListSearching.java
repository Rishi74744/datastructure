package com.java.implementation.datastructure.linkedlist;

import java.util.Scanner;

public class LinkedListSearching {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the size of linked list : ");
			int linkedListSize = scanner.nextInt();
			String nodeData[] = new String[linkedListSize];
			System.out.println("Enter total nodes");
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
			System.out.println("Enter data you want to search : ");
			Object searchData = scanner.next();
			int index = 1;
			boolean dataExists = false;
			while (true) {
				Object linkListData = linkedList.getData();
				linkedList = linkedList.getNextNode();
				if (linkListData.equals(searchData)) {
					dataExists = true;
					break;
				}
				if (linkedList == null) {
					break;
				}
				index++;
			}
			if (dataExists) {
				System.out.println("Data found at index : " + index);
			} else {
				System.out.println("Data not found!");
			}
		} catch (Exception e) {
			e.printStackTrace();
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
