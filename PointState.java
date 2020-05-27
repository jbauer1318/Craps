public class PointState extends State {
// ------------------------------------------------------------------------
// Second roll of dice:
//    7 Loss ("seven out") match of previous roll Win ("hits the points")
//    any other, roll again
// ------------------------------------------------------------------------    
    private int points_to_match;

    public PointState(State source) {
        super(source);
        points_to_match = source.getContext().getCurrentRoll();
    }
    
    public PointState(Dice dice) {
        super(dice);
        System.out.println("** Invalid State Transition Exception **");
        System.exit(0);
    }

    public void transitionState() { 
    	if(roll == pointScore){
			System.out.println("You rolled your number, you win!");
			on = true;
			System.out.println("Would you like to play again?");
			String again = keyboard.next();
			if(!again.equalsIgnoreCase("yes") && !again.equalsIgnoreCase("y"))
				break;
			System.out.println();
		}
    	
		else if(roll == 7){
			System.out.println("You lose!");
			on = true;
			System.out.println("Would you like to play again?");
			String again = keyboard.next();
			if(!again.equalsIgnoreCase("yes") && !again.equalsIgnoreCase("y"))
				break;
			System.out.println();
		}
    	
		else{
			System.out.println("You failed to roll a "+pointScore+" or 7, please roll again");
		}
    }
    //  transitions to either a Win or Loss state    
}
