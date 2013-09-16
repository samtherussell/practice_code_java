import java.util.Scanner;
public class time {
	
	
public static void main(String[]args){
	
	int[] time = {0,0,0};
	String[] data = {"Hour", "Minute", "Second"};
	
	Scanner input = new Scanner(System.in);
	for(int counter =0; counter < 3; counter++){
		System.out.printf("input %s", data[counter]);
		System.out.println();
	time[counter] = input.nextInt();
			}
	
	
	methodtime method = new methodtime();
	method.settime(time[0],time[1],time[2]);
	System.out.println(method.normaloutput());
	System.out.println(method.wordtime());
}
}
