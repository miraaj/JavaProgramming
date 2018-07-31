//@source javatpoint.com
import javax.swing.*;
import java.awt.*;

public class SpringLayoutExample {
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("SpringLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize( 500,200 );
        frame.setPreferredSize( frame.getSize() );

        Container contentPane = frame.getContentPane();
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);

        JLabel label = new JLabel("Label: ");
        JTextField textField = new JTextField("My Text Field", 15);
        contentPane.add(label);
        contentPane.add(textField);

        layout.putConstraint(SpringLayout.WEST, label,6,SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, label,6,SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.WEST, textField,6,SpringLayout.EAST, label);
        layout.putConstraint(SpringLayout.NORTH, textField,6,SpringLayout.NORTH, contentPane);
        layout.putConstraint(SpringLayout.EAST, contentPane,6,SpringLayout.EAST, textField);
        layout.putConstraint(SpringLayout.SOUTH, contentPane,6,SpringLayout.SOUTH, textField);

        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}