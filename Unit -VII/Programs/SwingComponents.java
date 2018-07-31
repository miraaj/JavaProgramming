import javax.swing.*;

/**
 * Created by Tek Raj Chhetri on 7/31/2018.
 */
public class SwingComponents {
    static JFrame frame;
    private static void initGUI(){
        frame = new JFrame( "SWING Components" );
        JLabel label = new JLabel( "Name" );
        JTextField textField = new JTextField(  );
        JOptionPane optionPane = new JOptionPane( "Select" );
        optionPane.setOptionType( 0 );
        JColorChooser colorChooser = new JColorChooser(  );
        JRadioButton birdButton = new JRadioButton(  "bird button");
        JRadioButton catButton = new JRadioButton( "Cat Button" );
        //grouping radio button
        ButtonGroup group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);

        JCheckBox checkBoxFood = new JCheckBox( "Food" );
        JCheckBox checkBoxDrinks = new JCheckBox( "Drinks" );


        frame.add( label );
        frame.add( checkBoxDrinks );
        frame.add( checkBoxFood );
        frame.add( textField );
        frame.add( optionPane );
        frame.add( colorChooser );
        frame.add( birdButton );
        frame.add( catButton );
        frame.setLayout(  new BoxLayout( frame.getContentPane(), BoxLayout.Y_AXIS ));

        frame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        frame.pack();
        frame.setVisible( true );
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
