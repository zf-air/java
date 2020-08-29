package list;

import java.util.LinkedList;

public class MyStack {
	private LinkedList link;
	
	public MyStack() {
		link = new LinkedList();
	}
	
	public void push(Object e) {
		link.addLast(e);
	}
	
	public void pop() {
		link.removeLast();
	}
	
	public Object top() {
		return link.getLast();
	}
	
	public boolean isEmpty() {
		return link.isEmpty();
	}
}
