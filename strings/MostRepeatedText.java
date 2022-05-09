package com.assignment.strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Scanner;

public class MostRepeatedText {
	static void getWords(String fileName, Map<String, Integer> words) throws FileNotFoundException {
		Scanner file = new Scanner(new File(fileName));
		while (file.hasNext()) {

			String word = file.next();
			Integer count = words.get(word);

			// If the same word is repeating
			if (count != null) {

				count++;
			} else
				count = 1;
			words.put(word, count);
		}


		file.close();
	}

	static int getMaxOccurrence(Map<String, Integer> words) {
		int max = 1;
		for (Entry<String, Integer> word : words.entrySet()) {
			if (word.getValue() > max) {
				max = word.getValue();
			}
		}
		return max;
	}

	public static void main(String[] args) throws FileNotFoundException {
		Map<String, Integer> words = new HashMap<String, Integer>();
		getWords("MyFile.txt", words);

		int max = getMaxOccurrence(words);

		for (Entry<String, Integer> word : words.entrySet()) {

			if (word.getValue() == max) {

				System.out.println(word);
			}
		}
	}
}
