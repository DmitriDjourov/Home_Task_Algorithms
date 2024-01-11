package org.example;

public class KthElementInUnsortedArray {
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
    public static int findKthElement(Integer[] data, int k) {
        if (k < 0 || k >= data.length) {
            throw new IllegalArgumentException("Invalid value of k");
        }

        return quickSelect(data, 0, data.length - 1, k);
    }

    private static int quickSelect(Integer[] data, int low, int high, int k) {
        if (low <= high) {
            int pivotIndex = partition(data, low, high);

            if (pivotIndex == k) {
                return data[pivotIndex];
            } else if (pivotIndex < k) {
                return quickSelect(data, pivotIndex + 1, high, k);
            } else {
                return quickSelect(data, low, pivotIndex - 1, k);
            }
        }

        return Integer.MIN_VALUE; // Этого не должно произойти, если введенные данные верны.
    }

    private static int partition(Integer[] data, int low, int high) {
        int pivot = data[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (data[j] <= pivot) {
                i++;
                swap(data, i, j);
            }
        }

        swap(data, i + 1, high);
        return i + 1;
    }

    private static void swap(Integer[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
