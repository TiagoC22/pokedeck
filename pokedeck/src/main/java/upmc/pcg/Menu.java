package upmc.pcg;
import upmc.pcg.ui.GameConsole;
import java.util.Scanner;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	public GameConsole GameConsole;
	private Deck game;
        
		
	public Menu(Deck d, Scanner scanner) {
		this.sc = scanner;
		GameConsole = new GameConsole(scanner);
		game = d;
	}
	
        String choice = "1";
	public void start() {
            
		System.out.println("Veuillez faire un choix :");
		while (Integer.parseInt(choice) != 0) {
			askUser_1(); //Call method askUser_1	
		}
	}
	
	public void askUser_1() {
            
		System.out.println("1 / Add a card");
		System.out.println("2 / Delete a card");
		System.out.println("3 / Update a card");
		System.out.println("4 / See the deck");
		System.out.println("5 / Search a card");
		System.out.println("6 / Leave");
                        
                choice = sc.nextLine();
		if (choice.equals("")) {
                    choice = "0";
                    System.out.println("Choose an existing choice");
		}
		
		int value = Integer.parseInt(choice);
		
		switch(value) {
                        default :
                            System.out.println("This is not a good choice !");
			break;
                        case 1 : //Add a card
				GameConsole.addCardDeck(game);
				break;
                                
                        case 2 : //Delete a card
				GameConsole.delCard(game);
				break;
                        
                        case 3 : //Update a card
				GameConsole.updateCard(game);
				break;
                            
                        case 4 : //See deck
				GameConsole.allDeck(game);
				break;
			
                        case 5 : //Search a card
				GameConsole.searchCard(game);
				break;
			
                        case 6 :
				System.exit(0);
				break;
			
			
			
					
		}
	}
	
	
}
