package myObjects;



public class Pupil {
	
	private int pupilID;
	private String firstName;
	private String SurName;
	private char gender;
	private int age;
	private int iq;
	
	public Pupil(){
		//set default values if no data is given
		this.pupilID = 0;
		this.firstName = "John";
		this.SurName = "Doe";
		this.gender = 'm';
		this.age = 20;
		this.iq = 90;
	}
	
	public Pupil(int pupilID, String firstName,String SurName, char gender, int age,int iq){
		
		this.pupilID = pupilID;
		this.firstName = firstName;
		this.SurName = SurName;
		this.gender = gender;
		this.age = age;
		this.iq = iq;
	}
	/**
	 * @return String
	 */
	public String toString(){
		
		return String.format("This is a %s named %s %s aged %d with an IQ of %d", getGender(),firstName, SurName, age, iq);
		
	}

	/**
	 * 
	 * @return String (both names)
	 */
	public String getName(){
		return firstName+" "+SurName;
		
	}
	
	/**
	 * 
	 * @return String (gender word interpretation)
	 */
	public String getGender(){
		
		String genderString;
		
		if(gender == 'm'){
			genderString = "male";
		}else if(gender=='f'){
			genderString = "female";
		}else{
			genderString = "person of undefined gender";
		}
		
		return genderString;
		
	}
	
	public int getAge(){
		return age;
		
	}
	
	public int getIQ(){
		return iq;
		
	}
	
}
