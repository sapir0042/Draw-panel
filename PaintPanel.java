import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 * The class PaintPanel draws the shapes in the panel
 * @author sapir leibovich
 */
public class PaintPanel extends JPanel {
	private ArrayList<MyShape> _shapes;
	private MyShape _shapeTemp;
	private int _x1, _y1, _x2, _y2;
	private String _shapeName="Line";
	private Color _color;
	private boolean _fill;
	
	public PaintPanel() {
		_shapes=new ArrayList<MyShape>();
		
		Listener lis = new Listener();
		addMouseListener(lis);
		addMouseMotionListener(lis);
	}
	
	//clear panel
	public void clearPanel() {
		_shapes.clear();
	}
	
	//set shape selection
	public void setShapeSelection(String shape) {
		_shapeName=shape;
	}
	
	//set color
	public void setColor(Color color) {
		_color=color;
	}
	
	//set fill
	public void setfill(boolean fill) {
		_fill=fill;
	}
	
	//remove last shape 
	public void undo() {
		if(_shapes.size()>0)
			_shapes.remove(_shapes.get(_shapes.size()-1));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//paint all shape
		for(MyShape shape:_shapes) 
			shape.paint(g);
		//paint current shape 
		if(_shapeTemp!=null)
			_shapeTemp.paint(g);
	}
	
	private class Listener extends MouseAdapter {
		
		//when mouse pressed initialize a new shape
		public void mousePressed(MouseEvent e) {
			_x1 = e.getX();
			_y1 = e.getY();
			switch (_shapeName) {
			case "Line":
				_shapeTemp=new MyLine(_x1, _y1, 0, 0, _color);break;
			case "Oval":
				_shapeTemp=new MyOval(_x1, _y1, 0, 0, _color,_fill);break;
			case "Rectangle":
				_shapeTemp=new MyRectangle(_x1, _y1, 0, 0, _color,_fill);break;
			case "Round Rectangle":
				_shapeTemp=new MyRoundRectangle(_x1, _y1, 0, 0, _color,_fill);break;
			}
		}

		//when mouse dragged initialize shape size
		public void mouseDragged(MouseEvent e) {
			_y2=e.getY();
			_x2=e.getX();
			if(_shapeTemp instanceof MyLine) {
				//set last point
				_shapeTemp.setx2(_x2);
				_shapeTemp.sety2(_y2);
			}
			else if(_shapeTemp instanceof MyBoundedShape){
				//set first point as the smallest point
				_shapeTemp.setx1(Math.min(_x1,_x2));
				_shapeTemp.sety1(Math.min(_y1,_y2));	
				//set width and height
				_shapeTemp.setx2(Math.abs(_x1-_x2));
				_shapeTemp.sety2(Math.abs(_y1-_y2));
			}
			repaint();
		}
		
		//when mouse is released add it to list of shapes 
		public void mouseReleased(MouseEvent e) {
			_shapes.add(_shapeTemp);
			_shapeTemp=null;
		}
	}
}
