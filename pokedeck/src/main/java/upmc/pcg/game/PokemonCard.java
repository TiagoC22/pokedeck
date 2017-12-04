/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg.game;

import upmc.pcg.Card;



/**
 *
 * @author Tiago
 */
public class PokemonCard extends Card {


    private String namePokemon;
    public static EnergyType energyType;
    private int hp;
  
    //Constructor
    public PokemonCard(String namePokemon, int hp, EnergyType energyType) {
        this.namePokemon = namePokemon;
        this.hp = hp;
        this.energyType = energyType;
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
   
    public String msgPokemon() {
        return "You have create "+namePokemon+" with "+hp+" life points,"+" and with the energy "+energyType;
    }




}

  
 

