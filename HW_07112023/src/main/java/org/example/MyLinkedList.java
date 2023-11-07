package org.example;

public class MyLinkedList {
		//    pushToHead(int data), pushToTail(int data), pushToIndex(int index, int data)
//        removeFirst(), removeLast(), remove(int index)
//        get(int index)
//        size()
//        print()
		// ДЗ Algorithms дописать (реализовать) методы :
//		public boolean removeLast(){return false},
//		public boolean contains(int data) {return false},
//		public int get(int index){return 0}
		private Node head;

		public void pushToHead(int data) {// dobvit v golovu
				Node newNode = new Node(data);// obernuli data v Node
				if (head == null) {
						head = newNode;
						return;
				}
				newNode.setNext(head);
				head = newNode;
		}

		public void pushToTile(int data) {
				Node newNode = new Node(data);// obernuli data v Node
				if (head == null) {
						head = newNode;
						return;
				}
				Node last = head;
				while (last.getNext() != null) {
						last = last.getNext();
				}
				last.setNext(newNode);
		}

		public boolean pushToIndex(int index, int data) {
				Node newNode = new Node(data);// obernuli data v Node
				if (index < 0 || index > (size() - 1)) {
						System.out.println("Index not validate");
						return false;
				}
				if (index == 0) {
						newNode.setNext(head);
						head = newNode;
						return true;
				}
				Node current = head;
				int currentIndex = 0;
				while (currentIndex < index - 1) {
						current = current.getNext();
						currentIndex++;
				}
				newNode.setNext(current.getNext());
				current.setNext(newNode);

				return true;
		}

		public boolean removeFirst() {
				if (head == null) {
						System.out.println(" List is null");
						return false;
				}
				Node current = head;
				if (current.getNext() != null) {
						head = current.getNext();
				} else {
						head = null;
				}
				return true;
		}
//		public boolean removeLast(){return false},
		public boolean removeLast() {
				if (head == null) {
						System.out.println("List is null");
						return false;
				}

				if (head.getNext() == null) {
						head = null;
						return true;
				}

				Node current = head;
				while (current.getNext().getNext() != null) {
						current = current.getNext();
				}
				current.setNext(null);
				return true;
		}
		//		public boolean contains(int data) {return false},
		public boolean contains(int data) {
				if (head == null) {
						System.out.println("List is null");
						return false;
				}
				Node current = head;
				while (current != null) {
						if (current.getData() == data) {
								return true;
						}
						current = current.getNext();
				}
				return false;
		}
		//		public int get(int index){return 0}
		public int get(int index) {
				if (index < 0) {
						throw new IllegalArgumentException("Index must be non-negative");
				}

				Node current = head;
				int currentIndex = 0;

				while (current != null) {
						if (currentIndex == index) {
								return current.getData();
						}
						current = current.getNext();
						currentIndex++;
				}

				throw new IndexOutOfBoundsException("Index out of bounds");
		}


		public boolean remove(int index) {
				if (index < 0 || index > (size() - 1)) {
						System.out.println("Index not validate");
						return false;
				}
				Node current = head;
				int currentIndex = 0;
				while (currentIndex < index - 1) {
						current = current.getNext();
						currentIndex++;
				}
				current.setNext(current.getNext().getNext());
				return true;
		}

		public int size() {
				if (head == null) return 0;
				Node current = head;
				int size = 1;
				while (current.getNext() != null) {
						current = current.getNext();
						size++;
				}
				return size;
		}

		void print() {
				Node current = head;
				while (current != null) {
						System.out.print(current.getData() + " ");
						current = current.getNext();
				}
				System.out.println();
		}
}

