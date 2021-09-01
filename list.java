package classes;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Component;
import javax.swing.JPanel;

public class list extends JPanel{
  private static int length;
list()
  {
	  GridLayout layout = new GridLayout(10,1);
	  layout.setVgap(5);
	  
	  this.setLayout(layout);
	  this.setBackground(Color.BLUE);
	  
  }
  public void updatenumbers()
  {
	  Component[] listitems=this.getComponents();
	  for(int i=0;i<list.length;i++)
	  {
		  if(listitems[i] instanceof task)
		  {
			  ((task)listitems[i]).changeIndex(i+1);
		  }
	  }
	   
  }
}
