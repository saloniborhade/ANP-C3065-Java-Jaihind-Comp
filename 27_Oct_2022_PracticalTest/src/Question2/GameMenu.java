package Question2;

public class GameMenu {

	public void startGame() {
		// TODO Auto-generated method stub
		System.out.println("Your Game Will Start");
		
	}
	
	public void displayGameInstruction() {
		// TODO Auto-generated method stub
		System.out.println("Instructions:");
		
	}
	
	public void exitGame() {
		// TODO Auto-generated method stub
		System.out.println("Game Over");
		
	}
	
	public static void main(String[] args) {
		System.out.println(" Start The Game");
		System.out.println("Display Game Instructions");
		System.out.println("Exit The Game");
		GameMenu demoObj=new GameMenu();
		
		int menuChoice=3;
		switch(menuChoice) {
		case 1:
			demoObj.startGame();
			break;
		case 2:
			demoObj.displayGameInstruction();
			break;
		case 3:
			demoObj.exitGame();
			break;
		default:
			System.out.println("Wrong Choice");
			
		}
	}

}
