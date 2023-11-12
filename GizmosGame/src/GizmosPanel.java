import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.io.*;
public class GizmosPanel extends JPanel{
	
	private BufferedImage background ,toolbar;
	
	private BufferedImage rule1, rule2, rule3, rule4;
	public GizmosPanel() {
	
		try {
			toolbar = ImageIO.read(GizmosPanel.class.getResource("/images/toolbar.png"));
			background = ImageIO.read(GizmosPanel.class.getResource("/images/bavck.png"));
			rule1 = ImageIO.read(GizmosPanel.class.getResource("/images/page3.png"));
			rule2 = ImageIO.read(GizmosPanel.class.getResource("/images/page4.png"));
			
		}
		catch(Exception E) {
			System.out.println("Exception Error");
			return;
		}
	}
	public void paint(Graphics g) {
		
		super.paint(g);
		
		g.drawImage(background, 0,0, 1920, 1080, null);
		drawToolBar(g);
		drawNextButton(g);
		displayRules(g);
	
	}
	
public void drawNextButton(Graphics g) {
		
}
public void drawPlayerDeck(Graphics g) {
		
}
public void drawToolBar(Graphics g) {
	g.drawImage(toolbar, 50, 50, 1063, 72, null);
	
	int y = 250;
	for(int i = 0; i < 3; i++) {
		System.out.println(y);
		g.drawImage(toolbar, 1200, y, 570, 72, null);
		y=y+200;
	}
}
public void drawArchive(Graphics g) {
	
}
public void drawScoreBoard(Graphics g) {
	
}
public void drawDispenser(Graphics g) {
	
}
public void drawPlayables(Graphics g) {
	
}
public void drawEnergyGrid(Graphics g) {
		
}
public void displayRules(Graphics g) {
	
	g.drawRect(60, 85, 1800, 910);
	g.drawImage(rule1, 279, 105, 681, 870, null);
	g.drawImage(rule2, 960, 105, 681, 870, null);
	
	//arrows
	g.drawRect(1705, 520, 80, 100);
	g.drawRect(135, 520, 80, 100);
}
public void toLeaderboard(Graphics g) {
	
}
public void effectsPopUp(Graphics g) {
	
}
public void nextPlayer(Graphics g) {
	
}
	
public void mousePressed(MouseEvent e) {
		
}
public void mouseReleased(MouseEvent e) {
		
	}
public void mouseEntered(MouseEvent e) {
	
}
public void mouseExited(MouseEvent e) {
	
}
public void mouseClicked(MouseEvent e) {
	int x = e.getX();
	int y = e.getY();
}
}


