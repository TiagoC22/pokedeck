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



public class Menu {
  
   public void start()
  {
  
 
    Scanner sc = new Scanner(System.in);
    System.out.println("[1] Add a card");
    System.out.println("[2] Delete a card");
    System.out.println("[3] Update a card");
    System.out.println("[4] View my deck");
    System.out.println("[5] Exit");
    int choice = sc.nextInt();
  
    switch(choice) {
        case 1: if (choice == 1) { 
            addCard ajoutc = new addCard(); //run addCard class
            ajoutc.askAddCard(); //run method askAddCard
        }
    
        case 2: if (choice == 2) { 
            delCard supprc = new delCard(); //run delCard class
            supprc.askDelCard(); //run method askDelCard
            break;
        }
    
        case 3: if (choice == 3) {
            System.out.println("Functionality not yet available");
        }
      
        case 4: if (choice == 4) { 
            Deck paquetdecarte = new Deck(); 
            paquetdecarte.displayCard();
            break;
        }
    
        case 5 : if(choice == 5) {
            System.out.println("You will leave the program...");
            System.exit(0);
        }
    
        case 6 : if(choice != 1 && choice  != 2 && choice != 3 && choice != 4 && choice != 5) {
            System.out.println("Please enter an existing value :");
            start();
        }
    }

  }   
   
   
}
