import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


public class calculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField outPutScreen;
	boolean shouldClear = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatorGUI frame = new calculatorGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calculatorGUI() {
		
		String expressionToEvaluate = "";
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		outPutScreen = new JTextField();
		outPutScreen.setBackground(Color.WHITE);
		outPutScreen.setForeground(Color.BLACK);
		outPutScreen.setEditable(false);
		outPutScreen.setBounds(40, 37, 359, 70);
		contentPane.add(outPutScreen);
		outPutScreen.setColumns(10);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(shouldClear == true){
					outPutScreen.setText("");
					shouldClear = false;
				}//end if
				String currentStringOfNumber = outPutScreen.getText();
				outPutScreen.setText(currentStringOfNumber + "1");
			}
		});
		button.setBounds(40, 131, 64, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(shouldClear == true){
					outPutScreen.setText("");
					shouldClear = false;
				}//end if
				String currentStringOfNumber = outPutScreen.getText();
				outPutScreen.setText(currentStringOfNumber + "2");
			}
		});
		button_1.setBounds(138, 131, 64, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(shouldClear == true){
					outPutScreen.setText("");
					shouldClear = false;
				}//end if
				String currentStringOfNumber = outPutScreen.getText();
				outPutScreen.setText(currentStringOfNumber + "3");
			}
		});
		button_2.setBounds(235, 131, 64, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(shouldClear == true){
					outPutScreen.setText("");
					shouldClear = false;
				}//end if
				String currentStringOfNumber = outPutScreen.getText();
				outPutScreen.setText(currentStringOfNumber + "4");
			}
		});
		button_3.setBounds(40, 165, 64, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("0");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(shouldClear == true){
					outPutScreen.setText("");
					shouldClear = false;
				}//end if
				String currentStringOfNumber = outPutScreen.getText();
				outPutScreen.setText(currentStringOfNumber + "0");
			}
		});
		button_4.setBounds(138, 233, 64, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(shouldClear == true){
					outPutScreen.setText("");
					shouldClear = false;
				}//end if
				String currentStringOfNumber = outPutScreen.getText();
				outPutScreen.setText(currentStringOfNumber + "5");
			}
		});
		button_5.setBounds(138, 165, 64, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(shouldClear == true){
					outPutScreen.setText("");
					shouldClear = false;
				}//end if
				String currentStringOfNumber = outPutScreen.getText();
				outPutScreen.setText(currentStringOfNumber + "6");
			}
		});
		button_6.setBounds(235, 165, 64, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(shouldClear == true){
					outPutScreen.setText("");
					shouldClear = false;
				}//end if
				String currentStringOfNumber = outPutScreen.getText();
				outPutScreen.setText(currentStringOfNumber + "7");
			}
		});
		button_7.setBounds(40, 199, 64, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(shouldClear == true){
					outPutScreen.setText("");
					shouldClear = false;
				}//end if
				String currentStringOfNumber = outPutScreen.getText();
				outPutScreen.setText(currentStringOfNumber + "8");
			}
		});
		button_8.setBounds(138, 199, 64, 23);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(shouldClear == true){
					outPutScreen.setText("");
					shouldClear = false;
				}//end if
				String currentStringOfNumber = outPutScreen.getText();
				outPutScreen.setText(currentStringOfNumber + "9");
			}
		});
		button_9.setBounds(235, 199, 64, 23);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("+");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(shouldClear == true){
					outPutScreen.setText("");
					shouldClear = false;
				}//end if
				String currentStringOfNumber = outPutScreen.getText();
				outPutScreen.setText(currentStringOfNumber + " + ");
			}
		});
		button_10.setBounds(335, 131, 64, 23);
		contentPane.add(button_10);
		
		JButton btnsubtract = new JButton("-");
		btnsubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(shouldClear == true){
					outPutScreen.setText("");
					shouldClear = false;
				}//end if
				String currentStringOfNumber = outPutScreen.getText();
				outPutScreen.setText(currentStringOfNumber + " - ");
			}
		});
		btnsubtract.setBounds(335, 165, 64, 23);
		contentPane.add(btnsubtract);
		
		JButton button_12 = new JButton("*");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(shouldClear == true){
					outPutScreen.setText("");
					shouldClear = false;
				}//end if
				String currentStringOfNumber = outPutScreen.getText();
				outPutScreen.setText(currentStringOfNumber + " * ");
			}
		});
		button_12.setBounds(335, 233, 64, 23);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("^");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(shouldClear == true){
					outPutScreen.setText("");
					shouldClear = false;
				}//end if
				String currentStringOfNumber = outPutScreen.getText();
				outPutScreen.setText(currentStringOfNumber + " ^ ");
			}
		});
		button_13.setBounds(335, 267, 64, 23);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(shouldClear == true){
					outPutScreen.setText("");
					shouldClear = false;
				}//end if
				String currentStringOfNumber = outPutScreen.getText();
				outPutScreen.setText(currentStringOfNumber + " / ");
			}
		});
		button_14.setBounds(335, 199, 64, 23);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("(");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(shouldClear == true){
					outPutScreen.setText("");
					shouldClear = false;
				}//end if
				String currentStringOfNumber = outPutScreen.getText();
				outPutScreen.setText(currentStringOfNumber + "( ");
			}
		});
		button_15.setBounds(40, 233, 64, 23);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton(")");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(shouldClear == true){
					outPutScreen.setText("");
					shouldClear = false;
				}//end if
				String currentStringOfNumber = outPutScreen.getText();
				outPutScreen.setText(currentStringOfNumber + " )");
			}
		});
		button_16.setBounds(235, 233, 64, 23);
		contentPane.add(button_16);
		
		//Here is the equal button
		JButton button_11 = new JButton("=");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(shouldClear == true){
					
				}//end if
				else{
					shouldClear = true;
					String originalNumberString = outPutScreen.getText();
					ArrayList<String> array = CheckExpression.CheckExp(outPutScreen.getText());
					//System.out.println(array);
					String mathString = CheckExpression.doMath(array);
				
					if(mathString == null){
						outPutScreen.setText(originalNumberString + " is Not a valid expression");
					}else if(mathString.equals("NaN")){
						outPutScreen.setText(originalNumberString + " does not make sense mathematically.");
					}else{
						outPutScreen.setText(originalNumberString + " = " + mathString);
					}
				}
				//outPutScreen.setText(CheckExpression.doMath(array));
				
			}
		});
		button_11.setBounds(40, 301, 259, 23);
		contentPane.add(button_11);
		
		JButton btnClear = new JButton("clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				outPutScreen.setText("");
			}
		});
		btnClear.setBounds(335, 301, 64, 23);
		contentPane.add(btnClear);
		
		JButton btnnegative = new JButton("- (negative)");
		btnnegative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(shouldClear == true){
					outPutScreen.setText("");
					shouldClear = false;
				}//end if
				String currentStringOfNumber = outPutScreen.getText();
				outPutScreen.setText(currentStringOfNumber + "-");
			}
		});
		btnnegative.setBounds(138, 267, 161, 23);
		contentPane.add(btnnegative);
	}
}