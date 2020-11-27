package labb2;

import java.util.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Model implements EventListener {
	private String erase = "";
	private String readtext = "";
	private File file;
	private String path = "";
	private JFileChooser jfc = new JFileChooser();
	
	public void exitMethod() {
		System.exit(0);
	}
	 
	public String newFile() { 
		if(!path.isEmpty()) {
			path = "";
			file = null;
			return erase;			
		}
		else {
			return erase;
		}
	}
	
	public void saveFile(String s) {
		File file = new File(path);
		if(file.exists()){
			if(path.contains(".txt")){
				try { 
					FileWriter fw = new FileWriter(file,false); 
					BufferedWriter bw = new BufferedWriter(fw); 
					bw.write(s); 
					bw.flush(); 
					bw.close();
				} 
				catch (Exception e) { 
					JOptionPane.showMessageDialog(null, e); 
				} 
			}
			else {
				try { 
					FileWriter fw = new FileWriter(file+".txt",false); 
					BufferedWriter bw = new BufferedWriter(fw); 
					bw.write(s); 
					bw.flush(); 
					bw.close();
				} 
				catch (Exception e) { 
					JOptionPane.showMessageDialog(null, e); 
				} 
			}
		}
		else {
			saveAsFile(s);		
		}
	}
	
	public void saveAsFile(String s) {
		int i = jfc.showSaveDialog(null);	
		if(i == JFileChooser.APPROVE_OPTION) {
			file = new File(jfc.getSelectedFile().getAbsolutePath()); 
			path = file.toString();     
            if(path.contains(".txt")) {
                try { 
                    FileWriter fw = new FileWriter(file, false);  
                    BufferedWriter bw = new BufferedWriter(fw); 
                    bw.write(s); 
                    bw.flush(); 
                    bw.close(); 
                } 
                catch (Exception e) { 
                    JOptionPane.showMessageDialog(null, e); 
                } 
            }
            else {
                try { 
                    FileWriter fw = new FileWriter(file+".txt", false);  
                    BufferedWriter bw = new BufferedWriter(fw); 
                    bw.write(s); 
                    bw.flush(); 
                    bw.close(); 
                } 
                catch (Exception e) { 
                    JOptionPane.showMessageDialog(null, e); 
                } 
            }
        } 
	}
	
	public String openFile() {
		   FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
		    jfc.setFileFilter(filter);
		    int returnVal = jfc.showOpenDialog(null);
		    if(returnVal == JFileChooser.APPROVE_OPTION) {		    	
		    	Path file = jfc.getSelectedFile().toPath();
		    	path = file.toString();
		    	try (InputStream in = Files.newInputStream(file);
		    	    BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
		    	    String line = null;
		    	    while ((line = reader.readLine()) != null) {
		    	        readtext = line;
		    	    }
		    	    reader.close();
		    	} catch (IOException e) {
		    	    System.err.println(e);
		    	}	    	
		    }
			return readtext;		
	}
}
