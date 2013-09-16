package myObjects;

import java.util.ArrayList;


public class Form {
	
	public static final int AllDetails = 0;
	public static final int NamesOnly = 1;
	public static final int NamesAndGender = 2;
	
	private ArrayList<Pupil> pupils;
	
	public Form(){
		pupils = new ArrayList<Pupil>();
	}
	/**
	 * 
	 * @return int
	 */
	public int getPupilNumber(){
		return pupils.size();
	
	}
	/**
	 * 
	 * @param firstName
	 * @param SurName
	 * @param gender
	 * @param age
	 * @param iq
	 */
	public void addPupil(String firstName,String SurName, char gender, int age,int iq){
		
		int newPupilID = pupils.size()+1;
		Pupil newPupil = new Pupil(newPupilID, firstName, SurName, gender, age, iq);
		pupils.add(newPupil);
	}
	/**
	 * 
	 * @param index
	 * @return pupil object
	 * @throws Exception
	 */
	public Pupil getPupil(int index) throws Exception{
	
		try{
			return pupils.get(index);
		}catch(IndexOutOfBoundsException e){
			throw new Exception("There isn't a pupil with that id");
		}finally{
			
		}
		
	}
	
	public Pupil[] getAllPupils(){
		
		Pupil[] AllPupils = new Pupil[pupils.size()];
		
		for(int x= 0; x<pupils.size(); x++){
			AllPupils[x] = pupils.get(x);
		}
		
		return AllPupils;
		
	}
	
	public String getListOfAllPupils(int option){
		
		if(pupils.size()<1){
			return "There are no pupils to show";
		}else{
		
			StringBuilder sb = new StringBuilder();
			
			switch(option){
			case 0:
				//title
				sb.append("Name\t\tGender\tAge\tIQ\n");
				//each row
				for(int x= 0; x<pupils.size(); x++){
					//adds each value followed by tab
					//and a new line at end
					sb.append(pupils.get(x).getName()+"\t"+pupils.get(x).getGender()+"\t"+pupils.get(x).getAge()+"\t"+pupils.get(x).getIQ()+"\n");
				}
				
				break;
			case 1:
				
				for(int x= 0; x<pupils.size(); x++){
					sb.append(pupils.get(x).getName()+"\n");
				}
				
				break;
			case 2:
				
				sb.append("Name\t\tGender\n");
				
				for(int x= 0; x<pupils.size(); x++){
					sb.append(pupils.get(x).getName()+"\t"+pupils.get(x).getGender()+"\n");
				}
				
				break;
			
			default:
				sb.append("Please select a valid option");
				break;
			}
			
			return sb.toString();
		}
	}
	
	public String getListOfPupils(boolean name, boolean gender, boolean age, boolean iq){
		
		StringBuilder sb = new StringBuilder();
		
		//titles
		if(name)
			sb.append("Name\t\t");
		if(gender)
			sb.append("Gender\t");
		if(age)
			sb.append("Age\t");
		if(iq)
			sb.append("IQ\t");
		sb.append("\n");
		
		
		for(int x= 0; x<pupils.size(); x++){
			if(name)
				sb.append(pupils.get(x).getName()+"\t");
			if(gender)
				sb.append(pupils.get(x).getGender()+"\t");
			if(age)
				sb.append(pupils.get(x).getAge()+"\t");
			if(iq)
				sb.append(pupils.get(x).getIQ()+"\t");
			sb.append("\n");
		}
		
		
		return sb.toString();
		
	}
	
	
}
