package com.applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/*
 * <applet code="helloworld.class" width="500" height="500>
 */
public class Helloworld  extends Applet{

	public void paint(Graphics g) {
		
	
		setForeground(Color.GREEN);
		g.drawString("helloworld", 50, 40);
		
		
		//g.drawline(x1,y1,x2,y2)//x1y1- starting position,x2y2-endingposition
		g.drawLine(100, 130, 135, 148);
		
		//g.drawarc(LEFT,TOP,WIDTH,HEIHT,STARTING_ANGLE,END_ANGLE);
		g.drawArc(120, 152, 150, 150, 0,180);
		
		g.fillArc(150, 160, 138,140, 0, 45);
		
		//g.drawRect(LEFT, TOP, WIDTH, HEIGHT);
		g.drawRect(180, 100, 45, 52);
		
		g.fillRect(200, 150, 68, 90);
	}
}
