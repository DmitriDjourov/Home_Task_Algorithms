package org.example;
public class Main {
    public static void main(String[] args) {
        /**
         * 1. Написать метод проверки isSorted(), является ли данный массив отсортированным.
         */
        int[] sortedArray = {1, 2, 3, 4, 5};
        int[] unsortedArray = {5, 2, 8, 1, 3};

        System.out.println("Is sortedArray sorted? " + ArraySortChecker.isSorted(sortedArray));
        System.out.println("Is unsortedArray sorted? " + ArraySortChecker.isSorted(unsortedArray));
        /**
         * 2. Написать метод случайного перемешивания данных в массиве.
         *    - Input:  1, 2, 2, 3, 4
         *    - Output: 2, 1, 2, 4, 3
         */
        int[] array = {1, 2, 2, 3, 4};
        ArrayShuffler.shuffleArray(array);

        System.out.println("Shuffled array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}