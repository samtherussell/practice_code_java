import java.util.Random;
import java.util.Scanner;
public class Monkey {
	public static void main(String[] a){
		
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		int n = 0;
		int f = 0;
		int s = 0;
		
		System.out.println("pick a number");
		n = input.nextInt();
		System.out.println("okay");
		
		
		for(int c = 0; c<1; ){
		s = r.nextInt(1000000001);
		f++;
		
		if(s==1){
			System.out.println(f);
			
			float d = ((float)f/1000000000)*100;
			System.out.println(d);
			
			
		c++;	
		}
		
		}
		
		
		
	}
}
