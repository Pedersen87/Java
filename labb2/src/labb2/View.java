package labb2;

import java.awt.event.*;

import javax.swing.*;

public class View extends WindowAdapter implements ActionListener {
	private Controler c;
	JTextArea write;
	JFrame jFrame;
	JMenuBar jMenuBar;
	View(Controler ct){
		c = ct;
		jFrame = new JFrame("Nytt dokument"); 
		write = new JTextArea();
		jMenuBar = new JMenuBar();
		jFrame.addWindowListener(this);
			JMenu menu = new JMenu("File"); 
		        JMenuItem newItem = new JMenuItem("New"); 
		        JMenuItem openItem = new JMenuItem("Open"); 
		        JMenuItem saveItem = new JMenuItem("Save"); 
		        JMenuItem saveAsItem = new JMenuItem("Save as");
		        JMenuItem exitItem = new JMenuItem("Exit");	     
		        newItem.addActionListener(this);
		        openItem.addActionListener(this);
		        saveItem.addActionListener(this);
		        saveAsItem.addActionListener(this);
		        exitItem.addActionListener(this);
				menu.add(newItem);
				menu.add(openItem);
				menu.add(saveItem);
				menu.add(saveAsItem);
				menu.add(exitItem);
		jMenuBar.add(menu);		
        jFrame.add(write); 
        jFrame.setJMenuBar(jMenuBar);
        jFrame.setSize(500, 500); 
        jFrame.show(); 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String choice = e.getActionCommand();
		c.eventIn(choice);
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
