import java.util.ArrayList;
import java.util.StringTokenizer;


public class Summer {
	ArrayList<String> Terms = new ArrayList<String>();
	String Equation;
	double total = 0;
	int LowerLimit;
	int UpperLimit;
	
	
	public Summer(String equation, int lowerLimit, int upperLimit) {
		// TODO Auto-generated constructor stub
		Equation = equation;
		LowerLimit = lowerLimit;
		UpperLimit = upperLimit;
				
				
		//sub in values
		for(int x = lowerLimit; x<(upperLimit+1);x++)
		subinX(x);
		
		
	
		
		
		
		
		
		
	
	}
	
	
	
	
	private void subinX(int xValue) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(Equation);		
		
		for (int x = 0; st.hasMoreTokens(); x++) {
			Terms.add(st.nextToken());
		}
		
		for (int x = 0; x < Terms.size(); x++) {
			if (Terms.get(x).toString().contains("x")){
				Terms.set(x, Integer.toString(xValue));
			}
		}	
		
		StringBuffer strBuff = new StringBuffer();
		
		for (int h = 0; h < Terms.size(); h++) {
			strBuff.append(Terms.get(h).toString());
			strBuff.append(" ");
		}	
		
		String EquationNoX = strBuff.toString();
		
	System.out.println(EquationNoX);
	Terms.clear();
	
	Calculator calc = new Calculator();
	calc.input(EquationNoX);
	total+= Double.parseDouble(calc.Calculate());
	
	}




	public Double getAnswer() {
		// TODO Auto-generated method stub
		return total;
	}
	
	
}

