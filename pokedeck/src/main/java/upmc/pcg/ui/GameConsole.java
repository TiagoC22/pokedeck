/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg.ui;

import java.util.Scanner;
import upmc.pcg.Card;
import upmc.pcg.Deck;


/**
 *
 * @author Tiago
 */


public class GameConsole {



	private Scanner scanner;
	private String choice;
	private int id;

	public GameConsole(Scanner scan) {
		this.scanner = scan;
	}

	// --------------------------------------------------

	public void parcoursDeck(Deck deck) {
		if (deck.sizeDeck() == 0) {
			System.out.println("Le paquet est vide");
		} else {
			deck.parcoursDeck();
		}
	}

	

}


