package org.example;


public class CustomQueue {
		private int[] data;
		private int head;
		private int tail;

		public CustomQueue(int capacity) {
				data = new int[capacity];
				head = -1;
				tail = -1;
		}
		//2.Реализовать методы enqueue(), dequeue(), size() у класса CustomQueue
		public void enqueue(int element) {
				if (tail == data.length - 1) {
						throw new RuntimeException("Queue is full");
				}
				data[++tail] = element;
				if (head == -1) {
						head = 0; // Устанавливаем начальную голову, если она была -1
				}
		}

		public int dequeue() {
				if (isEmpty()) {
						throw new RuntimeException("Queue is empty");
				}
				int element = data[head];
				if (head == tail) {
						head = tail = -1; // Очищаем очередь
				} else {
						head++;
				}
				return element;
		}

		public boolean isEmpty() {
				return head == -1;
		}

		public int size() {
				if (isEmpty()) {
						return 0;
				} else {
						return tail - head + 1;
				}
		}

		public static void main(String[] args) {
				CustomQueue queue = new CustomQueue(5);
				queue.enqueue(1);
				queue.enqueue(2);
				queue.enqueue(3);
				queue.enqueue(4);
				queue.enqueue(5);
				System.out.println(queue.dequeue());
				System.out.println(queue.dequeue());
				System.out.println(queue.dequeue());
				System.out.println(queue.dequeue());
				System.out.println(queue.dequeue());
		}
}
