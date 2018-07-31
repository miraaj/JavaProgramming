//This is controller which controls program flow
import java.awt.event.*;
public class Controller {
    private Model model;
    private View view;
    private ActionListener actionListener;    
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;                          
    }    
    public void contol(){        
        actionListener = new ActionListener() {
              public void actionPerformed(ActionEvent actionEvent) {                  
                  showLabel();
              }
        };                
        view.getButton().addActionListener(actionListener);   
    }    
    private void showLabel(){            
        view.setText((model.getGreetText()));
    }    
}