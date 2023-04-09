package NumberGuessing;
import java.util.*;
import javax.swing.*;

;public class NumberGuessing{
	public static void main(String[] args) {
		int range=100;
		int maxAttempts=10;
		int score=0;
		Random rand=new Random();
		
		int NumberToGuess = rand.nextInt(range)+1;
		 for(int i=1; i<=maxAttempts ; i++){
		String guessString=JOptionPane.showInputDialog(null,"Guess the number(between 1 to "+range+")"+"\n\n Attempts left:"+(maxAttempts-i+1+"\n\n"));
		int guess=Integer.parseInt(guessString);
		if(guess==NumberToGuess) {
			JOptionPane.showMessageDialog(null,"congratulations.....\n you guessed the number in "+i+"attempts!");
			score+=(maxAttempts-i+1);
			break;
		}
		else if(guess<NumberToGuess) {
			JOptionPane.showMessageDialog(null,"Your guess is too low");
		}
		else {
			JOptionPane.showMessageDialog(null,"Your guess is too high.");
		}
		 }
		 JOptionPane.showMessageDialog( null,"Thankyou for playing this game .\n \n      your score is :"+score);
	}
}