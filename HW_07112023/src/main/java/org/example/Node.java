package org.example;

public class Node {
		// delaem odnosvyazyiy spisok
		private int data;
		private Node next; // ssilka na sleduyshiy obekt

		public Node(int data) {
				this.data = data;
		}

		public int getData() {
				return data;
		}

		public void setData(int data) {
				this.data = data;
		}

		public Node getNext() {
				return next;
		}

		public void setNext(Node next) {
				this.next = next;
		}
}
