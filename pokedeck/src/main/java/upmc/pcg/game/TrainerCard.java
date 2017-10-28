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
public class TrainerCard {
    private final TrainerType trainerType;//Type de la carte (
    private String nameCard; //Nom de la carte
    private String description; //Description de la carte
   
   
	public TrainerCard(TrainerType trainerType) {	
        
       
		this.trainerType = trainerType;
                System.out.println(trainerType);
        }	
}

