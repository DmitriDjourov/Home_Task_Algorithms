# Home_Task_Algorithms

## **[HW_19092023](https://github.com/DmitriDjourov/Home_Task_Algorithms/tree/main/HW_19092023)**

  1. Дан отсортированный массив, в котором все элементы встречаются дважды (один за другим),
     а один элемент появляется только один раз.

     Написать метод для нахождения этого элемента.
     Решить задачу:
        1. через простой цикл
        2. через бинарный поиск
     
## **[HW_26092023](https://github.com/DmitriDjourov/Home_Task_Algorithms/tree/main/HW_26092023/src/main/java/org/example)** 

Описание задания.

  1. [Написать рекурсивную функцию вычисления факториала factorial(n) - произведения всех чисел до n включительно](HW_26092023/src/main/java/org/example/FactorialCalc.java)

  2. [Оценить временную сложность фрагментов алгоритмов:](https://github.com/DmitriDjourov/Home_Task_Algorithms/blob/main/HW_26092023/src/main/java/org/example/tasks.txt)

     [a)
     for (int i = 0; i < n; ++i) {
     for (int j = 1; j < m; ++j) {
     a[i][j]++;
          }
     }](https://github.com/DmitriDjourov/Home_Task_Algorithms/blob/57e7e31e1148964c78505e2bf3d0d21171e725e9/HW_26092023/src/main/java/org/example/tasks.txt#L15C10-L15C10)
     
     [b)
     for (int i = 0; i < n-1; ++i) {
     for (int j = 0; j < n-i; ++j) {
     a[i][j]++;
          }
     }](https://github.com/DmitriDjourov/Home_Task_Algorithms/blob/57e7e31e1148964c78505e2bf3d0d21171e725e9/HW_26092023/src/main/java/org/example/tasks.txt#L24)
     
     [c)
     for (int i = 0; i < n; ++i) {
     for (int j = 1; j < n; j *= 3) {
     a[i][j]++;
          }
     }](https://github.com/DmitriDjourov/Home_Task_Algorithms/blob/57e7e31e1148964c78505e2bf3d0d21171e725e9/HW_26092023/src/main/java/org/example/tasks.txt#L33)
     
     [d)
     for (int i = 0; i < 1000; ++i) {
     for (int j = 1; j < n; ++j) {
     ++count;
          }
     }](https://github.com/DmitriDjourov/Home_Task_Algorithms/blob/1ed2fa7663991e8f8e9debebc72289f5234c0296/HW_26092023/src/main/java/org/example/tasks.txt#L43)
     
     [e)
     for (int i = 0; i < n; ++i) {
     for (int j = 0; j < n/3; ++j) {
     matrx[i][i]++;
          }
     }](https://github.com/DmitriDjourov/Home_Task_Algorithms/blob/1ed2fa7663991e8f8e9debebc72289f5234c0296/HW_26092023/src/main/java/org/example/tasks.txt#L52)

## **[HW_10102023](https://github.com/DmitriDjourov/Home_Task_Algorithms/tree/main/HW_10102023/src/main/java/org/example)**

1. [Оценить эффективность алгоритма решения задачи Ханойской башни,
   предложенного на занятии (см. HanoiTower.java в репозитории)](https://github.com/DmitriDjourov/Home_Task_Algorithms/blob/main/HW_10102023/src/main/java/org/example/HanoiTower.java)

2. [Написать функцию sum(n, m), вычисляющую сумму тех чисел в диапазоне от 1 до n, которые делятся на m.](https://github.com/DmitriDjourov/Home_Task_Algorithms/blob/main/HW_10102023/src/main/java/org/example/Task2.java)
   Например:
   sum(7, 2) = 2 + 4 + 6 = 12
   sum(12, 3) = 3 + 6 + 9 + 12 = 30
   Решить задачу:
   а) через цикл
   б) через рекурсию
