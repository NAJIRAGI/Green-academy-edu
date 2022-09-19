package chapter11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stacke {

	public static void main(String[] args) {
	Stack<String> stack = new Stack<>();
	
	stack.push("A");
	System.out.println(stack.peek());
	stack.push("B");
	System.out.println(stack.peek());
	stack.push("C");
	System.out.println(stack.peek());
	stack.push("D");
	System.out.println(stack.peek());
	stack.push("E");
	System.out.println(stack.peek());
	stack.push("F");
	System.out.println(stack.peek());
	
	System.out.println("----------------------------------");
	
	// first in = = = > last out (먼저 들어간 객체가 마지막에 나옴)
	while(!stack.isEmpty()) {
		System.out.println(stack.pop());
	}
	System.out.println("----------------------------------");
	System.out.println("----------------------------------");
	
	Queue<String> queue = new LinkedList<>();
	
	queue.offer("A");
	System.out.println(queue.peek());
	queue.offer("B");
	System.out.println(queue.peek());
	queue.offer("C");
	System.out.println(queue.peek());
	queue.offer("D");
	System.out.println(queue.peek());
	queue.offer("E");
	System.out.println(queue.peek());
	queue.offer("F");
	System.out.println(queue.peek());
	
	System.out.println("----------------------------------");
	
	// first in = = = > first out (먼저 들어간 객체가 먼저 나옴)
	while(!queue.isEmpty()) {
		System.out.println(queue.poll());
	}
	
	
	}

}
