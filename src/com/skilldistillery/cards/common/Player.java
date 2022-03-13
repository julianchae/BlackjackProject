package com.skilldistillery.cards.common;

import java.util.List;

import com.skilldistillery.cards.blackjack.BlackJackHand;

public class Player {

	private BlackJackHand blackJackHand = new BlackJackHand();
	
	protected List<Card> cards;
	
	public void recieveCard(Card card) {

		blackJackHand.addCard(card);

	}
	
	public String showCard() {
		
		
		return blackJackHand.showCard1();
		
		
	}
	public String showCard2() {
		return blackJackHand.showCard2();
	}
	
	
	public int getHandValue() {
		return blackJackHand.getHandValue();
		
		
	}
	public String getInfo() {
		return blackJackHand.toString();
	}
	
		
	}
	
