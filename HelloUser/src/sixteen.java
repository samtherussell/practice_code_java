import java.util.Scanner;

public class sixteen {
	public static void main(String[] array){
	
		Scanner input = new Scanner(System.in);
		
		for(int counter = 0; counter < 4; counter++){
		
		System.out.println("enter age");
		int age = input.nextInt();
		
		if(age < 10){
			if(age < 5){
			System.out.println("Way too young");
			}
			else{
				System.out.println("too young");
			}
		}
		else{
			System.out.println("you're alright");
		
		}
		}
		System.out.println("bye bye");
	}
}
