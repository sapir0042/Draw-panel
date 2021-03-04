import java.awt.Color;
import java.awt.Graphics;
/**
 * The abstract class MyShape representing a shape represented by 4 numbers (x1,y2) , (x2,y2) and color
 * @author sapir leibovich
 *
 */
public abstract class MyShape {
	
	private int _x1,_x2,_y1,_y2;
	private Color _color;
	
	/**
	 * Constructor 
	 * @param x1 the x1 point
	 * @param y1 the y1 point
	 * @param x2 the x2 point
	 * @param y2 the y2 point
	 * @param color the color
	 */
	public MyShape(int x1, int y1, int x2,int y2,Color color) {
		_x1=x1;
		_y1=y1;
		_x2=x2;
		_y2=y2;
		_color=color;
	}
	
	/**
	 * Returns a string representation of this shape.
	 */
	public String toString() {
		return "("+_x1+","+_y1+") , ("+_x2+","+_y2+") ";
	}
	
	public abstract void paint(Graphics g);
	
	/**
	 *  Get the color
	 * @return the color
	 */
	public Color getColor() {
		return _color;
	}
	
	/**
	 *  Get the x1 point
	 * @return the x1 point
	 */
	public int getx1() {
		return _x1;
	}
	
	/**
	 *  Get the y1 point
	 * @return the y1 point
	 */
	public int gety1() {
		return _y1;
	}
	
	/**
	 *  Get the x2 point
	 * @return the x2 point
	 */
	public int getx2() {
		return _x2;
	}
	
	/**
	 *  Get the y2 point
	 * @return the y2 point
	 */
	public int gety2() {
		return _y2;
	}
	/**
	 *  Set the color
	 */
	public void setColor(Color color) {
		_color=color;
	}
	/**
	 *  Set the x1 point
	 */
	public void setx1(int x1) {
		_x1=x1;
	}
	/**
	 *  Set the y1 point
	 */
	public void sety1(int y1) {
		_y1=y1;
	}
	
	/**
	 *  Set the x2 point
	 */
	public void setx2(int x2) {
		_x2=x2;
	}
	
	/**
	 *  Set the y2 point
	 */
	public void sety2(int y2) {
		_y2=y2;
	}
	
}
