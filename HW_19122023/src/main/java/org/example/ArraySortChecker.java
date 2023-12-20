package org.example;

/**
 * 1. Написать метод проверки isSorted(), является ли данный массив отсортированным.
 */
public class ArraySortChecker {
    public static boolean isSorted(int[] array) {
        // Проверка для пустого или одноэлементного массива
        if (array == null || array.length <= 1) {
            return true;
        }
        // Проверка, является ли массив отсортированным по возрастанию
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        // Если цикл закончил выполнение, массив отсортирован по возрастанию
        return true;
    }
}
