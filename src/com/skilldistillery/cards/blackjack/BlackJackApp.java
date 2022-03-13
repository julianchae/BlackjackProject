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

		//deals cards to dealer and player
		dealer.recieveCard(dealer.dealCard());
		dealer.recieveCard(dealer.dealCard());
		player.recieveCard(dealer.dealCard());
		player.recieveCard(dealer.dealCard());
	
		
		System.out.println("Player's first card: "+ player.showCard());
		
		System.out.println("Dealer's first card " +dealer.showCard());
		
		System.out.println("Player's second card: "+player.showCard2());
		
		System.out.println("Player's info: "+ player.getInfo());

	
		
		while (player.getHandValue() < 21) {

			System.out.println("Would you like to hit(1) or stand(2)?");

			int userInput = sc.nextInt();

			if (userInput == 1) {

				player.recieveCard(dealer.dealCard());
				System.out.println(player.getInfo());
			}
			if (userInput == 2) {
				System.out.println(player.getInfo());
				
				System.out.println("Dealer's second card: "+ dealer.showCard2());
				System.out.println("Dealer's Card's and values : " +dealer.getInfo());
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