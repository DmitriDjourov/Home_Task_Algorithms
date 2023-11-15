package org.example;

// В двоичном дереве поиска SearchTree (см. код в репозитории), реализовать метод public String getMaxKey(),
// который возвращал бы наибольший ключ, находящийся в дереве.

public class SeatchTree {
		private TreeNode root;

		// Узел дерева
		private static class TreeNode {
				int key;
				TreeNode left;
				TreeNode right;


				public TreeNode(int key) {
						this.key = key;
						this.left = null;
						this.right = null;
				}
		}

		// Метод для размещения ключа в дереве
		public void instrt(int key) {
				root = instrtRec(root, key);
		}

		private TreeNode instrtRec(TreeNode root, int key) {
				if (root == null) {
						root = new TreeNode(key);
						return root;
				}
				if (key < root.key) {
						root.left = instrtRec(root.left, key);
				} else if (key > root.key) {
						root.right = instrtRec(root.right, key);
				}
				return root;
		}

		// Метод который ищет наибольший ключ в дереве
		public String getMaxKey() {
				if (root == null) {
						return "Пустое дерево";
				}
				TreeNode current = root;
				while (current.right != null) {
						current = current.right;
				}
				return String.valueOf(current.key);
		}

}
