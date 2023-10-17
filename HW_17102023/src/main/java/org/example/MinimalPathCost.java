package org.example;

public class MinimalPathCost {
  public static int findMinimalCost(int[][] pathCost) {
    int rows = pathCost.length;
    int cols = pathCost[0].length;

    // Создаем таблицу для хранения минимальных стоимостей
    int[][] dp = new int[rows][cols];

    // Инициализируем первую клетку
    dp[0][0] = pathCost[0][0];

    // Инициализируем первую строку
    for (int j = 1; j < cols; j++) {
      dp[0][j] = dp[0][j - 1] + pathCost[0][j];
    }

    // Инициализируем первый столбец
    for (int i = 1; i < rows; i++) {
      dp[i][0] = dp[i - 1][0] + pathCost[i][0];
    }

    // Заполняем остальные клетки
    for (int i = 1; i < rows; i++) {
      for (int j = 1; j < cols; j++) {
        dp[i][j] = pathCost[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
      }
    }

    // Возвращаем минимальную стоимость пути до правого нижнего угла
    return dp[rows - 1][cols - 1];
  }
}
