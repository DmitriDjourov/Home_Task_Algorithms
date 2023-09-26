package org.example;

public class FactorialCalc2 {
		public static long factorial(int n) {
				long rez = 1;

				for (int i = 1; i <= n; i++) {
						rez = rez * i;
				}
				return rez;
		}
}

