package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class titlebar extends JPanel{
  
	   //constructor
	  titlebar()
	  {
		  this.setPreferredSize(new Dimension(400,80));
		  //this.setBackground(Color.red);
		  
		  JLabel titletext = new JLabel("TO DO LIST");
		  titletext.setPreferredSize(new Dimension(200,80));
		  titletext.setFont(new Font("Sans-serif",Font.BOLD,20));
		  titletext.setHorizontalAlignment(JLabel.CENTER);
		  
		  this.add(titletext);
		  
		  
	  }
	
}
 