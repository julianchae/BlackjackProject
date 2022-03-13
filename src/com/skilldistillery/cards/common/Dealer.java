package com.skilldistillery.cards.common;

import com.skilldistillery.cards.blackjack.BlackJackHand;

public class Dealer extends Player{

	private BlackJackHand blackJackHand = new BlackJackHand();
	
	
	private Deck deck = new Deck();

	
	
		public Card dealCard() {
			
			return deck.deal();
		}
		
		public void shuffleDeck() {
			deck.shuffle();
		}
	
		
		
	}
