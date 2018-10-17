import java.util.*;
import javax.swing.*;

public class Play{
	public static void main(String[] args){
		Yahtzee game = new Yahtzee();
		Scanner iDevice = new Scanner(System.in);
		char select = '';
		
		while(select != 'D' || select != 'd'){
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
			
			if( select == 'a' || select == 'A'){
			System.out.println(" Player one rolls ! \n" +
			"   Player One rolled: \n" +
			"       " + game.toss() + "\n" +
			"**************************\n");
			}
			else if ( select == 'b' || select == 'B'){
				
			}
			
		}
	}
}