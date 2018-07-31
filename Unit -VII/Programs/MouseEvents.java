import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 * java program to demonstrate mouse event
 <applet code="MouseEvents" width=100 height=100></applet>
 */
public class MouseEvents extends Applet implements MouseListener, MouseMotionListener {
    String message = "";
    int xPosition = 0, yPosition = 0;

    public void init(){
        addMouseListener( this );
        addMouseMotionListener( this );
    }

    //mouse clicked
    public void mouseClicked(MouseEvent mouseEvent){
        //update co-ordinate
        xPosition = 10;
        yPosition = 20;
        message = "Mouse Clicked";
        repaint();
    }
    //mouse entered
    public void mouseEntered(MouseEvent mouseEvent){
        //update co-ordinate
        xPosition = 10;
        yPosition = 20;
        message = "Mouse Entered";
        repaint();
    }
    //mouse exited
    public void mouseExited(java.awt.event.MouseEvent mouseEvent){
        //update co-ordinate
        xPosition = 10;
        yPosition = 20;
        message = "Mouse exited";
        repaint();
    }
    //mouse  pressed
    public void  mousePressed(MouseEvent mouseEvent){
        //update co-ordinate
        xPosition = mouseEvent.getX();
        yPosition = mouseEvent.getY();
        message = "Mouse Down";
        repaint();
    }
    //mouse button released
    public void mouseReleased(MouseEvent mouseEvent){
        //update co-ordinate
        xPosition = mouseEvent.getX();
        yPosition = mouseEvent.getY();
        message = "Mouse Released";
        repaint();
    }
    //mouse dragged
    public void mouseDragged(MouseEvent mouseEvent){
        //update co-ordinate
        xPosition = mouseEvent.getX();
        yPosition = mouseEvent.getY();
        showStatus( "Dragging mouse at "+xPosition+" , "+yPosition );
        repaint();
    }
    //mouse moved
    public void mouseMoved(MouseEvent mouseEvent){
        //update co-ordinate
        xPosition = mouseEvent.getX();
        yPosition = mouseEvent.getY();
        showStatus( "Moving mouse at "+xPosition+" , "+yPosition );
        repaint();

    }

    public void paint(Graphics graphics){
        graphics.drawString( message, xPosition, yPosition );
    }
}
