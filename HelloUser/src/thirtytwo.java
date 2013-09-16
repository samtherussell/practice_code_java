
public class thirtytwo {
public static void main(String[] args){
	int bob[] = {8,5,9,3,6};
	int boob = 0;
	
	
	for(int output : bob )
	boob += output;
	System.out.println(boob);
	boob=0;
	
	add(bob);
	
	System.out.println("_________________");
	for(int output : bob ){
		boob += output;
	System.out.println(output);}
	System.out.println("_________________");
	System.out.println(boob);
		
	int n = bob.length*5;
	boob = boob-n;

	System.out.println(boob);
		
}
public static void add(int input[]){
	
	for(int counter = 0; counter < input.length; counter++)
		input[counter]+= 5;
}

}
