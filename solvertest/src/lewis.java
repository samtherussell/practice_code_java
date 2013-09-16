
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class lewis implements ActionListener{
	private JFrame myFrame = new JFrame("Calculator");
	private JButton ac = new JButton("AC");
	private JButton squared = new JButton("^2");
	private JButton divide = new JButton("/");
	private JButton times = new JButton("X");
	private JButton one = new JButton("1");
	private JButton two = new JButton("2");
	private JButton three = new JButton("3");
	private JButton plus = new JButton("+");
	private JButton four = new JButton("4");
	private JButton five = new JButton("5");
	private JButton six = new JButton("6");
	private JButton minus = new JButton("-");
	private JButton seven = new JButton("7");
	private JButton eight = new JButton("8");
	private JButton nine = new JButton("9");
	private JButton equals = new JButton("=");
	private JTextArea display = new JTextArea("0");
	private double TEMP = 0;
	private String temp = "";
	
	private boolean win = false;
	
	public lewis(){
	myFrame.setSize(400,400);
	myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	myFrame.setVisible(true);
	myFrame.setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();
	
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 0;
	c.gridy = 0;
	c.gridwidth = 4;
	myFrame.add(display,c);
	
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 0;
	c.gridy = 1;
	c.gridwidth = 1;
	myFrame.add(ac,c);
	
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 1;
	c.gridy = 1;
	c.gridwidth = 1;
	myFrame.add(squared,c);
	
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 2;
	c.gridy = 1;
	c.gridwidth = 1;
	myFrame.add(divide,c);

	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 3;
	c.gridy = 1;
	c.gridwidth = 1;
	myFrame.add(times,c);
	
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 0;
	c.gridy = 2;
	c.gridwidth = 1;
	myFrame.add(one,c);
	
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 1;
	c.gridy = 2;
	c.gridwidth = 1;
	myFrame.add(two,c);
	
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 2;
	c.gridy = 2;
	c.gridwidth = 1;
	myFrame.add(three,c);
	
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 3;
	c.gridy = 2;
	c.gridwidth = 1;
	myFrame.add(plus,c);
	
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 0;
	c.gridy = 3;
	c.gridwidth = 1;
	myFrame.add(four,c);
	
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 1;
	c.gridy = 3;
	c.gridwidth = 1;
	myFrame.add(five,c);
	
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 2;
	c.gridy = 3;
	c.gridwidth = 1;
	myFrame.add(six,c);
	
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 3;
	c.gridy = 3;
	c.gridwidth = 1;
	myFrame.add(minus,c);
	

	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 0;
	c.gridy = 4;
	c.gridwidth = 1;
	myFrame.add(seven,c);
	
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 1;
	c.gridy = 4;
	c.gridwidth = 1;
	myFrame.add(eight,c);
	
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 2;
	c.gridy = 4;
	c.gridwidth = 1;
	myFrame.add(nine,c);
	
	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 3;
	c.gridy = 4;
	c.gridwidth = 1;
	myFrame.add(equals,c);
	
	one.addActionListener(this);
	two.addActionListener(this);
	three.addActionListener(this);
	four.addActionListener(this);
	five.addActionListener(this);
	six.addActionListener(this);
	seven.addActionListener(this);
	eight.addActionListener(this);
	nine.addActionListener(this);
	ac.addActionListener(this);
	plus.addActionListener(this);
	minus.addActionListener(this);
	times.addActionListener(this);
	divide.addActionListener(this);
	squared.addActionListener(this);
	equals.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == one)display.setText("1"); TEMP = 1; temp = "1";
		if(e.getSource() == two)display.setText("2"); TEMP = 2; temp = "2";
		if(e.getSource() == three)display.setText("3"); TEMP = 3; temp = "3";
		if(e.getSource() == four)display.setText("4"); TEMP = 4; temp = "4";
		if(e.getSource() == five)display.setText("5"); TEMP = 5; temp = "5";
		if(e.getSource() == six)display.setText("6"); TEMP = 6; temp = "6";
		if(e.getSource() == seven)display.setText("7"); TEMP = 7; temp = "7";
		if(e.getSource() == eight)display.setText("8"); TEMP = 8; temp = "8";
		if(e.getSource() == nine)display.setText("9"); TEMP = 9; temp = "9";
		if(e.getSource() == times)display.setText("x");
		if(e.getSource() == divide)display.setText("/");
		if(e.getSource() == plus)display.setText("+");
		if(e.getSource() == minus)display.setText("-");
		if(e.getSource() == ac)display.setText("");
		if(e.getSource() == equals)display.setText(temp);
		
	}

	public static void main(String []args){
		new lewis();
	}
}