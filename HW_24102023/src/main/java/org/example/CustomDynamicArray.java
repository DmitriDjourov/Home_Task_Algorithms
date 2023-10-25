package org.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomDynamicArray implements Iterable<Integer>{

		private int[] data;
		private int size;
		private int count;

		public CustomDynamicArray(){
				data = new int[1];
				size = 1;
				count = 0;
		}

		public CustomDynamicArray(int capacity){
				data = new int[capacity];
				size = capacity;
				count = 0;
		}

		public void add(int element){
				if (count >= size) {
						growSize();
				}
				data[count++] = element;
		}

		public void addAt(int index, int element) {
				if (index >= count) throw new IndexOutOfBoundsException("Input index is out of bounds");
				if (count >= size) {
						growSize();
				}
				for (int i = count; i > index; i--) {
						data[i] = data[i - 1];
				}
				data[index] = element;
				count++;
		}

		public void remove(){
				if (count == 0) throw new NoSuchElementException();
				data[count - 1] = 0; // data[count - 1] = null - necessary in case of objects for Garbage Collector
				count--;
//        shrinkSize();
		}
//========================================== HW ===========================================
/*Реализовать методы у класса CustomDynamicArray (см. код занятия в репозитории):
		public void removeAt(int index)
		public void shrinkSize() - сократить размер внутреннего массива до текущего числа элементов
		public void set(int index, int data)
		public int get(int index)
		public void clear()
		public boolean contains(int data)
		public boolean isEmpty()*/

		public void removeAt(int index){ // TODO
				if (index < 0 || index >= count) {
						throw new IndexOutOfBoundsException("Input index is out of bounds");
				}
				for (int i = index; i < count - 1; i++) {
						data[i] = data[i + 1];
				}
				data[count - 1] = 0;
				count--;
		}

		public void shrinkSize() { //TODO
				if (count < size) {
						int[] newData = new int[count];
						System.arraycopy(data, 0, newData, 0, count);
						data = newData;
						size = count;
				}
		}

		public void set(int index, int newData){ //TODO
				if (index < 0 || index >= count) {
						throw new IndexOutOfBoundsException("Input index is out of bounds");
				}
				data[index] = newData;
		}

		public int get(int index){ //TODO
				if (index < 0 || index >= count) {
						throw new IndexOutOfBoundsException("Input index is out of bounds");
				}
				return data[index];
		}

		public void clear(){ // TODO
				for (int i = 0; i < count; i++) {
						data[i] = 0;
				}
				count = 0;
		}

		public boolean contains(int newData) {// TODO
				for (int i = 0; i < count; i++) {
						if (data[i] == newData) {
								return true;
						}
				}
				return false;
		}

		public boolean isEmpty(){
				return count == 0;
		}
		//=====================================================================================
		private void growSize() {
				int[] newData = new int[2 * size];
				for (int i = 0; i < count; i++) {
						newData[i] = data[i];
				}
				data = newData;
				size = 2 * size;
		}
		public static void main(String[] args) {
				CustomDynamicArray array = new CustomDynamicArray();
				array.add(1);
				System.out.println(array);
				array.printInnerStructure();

				array.add(2);
				System.out.println(array);
				array.printInnerStructure();

				array.add(3);
				System.out.println(array);
				array.printInnerStructure();

				array.add(4);
				System.out.println(array);
				array.printInnerStructure();

				array.add(5);
				System.out.println(array);
				array.printInnerStructure();

				array.addAt(0, 10);
				System.out.println(array);
				array.printInnerStructure();

				array.remove();
				System.out.println(array);
				array.printInnerStructure();
				System.out.println("========================= HW =======================================================");
		//========================= HW =======================================================
				array.removeAt(4);
				System.out.println(array);
				array.printInnerStructure();

				array.shrinkSize();
				System.out.println(array);
				array.printInnerStructure();

				array.set(1,1);
				System.out.println(array);
				array.printInnerStructure();

				int a = array.get(0);
				System.out.println(a);
				System.out.println(array);
				array.printInnerStructure();


				boolean b = array.contains(4);
				System.out.println(b);
				System.out.println(array);
				array.printInnerStructure();

				array.clear();
				System.out.println(array);
				array.printInnerStructure();

				boolean empty = array.isEmpty();
				System.out.println(empty);
				System.out.println(array);
				array.printInnerStructure();
		}

		@Override
		public String toString(){
				return "[" + Arrays.stream(data).limit(count).boxed()
						             .map(Object::toString).reduce((s1, s2) -> s1 + ", " + s2)
						             .orElse("") + "]";
		}

		public void printInnerStructure(){
				System.out.println("Inner Structure: " + Arrays.toString(data));
		}

//   2. Добавить итератор в класс CustomDynamicArray
		@Override
		public Iterator<Integer> iterator() {
				return new CustomDynamicArrayIterator();
		}

		private class CustomDynamicArrayIterator implements Iterator<Integer> {
				private int currentIndex = 0;

				@Override
				public boolean hasNext() {
						return currentIndex < count;
				}

				@Override
				public Integer next() {
						if (!hasNext()) {
								throw new NoSuchElementException();
						}
						return data[currentIndex++];
				}
		}
}
