package list;

public class Stack_demo {
	public static void main(String[] args) {
		MyStack s = new MyStack();
		s.push("hello");
		s.push("world");
		s.push("java");
		
		System.out.println(s.isEmpty());
		System.out.println(s.top());
		s.pop();
		System.out.println(s.top());
	}
}
