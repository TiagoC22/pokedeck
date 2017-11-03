/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.pcg.game;

import java.util.Scanner;
import upmc.pcg.Menu;
import upmc.pcg.ajoutCarte;

/**
 *
 * @author lepor
 */
public class EnergyCard {

public static EnergyType energyType;
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
    
    public static void askEnergyCard() {
        Scanner console1 = new Scanner(System.in);
            System.out.println("Nom de l'énergie : ");
            System.out.flush();
            String nameEnergy = console1.nextLine();
            
            System.out.println("Voici la liste des énergies :");
            
            
            for(EnergyType energy : EnergyType.values()){
               System.out.print(energy+" ,");
            }
            System.out.println(" ");
            Scanner console3 = new Scanner(System.in);
            System.out.println("Veuillez choisir une énergie (N'oubliez pas la majuscule):");
            System.out.flush();
            String TypeEnergy = console3.nextLine();
            
            if (TypeEnergy.equals("Plante")) {
                energyType = EnergyType.Plante;
                }
            else if (TypeEnergy.equals("Electrique"))  {
                energyType = EnergyType.Electrique;
            }
            else if (TypeEnergy.equals("Eau")) {
                energyType = EnergyType.Eau;
            }
            else if (TypeEnergy.equals("Psy")) {
                energyType = EnergyType.Psy;
            }
            else if (TypeEnergy.equals("Feu")) {
                energyType = EnergyType.Feu;
            }
            else if (TypeEnergy.equals("Combat")) {
                energyType = EnergyType.Combat;
            }
            else if (TypeEnergy.equals("Métal")) {
                energyType = EnergyType.Métal;
            }
            else if (TypeEnergy.equals("Obscurité")) {
                energyType = EnergyType.Obscurité;
            }
            else if (TypeEnergy.equals("Fée")) {
                energyType = EnergyType.Fée;
            }
            else if (TypeEnergy.equals("Incolore")) {
                energyType = EnergyType.Incolore;
            }
            else if (TypeEnergy.equals("Dragon")) {
                energyType = EnergyType.Dragon;
            }
        //Création de la carte
        EnergyCard energy = new EnergyCard(nameEnergy,energyType);
        System.out.println(energy.getCardEnergy());
        
        Scanner console4 = new Scanner(System.in);
       
        System.out.println("Voulez-vous ajouter une nouvelle carte ?");
        System.out.println("[1] YES / [2] NO");
        System.out.flush();
        int yes_no = console3.nextInt();
       
        if (yes_no == 1) {
        ajoutCarte ajoutc = new ajoutCarte(); //Lance la classe ajoutCarte
        ajoutc.texte1(); //Lancement méthode
        }
        else {
        Menu menu = new Menu(); //Lancement du menu
        menu.start();
        }
    }
}
