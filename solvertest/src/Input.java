import java.util.Scanner;





public class Input {
	public static void main(String[] args){
		while(1==1){
		System.out.println("go");
		Scanner input = new Scanner(System.in);
		String equation = input.nextLine();
		
		Solver solver = new Solver("ready");
		solver.input(equation);
		String answer = solver.solve();
		System.out.println(answer);
		}
	}
}
