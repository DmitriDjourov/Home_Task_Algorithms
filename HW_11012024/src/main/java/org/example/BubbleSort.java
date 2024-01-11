package org.example;

public class BubbleSort {
//        2. Написать свою реализацию алгоритма пузырьковой сортировки (bubble sort) или сортировки вставками (insertion sort)
//        (выбрать по желанию)

//        Метод пузырьковой сортировки
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;//поменял местами.

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // меняем array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // Если на внутреннем цикле не было обменов, то массив уже отсортирован
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
