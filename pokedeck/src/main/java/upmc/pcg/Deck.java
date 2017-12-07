/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package upmc.pcg;
import java.util.ArrayList;

/**
 *
 * @author Tiago
 */

public class Deck {
    protected ArrayList<Card> game;

    public Deck() {
        game = new ArrayList<Card>();
    }

    public ArrayList<Card> getDeck() {
        return game;
        }

    public void addCard(Card card) {
        game.add(card);
    }
        
    public int sizeDeck() {
        return game.size();
    }

    public void addDescriptionCard(int id, String description) {
        for (Card card : game) {
            if (card.getIdCard() == id) card.cardDescription(description);
        }
    }

    public boolean delCard(int id) {
        for (Card card : game) {
            if (card.getIdCard() == id) 
            return game.remove(card);
        }		
        return false;
    }

    public void seeDeck() { 
        for (Card card : game) {
            System.out.println(card.cardToString());
	}
    }

    public void displayCardType(String type) {
	for (Card card : game) {
            if (card.getCardType().equals(type)) 
                System.out.println(card.cardToString());
	}
    }

    public void displayCardName(String name) {
    for (Card card : game) {
	String nameCard = card.getCardName();
            if (nameCard.toLowerCase().equals(name.toLowerCase())) 
                System.out.println(card.cardToString());
	}
    }

    public boolean verifyDeck(int id) {
	for (Card card : game) {
            if (card.getIdCard() == id) 
                return true;
	}
        return false;
    }

    public Card cardToDeck(int id) {
	for (Card card : game) {
            if (card.getIdCard() == id) 
                return card;
	}
        return null;
    }	
}
