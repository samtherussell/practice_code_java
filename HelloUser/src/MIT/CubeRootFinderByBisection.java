package MIT;

import java.math.BigDecimal;
import java.util.Scanner;

public class CubeRootFinderByBisection {

	
	
	double precision;
	double input;
		
	/**
	 * 
	 * @param in is the double of which the cube root is to be found
	 * @return the cube root of 'in' rounded to 2 decimal places.
	 * 
	 */
	
	public double find(double in) {
		
		input = in;
		precision = 0.0001;
		
		Range r;
		double bg = 0;
		
		try {
			r = new Range(0, input);
		
		
		
		while(true){
		
			bg = r.getMiddle();
			
			if(Math.abs(Math.pow(bg, 3) - input ) < precision){
				break;
			}else if(Math.pow(bg, 3) < input){
				System.out.println("too low");
				r = new Range(bg,r.getUpper());
			}else if(Math.pow(bg, 3) > input){
				System.out.println("too high");
				r = new Range(r.getLower(), bg);
			}
		
		}
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(bg);
		return rounded(bg);
	}
	/**
	 * @param bg : to be rounded
	 * @return double rounded to two decimal places
	 */
	private double rounded(double bg) {
		if(bg%0.01<0.005){
			return bg - (bg%0.01);
		}else{
			return bg - (bg%0.01) + 0.01;
		}
			
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true){
			System.out.println("enter cube");
			System.out.println(new CubeRootFinderByBisection().find(input.nextInt())); 
		}
	}
}
