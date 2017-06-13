package com.java.implementation.datastructure.stack;

import java.util.Scanner;

public class StackPop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter stack size");
			int stackSize = scanner.nextInt();
			String stackData[] = new String[stackSize];
			System.out.println("Enter data for stack");
			for (int i = 0; i < stackSize; i++) {
				stackData[i] = scanner.next();
			}
			Stack currentTopOfStack = null;
			for (int i = 0; i < stackSize; i++) {
				currentTopOfStack = push(currentTopOfStack, stackData[i]);
			}
			while (true) {
				System.out.println(pop(currentTopOfStack));
				currentTopOfStack = currentTopOfStack.getTopOfStack();
				if (currentTopOfStack == null) {
					break;
				}
			}
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			scanner.close();
		}
	}

	public static Stack push(Stack prevStack, String data) {
		Stack stack = new Stack();
		stack.setData(data);
		stack.setTopOfStack(prevStack);
		return stack;
	}

	public static String pop(Stack topOfStack) {
		return topOfStack.getData().toString();
	}

}
