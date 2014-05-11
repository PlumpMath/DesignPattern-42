package algorithm.base;

public class Stack {

	private Node top;

	public Node peek() {
		if (top != null) {
			return top;
		}
		return null;
	}

	public Node pop() {
		if (top == null) {
			return null;
		} else {
			Node temp = new Node(top.value);
			top = top.next;
			return temp;
		}
	}

	public void push(Node n) {
		if (n != null) {
			Node temp = n;
			temp.next = top;
			top = temp;
		}
	}
}
