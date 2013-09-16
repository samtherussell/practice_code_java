
public class Programme3 {
	int old;
	String text;
	int bob;
	public Programme3(int age, int boob){
		 old = age;
		 bob = boob;
	}
	public String message(){
		switch(bob){
		case 0:	
			 text = String.format("Your number tripled is %d\n", old);
			return text;
		case 1:
			text = String.format("Your number quadrupled is %d \n", old);
			return text;
		default:
			return String.format("what the hell are you on");
		}
		
	}

}
