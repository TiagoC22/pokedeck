/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg.game;

/**
 *
 * @author lepor
 */
public class EnergyCard {

private EnergyType energyType;
private String nameEnergy; //Nom de la carte


    //Constructeur
    public EnergyCard(String nameEnergy, EnergyType energyType) {	
        this.energyType = energyType;
        this.nameEnergy = nameEnergy;
    }	
        
    //Accesseurs
    public String getCardEnergy(){
        return nameEnergy+energyType;
    }
    
    public String getNameEnergy() {
        return nameEnergy;
    }
    
    public EnergyType getEnergyType() {
        return energyType;
    }
}
