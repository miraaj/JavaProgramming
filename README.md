# JavaProgramming
This repository contains the lecture ppt, codes used in lecture and assignment for Java Programming  of BEDICT

## Executing Applet Program
Since Applet Program doesn't have main method as we've seen in earlier program, below are the procedure explaining execution of applet program.

###

```
import java.applet.Applet;
import java.awt.*;

/*
    <applet code="SimpleApplet" width=60 height=100></applet>
*/
public class SimpleApplet extends Applet {
    String message = "Welcome To AppletProgramming";
    int xPosition = 30, yPosition = 50;

    public void  paint(Graphics graphics){
        graphics.drawString( message, xPosition,yPosition );

    }
}

``` 
