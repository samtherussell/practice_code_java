import java.util.Scanner;


class Paddy {
	public static void main(String[] args) {
		float oppold=100,ownold = 99;
		float oppnew,ownnew;
		float expectown = Expectation(oppold,ownold);
		float expectopp = Expectation(ownold,oppold);
		Scanner scanner =new Scanner(System.in);
		int result = scanner.nextInt();
		ownnew = newscore(expectown,result,ownold);
		oppnew = newscore(expectopp,1-result,oppold);
		System.out.println("\t\told\tnew\texpectation");
		System.out.println("own score:\t" + ownold + "\t" + ownnew +"\t" + expectown);
		System.out.println("opps score:\t" + oppold + "\t" + oppnew + "\t" + expectopp);
		String b = String.format("there was %f and now there is %f",ownold, ownnew);
		System.out.println(b);
	}

	private static float newscore(float expect, int result, float ownold) {
		// TODO Auto-generated method stub
		float vara = result-expect;
		float varb = vara*100;
		float varc = varb+ownold;
		return varc;
	}

	private static float Expectation(float a, float b) {
		// TODO Auto-generated method stub
		float vara = a-b;
		float varb = vara/400;
		float varc = (float) Math.pow(10, varb);
		float vard = 1 + varc;
		float vare = 1/vard;
		return vare;
	}
}
