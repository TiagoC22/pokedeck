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
import java.util.*;


public class Menu {
   public static void main(String[] args)
  {

  System.out.println("[1] Ajouter une carte");
  System.out.flush();
  Scanner console = new Scanner(System.in);
  int choice1 = console.nextInt();
  
  System.out.println("[2] Supprimer une carte");
  System.out.flush();
  int choice2 = console.nextInt();

  }   
}
