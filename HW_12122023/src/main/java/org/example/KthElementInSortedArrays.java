package org.example;

/**
 * 1. Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент, который будет находиться на k-й позиции в конечном отсортированном массиве.
 * Массив 1 - 100 112 256 349 770
 * Массив 2 - 72 86 113 119 265 445 892
 * к = 7
 * Вывод : 256
 * Окончательный отсортированный массив -
 * 72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
 * 7-й элемент этого массива равен 256.
 */
public class KthElementInSortedArrays {
		public static int findKthElement(int[] array1, int[] array2, int k) {
				int m = array1.length;
				int n = array2.length;
				int i = 0, j = 0, count = 0, result = 0;

				while (i < m && j < n) {
						if (array1[i] < array2[j]) {
								result = array1[i];
								i++;
						} else {
								result = array2[j];
								j++;
						}
						count++;

						if (count == k) {
								break;
						}
				}

				while (i < m && count < k) {// Если один из массивов еще не исчерпан, продолжаем сдвигаться
						result = array1[i];
						i++;
						count++;
				}

				while (j < n && count < k) {
						result = array2[j];
						j++;
						count++;
				}

				return result;
		}

		public static int[] mergeArrays(int[] array1, int[] array2) {
				int m = array1.length;
				int n = array2.length;
				int[] mergedArray = new int[m + n];
				int i = 0, j = 0, index = 0;

				while (i < m && j < n) {
						if (array1[i] < array2[j]) {
								mergedArray[index++] = array1[i++];
						} else {
								mergedArray[index++] = array2[j++];
						}
				}

				while (i < m) {
						mergedArray[index++] = array1[i++];
				}

				while (j < n) {
						mergedArray[index++] = array2[j++];
				}

				return mergedArray;
		}
}
