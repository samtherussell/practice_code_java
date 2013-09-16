import java.util.Scanner;


public class Program1 {
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		Programme2 digit = new Programme2();
		int c=0;
		do{
		
		System.out.println("enter number");
		int age = input.nextInt();
		int first = 0;
		
		
		int bob = Programme4.rando();
		
		switch(bob){
		case 0:	
			first = digit.triple(age);
			break;
		case 1:
			first = digit.quad(age);
			break;
			
		}
		
		
		
		
		Programme3 words = new Programme3(first,bob);
		String second = words.message();
		
		System.out.printf("%s\n", second);
		c++;
		}while(c<10);
		
		}
		
	}

