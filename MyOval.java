import java.awt.Color;
import java.awt.Graphics;
/**
 * The class MyOval representing a oval
 * @author sapir leibovich
 *
 */
public class MyOval extends MyBoundedShape {

	/**
	 * Constructor 
	 * @param x1 the x1 point
	 * @param y1 the y1 point
	 * @param x2 the width of the blocking rectangle
	 * @param y2 the height of the blocking rectangle
	 * @param color the color
	 * @param fill true, if fill. otherwise, false (no fill)
	 */
	public MyOval(int x1, int y1, int x2,int y2,Color color,boolean fill) {
		super(x1,y1,x2,y2,color,fill);
	}

	/**
	 * Constructor 
	 * @param oval the oval
	 */
	public MyOval(MyOval oval) {
		super(oval.getx1(),oval.gety1(),oval.getx2(),oval.gety2(),oval.getColor(),oval.isFill());
	}

	/**
	 * paint the oval
	 */
	public void paint(Graphics g) {
		g.setColor(getColor());
		if(isFill())
			g.fillOval(getx1(),gety1(),getx2(),gety2());	
		else
			g.drawOval(getx1(),gety1(),getx2(),gety2());
	}
	/**
	 * Returns a string representation of this oval.
	 */
	public String toString() {
		return "oval: "+ super.toString();
	}
}
