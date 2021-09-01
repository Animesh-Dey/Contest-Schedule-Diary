package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class task extends JPanel{
	private JLabel index;
	private JTextField taskname;
	private JButton done;
	
	private boolean checked;
	
	
  //constructor
	task()
	{
		this.setPreferredSize(new Dimension(40,20));
		this.setBackground(Color.red);
		
		this.setLayout(new BorderLayout());
		
		checked=false;
		index=new JLabel("");
		index.setPreferredSize(new Dimension(20,20));
		index.setHorizontalAlignment(JLabel.CENTER);
		this.add(index,BorderLayout.WEST);
		
		taskname=new JTextField("Your TASK HERE");
		taskname.setBorder(BorderFactory.createEmptyBorder());
		
		this.add(taskname,BorderLayout.CENTER);
		
		done=new JButton("done");
		done.setPreferredSize(new Dimension(40,20));
		done.setBorder(BorderFactory.createEmptyBorder());
		
		this.add(done,BorderLayout.EAST);
		
	}
	public JButton getdone()
	{
		return done;
	}
	public void changeIndex(int num)
	{
		this.index.setText(num+"");
		this.revalidate();
	}
	public void changeState()
	{
		this.setBackground(Color.green);
		taskname.setBackground(Color.green);
		checked=true;
	}
}
