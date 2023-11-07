package org.example;

//    pushToHead(int data), pushToTail(int data), pushToIndex(int index, int data)
//        removeFirst(), removeLast(), remove(int index)
//        get(int index)
//        size()
//        print()
// ДЗ Algorithms дописать (реализовать) методы :
//		public boolean removeLast(){return false},
//		public boolean contains(int data) {return false},
//		public int get(int index){return 0}
public class Main {

		public static void main(String[] args) {
				MyLinkedList list = new MyLinkedList();
				list.pushToHead(10);
				list.pushToHead(15);
				list.pushToHead(20);
				list.pushToTile(25);
				System.out.println("Size = " + list.size());
				list.pushToIndex(2, 11);

				list.print();

				list.removeFirst();
				list.print();

				list.remove(2);
				list.print();
// ДЗ Algorithms дописать (реализовать) методы :
//		public boolean removeLast(){return false},
				list.removeLast();
				list.print();
//		public boolean contains(int data) {return false},
				System.out.println(list.contains(11));
//		public int get(int index){return 0}
				System.out.println(list.get(1));
		}
}