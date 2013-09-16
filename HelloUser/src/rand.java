import java.util.Random;
import java.util.Scanner;
public class rand {
public static void main(String[] args){
	int[] freq = new int[7];
	Random ran = new Random();
	Scanner input = new Scanner(System.in);
	System.out.println("how many times do you want to throw the dice?");
	int rolls = input.nextInt();
	
	for(int counter = 0; counter < rolls; counter++){
		++freq[ran.nextInt(6) + 1];
	}
	

	float total = 0;
	for(int coun = 1; coun < freq.length; coun++){
		total+=freq[coun];
		
	}
	float[] perc = new float[7];
	for(int cou = 1; cou < freq.length;cou++){
		perc[cou] = freq[cou]/total*100;	
	}
	
	
	
	System.out.println("Face\tFrequency\tpercentage of total");
	
	for(int count = 1; count < freq.length;count++){
		System.out.println(count + "\t" + freq[count] + "\t\t" + perc[count]);}
		
		int diff = Math.max(freq[1],freq[2]);
		int diff1 = Math.max(freq[3],freq[4]);
		int diff2 = Math.max(freq[5],freq[6]);
		int diff3 = Math.max(diff,diff1);
		int diff4 = Math.max(diff3,diff2);
		
		
		int diff5 = Math.min(freq[1],freq[2]);
		int diff6 = Math.min(freq[3],freq[4]);
		int diff7 = Math.min(freq[5],freq[6]);
		int diff8 = Math.min(diff5,diff6);
		int diff9 = Math.min(diff7,diff8);
		
		float dif = Math.max(perc[1],perc[2]);
		float dif1 = Math.max(perc[3],perc[4]);
		float dif2 = Math.max(perc[5],perc[6]);
		float dif3 = Math.max(dif,dif1);
		float dif4 = Math.max(dif3,dif2);
		
		
		float dif5 = Math.min(perc[1],perc[2]);
		float dif6 = Math.min(perc[3],perc[4]);
		float dif7 = Math.min(perc[5],perc[6]);
		float dif8 = Math.min(dif5,dif6);
		float dif9 = Math.min(dif7,dif8);
		
		
		System.out.printf("%d - %d ", diff4, diff9);
		
		
		System.out.println("so the differentce between biggest and smallest is ");
		System.out.println(diff4 - diff9);
		
		System.out.printf("and %f - %f equals the percentage difference which is: " , dif4, dif9);
		System.out.println(dif4-dif9);
		
		System.out.println("total throws: " + total);
		
		
	
	
	
	
	}
}
