package com.AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Myframe extends Frame implements ActionListener {

	
	Label msg1,msg2;
	Label lbluser,lblpass;
	TextField txtuser,txtpass;
	Button login,close;
	
	Panel p;
	
	Label user,password;
	
	public Myframe(String title) throws HeadlessException {
		
		super(title);
	
		setBackground(Color.YELLOW);
		setForeground(Color.BLUE);
		
		p=new Panel();	
		//p.setLayout(new GridLayout(2,2));
		
		msg1=new Label("Welcome To Java AWT");
		msg2=new Label("Label Control"); 
		
		lbluser=new Label("Enter Your Name:");
		lbluser.setBounds(10, 10, 100, 20);
		
		txtuser=new TextField(20);
		txtuser.setBounds(120, 20, 100, 20);
		
		lblpass=new Label("Enter The Password:");
		txtpass=new TextField(20);
		txtpass.setEchoChar('*');
		
		login=new Button("Login");
		login.setBounds(10,200,50,20);
		
		close=new Button("Close");
		close.setBounds(70, 200, 50, 20);
		
		user=new Label("Username:");
		password=new Label("Password:");
		
		p.add(msg1);
		p.add(msg2);
		
		p.add(lbluser);
		p.add(txtuser);
		p.add(lblpass);
		p.add(txtpass);
		p.add(login);
		p.add(close);
		p.add(user);
		p.add(password);
		
		add(p);
		
		login.addActionListener(this);
		close.addActionListener(this);
		
	}

	public static void main(String[] args) {
		

		Myframe obj=new Myframe("My Frame Window");//constructor calling
		
		obj.setSize(300,300);
		obj.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s=e.getActionCommand();
		
		if(s.equals("Login")) {
			
			user.setText("Username:"+txtuser.getText());
			password.setText("Password:"+txtpass.getText());
		}
		if(s.equals("Close")) {
			
			System.exit(0);
		}
		
	}

}
