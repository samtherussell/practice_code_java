import java.util.Scanner;
public class average {
public static void main(String[]args){
	int done = 0;
	float total = 0;
	float average;
	float number;
	int counter = 0;
	Scanner input = new Scanner(System.in);
	System.out.println("enter first number");
	total = input.nextInt();
	counter++;
	while(done < 1){
		System.out.println("enter next number or type 0 to calculate");
		number = input.nextFloat();
		if(number > 0 ){
			total = total + number;
			counter++;
		}
		else{
		done++;
		}
		
	}
		
	average = total/counter;
	System.out.println("THE AVERAGE IS " + average);
	
}
}
