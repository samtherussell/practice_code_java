import java.util.Random;
import java.util.Scanner;
public class however {
	public static void main(String[]args){
		Random number = new Random();
		int rannum = number.nextInt(10) + 1;
		int counter = 0;
		int goes = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("i am thinking of a number between 1 and 10. What is it?");
		while(counter < 1){
			
		int usernum = input.nextInt();
		
		if(usernum > 10){
			System.out.println("thats not between 1 and 10!! Try again...");
		}
		else{
		if(usernum == rannum){
			System.out.println("Well Done!! You Guessed it");
			goes++;
			System.out.printf("it took you %d goes.", goes);
			counter++;
		}
		else{
			
			int question = number.nextInt(6);
			
			switch(question){
			case 0: 
				System.out.println("Try again...");
				goes++;
				break;
			case 1:
				System.out.println("have another go...");
				goes++;
				break;
			case 2:
				System.out.println("and another...");
				goes++;
				break;
			case 3:
				System.out.println("Come on you can get it...");
				goes++;
				break;
			case 4:
				System.out.println("give it another try...");
				goes++;
				break;
			case 5:
				System.out.println("and again...");
				goes++;
				break;
			}
		}
			
			
		}
		}
	}

}
