package labb2;

import java.io.File;
import java.nio.file.Path;

public class Controler{
	private View v;
	private Model m;
	
	Controler(){
		m = new Model();
		v = new View(this);
	}
		public void eventIn(String choice) {
			
			if(choice.equals("New")) {
					v.write.setText(m.newFile());		
			}
			if(choice.equals("Open")) {	
				Path file = v.chooseOpenFile();
				if(file!=null) {
					v.write.setText(m.openFile(file));						
				}
				
			}
			if(choice.equals("Save")) {
				m.saveFile(v.write.getText());				
			}
			if(choice.equals("Save as")) {
				File file = v.chooseFile();
				if(file != null) {
					m.saveAsFile(v.write.getText(),file);
				}
			}
			if(choice.equals("Exit")) {
					m.saveFile(v.write.getText());
					m.exitMethod();	
			}
		}

	public static void main(String[] args) {
		new Controler();
	}

}
