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
    private String nameTrainer; //Nom de la carte
    private String descriptionTrainer; //Description de la carte
   
        //Constructeur
	public TrainerCard(String nameTrainer, String descriptionTrainer, TrainerType trainerType) {	
            this.trainerType = trainerType;
            this.nameTrainer = nameTrainer;
            this.descriptionTrainer = descriptionTrainer;
        }	
}

