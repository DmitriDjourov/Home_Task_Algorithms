package org.example;

/**
 * Для класса Book с полями String name, double price, boolean isPresent
 *     реализовать методы equals(Object o), hashCode(), compareTo(Book another).
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
@Builder
public class Book implements Comparable<Book>{
		private String name;
		private double price;
		private boolean isPresent;

		@Override
		public boolean equals(Object o) {
				if (this == o) return true;
				if (o == null || getClass() != o.getClass()) return false;
				Book book = (Book) o;
				return Double.compare(price, book.price) == 0 && isPresent == book.isPresent && Objects.equals(name, book.name);
		}

		@Override
		public int hashCode() {
				return Objects.hash(name, price, isPresent);
		}

		@Override
		//  сравниваем книги по цене
		public int compareTo(Book another) {
				return Double.compare(this.price,another.price);
		}
}
