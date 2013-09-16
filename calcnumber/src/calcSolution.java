


public class calcSolution {

	int[] numbers;
	boolean[] numberUsed;
	int target;
	
	
	
	
	public calcSolution(int[] Numbers, int Target) {
		this.numbers = Numbers;
		this.target = Target;
		this.numberUsed = new boolean[numbers.length];
		clearNumberUsed();
	}

	public String getMethod() {
		
		
		
		calcFactors cf = new calcFactors();
		System.out.println("before");
		if(cf.getMethod(numbers, target,numberUsed)){
			System.out.println("woop");
		}else{
			System.out.println("noe");
			int j = 1;
			for(int f = 0; f<numbers.length; f++){
				System.out.println(j);j++;
				numberUsed[f] = true;
				
				if(cf.getMethod(numbers, target + numbers[f],numberUsed)){
					System.out.println("+ "+numbers[f]+"woop +");
					break;
				}else if(cf.getMethod(numbers, target - numbers[f],numberUsed)){
					
					System.out.println("- "+numbers[f]+"woop");
					break;
				}else{
					System.out.println("meh");
				}
				
			}
		}
		
		
		return "";
		
		
	}

	private void clearNumberUsed() {
		// TODO Auto-generated method stub
		for(int x = 0; x<numberUsed.length;x++){
			numberUsed[x] = false;
		}
	}

	
}
