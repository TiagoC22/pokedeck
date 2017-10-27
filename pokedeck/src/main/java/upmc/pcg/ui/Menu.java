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

package upmc.pcg.ui;
import java.util.Scanner; //Class scanner
import upmc.pcg.ajoutCarte; //Class ajoutCarte
import upmc.pcg.supprCarte; //Class supprCarte


public class Menu {
  
   public void start()
  {
  
 
    Scanner sc = new Scanner(System.in);
    System.out.println("[1] Ajouter une carte");
    System.out.println("[2] Supprimer une carte");
    int choix = sc.nextInt();
  
  switch(choix) {
    case 1: if (choix == 1) {
        new ajoutCarte(); break;
    }
    
    case 2: if (choix == 2) {
        new supprCarte();
    }
    
}
  
  }   
   
   
}
