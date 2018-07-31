import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;
public class AdapterDemo extends MouseMotionAdapter{  
    JFrame frame;  
    AdapterDemo(){  
        frame=new JFrame("Mouse Motion Adapter");  
        frame.addMouseMotionListener(this);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
        frame.setSize(300,300);  
        frame.setLayout(null);  
        frame.setVisible(true);  
    }  
public void mouseDragged(MouseEvent e) {  
    Graphics g=frame.getGraphics();  
    g.setColor(Color.RED);  
    g.fillOval(e.getX(),e.getY(),20,20);  
}  
public static void main(String[] args) {  
    new AdapterDemo();  
}  
}  