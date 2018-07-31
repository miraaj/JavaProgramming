import javax.swing.*;
public class StartProgram
{
    public static void main(String[] args) {           
        SwingUtilities.invokeLater(new Runnable() {            
            public void run() {                                           
                Model model = new Model("Java Programming");
                View view = new View("This label will change after button click"); 
                Controller controller = new Controller(model,view);
                controller.contol();
            }
        });  
    }
}