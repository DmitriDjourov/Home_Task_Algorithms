package org.example;

import java.util.Arrays;

public class Main {
		public static void main(String[] args) {
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
				int[] array1 = {100, 112, 256, 349, 770};
				int[] array2 = {72, 86, 113, 119, 265, 445, 892};
				int k = 7;

				int result = KthElementInSortedArrays.findKthElement(array1, array2, k);
				System.out.println("The " + k + "-th element is: " + result);

				int[] mergedArray = KthElementInSortedArrays.mergeArrays(array1, array2);
				System.out.println("Merged and sorted array: " + Arrays.toString(mergedArray));

				/**
				 * 2. Имея отсортированный массив arr[] и число x, напишите функцию, которая подсчитывает вхождения x в arr[] (сколько раз число x встречается в массиве).
				 * Ожидаемая временная сложность O(log n)
				 * arr[] = {1, 1, 2, 2, 2, 2, 3,}
				 * x = 2
				 * Вывод: 4 раза
				 */
				int[] arr = {1, 1, 2, 2, 2, 2, 3};
				int x = 2;

				int count = CountOccurrences.countOccurrences(arr, x);
				System.out.println("-------------------------------------------------------");
				System.out.println("Число " + x + " встречается " + count + " раз(а).");

		}
}