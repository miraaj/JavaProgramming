import javax.swing.*;        

public class HelloWorld {
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("GUI Programming Javas");
        frame.setLocation(250,100);   
        frame.setSize(600,350);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        frame.add(label);

        //Display the window.
        // frame.pack(); //uncomment to see difference
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}