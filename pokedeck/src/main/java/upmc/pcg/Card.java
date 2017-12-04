/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg;

/**
 *
 * @author Tiago
 */
public abstract class Card {
        protected String typecard;
	protected String namecard;
	protected String description;
        protected int id;
        
        //Constructor
        public Card(int id, String typecard, String namecard) {
        this.id = id;
	this.typecard = typecard;
	this.namecard = namecard;
	}

	//Getters
	public String getCardType() {
		return typecard;
	}
	
	public String getCardName() {
		return namecard;
	}
        
        public int getNumeroCarte() {
		return id;
	}
	
        
	public void cardDescription(String desc) {
		this.description = desc;
	}      
       
        public abstract String cardToString();
}

