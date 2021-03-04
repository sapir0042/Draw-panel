import java.awt.Color;
import java.awt.Graphics;

public class MyRoundRectangle extends MyBoundedShape {

	private final int arc=60;
	
	/**
	 * Constructor 
	 * @param x1 the x1 point
	 * @param y1 the y1 point
	 * @param x2 the width of the rectangle
	 * @param y2 the height of the rectangle
	 * @param color the color
	 * @param fill true, if fill. otherwise, false (no fill)
	 */
	public MyRoundRectangle(int x1, int y1, int x2,int y2,Color color,boolean fill) {
		super(x1,y1,x2,y2,color,fill);

	}
	/**
	 * Constructor 
	 * @param rectangle the rectangle
	 */
	public MyRoundRectangle(MyRoundRectangle rectangle) {
		super(rectangle.getx1(),rectangle.gety1(),rectangle.getx2(),rectangle.gety2(),rectangle.getColor(),rectangle.isFill());
	}

	/**
	 * paint the rectangle
	 */
	public void paint(Graphics g) {
		g.setColor(getColor());
		if(isFill())
			g.fillRoundRect(getx1(), gety1(), getx2(), gety2(), arc, arc);
			//g.fillRect(getx1(),gety1(),getx2(),gety2());	
		else
			g.drawRoundRect(getx1(), gety1(), getx2(), gety2(), arc, arc);
	}
	/**
	 * Returns a string representation of this rectangle.
	 */
	public String toString() {
		return "rectangle: "+ super.toString();
	}

}
