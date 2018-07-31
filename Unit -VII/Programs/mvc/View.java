//This is view used for displaying UI components
import javax.swing.*;
import java.awt.*;
public class View {
    private JFrame frame;
    private JLabel label;
    private JButton button;  
    public View(String text){
        frame = new JFrame("MVC Programming using Swing");                                                                             
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           
        frame.setSize(500,500);        
        frame.setVisible(true);        
        label = new JLabel(text);
        frame.add(label, BorderLayout.CENTER);        
        button = new JButton("Click Me");        
        frame.add(button, BorderLayout.SOUTH);        
    }   
    public JButton getButton(){
        return button;
    }
    public void setText(String text){
        label.setText(text);
    }  
}