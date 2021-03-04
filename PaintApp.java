import javax.swing.JFrame;

public class PaintApp {

	public static void main(String[] args) {

		AppPanel panel =new AppPanel();
		panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setSize(1200,800);
		panel.setLocationRelativeTo(null);  
		panel.setVisible(true);
		
	}

}
