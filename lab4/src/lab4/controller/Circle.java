package lab4.controller;
import java.awt.*;

class Circle extends Model {
	private int x,y,h,w;
	
	public Circle(int inx, int iny, int inw, int inh) {
		x=inx;
		y=iny;
		h=inh;
		w=inw;
	}
			
	public void draw(Graphics g) {
		g.drawOval(x,y,w,h);
	}
	public void add(DrawInterface d) { }
	public void remove(DrawInterface d) { }
	public DrawInterface getContainer() {
		return null;
	}
}