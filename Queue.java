package dataqueue;

import java.util.Scanner;

class QNode {
	int data;
	QNode next;

	QNode(int data) {
		this.data = data;
		this.next = null;
	}
}
public class Queue {
	QNode front;
	QNode rear;

	void enque(int val) {
		QNode n = new QNode(val);
		if (rear == front && rear == null) {
			n.next = rear;
			rear = n;
			front = rear;
			return;
		}
		rear.next = n;
		rear = n;
	}
	void printQueue() {
		QNode temp = this.front;
		while (temp != null) {
			System.out.println(temp.data );
			temp = temp.next;
		
	}
	}
	public static void main(String[] args) {
		Queue q = new Queue();
		
		q.enque(56);
		q.enque(30);
		q.enque(70);
		q.printQueue();
}
}
