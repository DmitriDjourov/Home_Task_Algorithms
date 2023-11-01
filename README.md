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

## **[HW_17102023](https://github.com/DmitriDjourov/Home_Task_Algorithms/tree/main/HW_17102023/src/main/java/org/example)**

##  1. [Вычислить n-й член последовательности, заданной формулами:](https://github.com/DmitriDjourov/Home_Task_Algorithms/blob/main/HW_17102023/src/main/java/org/example/SequenceCalculator.java)

>> a(2n) = a(n) + a(n-1),
>> a(2n+1) = a(n) — a(n-1),
>> a(0) = a(1) = 1.

>> Т.е.:
>> a(2) = a(21) = a(1) + a(0) = 2
>> a(3) = a(21 + 1) = a(1) - a(0) = 0
>> a(4) = a(22) = a(2) + a(1) = 3
>> a(5) = a(22 + 1) = a(2) - a(1) = 1
>> a(6) = a(23) = a(3) + a(2) = 2
>> a(7) = a(23 + 1) = a(3) - a(2) = -2

>> последовательность: 1 1 2 0 3 1 2 -2


##  2. [Самый дешёвый путь](https://github.com/DmitriDjourov/Home_Task_Algorithms/blob/main/HW_17102023/src/main/java/org/example/MinimalPathCost.java)
>> В каждой клетке прямоугольной таблицы N*M записано некоторое число.
>> Изначально игрок находится в левой верхней клетке.
>> За один ход ему разрешается перемещаться в соседнюю клетку либо вправо, либо вниз (влево и вверх перемещаться запрещено).
>> При проходе через клетку игрок платит определенную сумму, значение которой записано в этой клетке.
>> Требуется найти минимальную стоимость пути, отдав которую игрок может попасть в правый нижний угол.

>> Например, входные данные алгоритма:
>> int[][] pathCost = new int[][] {
>>                 {0,  11,  0,  0,  0, 0},
>>                 {10, 10, 10, 10, 10, 0},
>>                 {10, 10, 10,  4, 10, 0},
>>         };        
>> Результат: minimalCost = 11

>> int[][] pathCost = new int[][] {
>>                 {0,  11,  0,  0,  0, 100},
>>                 {10, 10, 10, 10, 10,   0},
>>                 {10, 10, 10,  4, 10,   0},
>>         };
>> Результат: minimalCost = 21

## **[HW_24102023](https://github.com/DmitriDjourov/Home_Task_Algorithms/tree/main/HW_24102023/src/main/java/org/example)**

## 1. Реализовать методы у класса CustomDynamicArray (см. код занятия в репозитории):
** public void removeAt(int index)
** public void shrinkSize() - сократить размер внутреннего массива до текущего числа элементов
** public void set(int index, int data)
** public int get(int index)
** public void clear()
** public boolean contains(int data)
** public boolean isEmpty()

## 2. Добавить итератор в класс CustomDynamicArray

## 3. Оценить алгоритмическую сложность всех методов в CustomDynamicArray через О-нотацию.

## **[HW_31102023](https://github.com/DmitriDjourov/Home_Task_Algorithms/tree/main/HW_31102023/src/main/java/org/example)**

1. Реализовать метод
    - [search()](https://github.com/DmitriDjourov/Home_Task_Algorithms/blob/8b1d54b41f33b7164fd6dfc3c9142d1d4184336a/HW_31102023/src/main/java/org/example/CustomStack.java#L36)
      у написанного на занятии стека [CustomStack](https://github.com/DmitriDjourov/Home_Task_Algorithms/blob/main/HW_31102023/src/main/java/org/example/CustomStack.java#L36) (см. код в репозитории).
      [public int search(int element)](https://github.com/DmitriDjourov/Home_Task_Algorithms/blob/8b1d54b41f33b7164fd6dfc3c9142d1d4184336a/HW_31102023/src/main/java/org/example/CustomStack.java#L39) -  определяет, существует ли объект в стеке.
      Если элемент найден, возвращает позицию элемента с вершины стека. В противном случае он возвращает -1.
2. Реализовать методы
    - [enqueue()](https://github.com/DmitriDjourov/Home_Task_Algorithms/blob/8b1d54b41f33b7164fd6dfc3c9142d1d4184336a/HW_31102023/src/main/java/org/example/CustomQueue.java#L15),
    - [dequeue()](https://github.com/DmitriDjourov/Home_Task_Algorithms/blob/8b1d54b41f33b7164fd6dfc3c9142d1d4184336a/HW_31102023/src/main/java/org/example/CustomQueue.java#L25),
    - [size()](https://github.com/DmitriDjourov/Home_Task_Algorithms/blob/8b1d54b41f33b7164fd6dfc3c9142d1d4184336a/HW_31102023/src/main/java/org/example/CustomQueue.java#L42)
    - у класса [CustomQueue](https://github.com/DmitriDjourov/Home_Task_Algorithms/blob/main/HW_31102023/src/main/java/org/example/CustomQueue.java#L42) (заготовки методов см. в репозитории).
