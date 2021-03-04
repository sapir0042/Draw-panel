import java.awt.Color;
import java.awt.Graphics;
/**
 * The abstract class MyBoundedShape representing a bounded shape 
 * @author sapir leibovich
 */
public abstract class MyBoundedShape extends MyShape {
	
	private boolean _fill;
	
	/**
	 * Constructor 
	 * @param x1 the x1 point
	 * @param y1 the y1 point
	 * @param x2 the x2 point
	 * @param y2 the y2 point
	 * @param color the color
	 * @param fill true, if fill. otherwise, false (no fill)
	 */
	public MyBoundedShape(int x1, int y1, int x2,int y2,Color color,boolean fill) {
		super(x1,y1,x2,y2,color);
		_fill=fill;
	}
	
	public abstract void paint(Graphics g);
	
	/**
	 * Checks if the shape is fill
	 * @return true, if fill. otherwise, false (not fill)
	 */
	public boolean isFill() {
		return _fill;
	}
	
	/**
	 * Set the shape no fill
	 */
	public void setNoFill() {
		_fill=false;
	}
	
	/**
	 * Returns a string representation of this MyBoundedShape.
	 */
	public String toString() {
		return (_fill?"fill , ":"not fill , ") + super.toString();
	}
}

