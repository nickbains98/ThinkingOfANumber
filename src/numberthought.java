import java.util.Scanner;
import java.util.Random;
public class numberthought {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		
		p("Welcome to the fabulous game of \"I'mThinkingOfANumber\"");
		p("Type a \"1\" if you want to guess or a \"2\" if you want me to guess.");
		
		int gameTypeChoice = scanner.nextInt();
		
		if (gameTypeChoice == 1){
			game1(scanner, random);
		}
		
	}
	
	
	
	public static void game1(Scanner scanner, Random random){
		int computerNumber = random.nextInt(101);
		p("This is the game where I think of a number between 0 and 100, and you try to guess it.");
		p("Take a guess of what my number is");
		while(true){
			
			int guess = scanner.nextInt();
			
			int numberOfGuesses = 1;
			
			while(guess != computerNumber){
				if (guess<computerNumber){
					p("Your guess is too low.");
					numberOfGuesses += 1;
					guess = scanner.nextInt();
				}else if(guess>computerNumber){
					p("Your guess is too high.");
					numberOfGuesses += 1;
					guess = scanner.nextInt();
				}else{
					p(guess + " is an invalid number, please guess again");
					guess = scanner.nextInt();
				}
			}
			p("Gnarly dude, it was " + computerNumber);
			p("You guessed " + numberOfGuesses + " times.");
		}
	}
	public static void p(String s){
		System.out.println(s);
	}
}
