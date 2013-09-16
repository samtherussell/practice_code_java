package cheese;

import moreAbstract.Person;

public class Student extends Person {

	protected int pupilID;
	protected int iq;
	
	
	public Student(){
		//set default values if no data is given
		this.firstName = "Example";
		this.SurName = "Student";
		this.gender = 'f';
		this.age = 10;
		this.pupilID = 11;
		this.iq = 12;
	}
	
	public Student(int pupilID, String firstName,String SurName, char gender, int age,int iq){
		super(firstName,SurName,gender, age);
		this.pupilID = pupilID;
		this.iq = iq;
	}
	
	@Override
	public String toString() {
		
		return String.format("This is a %s named %s %s aged %d with an IQ of %d", getGender(),firstName, SurName, age, iq);
	}

	public int getIQ(){
		return iq;
		
	}
	

}
