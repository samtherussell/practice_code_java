import java.util.Scanner;





public class Input {
	public static void main(String[] args){
		while(1==1){
		System.out.println("go");
		Scanner input = new Scanner(System.in);
		
		System.out.println("equation");
		String equation = input.nextLine();
		
		System.out.println("from");
		int LowerLimit = input.nextInt();
		
		System.out.println("to");
		int UpperLimit = input.nextInt();

		
		Summer sum = new Summer(equation, LowerLimit, UpperLimit);
		double answer = sum.getAnswer();
		
		
		System.out.println(answer);
		}
	}
}
