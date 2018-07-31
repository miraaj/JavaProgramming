//@source Javatpoint.com
import javax.swing.*;
import java.awt.*;
import static javax.swing.GroupLayout.Alignment.*;
public class GroupLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GroupLayoutExample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container myPanel = frame.getContentPane();
        frame.setSize( 500,200 );
        frame.setPreferredSize( frame.getSize() );
        GroupLayout groupLayout = new GroupLayout(myPanel);
        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);
        myPanel.setLayout(groupLayout);
        JButton b1 = new JButton("Button One");
        JButton b2 = new JButton("Button Two");
        JButton b3 = new JButton("Button Three");
        groupLayout.setHorizontalGroup(groupLayout.createSequentialGroup()
                .addGroup(groupLayout.createParallelGroup(LEADING).addComponent(b1).addComponent(b3))
                .addGroup(groupLayout.createParallelGroup(TRAILING).addComponent(b2)));
        groupLayout.setVerticalGroup(groupLayout.createSequentialGroup()
                .addGroup(groupLayout.createParallelGroup(BASELINE).addComponent(b1).addComponent(b2))
                .addGroup(groupLayout.createParallelGroup(BASELINE).addComponent(b3)));
        frame.pack();
        frame.setVisible(true);
    }
}  