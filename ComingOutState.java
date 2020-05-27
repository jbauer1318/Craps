public class ComingOutState extends State {
// ------------------------------------------------------------------------
// First roll of dice:
//    2,3, or 12 Loss ("craps")  
//    7 or 11 Win ("natural")
//    any other (4,5,6,8,9,10) establishes "points"
// ------------------------------------------------------------------------
    private int roll;

    public ComingOutState(Dice dice) {
        super(dice);
    }
    
     public ComingOutState(State source) {
        super(source);
        System.out.println("** Invalid State Transition Exception **");
        System.exit(0);
    }

    public void transitionState() {  
    	
    	if(roll == 7 || roll == 11){
			System.out.println("You win!");
			System.out.println("Would you like to play again?");
			String again = keyboard.next();
			if(!again.equalsIgnoreCase("yes") && !again.equalsIgnoreCase("y"))
				break;
			System.out.println();
		}
		else if(roll == 2 || roll == 3 || roll == 12){
			System.out.println("You lose!");
			System.out.println("Would you like to play again?");
			String again = keyboard.next();
			if(!again.equalsIgnoreCase("yes") && !again.equalsIgnoreCase("y"))
				break;
			System.out.println();
		}
		
		else{
			pointScore = roll;
			System.out.println("Your number is "+roll+", please roll again");
			on = false;
		} 
   }
}

