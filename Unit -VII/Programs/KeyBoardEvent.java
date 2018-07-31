import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Tek Raj Chhetri on 7/28/2018.
 * Java program to demonstrate key event handlers
 * To run this program in commandline compile this file as normal java file
 * then you could follow one of the two method to run
   * Put this code <applet code="KeyBoardEvent" width=300 height=300></applet> in html file and save it. And use appletviewer filename.html for output

   * Or use appletviewer classname.java  
 */
/*
    <applet code="KeyBoardEvent" width=300 height=300></applet>
*/
public class KeyBoardEvent extends Applet implements KeyListener{
    String message = "";
    int x = 10, y = 20;

    public void  init(){
        addKeyListener( this );
    }

    public void keyPressed(KeyEvent ke){
        showStatus( "Key Down" );
    }

    public void  keyReleased(KeyEvent ke){
        showStatus( "Key Released" );
    }
    public void keyTyped(KeyEvent ke){
        message += ke.getKeyChar();
        repaint();
    }
    //display key stroke
    public void paint(Graphics graphics){
        graphics.drawString(message,x,y);
    }

}
