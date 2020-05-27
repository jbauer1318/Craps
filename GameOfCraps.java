public class GameOfCraps {

    public static void main(String[] args) {
 
        int wager;
        int human_winnings = 0;
        int computer_winnings = 0;
        int num_games_to_play;
        
        final int MAX_WAGER = 100;
        Dice dice;

        num_games_to_play = promptForNumGames();
        for(int i = 1; i <= num_games_to_play; i++){

            // HUMAN'S ROUND
            wager = getHumansWager(MAX_WAGER);
            dice = new Dice();
            playRound(dice);

            if(dice.getState() instanceof Win)
                human_winnings = human_winnings + wager;
            else
                human_winnings = human_winnings - wager;

            // COMPUTER'S ROUND
            wager = randomly_generate(MAX_WAGER);
            dice = new Dice();
            playRound(dice);

            if(dice.getState() instanceof Win)
                computer_winnings = computer_winnings + wager;
            else
                computer_winnings = computer_winnings - wager;
        }  
    } 
        
    public static int promptForNumGames(){   }

    public static int getHumansWager(double max_wager){  }
    // prompts for and returns wager between 1 and max_wager dollars
    
    Dice myDice = new Dice(6, bank, wager, hold);
	System.out.print("How much you would like to bet? \n$");
	userBet = input.nextDouble();		
	while (wager > myDice.getBank() || wager < 0)
	{
		System.out.println("Your bet wasn't in your bank range. Please bet again. \nBank: $" + myDie.getBank() + "\n");
		System.out.print("How much you would like to bet? \n$");
		wager = input.nextDouble();	
	}
	myDice.setBet(wager);

    public static int randomly_generate(int max){  }
    // generates random integer between 1 and max
    Random rn = new Random();
    int range = max - 1;
    int randomNum =  rn.nextInt(range) + 1;

    public static void playRound(Dice dice){
    // play until win or loss occurs
        while(!(dice.getState() instanceof Win) &&
              !(dice.getState() instanceof Loss))
            dice.rollDice();
    }
}