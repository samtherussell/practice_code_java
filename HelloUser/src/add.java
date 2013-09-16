import java.util.Scanner;
public class add{
	public static void main(String[]array){
		Scanner input =  new Scanner(System.in);
		System.out.println("enter the first number");
		float number1 = input.nextFloat();
		System.out.println("And now the second");
		float number2 = input.nextFloat();
		float answer = number1 + number2;
		System.out.println("The answer is ......");
		System.out.println(answer);
	}

}
