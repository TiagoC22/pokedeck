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

    public void addCard(Card c) {
        game.add(c);
    }
        
    public int sizeDeck() {
        return game.size();
    }

    public void addDescriptionCard(int id, String description) {
        for (Card c : game) {
            if (c.getIdCard() == id) c.cardDescription(description);
        }
    }

    public boolean delCard(int id) {
        for (Card c : game) {
            if (c.getIdCard() == id) 
            return game.remove(c);
        }		
        return false;
    }

    public void seeDeck() { 
        for (Card c : game) {
            System.out.println(c.cardToString());
	}
    }

    public void displayCardType(String type) {
	for (Card c : game) {
            if (c.getCardType().equals(type)) 
                System.out.println(c.cardToString());
	}
    }

    public void displayCardName(String name) {
    for (Card c : game) {
	String nameCard = c.getCardName();
            if (nameCard.toLowerCase().equals(name.toLowerCase())) 
                System.out.println(c.cardToString());
	}
    }

    public boolean verifyDeck(int id) {
	for (Card c : game) {
            if (c.getIdCard() == id) 
                return true;
	}
        return false;
    }

    public Card cardToDeck(int id) {
	for (Card c : game) {
            if (c.getIdCard() == id) 
                return c;
	}
        return null;
    }	
}
