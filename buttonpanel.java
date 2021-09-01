package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class buttonpanel extends JPanel {
  private JButton addtask;
  private JButton clear;
  
  Border emptyborder = BorderFactory.createEmptyBorder();
  
  
  //constructor
  buttonpanel()
  {
	  this.setPreferredSize(new Dimension(400,60));
	  //this.setBackground(Color.red);
	  
	  addtask =new JButton("ADD TASK");
	  addtask.setBorder(emptyborder);
	  addtask.setFont(new Font("Sans-serif",Font.PLAIN,20));
	  
	  this.add(addtask);
	  
	  this.add(Box.createHorizontalStrut(20));
	  
	  
  }
  
  public JButton getaddtask()
  {
	  return addtask;
  }
  public JButton getclear()
  {
	return clear;
	  
  }
  
}
