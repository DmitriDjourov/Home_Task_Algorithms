package org.example;

public class HanoiTower {
//1. Оценить эффективность алгоритма решения задачи Ханойской башни,
//    предложенного на занятии (см. HanoiTower.java в репозитории)

		/* Имеется три стержня — левый, средний и правый.
    На левом стержне находятся n дисков, диаметры которых различны.
    Диски упорядочены по размеру диаметра, сверху лежит наименьший, снизу — наибольший.
    Требуется перенести диски с левого стержня на правый, используя средний стержень как вспомогательный.

    Головоломка имеет следующие два правила:
      1. Вы не можете поместить больший диск на меньший диск.
      2. За один раз можно перемещать только один диск.
*/
		public static void main(String[] args) {
				hanoi(3);
		}

		public static void hanoi(int n) {
				hanoiRecursive(n, 'A', 'B', 'C');
		}

		private static void hanoiRecursive(int n, char start, char middle, char end) {
				if (n == 1) {
						System.out.println("Move disk 1 from " + start + " to " + end); // base condition;
						return;
				}
				hanoiRecursive(n - 1, start, end, middle);
				System.out.println("Move disk " + n + " from " + start + " to " + end);
				hanoiRecursive(n - 1, middle, start, end);
		}
}
//Оценка :

//  n - количество дисков, которые нужно переместить с одной башни на другую.
//  Когда n=1 требуется один ход
//  когда n>1 задача рекрусивно разбивается на две подзадачи для (n-1) диска, и следующий ход для
//  n-го диска. Значит для каждого диска нужно 2^n шагов.
//  Сложность алгоритма оцениваем как О(2^n). Алгоритм не эффективен для больших значений.