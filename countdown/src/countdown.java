import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;

public class countdown implements ActionListener{

private JFrame myFrame = new JFrame("Countdown");
private JButton num1 = new JButton("");
private JButton num2 = new JButton("");
private JButton num3 = new JButton("");
private JButton num4 = new JButton("");
private JButton num5 = new JButton("");
private JButton num6 = new JButton("");
private JButton add = new JButton("+");
private JButton minus = new JButton("-");
private JButton times = new JButton("x");
private JButton divide = new JButton("/");
private JButton clear = new JButton("Reset");
private JButton nextGame = new JButton("Next Game");
private JButton equals = new JButton(" = ");
private JTextArea display1 = new JTextArea("");
private JTextArea display2 = new JTextArea("");
private JTextArea error = new JTextArea("");
private int number1;
private int number2;
private int number3;
private int number4;
private int number5;
private int number6;
private String string1;
private String string2;
private String string3;
private String string4;
private String string5;
private String string6;
private String originalString1;
private String originalString2;
private String originalString3;
private String originalString4;
private String originalString5;
private String originalString6;
private boolean num1Clicked = false;
private boolean num2Clicked = false;
private boolean num3Clicked = false;
private boolean num4Clicked = false;
private boolean num5Clicked = false;
private boolean num6Clicked = false;
private String temp = " = ";
private int count = 0;
private boolean proceed = true;
private int termCount = 0;
private int theNum1 = 0;
private int theNum2 = 0;
private int ans;
private int theAns;
private String operatorType = "";

public countdown(){
		myFrame.setSize(600,300);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		
		myFrame.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.ipadx = 50;
		c.ipady = 10;
		c.gridy = 0;
		c.gridwidth = 5;
		myFrame.add(display1,c);
		display1.setEditable(false);
		
		c.gridx = 0;
		c.gridy = 1;
		c.ipadx = 50;
		c.ipady = 10;
		c.gridwidth = 3;
		myFrame.add(display2,c);
		display2.setEditable(false);
		
		c.gridx = 3;
		c.gridy = 1;
		c.ipadx = 50;
		c.ipady = 10;
		c.gridwidth = 2;
		myFrame.add(error,c);
		error.setEditable(false);
		
		c.gridx = 0;
		c.gridy = 2;
		c.ipady = 30;
		c.ipady = 30;
		c.gridwidth = 1;
		myFrame.add(num1,c);
		
		c.gridx = 1;
		c.gridy = 2;
		c.ipady = 30;
		c.ipady = 30;
		c.gridwidth = 1;
		myFrame.add(num2,c);
		
		c.gridx = 2;
		c.gridy = 2;
		c.ipady = 30;
		c.ipady = 30;
		c.gridwidth = 1;
		myFrame.add(num3,c);
		
		c.gridx = 3;
		c.gridy = 2;
		c.ipady = 30;
		c.ipady = 30;
		c.gridwidth = 1;
		myFrame.add(add,c);
		
		c.gridx = 4;
		c.gridy = 2;
		c.ipady = 30;
		c.ipady = 30;
		c.gridwidth = 1;
		myFrame.add(minus,c);
				
		c.gridx = 0;
		c.gridy = 3;
		c.ipady = 30;
		c.ipady = 30;
		c.gridwidth = 1;
		myFrame.add(num4,c);
		
		c.gridx = 1;
		c.gridy = 3;
		c.ipady = 30;
		c.ipady = 30;
		c.gridwidth = 1;
		myFrame.add(num5,c);
		
		c.gridx = 2;
		c.gridy = 3;
		c.ipady = 30;
		c.ipady = 30;
		c.gridwidth = 1;
		myFrame.add(num6,c);
		
		c.gridx = 3;
		c.gridy = 3;
		c.ipady = 30;
		c.ipady = 30;
		c.gridwidth = 1;
		myFrame.add(times,c);
		
		c.gridx = 4;
		c.gridy = 3;
		c.ipady = 30;
		c.ipady = 30;
		c.gridwidth = 1;
		myFrame.add(divide,c);
			
		c.gridx = 4;
		c.gridy = 4;
		c.ipady = 30;
		c.ipady = 30;
		c.gridwidth = 1;
		myFrame.add(clear,c);
		
		c.gridx = 3;
		c.gridy = 4;
		c.ipady = 30;
		c.ipady = 30;
		c.gridwidth = 1;
		myFrame.add(nextGame,c);	
			
		c.gridx = 0;
		c.gridy = 4;
		c.ipady = 30;
		c.ipady = 30;
		c.gridwidth = 3;
		myFrame.add(equals,c);
		
		num1.addActionListener(this);
		num2.addActionListener(this);
		num3.addActionListener(this);
		num4.addActionListener(this);
		num5.addActionListener(this);
		num6.addActionListener(this);
		add.addActionListener(this);
		minus.addActionListener(this);
		times.addActionListener(this);
		divide.addActionListener(this);
		nextGame.addActionListener(this);
		clear.addActionListener(this);
		equals.addActionListener(this);
}

public void actionPerformed(ActionEvent e){

		if(e.getSource() == num1){
			if(num1Clicked != true){
			updateStrings();
			error.setText("");
			checkCount();
			checkTermCount();
			if(proceed != false){
			display2.append(string1);
			num1.setText("-");
			num1Clicked = true;
			if(theNum1 != 0){
			theNum2 = Integer.parseInt(string1);
			}
			else{
			theNum1 = Integer.parseInt(string1);
			}
			count++;
			termCount++;
			}
			else{
			}
			}
			else{
			error.setText("ERROR");
			}
		}
		
		if(e.getSource() == num2){
			if(num2Clicked != true){
			updateStrings();
			error.setText("");
			checkCount();
			checkTermCount();
			if(proceed != false){
			display2.append(string2);
			num2.setText("-");
			num2Clicked = true; 
			if(theNum1 != 0){
			theNum2 = Integer.parseInt(string2);
			}
			else{
			theNum1 = Integer.parseInt(string2);
			}
			count++;
			termCount++;
			}
			else{
			}
			}
			else{
			error.setText("ERROR");
			}
		}
		
		if(e.getSource() == num3){
			if(num3Clicked != true){
			updateStrings();
			error.setText("");
			checkCount();
			checkTermCount();
			if(proceed != false){
			display2.append(string3);
			num3.setText("-");
			num3Clicked = true;
			if(theNum1 != 0){
			theNum2 = Integer.parseInt(string3);
			}
			else{
			theNum1 = Integer.parseInt(string3);
			}
			count++;
			termCount++;
			}
			else{}
			}
			else{
			error.setText("ERROR");
			}
		}
		
		if(e.getSource() == num4){
			if(num4Clicked != true){
			updateStrings();
			error.setText("");
			checkCount();
			checkTermCount();
			if(proceed != false){
			display2.append(string4);
			num4.setText("-");
			num4Clicked = true;
			if(theNum1 != 0){
			theNum2 = Integer.parseInt(string4);
			}
			else{
			theNum1 = Integer.parseInt(string4);
			}
			count++;
			termCount++;
			}
			else{}
			}
			else{
			error.setText("ERROR");
			}
		}
		
		if(e.getSource() == num5){
			if(num5Clicked != true){
			updateStrings();
			error.setText("");
			checkCount();
			checkTermCount();
			if(proceed != false){
			display2.append(string5);
			num5.setText("-");
			num5Clicked = true;
			if(theNum1 != 0){
			theNum2 = Integer.parseInt(string5);
			}
			else{
			theNum1 = Integer.parseInt(string5);
			}
			count++;
			termCount++;
			}
			else{}
			}
			else{
			error.setText("ERROR");
			}
		}
		
		if(e.getSource() == num6){
			if(num6Clicked != true){
			updateStrings();
			error.setText("");
			checkCount();
			checkTermCount();
			if(proceed != false){
			display2.append(string6);
			num6.setText("-");
			num6Clicked = true;
			if(theNum1 != 0){
			theNum2 = Integer.parseInt(string6);
			}
			else{
			theNum1 = Integer.parseInt(string6);
			}
			count++;
			termCount++;
			}
			else{}
			}
			else{
			error.setText("ERROR");
			}
		}
		
		if(e.getSource() == add){
			display2.append(" + ");
			proceed = true;
			count = 0;
			error.setText("");
			operatorType = "add";
		}
		
		if(e.getSource() == minus){
			display2.append(" - ");
			proceed = true;
			count = 0;
			error.setText("");
			operatorType = "minus";
		}
		
		if(e.getSource() == times){
			display2.append(" x ");
			proceed = true;
			count = 0;
			error.setText("");
			operatorType = "times";
		}
		
		if(e.getSource() == divide){
			display2.append(" / ");
			proceed = true;
			count = 0;
			error.setText("");
			operatorType = "divide";
		}

		
		if(e.getSource() == nextGame){
		display2.setText("");
		calcRandNum();
		}
		
		if(e.getSource() == clear){
		display2.setText("");
		num1.setText(originalString1);
		num2.setText(originalString2);
		num3.setText(originalString3);
		num4.setText(originalString4);
		num5.setText(originalString5);
		num6.setText(originalString6);

		string1 = originalString1;
	string2 = originalString2;
	string3 = originalString3;
	string4 = originalString4;
	string5 = originalString5;
	string6 = originalString6;

		
		num1Clicked = false;
		num2Clicked = false;
		num3Clicked = false;
		num4Clicked = false;
		num5Clicked = false;
		num6Clicked = false;
		
		count = 0;
		proceed = true;
		termCount = 0;
		error.setText("");
		theNum1 = 0;
		theNum2 = 0;
		}
		
		if(e.getSource() == equals){
			if(termCount == 2){
				if(operatorType == "add"){
					ans = theNum1 + theNum2;
					error.setText(" = " + ans);
					setButton();
				}
				
				if(operatorType == "minus"){
					ans = theNum1 - theNum2;
					error.setText(" = " + ans);
					setButton();
				}
				
				if(operatorType == "times"){
					ans = theNum1 * theNum2;
					error.setText(" = " + ans);
					setButton();
				}
				
				if(operatorType == "divide"){
					ans = theNum1 /theNum2;
					error.setText(" = " + ans);
					setButton();
				}
				
				else{
				error.setText("No Operator Present");
				}
				
				if(theAns == ans){
					display1.setText("YOU WIN!!!");
					error.setText("");
					display2.setText("");
				}
				
				error.setText(" = " + ans);
				display2.setText("");
				theNum1 = 0;
				theNum2 = 0;
			}
			else{
				error.setText("More terms needed");
			}
		}
		
		updateStrings();
}

public void setButton(){
if(num1.getText() == "-"){
num1.setText(""+ans);
num1Clicked = false;
}
else if(num2.getText() == "-"){
num2.setText(""+ans);
num2Clicked = false;
}
else if(num3.getText() == "-"){
num3.setText(""+ans);
num3Clicked = false;
}
else if(num4.getText() == "-"){
num4.setText(""+ans);
num4Clicked = false;
}
else if(num5.getText() == "-"){
num5.setText(""+ans);
num5Clicked = false;
}
else if(num6.getText() == "-"){
num6.setText(""+ans);
num6Clicked = false;
}
termCount = 0;
count = 0;
}


public void checkCount(){
if(count%2 == 1){
		error.setText("Enter Operator");
		proceed = false;
	}
	else{
	proceed = true;
	}
}

public void calcRandNum(){
Random rand = new Random();

theAns = rand.nextInt(900)+100;
display1.setText(""+theAns);
number1 = rand.nextInt(13)+1;
number2 = rand.nextInt(13)+1;
number3 = rand.nextInt(13)+1;
number4 = rand.nextInt(13)+1;
number5 = rand.nextInt(13)+1;
number6 = rand.nextInt(13)+1;

while(number1 == number2 || number1==number3 || number1==number4 || number1== number5 ||number1== number6 || number2 == number3 || number2 == number4 || number2 == number5 || number2 == number6 || number3 == number4 || number3==number5 || number3==number6 || number4 == number5||number4 ==number6 || number5==number6){
	number2 = rand.nextInt(10)+1;
	number3=rand.nextInt(10)+1;
	number4 = rand.nextInt(10)+1;
	number5=rand.nextInt(10)+1;
	number6=rand.nextInt(10)+1;
}

if(number1 == 11)number1 = 20;
if(number1 == 12)number1 = 50;
if(number1 == 13)number1 = 100;
if(number2 == 11)number2 = 20;
if(number2 == 12)number2 = 50;
if(number2 == 13)number2 = 100;
if(number3 == 11)number3 = 20;
if(number3 == 12)number3 = 50;
if(number3 == 13)number3 = 100;
if(number4 == 11)number4 = 20;
if(number4 == 12)number4 = 50;
if(number4 == 13)number4 = 100;
if(number5 == 11)number5 = 20;
if(number5 == 12)number5 = 50;
if(number5 == 13)number5 = 100;
if(number6 == 11)number6 = 20;
if(number6 == 12)number6 = 50;
if(number6 == 13)number6 = 100;

originalString1 = Integer.toString(number1);
originalString2 = Integer.toString(number2);
originalString3 = Integer.toString(number3);
originalString4 = Integer.toString(number4);
originalString5 = Integer.toString(number5);
originalString6 = Integer.toString(number6);


string1 = originalString1;
string2 = originalString2;
string3 = originalString3;
string4 = originalString4;
string5 = originalString5;
string6 = originalString6;


num1.setText(string1);
num2.setText(string2);
num3.setText(string3);
num4.setText(string4);
num5.setText(string5);
num6.setText(string6);


num1Clicked = false;
num2Clicked = false;
num3Clicked = false;
num4Clicked = false;
num5Clicked = false;
num6Clicked = false;
count = 0;
proceed = true;
error.setText("");
termCount = 0;
	theNum1 = 0;
		theNum2 = 0;
}

public void checkTermCount(){
	if(termCount == 2){
		proceed = false;
		error.setText("Too many terms");
	}
	else{
		proceed = true;
	}
}

public void updateStrings(){
string1 = num1.getText();
string2 = num2.getText();
string3 = num3.getText();
string4 = num4.getText();
string5 = num5.getText();
string6 = num6.getText();
}

public static void main(String []args){
		new countdown();
	}
}
