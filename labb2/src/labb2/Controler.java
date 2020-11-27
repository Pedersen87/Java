package labb2;

import javax.swing.*;


public class Controler{
	private View v;
	private Model m;
	private JOptionPane joptionpane = new JOptionPane();
	private int i;
	Controler(){
		m = new Model();
		v = new View(this);
	}
	
		public void eventIn(String choice) {
			
			if(choice.equals("New")) {
				i = JOptionPane.showConfirmDialog(joptionpane,"Do you want to save?","Warning!",JOptionPane.YES_NO_OPTION);
				if(i==0) {
					m.saveFile(v.write.getText());
					v.write.setText(m.newFile());
				}
				else {
					v.write.setText(m.newFile());
				}
								
			}
			if(choice.equals("Open")) {	
				i = JOptionPane.showConfirmDialog(joptionpane,"Do you want to save?","Warning!",JOptionPane.YES_NO_OPTION);
				if(i==0) {
					m.saveFile(v.write.getText());
					v.write.setText(m.openFile());
				}
				else {
					v.write.setText(m.openFile());								
				}			
			}
			if(choice.equals("Save")) {
				m.saveFile(v.write.getText());				
			}
			if(choice.equals("Save as")) {
				m.saveAsFile(v.write.getText());
			}
			if(choice.equals("Exit")) {
				i = JOptionPane.showConfirmDialog(joptionpane,"Do you want to save?","Warning!",JOptionPane.YES_NO_OPTION);
				if(i==0) {
					m.saveFile(v.write.getText());
					m.exitMethod();	
				}
				else {
					m.exitMethod();					
				}
			}
		}

	public static void main(String[] args) {
		new Controler();
	}

}
