package org.example;

public class Main {
		public static void main(String[] args) {
// В двоичном дереве поиска SearchTree (см. код в репозитории), реализовать метод public String getMaxKey(),
// который возвращал бы наибольший ключ, находящийся в дереве.

				SeatchTree tree = new SeatchTree();
				tree.instrt(5);
				tree.instrt(3);
				tree.instrt(7);
				tree.instrt(2);
				tree.instrt(4);
				tree.instrt(6);
				tree.instrt(8);

				System.out.println("Самый большой ключ :" + tree.getMaxKey());
		}
}