package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	protected List<Card> cards; //list of cards in his hand.

	public Hand() {
		super();
		this.cards = new ArrayList<>();
	}
	

		
	

	public void addCard(Card card) { // taking in a card
		this.cards.add(card); // adding to list cards

	}

	public void clear() {

	}

	public abstract int getHandValue();

	@Override
	public String toString() {
		
		return "Your hand contains" + cards+ "Your hand value is :"+getHandValue();
	}

}
