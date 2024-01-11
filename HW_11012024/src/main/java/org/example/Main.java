package org.example;

public class Main {

    public static void main(String[] args) {
//        1. Найти k-ый по величине элемент неотсортированного массива.
//        Входные данные: Integer[] data = {1, 3, 1, 5, 0, 7, 8};
//        Результат:
//        k = 0
//        findSmallest(data, k)=0 (min)
//        k = 1
//        Результат: findSmallest(data, k)=1
//        k = 6
//        Результат: findSmallest(data, k)=8 (max)
//        Решить задачу через адаптацию алгоритма сортировки quicksort

        Integer[] data = {1, 3, 1, 5, 0, 7, 8};

        int k = 0;
        System.out.println("k = " + k + "\nРезультат: findKthElement(data, k) = "
                                   + KthElementInUnsortedArray.findKthElement(data, k));

        k = 1;
        System.out.println("k = " + k + "\nРезультат: findKthElement(data, k) = "
                                   + KthElementInUnsortedArray.findKthElement(data, k));

        k = 6;
        System.out.println("k = " + k + "\nРезультат: findKthElement(data, k) = "
                                   + KthElementInUnsortedArray.findKthElement(data, k));
//        2. Написать свою реализацию алгоритма пузырьковой сортировки (bubble sort) или сортировки вставками (insertion sort)
//        (выбрать по желанию)

//        Метод пузырьковой сортировки

        System.out.println(" ------------------------------ ");
        System.out.println(" Метод пузырьковой сортировки\n ");
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        BubbleSort.printArray(array);

        BubbleSort.bubbleSort(array);

        System.out.println("Sorted array:");
        BubbleSort.printArray(array);
    }
}


