package org.example;

public class Main {
		public static void main(String[] args) {
// В двоичном дереве поиска SearchTree (см. код в репозитории), реализовать метод public String getMaxKey(),
// который возвращал бы наибольший ключ, находящийся в дереве.
				SearchTree tree = new SearchTree();
				tree.add("C", 10);
				tree.add("A", 5);
				tree.add("B", 2);
				tree.add("F", 100);
				tree.add("K", 100);
				tree.add("X", 100);

				System.out.println("Наибольший ключ: " + tree.getMaxKey());
		}
}