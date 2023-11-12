

import java.awt.*;
import javax.swing.*;
public class GizmosFrame extends JFrame{
	private static final int WIDTH = 1920;
	private static final int HEIGHT = 1080;
	
	public GizmosFrame(String framename) {
		super(framename);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH,HEIGHT);
		add(new GizmosPanel());
		setVisible(true);
	}
	
}


