/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import upmc.pcg.Menu;
import upmc.pcg.addCard;

/**
 *
 * @author lepor
 */
public class EnergyCard {

public static EnergyType energyType;
private String nameEnergy; //name of the card


    //Constructor
    public EnergyCard(String nameEnergy, EnergyType energyType) {	
        this.energyType = energyType;
        this.nameEnergy = nameEnergy;
    }	
        
    //Accessors
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
    
    public static List<EnergyCard> jeu = new ArrayList<EnergyCard>(); //declaration of the array

    public static EnergyCard getArrayEnergy() {
    for (int x=0; x<jeu.size(); x++) {
       return jeu.get(x);
    }
        return null;
     
}
    
    public static void askEnergyCard() {
            Scanner console1 = new Scanner(System.in);
            System.out.println("Name of energy : ");
            System.out.flush();
            String nameEnergy = console1.nextLine();
            
            System.out.println("Here is the list of energy's :");
            
            
            for(EnergyType energy : EnergyType.values()){
               System.out.print(energy+" ,");
            }
            System.out.println(" ");
            Scanner console2 = new Scanner(System.in);
            System.out.println("Please choose an energy (Don't forget the capital letter :");
            System.out.flush();
            String TypeEnergy = console2.nextLine();
            
            if (TypeEnergy.equals("Grass")) {
                energyType = EnergyType.Grass;
                }
            else if (TypeEnergy.equals("Lightning"))  {
                energyType = EnergyType.Lightning;
            }
            else if (TypeEnergy.equals("Water")) {
                energyType = EnergyType.Water;
            }
            else if (TypeEnergy.equals("Psy")) {
                energyType = EnergyType.Psy;
            }
            else if (TypeEnergy.equals("Fire")) {
                energyType = EnergyType.Fire;
            }
            else if (TypeEnergy.equals("Fighting")) {
                energyType = EnergyType.Fighting;
            }
            else if (TypeEnergy.equals("Metal")) {
                energyType = EnergyType.Metal;
            }
            else if (TypeEnergy.equals("Darkness")) {
                energyType = EnergyType.Darkness;
            }
            else if (TypeEnergy.equals("Fairy")) {
                energyType = EnergyType.Fairy;
            }
            else if (TypeEnergy.equals("Incolore")) {
                energyType = EnergyType.Incolore;
            }
            else if (TypeEnergy.equals("Dragon")) {
                energyType = EnergyType.Dragon;
            }
        //Create the card
        jeu.add(new EnergyCard(nameEnergy, energyType));
        EnergyCard energy = new EnergyCard(nameEnergy,energyType);
        jeu.add(energy);
        System.out.println(energy.msgEnergy());
       
        Scanner console3 = new Scanner(System.in);
       
        System.out.println("Do you want to add a new card ?");
        System.out.println("[1] YES / [2] NO");
        System.out.flush();
        int yes_no = console3.nextInt();
       
        if (yes_no == 1) {
        addCard ajoutc = new addCard(); //run addCard class
        ajoutc.askAddCard(); //run method askAddCard
        }
        else {
        Menu menu = new Menu(); //run menu
        menu.start();
        }
    }
}
