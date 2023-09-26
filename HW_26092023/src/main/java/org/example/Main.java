package org.example;

public class Main {
		public static void main(String[] args) {
				int n = 10;
				long rez = FactorialCalc.factorial(n);
				System.out.println("Подход 1 ( IF ... ). Факториал от " + n + " = " + rez);
				rez = FactorialCalc2.factorial(n);
				System.out.println("Подход 2 ( For ... ).Факториал от " + n + " = " + rez);
		}
}