import javax.swing.*;
import java.awt.*;

/**
 * Created by Tek Raj Chhetri on 7/31/2018.
 */
public class BoxLayoutExample {
    static JFrame frame;
    private static void initGUI(){
        frame = new JFrame( "Box Layout" );

        JButton one = new JButton( "1" );
        JButton two = new JButton( "2" );
        JButton three = new JButton( "3" );
        JButton four = new JButton( "4" );
        JButton five = new JButton( "5" );
        one.setBackground( Color.RED );
        one.setForeground( Color.white ); //text color
        two.setBackground( Color.magenta );
        two.setForeground( Color.white );
        three.setBackground( Color.cyan );
        three.setForeground( Color.white );
        four.setBackground( Color.green );
        four.setForeground( Color.white );
        five.setBackground( Color.black );
        five.setForeground( Color.white );

        //add button to frame
        frame.add( one );
        frame.add( two );
        frame.add( three );
        frame.add( four );
        frame.add( five);

        frame.setVisible( true );
        frame.setLayout(  new BoxLayout( frame.getContentPane(), BoxLayout.Y_AXIS ));
        frame.pack();
        frame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater( new Runnable() {
            @Override
            public void run() {
              initGUI();
            }
        } );
    }
}
