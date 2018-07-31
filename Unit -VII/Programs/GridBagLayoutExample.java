import javax.swing.*;
import java.awt.*;

/**
 * Created by Tek Raj Chhetri on 7/31/2018.
 */
public class GridBagLayoutExample {
    static JFrame frame;
    private static void initGUI(){
        frame = new JFrame( "Grid Bag Layout" );

        JButton one = new JButton( "1" );
        JButton two = new JButton( "2" );
        JButton three = new JButton( "3" );
        one.setSize( 100,50 );
        one.setPreferredSize( one.getSize(  ) );
        two.setSize( 100,50 );
        two.setPreferredSize( one.getSize(  ) );
        three.setSize( 200,50 );
       three.setPreferredSize( three.getSize()  );

        one.setBackground( Color.RED );
        one.setForeground( Color.white ); //text color
        two.setBackground( Color.magenta );
        two.setForeground( Color.white );
        three.setBackground( Color.cyan );
        three.setForeground( Color.white );

        frame.setVisible( true );
        frame.setLayout( new GridBagLayout() );
        frame.setSize( 400,400 );
        frame.setPreferredSize( frame.getSize() );
        frame.pack();
        frame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        GridBagConstraints gridBagConstraints = new GridBagConstraints(  );
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        frame.add( three,gridBagConstraints );
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        frame.add( one,gridBagConstraints );
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        frame.add( two,gridBagConstraints );

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
