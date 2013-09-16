import java.util.ArrayList;


public class Solve {

	String SolveIt(ArrayList<String> Terms){
		
		
		






//For DIVIDE
//run through terms
		for (int x = 0; x < Terms.size(); x++) {
			//if it is multiply
			if (Terms.get(x).toString().contains("/")){
				double first = Double.parseDouble(Terms.get(x-1).toString());
				double second = Double.parseDouble(Terms.get(x+1).toString());
				double product = first/second;
				Terms.set(x-1, Double.toString(product));
				Terms.remove(x+1);
				Terms.remove(x);	
				x--;
			}
		}


//FOR MULTIPLYING
//run through terms
for (int x = 0; x < Terms.size(); x++) {
	//if it is multiply
	if (Terms.get(x).toString().contains("*")){
		double first = Double.parseDouble(Terms.get(x-1).toString());
		double second = Double.parseDouble(Terms.get(x+1).toString());
		double product = first*second;
		Terms.set(x-1, Double.toString(product));
		Terms.remove(x+1);
		Terms.remove(x);	
		x--;
	}
}


//FOR ADDING
		//run through terms
		for (int x = 0; x < Terms.size(); x++) {
			//if it is multiply
			if (Terms.get(x).toString().contains("+")){
				double first = Double.parseDouble(Terms.get(x-1).toString());
				double second = Double.parseDouble(Terms.get(x+1).toString());
				double product = first+second;
				Terms.set(x-1, Double.toString(product));
				Terms.remove(x+1);
				Terms.remove(x);	
				x--;
			}
		}

//FOR SUBTRACTING
//run through terms
for (int x = 0; x < Terms.size(); x++) {
	//if it is multiply
	if (Terms.get(x).toString().contains("-")){
		double first = Double.parseDouble(Terms.get(x-1).toString());
		double second = Double.parseDouble(Terms.get(x+1).toString());
		double product = first-second;
		Terms.set(x-1, Double.toString(product));
		Terms.remove(x+1);
		Terms.remove(x);	
		x--;
	}
}
		
		return Terms.get(0).toString();
		
	}
	
	
}
