package algorithm.base;

public class Queue {

	private Node first,last;
	/**
	 * �����
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
	 * ������
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
