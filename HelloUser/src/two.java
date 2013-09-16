import java.util.Scanner;
public class two {
public static void main(String[]args){
	
	Scanner input = new Scanner(System.in);
	int integer = input.nextInt();
	one add = new one();
	int added = add.addone(integer);
			System.out.println(added);
}
}
