import java.applet.Applet;
import java.awt.*;

/*
    <applet code="SimpleApplet" width=60 height=100></applet>
*/
public class SimpleApplet extends Applet {
    String message = "Welcome To AppletProgramming";
    int xPosition = 30, yPosition = 50;

    public void  paint(Graphics graphics){
        graphics.drawString( message, xPosition,yPosition );

    }
}
