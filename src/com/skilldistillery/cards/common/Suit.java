package com.skilldistillery.cards.common;

public enum Suit {
	HEARTS("hearts"), SPADES("spades"), CLUBS("clubs"), DIAMONDS("diamonds");

	private String name;

	private Suit(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return this.name;
	}
}
