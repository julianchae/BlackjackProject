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
		return blackJackHand.toString();
		
	}
	public int getHandValue() {
		return blackJackHand.getHandValue();
	}
	
		
	}
	

