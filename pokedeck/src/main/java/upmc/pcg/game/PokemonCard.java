package upmc.pcg.game;

import upmc.pcg.Card;



public class PokemonCard extends Card {

    protected EnergyType energyType;
    protected int hp;
    private String namePokemon;

    public PokemonCard(int id, EnergyType typePokemon, String namePokemon, int hp) {
        super(id, "Pokemon", namePokemon); //Call constructor of class Card
        this.namePokemon = namePokemon;
        this.energyType = typePokemon;
        this.hp = hp;
    }
        
    //Accessors
    public String getCardPokemon(){
        return namePokemon+hp+energyType;
    }
   
    public String getNamePokemon() {
        return namePokemon;
    }
    
    public int getHpPokemon() {
        return hp;
    }
 
    public EnergyType getEnergyTypePokemon() {
        return energyType;
    }
    
    public String toString() {
       return namePokemon+" "+hp+" "+energyType;
    }

    @Override
    public String cardToString() {
        String card = "[Id] : "+this.id+" [Name] : "+this.namePokemon+ " [Type] : " + this.energyType+" [Hp] : "+this.hp;

        if (this.description != null)
            card += "\n"+this.description;
	return  card;
    }
}
