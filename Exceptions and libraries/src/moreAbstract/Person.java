package moreAbstract;

public class Person {

	
	protected String firstName;
	protected String SurName;
	protected char gender;
	protected int age;
	
	
	public Person(){
		//set default values if no data is given
		this.firstName = "John";
		this.SurName = "Doe";
		this.gender = 'm';
		this.age = 20;
		
	}
	
	public Person(String firstName,String SurName, char gender, int age){
		
		
		this.firstName = firstName;
		this.SurName = SurName;
		this.gender = gender;
		this.age = age;
		
	}

	public String toString(){
		
		return String.format("This is a %s named %s %s aged %d.", getGender(),firstName, SurName, age);
		
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
	
	
	
}
