package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. Дан отсортированный массив, в котором все элементы встречаются дважды (один за другим),
        //    а один элемент появляется только один раз.

        int[] arr = {1, 1, 3, 3, 4, 4, 5, 6, 6, 7, 7};
        //Arrays.sort(arr);
        //System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println(findSingleElement(arr));
        System.out.println(findSingleElementBinarySearch(arr));
    }
    // Написать метод для нахождения этого элемента.
    // Решить задачу:

    // 1. через простой цикл
    public static int findSingleElement(int[] arr) {
        int result = 0; // Исходное значение результата

        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i]; // Используем операцию XOR (^) для нахождения элемента, встречающегося один раз
        }
        return result;
    }

    // 2. через бинарный поиск
    public static int findSingleElementBinarySearch(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Если индекс mid четный и arr[mid] равен arr[mid+1], искомый элемент находится справа
            if (mid % 2 == 0 && arr[mid] == arr[mid + 1]) {
                low = mid + 2; // Пропускаем пару элементов
            }
            // Иначе искомый элемент находится слева
            else {
                high = mid;
            }
        }
        return arr[low];
    }
}