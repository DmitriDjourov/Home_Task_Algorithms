package org.example;

public class Task2 {
		/*				2. Написать функцию sum(n, m), вычисляющую сумму тех чисел в диапазоне от 1 до n,
		            которые делятся на m.
				 Например:
				sum(7, 2) = 2 + 4 + 6 = 12
				sum(12, 3) = 3 + 6 + 9 + 12 = 30
				Решить задачу:
				а) через цикл
				б) через рекурсию */
		public static void main(String[] args) {
				//int sumNum = Task2.funcSumThreeNumsSum(7, 2);
				int sumNum = Task2.funcSumThreeNumssum(12, 3);
				System.out.println("через цикл : " + sumNum);

				int sumNum2 = Task2.funcSumThreeNumsSumRecurs(12, 3);
				System.out.println("через рекурсию : " + sumNum2);
		}
		//а) через цикл
		private static int funcSumThreeNumssum(int n, int m) {
				int sum = 0;
				for (int j = 1; j <= n; j++) {
						if (j % m == 0) {
								sum += j;
						}
				}
				return sum;
		}
		// б) через рекурсию
		private static int funcSumThreeNumsSumRecurs(int n, int m) {
				if (n <= 0) {
						return 0;
				} else {
						int sum = funcSumThreeNumsSumRecurs(n - 1, m);
						if (n % m == 0) {
								sum += n;
						}
						return sum;
				}
		}

}
