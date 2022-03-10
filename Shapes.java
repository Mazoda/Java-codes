
//هدي مازن أبو مطلق
//20192015

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/////////////////////////////////////////////////////////////////////////////////
class Shapes extends JFrame implements ActionListener{
	  
	JComboBox comboBox;
	public Shapes(){
        
        setLayout(new FlowLayout());
		add(new JLabel("Choose the Shape"));
		
		String [] shapes ={"None", "Shape 1", "Shape 2" ,"Shape 3"};
		comboBox = new JComboBox (shapes);
		comboBox.addActionListener(this);
		add(comboBox);
		setSize(500,500);
		setVisible(true);
	}
	
	void drawShape1(Graphics gr){
		Color brown = new Color(147,61,15);
		gr.setColor(brown);
		gr.drawRect(220, 240, 20, 100);
		gr.fillRect(220, 240, 20, 100);
		gr.setColor(Color.green);
		gr.drawOval(200,100,60,150);
		gr.fillOval(200,100,60,150);
		
	}	
	
	void drawShape2(Graphics gr){
		gr.setColor(Color.red);
		gr.drawOval(120, 245, 10, 10);
		gr.drawOval(245, 245, 10, 10);
		gr.drawOval(375, 245, 10, 10);
		gr.drawOval(195, 120, 10, 10);
		gr.drawOval(295, 120, 10, 10);
		gr.drawOval(195, 370, 10, 10);
		gr.drawOval(295,  370, 10, 10);
		
		int x[]={200,300,380,300,200,125};
		int y[]={125,125,250,375,375,250};

		gr.setColor(Color.blue);
		gr.drawPolygon(x, y, 6);
		gr.setColor(Color.pink);
		gr.drawLine(200, 125, 300, 375);
		gr.drawLine(125, 250, 375, 250);
		gr.drawLine(300, 125, 200, 375);
		gr.setColor(Color.red);	
		gr.fillOval(120, 245, 10, 10);
		gr.fillOval(245, 245, 10, 10);
		gr.fillOval(375, 245, 10, 10);
		gr.fillOval(195, 120, 10, 10);
		gr.fillOval(295, 120, 10, 10);
		gr.fillOval(195, 370, 10, 10);
		gr.fillOval(295,  370, 10, 10);
	}
	
	void drawShape3(Graphics gr){
		gr.setColor(Color.BLUE);
		gr.drawRect(50, 50, 400, 300);
		gr.setColor(Color.red);
		int x =250,y=150,w=50,h=100;
		for(int i=0;i<5;i++){
		gr.drawOval(x, y, w, h);
		gr.drawOval(x-w, y, w, h);
		y=y-25;
		w=w+37;
		h=h+50;
				}
		
		

	}

	public void paint(Graphics g){
		super.paint(g);	 
		if (comboBox.getSelectedIndex() ==1)
		 	drawShape1(g);
		else if (comboBox.getSelectedIndex()==2)
			drawShape2(g);
		else if (comboBox.getSelectedIndex()==3)
			drawShape3(g);
	}
	public void actionPerformed(ActionEvent event){
		repaint();
	} 
	public static void main(String args[]){
		new Shapes();
		
	}
}