package org.example;

import java.util.*;
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
public class WordGrouping {
		public static List<List<String>> groupWords(String[] words) {
				Map<String, List<String>> wordGroups = new HashMap<>();

				for (String word : words) {
						// Создаем уникальный набор символов для каждого слова
						char[] charArray = word.toCharArray();
						Arrays.sort(charArray);
						String sortedWord = new String(charArray);

						// Добавляем слово в группу
						wordGroups.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
				}

				// Преобразуем значения HashMap в список и возвращаем
				return new ArrayList<>(wordGroups.values());
		}

		public static void printWordGroups(List<List<String>> wordGroups) {
				for (List<String> group : wordGroups) {
						System.out.println(String.join(", ", group));
				}
		}
}