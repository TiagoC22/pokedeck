package upmc.pcg;

package Pokedeck.utilisateur;

import java.util.Scanner;

import Pokedeck.pokemon.*;

public class SousMenu {

	private Scanner sc;
	private String choix;
	private int n;

	public SousMenu(Scanner sc) {
		this.sc = sc;
	}
        
	public void parcoursDeck(Deck paquet) {
		if (paquet.tailleDeck() == 0) {
			System.out.println("Le paquet est vide");
		} else {
			paquet.parcoursDeck();
		}
	}

	public int choixAjoutTypeCarte() {
		System.out.println("Choix du type de carte à ajouter : ");
		System.out.println("1 - POKEMON \t2 - DRESSEUR\t3 - ENERGIE");
		choix = sc.nextLine();
		int n = Integer.parseInt(choix);
		return n;
	}
}