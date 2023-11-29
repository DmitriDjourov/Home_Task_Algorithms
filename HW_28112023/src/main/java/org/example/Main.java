package org.example;


import com.github.javafaker.Faker;

public class Main {
		public static void main(String[] args) {
				final Faker FAKER = new Faker();
				Book book1 = new Book(FAKER.book().title(), 20.5, true);
				Book book2 = new Book(FAKER.book().title(), 20.5, true);
				//использование equals
				System.out.println("Equals: " + book1.equals(book2));
				// использование hashCode
				System.out.println("HashCode: " + book1.getName() + ": " + book1.hashCode());
				System.out.println("HashCode: " + book2.getName() + ": " + book2.hashCode());
				// использование compareTo
				System.out.println("CompareTo: " + book1.compareTo(book2));
		}
}