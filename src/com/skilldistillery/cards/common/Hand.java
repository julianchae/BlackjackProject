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

	public String showCard1() {
		
		return "Card: "+ cards.get(0);
		
	}
	public String showCard2() {
		
		return "Card: " + cards.get(1);
	}
	public String toString() {
		
		return "Cards: "+ cards+ "Value : " +getHandValue();
	}

}






