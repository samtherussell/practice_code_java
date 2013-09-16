package cheese;

import myObjects.*;

public class Input {
	static Form d1;
	
	public static void main(String[] s){
		
		Student sam = new Student();
		System.out.println(sam.toString());
		
		/*d1 = new Form();
		d1.addPupil("Georgina", "Russell", 'f', 15, 97);
		d1.addPupil("Ian", "Russell", 'm', 49, 120);
		d1.addPupil("Lesley", "Russell", 'f', 50, 130);
		
		
		try {
			System.out.println(d1.getPupil(10).getName());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(d1.getListOfAllPupils(Form.NamesOnly));
		
		
		System.out.println(AverageIQs());
		*/
	}

	private static int AverageIQs() {
		
		int sum = 0;
		for(int x = 0; x< d1.getPupilNumber(); x++){
			try {
				sum+= d1.getPupil(x).getIQ();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		int AVG;
		
		try{
			AVG = sum/d1.getPupilNumber();
		}catch(ArithmeticException e){
			AVG = 0;
		}
		
		return AVG;
	}

}
