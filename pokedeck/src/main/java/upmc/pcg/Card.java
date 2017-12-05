
package upmc.pcg;

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

