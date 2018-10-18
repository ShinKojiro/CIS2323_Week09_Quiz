import java.util.*;
import javax.swing.*;

import Yahtzee.*;

public class Play{
	public static void main(String[] args){
		//Yahtzee game = new Yahtzee();
		//new players !
		Yahtzee player1 = new Yahtzee();
		Yahtzee player2 = new Yahtzee();
		Scanner iDevice = new Scanner(System.in);
		char select = 'z';
		
		while(select != 'd' && select != 'D'){
			System.out.println("**************************\n" + 
			"What do you want to do?\n" +
			"A) Roll for Player one\n" +
			"B) Roll for Player two\n" +
			"C) Cheat (?)\n" +
			"D) Quit \n" +
			"************************\n");
			
			System.out.print("\nChoose and option: ");
			select = iDevice.next().charAt(0);
			iDevice.nextLine();
			try{
			if( select == 'a' || select == 'A'){
			System.out.println(" Player One rolls ! \n" +
			"   Player One rolled: \n" +
			"       " + player1.toss() + "\n" +
			"**************************\n");
			}
			else if ( select == 'b' || select == 'B'){
			System.out.println(" Player Two rolls ! \n" +
			"   Player Two rolled: \n" +
			"       " + player2.toss() + "\n" +
			"**************************\n");
			}
			else if ( select == 'c' || select == 'C'){
				System.out.println("Player One rolls: " + player1.tossCheat());
			}
			//else if ( select == 'd' || select == 'D'){
				
			//}
			}
			catch(CheatException ex){
				System.out.println("SHAME ON PLAYER 1 !!!");
				//select = 'd';
			}
		}
	}
}