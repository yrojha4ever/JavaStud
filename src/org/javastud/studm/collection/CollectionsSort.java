package org.javastud.studm.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {
	public static void main(String[] args) {

		List<String> cards = new ArrayList<>();
		cards.add("Heart");
		cards.add("Diamonds");
		cards.add("Clubs");
		cards.add("Spades");

		List<String> allCards = Arrays.asList("Heart", "Diamonds", "Clubs", "Spades");
		System.out.println(allCards);

		System.out.println("---------------");

		Collections.sort(cards, Collections.reverseOrder());
		System.out.println(cards);

		System.out.println("---------------");
		
		List<Integer> suffles = Arrays.asList(1, 2, 3, 4, 5, 6);
		Collections.shuffle(suffles);
		System.out.println(suffles);

	}
}
