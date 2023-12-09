package org.example;

import java.util.List;
/**
 * Сгруппируйте слова с одинаковым набором символов
 * Дан список слов со строчными буквами. Реализуйте функцию поиска всех слов с одинаковым уникальным набором символов.
 *
 * Input: String words[] = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf", "tact"};
 * Output :
 * student, students
 * cat, act, tact
 * dog, god
 * flow, wolf
 * (Набор букв 1 группы: s, t, u, d, e, n, t; 2 группы: a, c, t; 3 группы: d, o, g; 4 группы: f, l, o, w)
 * Группы слов функция возвращает в виде List>, либо сразу печатает в консоль.
 */
public class Main {
		public static void main(String[] args) {
				String[] words = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf", "tact"};

				List<List<String>> wordGroups = WordGrouping.groupWords(words);

				WordGrouping.printWordGroups(wordGroups);
		}
}