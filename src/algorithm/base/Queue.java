package algorithm.base;

public class Queue {

	private Node first,last;
	/**
	 * 入队列
	 */
	public void enQueue(Node n){
		if(first==null){
			first=n;
			last=n;
		}else{
			last.next=n;
			last=n;
		}
	}
	/**
	 * 出队列
	 */
	public Node deQueue(){
		if(first==null){
			return null;
		}else{
			Node temp=first;
			first=first.next;
			return temp;
		}
	}

}
