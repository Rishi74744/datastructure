package com.java.implementation.datastructure.linkedlist;

import java.util.Scanner;

public class LinkedListDeletion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the size of linked list : ");
			int linkedListSize = scanner.nextInt();
			String nodeData[] = new String[linkedListSize];
			System.out.println("Insert data to create linked list");
			for (int i = 0; i < linkedListSize; i++) {
				nodeData[i] = scanner.next();
			}
			Node prevNode = null;
			Node linkedList = null;
			for (int i = 0; i < linkedListSize; i++) {
				if (i == 0) {
					prevNode = createNode(nodeData[i]);
					linkedList = prevNode;
				} else {
					Node node = createNode(nodeData[i]);
					prevNode.setNextNode(node);
					prevNode = node;
				}
			}
			System.out.println("Enter node data you want to delete : ");
			Object searchData = scanner.next();
			int index = 1;
			boolean dataExists = false;
			Node fisrtNode = linkedList;
			while (true) {
				Object linkListData = linkedList.getData();
				if (linkListData.equals(searchData)) {
					linkedList = linkedList.getNextNode();
					fisrtNode = linkedList;
					dataExists = true;
					break;
				} else if (linkedList.getNextNode().getData().equals(searchData)) {
					linkedList.setNextNode(linkedList.getNextNode().getNextNode());
					dataExists = true;
					break;
				}
				linkedList = linkedList.getNextNode();
				if (linkedList == null) {
					break;
				}
				index++;
			}
			if (dataExists) {
				System.out.println("Data found at index : " + index + " and deleted!");
				while (true) {
					System.out.println(fisrtNode.getData() + " ");
					fisrtNode = fisrtNode.getNextNode();
					if (fisrtNode == null) {
						break;
					}
				}
			} else {
				System.out.println("Data not found!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

	public static Node createNode(String data) {
		Node node = new Node();
		node.setData(data);
		node.setNextNode(null);
		return node;
	}

}
