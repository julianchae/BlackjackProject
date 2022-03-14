package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackJackHand extends Hand {

	public BlackJackHand() {
		super();

	}

	public boolean isBlackJack() {
		if (getHandValue() == 21) {
			return true;
		}
		return false;

	}

	public boolean isBust() {
		if (getHandValue() > 21) {
			return true;
		}
		return false;

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
