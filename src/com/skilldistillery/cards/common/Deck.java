package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cards= new ArrayList<>(52); // creating list of cards

	public Deck() { // constructor
		for (Suit suit : Suit.values()) { // iterating thru the suits
			for (Rank rank : Rank.values()) { // iterating thru the ranks
				Card newCard = new Card(suit, rank); // adding rank and suit to card.
				cards.add(newCard);

			}
		}
	}

	public int checkDeckSize() { // checks how many cards in deck
		return cards.size(); // .size method shows how many cards in the list of cards

	}

	public void shuffle() {
		Collections.shuffle(cards); // shuffles the list of cards

	}

	public Card deal() {

		return cards.remove(0); // removes the top card of shuffled deck

	}

}
