package org.example;

import java.util.Random;

/**
 * 2. Написать метод случайного перемешивания данных в массиве.
 * - Input:  1, 2, 2, 3, 4
 * - Output: 2, 1, 2, 4, 3
 */
public class ArrayShuffler {
    public static void shuffleArray(int[] array) {
        Random rand = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            // Генерируем случайный индекс от 0 до i
            int randomIndex = rand.nextInt(i + 1);

            // Обмен элементов на позициях i и randomIndex
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}
