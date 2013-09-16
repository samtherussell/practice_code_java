package MIT;

public class FindFibinachi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(find(6));
	}
	/**
	 * 
	 * @param n as the position in the sequence
	 * @return the value of that position in the sequence
	 */
	public static int find(int n){
		if(n == 0 || n == 1){
			return 1;
		}else{
			return find(n-1)+find(n-2);
		}
		
	}
	
	
	
}
