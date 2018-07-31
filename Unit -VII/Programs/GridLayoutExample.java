import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Tek Raj Chhetri on 7/31/2018.
 * Program to demonstrate Grid Layout
 */
public class GridLayoutExample {
     static JFrame frame;
    private static void initGUI(){
        frame = new JFrame( "Grid Layout" );

        JButton one = new JButton( "1" );
        JButton two = new JButton( "2" );
        JButton three = new JButton( "3" );
        JButton four = new JButton( "4" );
        JButton five = new JButton( "5" );
        JButton six = new JButton( "6" );
        JButton seven = new JButton( "7" );
        JButton eight = new JButton( "8" );
        JButton nine = new JButton( "9" );
        //set color to button

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
        six.setBackground( Color.blue );
        six.setForeground( Color.white );
        seven.setBackground( Color.magenta );
        seven.setForeground( Color.white );
        eight.setBackground( Color.orange );
        eight.setForeground( Color.white );
        nine.setBackground( Color.MAGENTA );
        nine.setForeground( Color.white );
        //add buttons to frame
        frame.add( one );
        frame.add( two );
        frame.add( three );
        frame.add( four );
        frame.add( five);
        frame.add( six );
        frame.add( seven );
        frame.add( eight );
        frame.add( nine );

        frame.setVisible( true );
        frame.setSize( 500,400 );
        //set gridlayout
        frame.setLayout( new GridLayout(3,3) );
        frame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        //add listener
        one.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDialog( 1 );
            }
        } );
        two.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDialog( 2 );
            }
        } );
        three.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDialog( 3 );
            }
        } );
        four.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDialog( 4 );
            }
        } );
        five.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDialog( 5 );
            }
        } );
        six.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDialog( 6 );
            }
        } );
        seven.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDialog( 7 );
            }
        } );
        eight.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDialog( 8 );
            }
        } );
        nine.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showDialog( 9 );
            }
        } );
    }

    private static void showDialog(int number){
        JOptionPane.showMessageDialog( frame,number+" is clicked");
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
