
public class test {
	
	public void main(String[] args){
		System.out.println("ijit");
		
		System.out.println(Expectation(3,3));
	}
	
	private float Expectation(int scorea, int scoreb) {
		// TODO Auto-generated method stub
		float vara = scoreb-scorea;
		float varb = vara/400;
		float varc = (float) Math.pow(10, varb);
		float vard = 1 + varc;
		float vare = 1/vard;
		return vare;
	}
}
