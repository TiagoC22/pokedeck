/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg.game;

import java.util.HashMap;
import java.util.Scanner;
import upmc.pcg.Paquet;


/**
 *
 * @author lepor
 */
public class PokemonCard {

    
    private String namePokemon;
    private EnergyType energyType;
    private int hp;

    //Constructeur
    public PokemonCard(String namePokemon, int hp, EnergyType energyType) {
        this.namePokemon = namePokemon;
        this.hp = hp;
        this.energyType = energyType;
    }
    
    //Accesseurs
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
 
  }


  
 

