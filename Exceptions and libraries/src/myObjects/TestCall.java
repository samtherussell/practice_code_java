package myObjects;

public class TestCall {
	
	public static void main (String args[]){
		
		/*
		Pupil pupil = new Pupil("Sam", "Russell", 'm', 17, 800);
		System.out.println(pupil.getName());
		*/
		
		
		Form d1 = new Form();
		d1.addPupil("Gina", "Russell", 'f', 15, 97);
		d1.addPupil("Ian", "Russell", 'm', 49, 120);
		d1.addPupil("Lesley", "Russell", 'f', 50, 130);
		
		/*try{
			System.out.println(form.getPupil(1).getName());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}*/
		
		System.out.println(d1.getListOfPupils(true, false, true, false));
		
	}

}
