import java.util.Scanner;
import java.util.Random;
public class eqCreator {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		String myArray[];
		myArray = new String[100];
		
		
		System.out.println("Enter any number to begin each question, Or enter '0' to end the quiz: ");

		int score=0;
		int total=0;
		
		int y = input.nextInt();
		
		
		while(y!=0){
			
			int theNum = rand.nextInt(5) +1;
			
			if(theNum == 1){
			int a = rand.nextInt(20)+2;
			int b = rand.nextInt(20)+1;
			int c = rand.nextInt(20)+2;
			int ans = rand.nextInt(10);
			
			if(a==c)a=a+1;
			if(ans==0)ans=ans+rand.nextInt(20)+2;
			
			int d = ans*(a-c) + b;

				if(d==0)System.out.print("What is x when" + a + "x = " + c + "x?");
				if(d<0){System.out.print("What is x when " + a + "x + " + b + " = " + c + "x " + d+"?");}
				if(d>0){System.out.print("What is x when " + a + "x + " + b + " = " + c + "x +" + d+"?");}
				
				int num = input.nextInt();
			if(num==ans){
				System.out.println("Correct!");
				y = input.nextInt();
				myArray[total] = "Correct";
				score++;
				total++;
			}
			else{
				System.out.println("Sorry that's not right, the correct answer was " + ans);
				y = input.nextInt();
				myArray[total] = "Wrong";
				total++;
			}
			}
			
			
			
			
			if(theNum==2){
				int aNum = rand.nextInt(15) + 5;
				int ans = aNum*aNum;
				System.out.println("What is " + aNum + " squared?");
				int theirAns = input.nextInt();
				if(theirAns == ans){
					System.out.println("Correct!");
					myArray[total] = "Correct";
					score++;
					total++;
					y=input.nextInt();
				}
				else{
					System.out.println("Sorry that's not right, the correct answer was " + ans);
					total++;
					myArray[total] = "Wrong";
					y=input.nextInt();
				}
				
			}
				
				
				if(theNum==3){
					int aNum = rand.nextInt(15) + 5;
					int ans = aNum*aNum;
					System.out.println("What is the square root of " + ans + "?");
					int theirAns = input.nextInt();
					if(theirAns == aNum){
						System.out.println("Correct!");
						myArray[total] = "Correct";
						score++;
						total++;
						y=input.nextInt();
					}
					else{
						System.out.println("Sorry that's not right, the correct answer was " + aNum);
						total++;
						myArray[total] = "Wrong";
						y=input.nextInt();
					}
			}
				
				
				
				
				if(theNum==4){
					int myNum = rand.nextInt(5) + 1;
					int myNum1 = rand.nextInt(10) + 1;
					int term = rand.nextInt(10) + 1;
					
					int ans = (term*myNum)+myNum1;
					String n = "";
					if(term == 1)n = "st";
					if(term == 2)n = "nd";
					if(term == 3)n = "rd";
					if(term>3)n="th";
					
					System.out.println("What is the " + term + n + " term of " + myNum + "n + " + myNum1 + "?");
					int theirAns = input.nextInt();
					if(theirAns == ans){
						System.out.println("Correct!");
						myArray[total] = "Correct";
						score++;
						total++;
						y=input.nextInt();
					}
					else{
						System.out.println("Sorry that's not right, the correct answer was " + ans);
						total++;
						myArray[total] = "Wrong";
						y=input.nextInt();
					}
				}
			
			
			
				if(theNum==5){
					int init = rand.nextInt(5) +1;
					int incr = rand.nextInt(10)+1; 
					
					int init1 = init + incr;
					int init2 = init1 + incr;
					
					int term = rand.nextInt(7) + 6;
					String n = "th";
					
					int term1 = term -1;
					int ans = init + (incr*term1);
							
					System.out.println("What is the " + term + n + " term of " + init + ", " + init1 + ", " + init2 + "?");
					
					int theirAns = input.nextInt();
					if(theirAns == ans){
						System.out.println("Correct!");
						myArray[total] = "Correct";
						score++;
						total++;
						y=input.nextInt();
					}
					else{
						System.out.println("Sorry that's not right, the correct answer was " + ans);
						total++;
						myArray[total] = "Wrong";
						y=input.nextInt();
					}
				}
			
		}
		if(y==0){
			int perc = (score*100)/total;
			System.out.println("You chose to end the quiz, you scored " + score + " out of a possible " + total + ", scoring " + perc + "%!");
			
		}
		input.close();
		}
	}