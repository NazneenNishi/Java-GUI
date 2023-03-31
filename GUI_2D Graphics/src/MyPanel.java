import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel {
	
	 Image image;
	 
	 MyPanel() {
		 
		 image = new ImageIcon("base.jpg").getImage();
		 this.setPreferredSize(new Dimension(500,500));
		 
	 }
	 
	 public void paint(Graphics g) {
		 
		 Graphics2D g2D = (Graphics2D) g;
		 g2D.drawImage(image, 0, 0, null);
		 
		 g2D.setPaint(new Color(0x20fa9c));
		 g2D.setStroke(new BasicStroke(5));
		 g2D.drawLine(0, 0, 500, 500);
		 
		 g2D.setPaint(new Color(0xfa2069));
		 //g2D.drawRect(0, 0, 100, 200);
		 g2D.fillRect(20, 280, 100, 200);
	  
		 g2D.setPaint(new Color(0xfa20e8));
		 g2D.drawOval(200, 350, 100, 100);
		 //g2D.fillOval(200, 350, 100, 100);
	  
		 g2D.setPaint(new Color(0x9317ff));
		 //g2D.drawArc(0, 0, 100, 100, 0, 180);
		 g2D.fillArc(340, 80, 100, 100, 0, 180);
		 g2D.setPaint(Color.white);
		 g2D.fillArc(340, 80, 100, 100, 180, 180);
	  
		 int[] xPoints= {290,390,490};
		 int[] yPoints = {280,130,280};
		 g2D.setPaint(new Color(0x1c41fc));
		 //g2D.drawPolygon(xPoints, yPoints, 3);
		 g2D.fillPolygon(xPoints, yPoints, 3);
	  
		 g2D.setPaint(new Color(0x05197d));
		 g2D.setFont(new Font("MV Boli",Font.BOLD,50));
		 g2D.drawString("U R A WINNER!", 50, 50);
		 
	 }

}
