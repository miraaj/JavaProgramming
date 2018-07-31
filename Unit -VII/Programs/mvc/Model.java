/*
    *This is model which handles the data
*/
public class Model{
    
    private String greetTo=" ";    

    public Model(String greetValue){
        this.greetTo  = greetValue;
    }
    
    public String getGreetText(){
        return "Welcome to "+greetTo;
    }
}