package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackJackHand extends Hand {

	public BlackJackHand() {
		super();

	}

	public boolean isBlackJack() {

		System.out.println("BlackJack!!!");
		return true;

	}

	public boolean isBust() {

		System.out.println("You busted. HAHA");
		return true;

	}

	@Override
	public int getHandValue() {
		int handValue = 0;
		for (Card currentCard : cards) {
			handValue += currentCard.getValue();

		}

		return handValue;
	}

}
