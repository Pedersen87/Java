package lab4.controller;

import java.io.FileNotFoundException;

public class Controller {
	private View view;
	private Model model;
	
	Controller(){
		model = new Model();
		view = new View(this);
		open();		
	}
	
	public void open(){ 
		view.setDrawInterface(model.openFile());
	}
	
	public void eventIn(String option) {
	
		if(option.equals("Circle")) {	
			model.setLineWidth(view.lineWidthInput());
			model.setAreaColor(view.areaColorInput());
			model.setLineColor(view.borderColorInput());
			view.circle(model.getXcord(), model.getYcord(), model.getWidth(), model.getHeight(),model.getLineWidth(),model.getAreaColor(),model.getLineColor());
			model.saveFile(view.SaveDraw());
			view.setDrawInterface(model.openFile());						
		}
		if(option.equals("Rectangle")) {		
			model.setLineWidth(view.lineWidthInput());
			model.setAreaColor(view.areaColorInput());
			model.setLineColor(view.borderColorInput());
			view.rectangle(model.getXcord(), model.getYcord(), model.getWidth(), model.getHeight(), model.getLineWidth(),model.getAreaColor(),model.getLineColor());
			model.saveFile(view.SaveDraw()); 
			view.setDrawInterface(model.openFile());
		}	
		if(option.equals("Line")) {	
			model.setLineWidth(view.lineWidthInput());
			model.setAreaColor(view.areaColorInput());
			model.setLineColor(view.borderColorInput());
			view.line(model.getXcord(), model.getYcord(),model.getWidth(), model.getHeight(),model.getLineWidth(),model.getAreaColor());
			model.saveFile(view.SaveDraw()); 
			view.setDrawInterface(model.openFile());
		}	
	}
	
	
	public static void main(String[] args) {
		new Controller();
	}


}
