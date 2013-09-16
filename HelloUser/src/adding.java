import javax.swing.JOptionPane;
public class adding {
	public static void main(String[] args){
		
		String numnum = JOptionPane.showInputDialog("how many numbers do you want to add");
		int numbernum = Integer.parseInt(numnum);
		String[] numberstext = new String[numbernum];
		int[] numbers = new int[numbernum] ;
		
		numberstext[0] = JOptionPane.showInputDialog("type the first number");
		numbers[0] = Integer.parseInt(numberstext[0]);
		
		for(int i = 1 ; i < numbernum; i++){
			numberstext[i] = JOptionPane.showInputDialog("type next number");
			numbers[i] = Integer.parseInt(numberstext[i]);
		}
		
		int sum = 0;
		for(int counter = 0; counter < numbers.length; counter++){
			sum+=numbers[counter];
			
		}
		
		JOptionPane.showMessageDialog(null, sum, "the answer is...", JOptionPane.PLAIN_MESSAGE);
		
	}

}
