import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
/**
 * The AppPanel class creates the buttons panel and the painting panel
 * @author sapir leibovich
 */
public class AppPanel extends JFrame {
	
	private JPanel panelButtons;
	private PaintPanel paintPanel;
	private JButton _line;
	private JButton _rect;
	private JButton _oval;
	private JButton _roundRect;
	private JCheckBox _fill;
	private JColorChooser _colorPan;
	private JButton _undo;
	private JButton _clear;
	private JButton _exit;
	
	public AppPanel() {

		super("Paint");
		
		//Buttons panel
		panelButtons = new JPanel();
		
		//paint panel 
		paintPanel = new PaintPanel();
		paintPanel.setBackground(Color.WHITE);

		//add panels
		add(panelButtons,BorderLayout.NORTH);
		add(paintPanel,BorderLayout.CENTER);

		//Buttons
		_line= new JButton("Line");
		_rect= new JButton("Rectangle");
		_oval= new JButton("Oval");
		_roundRect= new JButton("RoundRect");
		_fill= new JCheckBox("fill");
		_undo= new JButton("Undo");
		_clear= new JButton("Clear");
		_exit= new JButton("Exit");
		
		//Color chooser panel 
		_colorPan=new JColorChooser();
		AbstractColorChooserPanel[] panels = _colorPan.getChooserPanels();

		//listeners
		_line.addActionListener(new ButtonSelection());
		_oval.addActionListener(new ButtonSelection());
		_rect.addActionListener(new ButtonSelection());
		_roundRect.addActionListener(new ButtonSelection());
		_fill.addActionListener(new ButtonSelection());
		_colorPan.getSelectionModel().addChangeListener(new ColorSelection());
		_undo.addActionListener(new ButtonSelection());
		_clear.addActionListener(new ButtonSelection());
		_exit.addActionListener(new ButtonSelection());

		//add all to component panel
		panelButtons.add(_line);
		panelButtons.add(_oval);
		panelButtons.add(_rect);
		panelButtons.add(_roundRect);
		panelButtons.add(_fill);
		panelButtons.add(panels[0]);
		panelButtons.add(_undo);
		panelButtons.add(_clear);
		panelButtons.add(_exit);

	}
	
	class ColorSelection implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			paintPanel.setColor(_colorPan.getColor());
		}
	}

	class ButtonSelection implements  ActionListener{
		public void actionPerformed(ActionEvent e){
			Object source = e.getSource();
			if(source==_line) {
				paintPanel.setShapeSelection("Line");
			}
			else if(source==_oval) {
				paintPanel.setShapeSelection("Oval");
			}
			else if(source==_rect) {
				paintPanel.setShapeSelection("Rectangle");
			}
			else if(source==_roundRect) {
				paintPanel.setShapeSelection("Round Rectangle");
			}
			else if(source==_exit) {	
				dispose();
			}
			else if(source==_clear) {
				paintPanel.clearPanel();
				repaint();
			}
			else if(source==_undo) {
				paintPanel.undo();
				repaint();
			}
			else if(source==_fill) {
				paintPanel.setfill(_fill.isSelected());
			}
		}

	}
}
