package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.common.Dealer;

import com.skilldistillery.cards.common.Player;

public class BlackJackApp {

	Dealer dealer = new Dealer();
	Player player = new Player();
	BlackJackHand blackJackHand = new BlackJackHand();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BlackJackApp app = new BlackJackApp();

		app.menu(sc);

	}

	public void menu(Scanner sc) {

		System.out.println("Welcome To BlackJack, where the house always wins.");
		System.out.println("");
		System.out.println("Would you like to play? \n 1. Yes \n 2. No");

		int userInput = sc.nextInt();
		switch (userInput) {

		case 1:
			play();
			break;
		case 2:
			System.out.println("Why are you even here...");
			break;

		}
	}

	public void play() {

		System.out.println("");

		System.out.println("*Dealer shuffles*\n *Dealer deals*");
		dealer.shuffleDeck();

		// deals cards to dealer and player
		dealer.recieveCard(dealer.dealCard());
		dealer.recieveCard(dealer.dealCard());
		player.recieveCard(dealer.dealCard());
		player.recieveCard(dealer.dealCard());

		System.out.println("Your first card: " + player.showCard());
		System.out.println("");
		System.out.println("Dealer's first card: " + dealer.showCard());
		System.out.println("");
		System.out.println("Your second card: " + player.showCard2());
		System.out.println("");
		System.out.println("Dealer's second card remains flipped.");

		System.out.println("Player's info: " + player.getInfo());
		System.out.println("");

		hitOrStay();
	}

	public void hitOrStay() {
		Scanner sc = new Scanner(System.in);
		while (!player.blackJackHand.isBust() && !player.blackJackHand.isBlackJack()) {

			System.out.println("Would you like to hit(1) or stay(2)?");

			int userInput = sc.nextInt();

			if (userInput == 1) {
				System.out.println("Bold move, Cotton. \n You've chose to hit.");
				playerHits();
				System.out.println("Player's info: " + player.getInfo());
				if (player.blackJackHand.isBlackJack()) {
					System.out.println("Blackjack, congrats");
					break;
				}
				if (player.blackJackHand.isBust()) {
					System.out.println("You busted.");
					break;
				}

			}
			if (userInput == 2) {
				System.out.println("You have chosen to stay. \n Dealer's turn.");
				dealerTurn();
				break;
			}

		}

	}

	public void dealerTurn() {
		System.out.println("Dealer flips second card. ");
		System.out.println(dealer.getInfo());

		if (dealer.getHandValue() < 17) {

			while (dealer.getHandValue() <= 17 && !dealer.blackJackHand.isBust()
					&& !dealer.blackJackHand.isBlackJack()) {

				dealerHits();
				System.out.println("Dealer hits \nDealer's new hand" + dealer.getInfo());

				if (dealer.getHandValue() > 21) {
					dealer.blackJackHand.isBust();
					System.out.println("Dealer bust. you win.");
				}
				if (dealer.getHandValue() == 21) {
					dealer.blackJackHand.isBlackJack();
					System.out.println("Dealer blackjack, you lose.");

				} else if (dealer.getHandValue() > player.getHandValue()) {
					System.out.println("You lose.");
				} else if (dealer.getHandValue() < player.getHandValue()) {
					System.out.println("You win.");
				}

			}
		}
		else if(dealer.getHandValue()>player.getHandValue())
		System.out.println("You lose");
	}

	private void playerHits() {
		player.recieveCard(dealer.dealCard());

	}

	private void dealerHits() {
		dealer.recieveCard(dealer.dealCard());
	}

	

	}

