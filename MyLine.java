import java.awt.Color;
import java.awt.Graphics;
/**
 * The class MyLine representing a line
 * @author sapir leibovich
 *
 */
public class MyLine extends MyShape {

	/**
	 * Constructor 
	 * @param x1 the x1 point
	 * @param y1 the y1 point
	 * @param x2 the x2 point
	 * @param y2 the y2 point
	 * @param color the color
	 */
	public MyLine(int x1, int y1, int x2,int y2,Color color) {
		super(x1,y1,x2,y2,color);
	}

	/**
	 * Constructor 
	 * @param line the line
	 */
	public MyLine(MyLine line) {
		super(line.getx1(),line.gety1(),line.getx2(),line.gety2(),line.getColor());
	}

	/**
	 * paint the line
	 */
	public void paint(Graphics g) {
		g.setColor(getColor());
		g.drawLine(getx1(),gety1(),getx2(),gety2());	
	}
	/**
	 * Returns a string representation of this line.
	 */
	public String toString() {
		return "line: "+super.toString();
	}
}
