import java.util.Scanner;
public class ten{
	public static void main(String[]args){
	
	Scanner scan = new Scanner(System.in);
	
	int age = 3;
	
	for (int counter = 0; counter < 3; counter++){
		
		System.out.println("enter your age");
		age = scan.nextInt();
		
		switch(age){
			case 18:
			System.out.println("wooo you're way to young");	 
			break;
			default:
			System.out.println("woo");
	 
		}
		
		System.out.println("5thanks for your age");
	}
	
}
}
