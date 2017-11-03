// Copyright 2017 Pierre Talbot (IRCAM)

// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at

//     http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package upmc.pcg;

import java.util.Scanner; //Class scanner
import upmc.pcg.Paquet;
import upmc.pcg.ajoutCarte; //Class ajoutCarte
import upmc.pcg.supprCarte; //Class supprCarte


public class Menu {
  
   public void start()
  {
  
 
    Scanner sc = new Scanner(System.in);
    System.out.println("[1] Ajouter une carte");
    System.out.println("[2] Supprimer une carte");
    System.out.println("[3] Mettre à jour une carte");
    System.out.println("[4] Consulter mon paquet");
    System.out.println("[5] Quitter");
    int choix = sc.nextInt();
  
  switch(choix) {
    case 1: if (choix == 1) { 
        ajoutCarte ajoutc = new ajoutCarte(); //Lance la classe ajoutCarte
        ajoutc.texte1(); //Lancement méthode
    }
    
    case 2: if (choix == 2) { 
        supprCarte supprc = new supprCarte(); //Lance la classe supprCarte
        supprc.texte(); //Lancement méthode
        break;
    }
    
    case 3: if (choix == 3) {
        System.out.println("Fonctionnalité pas encore disponible");
    }
      
    case 4: if (choix == 4) { 
        Paquet paquetdecarte = new Paquet(); 
        paquetdecarte.afficherCarte();
        break;
    }
    
    case 5 : if(choix == 5) {
        System.out.println("Vous allez quitter le programme...");
        System.exit(0);
    }
    
    case 6 : if(choix != 1 && choix  != 2 && choix != 3 && choix != 4 && choix != 5) {
        System.out.println("Veuillez saisir une valeur existente :");
        start();
    }
}
  
  }   
   
   
}
