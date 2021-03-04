import java.awt.Color;
import java.awt.Graphics;
/**
 * The class MyRectangle representing a rectangle
 * @author sapir leibovich
 *
 */
public class MyRectangle extends MyBoundedShape {

	/**
	 * Constructor 
	 * @param x1 the x1 point
	 * @param y1 the y1 point
	 * @param x2 the width of the rectangle
	 * @param y2 the height of the rectangle
	 * @param color the color
	 * @param fill true, if fill. otherwise, false (no fill)
	 */
	public MyRectangle(int x1, int y1, int x2,int y2,Color color,boolean fill) {
		super(x1,y1,x2,y2,color,fill);

	}
	/**
	 * Constructor 
	 * @param rectangle the rectangle
	 */
	public MyRectangle(MyRectangle rectangle) {
		super(rectangle.getx1(),rectangle.gety1(),rectangle.getx2(),rectangle.gety2(),rectangle.getColor(),rectangle.isFill());
	}

	/**
	 * paint the rectangle
	 */
	public void paint(Graphics g) {
		g.setColor(getColor());
		if(isFill())
			g.fillRect(getx1(),gety1(),getx2(),gety2());	
		else
			g.drawRect(getx1(),gety1(),getx2(),gety2());
	}
	/**
	 * Returns a string representation of this rectangle.
	 */
	public String toString() {
		return "rectangle: "+ super.toString();
	}
}
