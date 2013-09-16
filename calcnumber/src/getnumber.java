import java.util.Scanner;
import java.util.StringTokenizer;


public class getnumber {
	
	static int N = 6;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		while(1==1){
			System.out.println("target");
			int target = Integer.parseInt(input.nextLine());
			
			
			System.out.println("numbers");
			String StringNumbers = input.nextLine();
			
			StringTokenizer st = new StringTokenizer(StringNumbers);
			
			int Numbers[] = new int[6];
			
			if(st.countTokens()!=6){
				System.out.println("six number please");
			}else{		
				for (int x = 0; st.hasMoreTokens(); x++) {
					Numbers[x] = Integer.parseInt(st.nextToken());
				}
				
				System.out.println(new OxfordSolver().Solve(Numbers, target));
				/*calcSolution cs = new calcSolution(Numbers, target);
				
				System.out.println(cs.getMethod());*/
				}
		}
		
		
	}

}
