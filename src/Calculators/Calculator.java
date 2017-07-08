

package Calculators;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.SystemColor;

public class Calculator {
	
	

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		//This sets the look and feel of GUI widgets. I need it to use this code, because I'm on macOS
		 try {
			    UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
			 } catch (Exception e) {
			            e.printStackTrace();
			 }
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 238, 352);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().setBackground(new Color(230, 230, 250));

		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 240));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(6, 6, 226, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//ROW 0
		JButton btnBackSpace = new JButton("");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.BOLD, 15));
		btnBackSpace.setBounds(10, 57, 50, 50);
		frame.getContentPane().add(btnBackSpace);
		
		
		btnBackSpace.setBackground(new Color(240, 255, 240));
		
		
		/*
		 * I need this code to make JButton background visible when I don't have the look and feel set
		 * 
		 *btnBackSpace.setOpaque(true);
		 *btnBackSpace.setBorderPainted(true);
		 */
		
		JButton btnC = new JButton("AC");
		btnC.setBackground(new Color(240, 255, 240));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnC.setBounds(66, 57, 50, 50);
		frame.getContentPane().add(btnC);
	

		
		JButton btnPlus = new JButton ("+");
		btnPlus.setBackground(new Color(240, 255, 240));
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(178, 57, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		
		//ROW 1
		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(255, 239, 213));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() + btn7.getText();
			textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 112, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(255, 239, 213));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() + btn8.getText();
			textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(66, 112, 50, 50);
		frame.getContentPane().add(btn8);
		
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(255, 239, 213));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() + btn9.getText();
			textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(122, 112, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnMinus = new JButton ("-");
		btnMinus.setBackground(new Color(240, 255, 240));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMinus.setBounds(178, 112, 50, 50);
		frame.getContentPane().add(btnMinus);
		
		//ROW 2
		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(255, 239, 213));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() + btn4.getText();
			textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 166, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(new Color(255, 239, 213));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() + btn5.getText();
			textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(66, 166, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(255, 239, 213));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() + btn6.getText();
			textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(122, 166, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnMult = new JButton ("×");
		btnMult.setBackground(new Color(240, 255, 240));
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMult.setBounds(178, 166, 50, 50);
		frame.getContentPane().add(btnMult);
		
		//ROW 3
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(255, 239, 213));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() + btn1.getText();
			textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 220, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(255, 239, 213));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() + btn2.getText();
			textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(66, 220, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(255, 239, 213));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() + btn3.getText();
			textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(122, 220, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnDevide = new JButton ("÷");
		btnDevide.setBackground(new Color(240, 255, 240));
		btnDevide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDevide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDevide.setBounds(178, 220, 50, 50);
		frame.getContentPane().add(btnDevide);
		
		//ROW 4
		JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(255, 239, 213));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() + btn0.getText();
			textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(66, 274, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setBackground(new Color(255, 239, 213));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String EnterNumber = textField.getText() + btnDot.getText();
			textField.setText(EnterNumber);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(10, 274, 50, 50);
		frame.getContentPane().add(btnDot);
		
		JButton btnPM = new JButton("±");
		btnPM.setBackground(new Color(240, 255, 240));
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double ops = Double.parseDouble(String.valueOf(textField.getText()));
			ops = ops * (-1);
			textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnPM.setBounds(122, 57, 50, 50);
		frame.getContentPane().add(btnPM);
		
		JButton btnEqual = new JButton ("=");
		btnEqual.setBackground(new Color(216, 191, 216));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				secondnum = Double.parseDouble(textField.getText());
				if (operations == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				} else if (operations == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				} else if (operations == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				} else if (operations == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				} 
		}});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(122, 274, 106, 50);
		frame.getContentPane().add(btnEqual);
	}
}

/*try {
// Set cross-platform Java L&F (also called "Metal")
UIManager.setLookAndFeel(
UIManager.getCrossPlatformLookAndFeelClassName());
} 
catch (UnsupportedLookAndFeelException e) {
// handle exception
}
catch (ClassNotFoundException e) {
// handle exception
}
catch (InstantiationException e) {
// handle exception
}
catch (IllegalAccessException e) {
// handle exception
}

new SwingApplication(); //Create and show the GUI.*/


