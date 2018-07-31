import javax.swing.*;
import java.awt.*;

/**
 * Created by Tek Raj Chhetri on 7/31/2018.
 */

public class CardLayoutExample {

    static JFrame frame;
    private  static void initGUI(){
        frame = new JFrame( "Card Layout" );
        JButton queen = new JButton( "Q" );
        queen.setFont(new Font( "Arial",Font.BOLD,45 ));
        queen.setBackground( Color.green );
        queen.setForeground( Color.WHITE );

        //add to frame
        frame.add( queen );
        frame.setVisible( true );
        frame.setSize( 1025,768 );
        frame.getContentPane().setLayout( new CardLayout( 30,50 ) );
        frame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
           public void run(){
               initGUI();
           }
        });
    }
}
