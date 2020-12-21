package lab4.controller;
import java.awt.*;
import java.util.*;

class ShapeContainer implements DrawInterface {
	private Vector vector;
	
	public ShapeContainer() {
		vector=new Vector();
	}
			
	public void draw(Graphics g) {
		DrawInterface t;
		Enumeration e=vector.elements();
		while(e.hasMoreElements()) {
			t=(DrawInterface) e.nextElement();
			t.draw(g);
		}
	}
	public void add(DrawInterface s) {
		vector.add(s);
	}
	public void remove(DrawInterface s) {
		vector.remove(s);
	}
	public DrawInterface getContainer() {
		return this;
	}
}