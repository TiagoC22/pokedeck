/*package upmc.pcg;
import java.util.ArrayList;
import java.util.Scanner;
import upmc.pcg.Card;

public class Deck {
    
protected ArrayList<Card> deck; //Tableau de carte

    public Deck() {
	deck = new ArrayList<Card>(); //Array des cartes
	}


       
        
        public ArrayList<Card> getDeck() {
		return deck;
	}
	
	public void ajouterCarte(Card card) {
		deck.add(card);
	}
	
	public boolean enleverCarte(int num) {
		for (Card c : deck) {
			if (c.getNumeroCarte() == num) return deck.remove(c);
		}		
		return false;
	}
	
	public void ajouterDescriptionALaCarte(int num, String desc) {
		for (Card c : deck) {
			if (c.getNumeroCarte() == num) c.cardDescription(desc);
		}
	}
	
	public int tailleDeck() {
		return deck.size();
	}
	
	public void parcoursDeck() {
		for (Card c : deck) {
			System.out.println(c.cardToString());
		}
	}
	
	public boolean existeDansDeck(int num) {
		for (Card c : deck) {
			if (c.getNumeroCarte() == num) return true;
		}
		return false;
	}
	
	public Card retourneCarteDansDeck(int num) {
		for (Card c : deck) {
			if (c.getNumeroCarte() == num) return c;
		}
		return null;
	}
	
	public void afficheCartesParType(String type) {
		for (Card c : deck) {
			if (c.getCardType().equals(type)) System.out.println(c.cardToString());
		}
	}
	
	public void afficheCartesParNom(String nom) {
		String nomCarte;
		for (Card c : deck) {
			nomCarte = c.getCardName();
			if (nomCarte.toLowerCase().equals(nom.toLowerCase())) System.out.println(c.cardToString());
                }
    }
    


 
}*/
package Pokedeck.utilisateur;

import java.util.ArrayList;

import Pokedeck.pokemon.Carte;


public class Deck {
	
	protected ArrayList<Carte> deck;
	
	public Deck() {
		deck = new ArrayList<Carte>();
	}
	
	public ArrayList<Carte> getDeck() {
		return deck;
	}
	
	public void ajouterCarte(Carte card) {
		deck.add(card);
	}
	
	public boolean enleverCarte(int num) {
		for (Carte c : deck) {
			if (c.getNumeroCarte() == num) return deck.remove(c);
		}		
		return false;
	}
	
	public void ajouterDescriptionALaCarte(int num, String desc) {
		for (Carte c : deck) {
			if (c.getNumeroCarte() == num) c.mettreDescription(desc);
		}
	}
	
	public int tailleDeck() {
		return deck.size();
	}
	
	public void parcoursDeck() {
		for (Carte c : deck) {
			System.out.println(c.carteToString());
		}
	}
	
	public boolean existeDansDeck(int num) {
		for (Carte c : deck) {
			if (c.getNumeroCarte() == num) return true;
		}
		return false;
	}
	
	public Carte retourneCarteDansDeck(int num) {
		for (Carte c : deck) {
			if (c.getNumeroCarte() == num) return c;
		}
		return null;
	}
	
	public void afficheCartesParType(String type) {
		for (Carte c : deck) {
			if (c.getCarteType().equals(type)) System.out.println(c.carteToString());
		}
	}
	
	public void afficheCartesParNom(String nom) {
		String nomCarte;
		for (Carte c : deck) {
			nomCarte = c.getCarteNom();
			if (nomCarte.toLowerCase().equals(nom.toLowerCase())) System.out.println(c.carteToString());
		}
	}
}