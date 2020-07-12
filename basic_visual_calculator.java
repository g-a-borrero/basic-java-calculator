/*
This calculator only handles basic operations. It cannot solve
multi-operand queries. Addition, subtraction, multiplication,
and division. That's it.
*/

import java.awt.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Calculator{
	String calculation = "";

	public static double solve(String maths){
		String pattern = "(\\d+)([\\*\\-\\+\\/])(\\d+)";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(maths);
		m.find();
		
		double[] Nums = new double[]{ Double.parseDouble(m.group(1)), Double.parseDouble(m.group(3)) };
		double result;

		switch (m.group(2)){
			case "*":
				result = Nums[0]*Nums[1];
				break;
			case "-":
				result = Nums[0]-Nums[1];
				break;
			case "+":
				result = Nums[0]+Nums[1];
				break;
			case "/":
				result = Nums[0]/Nums[1];
				break;
			default:
				result = -999;
		};
		return result;
	}

	Calculator(){
		Frame f = new Frame();

		TextField input = new TextField();
		input.setBounds(25,50,100,25);
		f.add(input);

		TextField output = new TextField();
		output.setBounds(50,175,75,25);
		f.add(output);

		Button one = new Button("1");
		one.setBounds(25,75,25,25);
		one.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculation += one.getLabel();
				input.setText(calculation);
			}	
		});
		f.add(one);
		
		Button two = new Button("2");
		two.setBounds(50,75,25,25);
		two.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculation += two.getLabel();
				input.setText(calculation);
			}	
		});
		f.add(two);
		
		Button three = new Button("3");
		three.setBounds(75,75,25,25);
		three.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculation += three.getLabel();
				input.setText(calculation);
			}	
		});
		f.add(three);

		Button four = new Button("4");
		four.setBounds(25,100,25,25);
		four.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculation += four.getLabel();
				input.setText(calculation);
			}	
		});
		f.add(four);

		Button five = new Button("5");
		five.setBounds(50,100,25,25);
		five.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculation += five.getLabel();
				input.setText(calculation);
			}	
		});
		f.add(five);

		Button six = new Button("6");
		six.setBounds(75,100,25,25);
		six.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculation += six.getLabel();
				input.setText(calculation);
			}	
		});
		f.add(six);

		Button seven = new Button("7");
		seven.setBounds(25,125,25,25);
		seven.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculation += seven.getLabel();
				input.setText(calculation);
			}	
		});
		f.add(seven);

		Button eight = new Button("8");
		eight.setBounds(50,125,25,25);
		eight.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculation += eight.getLabel();
				input.setText(calculation);
			}	
		});
		f.add(eight);

		Button nine = new Button("9");
		nine.setBounds(75,125,25,25);
		nine.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculation += nine.getLabel();
				input.setText(calculation);
			}	
		});
		f.add(nine);

		Button zero = new Button("0");
		zero.setBounds(25,150,75,25);
		zero.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculation += zero.getLabel();
				input.setText(calculation);
			}	
		});
		f.add(zero);

		Button addition = new Button("+");
		addition.setBounds(100,75,25,25);
		addition.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculation += addition.getLabel();
				input.setText(calculation);
			}	
		});
		f.add(addition);

		Button subtraction = new Button("-");
		subtraction.setBounds(100,100,25,25);
		subtraction.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculation += subtraction.getLabel();
				input.setText(calculation);
			}	
		});
		f.add(subtraction);

		Button multiplication = new Button("*");
		multiplication.setBounds(100,125,25,25);
		multiplication.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculation += multiplication.getLabel();
				input.setText(calculation);
			}	
		});
		f.add(multiplication);

		Button division = new Button("/");
		division.setBounds(100,150,25,25);
		division.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculation += division.getLabel();
				input.setText(calculation);
			}	
		});
		f.add(division);

		Button equals = new Button("=");
		equals.setBounds(25,175,25,25);
		equals.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				calculation += equals.getLabel();
				input.setText(calculation);
				double solution = Calculator.solve(calculation);
				output.setText(String.valueOf(solution));
				calculation = "";
			}	
		});
		f.add(equals);

		f.setSize(150,225);
		f.setLayout(null);
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter(){
    		public void windowClosing(WindowEvent e) {
    			f.dispose();
    		}
  		});
	}

	public static void main(String[] args){
		Calculator c = new Calculator();
		
	}
}