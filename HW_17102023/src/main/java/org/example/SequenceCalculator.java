package org.example;

public class SequenceCalculator {
  public static int calculateNthTerm(int n) {
    int[] sequence = new int[n + 1];
    sequence[0] = sequence[1] = 1;

    for (int i = 2; i <= n; i++) {
      if (i % 2 == 0) {
        sequence[i] = sequence[i / 2] + sequence[i / 2 - 1];
      } else {
        sequence[i] = sequence[i / 2] - sequence[i / 2 - 1];
      }
    }

    return sequence[n];
  }
}

