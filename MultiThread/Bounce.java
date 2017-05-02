package MultiThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 2017/4/8 22:33
 *
 * @author weiyu si
 */
public class Bounce {
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new BounceFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class BounceFrame extends JFrame{
    private BallComponent comp;
    public static final int STEPS =1000;
    public static final int DELAY =300;

    public BounceFrame(){
        setTitle("Bounce");

        comp = new BallComponent();
        add(comp,BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        addButton(buttonPanel,"Start",new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event) {
                addBall();
            }
        });
        addButton(buttonPanel,"Close",new ActionListener(){
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }
        });
        add(buttonPanel,BorderLayout.SOUTH);
        pack();
    }

    public void addButton(Container c,String title,ActionListener listener){
        JButton button = new JButton(title);
        c.add(button);
        button.addActionListener(listener);
    }

    public void addBall(){
        try{
            Ball ball = new Ball();
            comp.add(ball);

            for(int i=1;i<=STEPS; i++){
                ball.move(comp.getBounds());
                comp.paint(comp.getGraphics());
                Thread.sleep(DELAY);
            }
        }
        catch (InterruptedException e){

        }
    }

}
