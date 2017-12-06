package upmc.pcg;

public abstract class Card {
    protected String typeCard;
    protected String nameCard;
    protected String description;
    protected int id;
        
    //Constructor
    public Card(int id, String nameCard, String typeCard) {
        this.id = id;
        this.typeCard = typeCard;
        this.nameCard = nameCard;
    }

    //Getters
    public String getCardType() {
	return typeCard;
    }
	
    public String getCardName() {
        return nameCard;
    }
        
    public int getIdCard() {
        return id;
    }
	
    public void cardDescription(String description) {
        this.description = description;
    }      
    
    //toString for data of card
    public abstract String cardToString();
}

