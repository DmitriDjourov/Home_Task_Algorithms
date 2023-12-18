package org.example;

/**
 * 2. Имея отсортированный массив arr[] и число x, напишите функцию, которая подсчитывает вхождения x в arr[] (сколько раз число x встречается в массиве).
 * Ожидаемая временная сложность O(log n)
 * arr[] = {1, 1, 2, 2, 2, 2, 3,}
 * x = 2
 * Вывод: 4 раза
 */
public class CountOccurrences {
		public static int countOccurrences(int[] arr, int x) {
				int firstIndex = findFirstIndex(arr, x);
				int lastIndex = findLastIndex(arr, x);

				if (firstIndex == -1 || lastIndex == -1) {
						return 0;
				}

				return lastIndex - firstIndex + 1;
		}

		private static int findFirstIndex(int[] arr, int x) {
				int low = 0;
				int high = arr.length - 1;
				int result = -1;

				while (low <= high) {
						int mid = low + (high - low) / 2;

						if (arr[mid] == x) {
								result = mid;
								high = mid - 1; // Поиск в левой половине
						} else if (arr[mid] < x) {
								low = mid + 1;
						} else {
								high = mid - 1;
						}
				}

				return result;
		}

		private static int findLastIndex(int[] arr, int x) {
				int low = 0;
				int high = arr.length - 1;
				int result = -1;

				while (low <= high) {
						int mid = low + (high - low) / 2;

						if (arr[mid] == x) {
								result = mid;
								low = mid + 1; // Поиск в правой половине
						} else if (arr[mid] < x) {
								low = mid + 1;
						} else {
								high = mid - 1;
						}
				}
				return result;
		}
}
