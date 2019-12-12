import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class MyWindow extends JFrame {
    private Flock f;
    public MyWindow(Flock f){
        this.f = f;
        this.setSize(1200,1000);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Window");
    }
    @Override
    public void paint(Graphics g){
        f.draw(g);
        /*
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(new Color(100,100,0));
        Ellipse2D macaw = new Ellipse2D.Double(100,100,100,100);
        g2.fill(macaw);
        g2.setColor(new Color(200,200,0));
        Ellipse2D penguin = new Ellipse2D.Double(100+100,100+100,100,100);
        g2.fill(penguin);
        g.setColor(new Color(255, 0, 0));
        g.drawLine(100,100,100,500);
        g.drawOval(100,100,200,300);
        */
    }
}