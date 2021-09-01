package classes;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class appframe extends JFrame {
	private titlebar title;
	private list list;
	private buttonpanel btnpanel;
	
	private JButton addtask;
	private JButton clear;
   //constructor
	appframe()
	{
		this.setSize(400,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		title = new titlebar();
		list=new list();
		btnpanel=new buttonpanel();
		
		this.add(title,BorderLayout.NORTH);
		this.add(btnpanel,BorderLayout.SOUTH);
		this.add(list,BorderLayout.CENTER);
		addtask=btnpanel.getaddtask();
		clear=btnpanel.getclear();
		
		addListners();
	}
	public void addListners()
	{
		addtask.addMouseListener(new MouseAdapter() 
		{
			public void mousePressed(MouseEvent e)
			{
				task tas=new task();
				list.add(tas);
				list.updatenumbers();
				
				tas.getdone().addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e)
					{
						tas.changeState();
						revalidate();
					}
				});
				revalidate();
			}
		});
	}
}
