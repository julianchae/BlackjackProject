package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.common.Dealer;

import com.skilldistillery.cards.common.Player;

public class BlackJackApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome To BlackJack, where the house always wins.");

		BlackJackApp run = new BlackJackApp();

		run.app(sc);
	}

	public void app(Scanner sc) {
		Dealer dealer = new Dealer();
		Player player = new Player();
		BlackJackHand blackJackHand = new BlackJackHand();
		

		dealer.shuffleDeck();

		dealer.recieveCard(dealer.dealCard());
		dealer.recieveCard(dealer.dealCard());
		player.recieveCard(dealer.dealCard());
		player.recieveCard(dealer.dealCard());
	
		
		System.out.println(player.showCard());
		
		

	
		
		while (player.getHandValue() < 21) {

			System.out.println("Would you like to hit(1) or stand(2)?");

			int userInput = sc.nextInt();

			if (userInput == 1) {

				player.recieveCard(dealer.dealCard());
				System.out.println(player.showCard());
			}
			if (userInput == 2) {
				System.out.println(player.showCard());
				break;
			}

			if (player.getHandValue() == 21) {
				blackJackHand.isBlackJack();

			}
			if (player.getHandValue() > 21) {
				blackJackHand.isBust();
			}

		}
	}
}
