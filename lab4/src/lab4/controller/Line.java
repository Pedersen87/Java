package lab4.controller;
import java.awt.*;

class Line extends Model {
	private int x,y,x2,y2;
	
	public Line(int inx, int iny, int inx2, int iny2) {
		x=inx;
		y=iny;
		x2=inx2;
		y2=iny2;
	}
			
	public void draw(Graphics g) {
		g.drawLine(x,y,x2,y2);
	}
	public void add(DrawInterface d) { }
	public void remove(DrawInterface d) { }
	public DrawInterface getContainer() {
		return null;
	}
}