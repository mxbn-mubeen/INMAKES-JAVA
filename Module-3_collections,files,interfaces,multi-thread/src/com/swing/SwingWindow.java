package com.swing;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingWindow extends JFrame implements ActionListener{

	JLabel lblname,address,phoneno,gender,payment;
	JTextField txtname,txtphoneno;
	JTextArea txtAddress;
	JRadioButton male,female;
	JCheckBox creditcard,debitcard,upi;
	JButton register,close;
	ButtonGroup gendergroup;
	
	public SwingWindow(String title) throws HeadlessException {
		
		super(title);
		
		setLayout(null);
		lblname= new JLabel("yourname");
		lblname.setBounds(10,10,100,20);
		
		txtname=new JTextField(20);
		txtname.setBounds(120, 10, 100, 20);
		
		address=new JLabel("Address:");
		address.setBounds(10, 40, 100, 20);
		
		txtAddress=new JTextArea(5,30);
		txtAddress.setBounds(120, 40, 100, 40);
		
		gender=new JLabel("Gender:");
		gender.setBounds(10,80,100,20);
		
		gendergroup=new ButtonGroup();
		male=new JRadioButton("male");
		female=new JRadioButton("female");
		
		male.setBounds(120,80,80,20);
		female.setBounds(200,80,80,20);
		
		gendergroup.add(male);
		gendergroup.add(female);
		
		male.setSelected(true);
		
		phoneno=new JLabel("Phone No:");
		txtphoneno=new JTextField(20);
		
		phoneno.setBounds(10,100,100,20);
		txtphoneno.setBounds(120,100,100,20);
		
		payment=new JLabel("Payment Options:");
		payment.setBounds(10,120,100,20);
		
		creditcard=new JCheckBox("Credit Card");
		debitcard=new JCheckBox("Debit Card");
		upi=new JCheckBox("Upi Payment");
		
		creditcard.setBounds(120,120,100,20);
		debitcard.setBounds(240,120,100,20);
		upi.setBounds(350,120,100,20);
		
		register=new JButton("Register");
		register.setBounds(10,140,100,20);
		
		close=new JButton("Close");
		close.setBounds(160,140,100,20);
		
		
		
		add(lblname);
		add(txtname);
		add(address);
		add(txtAddress);
		add(gender);
		add(male);
		add(female);
		add(phoneno);
		add(txtphoneno);
		add(payment);
		add(creditcard);
		add(debitcard);
		add(upi);
		add(register);
		add(close);
		
		register.addActionListener(this);
		close.addActionListener(this);
				
	}

	public static void main(String[] args) {
		SwingWindow obj=new SwingWindow("EXAMPLE OF SWING WINDOW");
		obj.setSize(500,350);
		obj.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {


		String cmd=e.getActionCommand();
		
		if(cmd.equals("Register")) {
			
			System.out.println("Name="+txtname.getText());
			System.out.println("Address="+txtAddress.getText());
			
			if(male.isSelected())
				System.out.println("male="+male.getText());
			else
				System.out.println("female="+female.getText());
			
			System.out.println("Phone Nunmber="+txtphoneno.getText());
			
			if(creditcard.isSelected()) {
				System.out.println("Banking Options="+creditcard.getText());
			}
			if(creditcard.isSelected()) {
				System.out.println("Banking Options="+debitcard.getText());
			}
			if(upi.isSelected()) {
				System.out.println("Banking Options="+upi.getText());
			}
		}	
		
		if(cmd.equals("Close")) {
				
				System.exit(0);
			}
		}
}
