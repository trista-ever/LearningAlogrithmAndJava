package MultiThread;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * 2017/4/8 22:59
 *
 * @author weiyu si
 */
public class BallComponent extends JPanel {
    public static final int DEFAULT_WIDTH =450;
    public static final int DEFAULT_HEIGHT =350;
    private java.util.List<Ball> balls = new ArrayList<>();

    public void add(Ball b){
        balls.add(b);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g;
        for(Ball b : balls){
            g2.fill(b.getShape());
        }
    }
    public Dimension getPreferredSize(){
        return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}
