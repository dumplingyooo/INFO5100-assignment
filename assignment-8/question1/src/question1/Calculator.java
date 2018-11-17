package question1;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

enum Operation {
	ADD, SUBTRACT, MULTIPLY, DIVIDE, COMPUTE
}

public class Calculator extends JFrame {

	private JTextField resultTextField;
	private JButton add, subtract, multiply, divide, compute;

	private JButton nub1, nub2, nub3, nub4, nub5, nub6, nub7, nub8, nub9, nub0;
	private Font font;

	static double first = 0, second = 0, result = 0;

	Operation o = Operation.COMPUTE;
	
	
	public Calculator() {
		createComponents();
		setLayout();
		addComponents();
		addBehaviors();
		display();
	}

	private void addBehaviors() {

		OperationListener ol = new OperationListener();
		nub1.addActionListener(ol);
		nub2.addActionListener(ol);
		nub3.addActionListener(ol);
		nub4.addActionListener(ol);
		nub5.addActionListener(ol);
		nub6.addActionListener(ol);
		nub7.addActionListener(ol);
		nub8.addActionListener(ol);
		nub9.addActionListener(ol);
		nub0.addActionListener(ol);
		add.addActionListener(ol);
		subtract.addActionListener(ol);
		multiply.addActionListener(ol);
		divide.addActionListener(ol);
		compute.addActionListener(ol);

	}

	private void display() {
		setSize(600, 600);
		setVisible(true);

	}

	private void addComponents() {
		Container c = getContentPane();
		c.add(resultTextField);

		JPanel panel = new JPanel();
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
		c.add(panel);

		panel = new JPanel();
		panel.add(compute);
		c.add(panel);

		JPanel p = new JPanel();
		p.add(nub1);
		p.add(nub2);
		p.add(nub3);
		p.add(nub4);

		c.add(p);

		p = new JPanel();
		p.add(nub5);
		p.add(nub6);
		p.add(nub7);
		p.add(nub8);

		c.add(p);

		p = new JPanel();
		p.add(nub9);
		p.add(nub0);

		c.add(p);

	}

	private void setLayout() {
		GridLayout gl = new GridLayout(6, 1);
		Container c = this.getContentPane();
		c.setLayout(gl);

	}

	private void createComponents() {
		font = new Font("TimesRoman", Font.PLAIN, 36);
		resultTextField = new JTextField(10);
		resultTextField.setFont(font);

		add = new JButton("+");
		add.setFont(font);
		subtract = new JButton("-");
		subtract.setFont(font);
		multiply = new JButton("x");
		multiply.setFont(font);
		divide = new JButton("%");
		divide.setFont(font);
		compute = new JButton("=");
		compute.setFont(font);
		nub1 = new JButton("1");
		nub1.setFont(font);
		nub2 = new JButton("2");
		nub2.setFont(font);
		nub3 = new JButton("3");
		nub3.setFont(font);
		nub4 = new JButton("4");
		nub4.setFont(font);
		nub5 = new JButton("5");
		nub5.setFont(font);
		nub6 = new JButton("6");
		nub6.setFont(font);
		nub7 = new JButton("7");
		nub7.setFont(font);
		nub8 = new JButton("8");
		nub8.setFont(font);
		nub9 = new JButton("9");
		nub9.setFont(font);
		nub0 = new JButton("0");
		nub0.setFont(font);
		}

	class OperationListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == nub1) {
				resultTextField.setText(resultTextField.getText().concat("1"));
			}
			if (e.getSource() == nub2) {
				resultTextField.setText(resultTextField.getText().concat("2"));
			}
			if (e.getSource() == nub3) {
				resultTextField.setText(resultTextField.getText().concat("3"));
			}
			if (e.getSource() == nub4) {
				resultTextField.setText(resultTextField.getText().concat("4"));
			}
			if (e.getSource() == nub5) {
				resultTextField.setText(resultTextField.getText().concat("5"));
			}
			if (e.getSource() == nub6) {
				resultTextField.setText(resultTextField.getText().concat("6"));
			}
			if (e.getSource() == nub7) {
				resultTextField.setText(resultTextField.getText().concat("7"));
			}
			if (e.getSource() == nub8) {
				resultTextField.setText(resultTextField.getText().concat("8"));
			}
			if (e.getSource() == nub9) {
				resultTextField.setText(resultTextField.getText().concat("9"));
			}
			if (e.getSource() == nub0) {
				resultTextField.setText(resultTextField.getText().concat("0"));
			}
			if (e.getSource() == add) {
				first = Double.parseDouble(resultTextField.getText());
				o = Operation.ADD;
				resultTextField.setText("");
			}
			if (e.getSource() == subtract) {
				first = Double.parseDouble(resultTextField.getText());
				o = Operation.SUBTRACT;
				resultTextField.setText("");
			}
			if (e.getSource() == multiply) {
				first = Double.parseDouble(resultTextField.getText());
				o = Operation.MULTIPLY;
				resultTextField.setText("");
			}
			if (e.getSource() == divide) {
				first = Double.parseDouble(resultTextField.getText());
				o = Operation.DIVIDE;
				resultTextField.setText("");
			}
			if (e.getSource() == compute) {
				second = Double.parseDouble(resultTextField.getText());
				
				if (o == Operation.ADD) {
					result = first + second;
				}
				if (o == Operation.SUBTRACT) {
					result = first - second;
				}
				if (o == Operation.DIVIDE) {
					result = first / second;
				}
				if (o == Operation.MULTIPLY) {
					result = first * second;
				}
				
				resultTextField.setText(result + "");
			}

		}

	}


	public static void main(String[] args) {
		new Calculator();

	}

}
