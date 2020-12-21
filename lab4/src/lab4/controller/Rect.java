package lab4.controller;
import java.awt.*;

class Rect extends Model {
	private int x,y,h,w;
	
	public Rect(int inx, int iny, int inw, int inh) {
		x=inx;
		y=iny;
		h=inh;
		w=inw;
	}
			
	public void draw(Graphics g) {
		g.drawRect(x,y,w,h);
	}
	public void add(DrawInterface s) { }
	public void remove(DrawInterface s) { }
	public DrawInterface getContainer() {
		return null;
	}
}