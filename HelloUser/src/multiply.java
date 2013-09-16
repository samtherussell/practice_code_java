import java.util.Scanner;
public class multiply {
public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	System.out.println("enter the first number");
	double no1 = input.nextDouble();
	System.out.println("enter the Second number");
	double no2 = input.nextDouble();
	double answer = no1 * no2;
	System.out.println(answer);
}

}
