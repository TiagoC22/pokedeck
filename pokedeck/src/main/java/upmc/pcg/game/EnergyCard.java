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
public class EnergyCard extends Card { 

protected EnergyType energyType;
protected String nameEnergy; //Name of the card
protected int id;

    //Constructor
    public EnergyCard(int id, String nameEnergy, EnergyType energyType) {	
        super(id, nameEnergy,""); //Appel du constructeur de Card
        this.energyType = energyType;
        this.nameEnergy = nameEnergy;
    }	
        
	
    //Getters
    public String getCardEnergy(){
        return nameEnergy+energyType;
    }
    
    public String getNameEnergy() {
        return nameEnergy;
    }
    
    public EnergyType getEnergyType() {
        return energyType;
    }
    
    public String toString() {
        return nameEnergy+" "+energyType;
   }
   
    public String msgEnergy() {
        return "You have create "+nameEnergy+" with the type : "+energyType;
    }
}
