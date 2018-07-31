import javax.swing.*;
import java.awt.*;

/**
 * Created by Tek Raj Chhetri
 * Program to demonstrate borderlayout
 */
public class BorderLayoutExample {

    private static  void  initGUI(){
        JFrame frame = new JFrame();
        //add buttons
        JButton buttonNorth = new JButton( "North" );
        JButton buttonSouth = new JButton( "South" );
        JButton buttonEast = new JButton( "East" );
        JButton buttonWest = new JButton( "West" );
        //set color
        buttonEast.setBackground( Color.green );
        buttonWest.setBackground( Color.cyan );
        buttonNorth.setBackground( Color.magenta );
        buttonSouth.setBackground( Color.RED );

        frame.getContentPane().add( buttonEast, BorderLayout.EAST );
        frame.getContentPane().add( buttonWest, BorderLayout.WEST );
        frame.getContentPane().add( buttonNorth, BorderLayout.NORTH );
        frame.getContentPane().add( buttonSouth, BorderLayout.SOUTH );
        frame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        frame.setSize( 550,250 );
        frame.setTitle( "BorderLayout" );
        frame.setVisible( true );
    }

    public static void main(String[] args) {
       // new BorderLayoutExample(); can also be used instead of code below
        // but below is better as it run creating thread
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                initGUI();
            }
        });
    }
}
