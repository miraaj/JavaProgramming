# JavaProgramming
This repository contains the lecture ppt, codes used in lecture and assignment for Java Programming  of BEDICT.
## Executing Java Program
For the java program to run through command line, follow the steps below:
* Compile Program
    * First we need to compile program to make sure it's error free (compile time error) using the command **javac**
```
Syntax:
    javac filename.java
Eg:
    javac HelloWorld.java
```
The compilation is same regardless of different class name, always use **filename** to compile.
* Running Program
    * To this point it is assumed that you've compiled program without any error. Now we use **java** command to run the program
```
Syntax:
    java classname
Eg:
    *Same file name and class name -- HelloWorld.java 
    java HelloWorld
    *Different file name and class name -- HelloWorld.java but class name is HelloJava.java
    java HelloJava
```
## Executing Applet Program
Since Applet Program doesn't have main method as in earlier program, below are the procedure explaining execution of applet program.

What ever method you use to run an applet program, first you need to compile it as usual.
### Running using __appletviewer filename.java__ command

For this method to use put the code
```
<applet code="SimpleApplet" width=60 height=100></applet>

```
in your java code as shown below. The code value must be the class name. In this case it's **SimpleApplet** same as class name.

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
Now after successful compilation use the command **appletviewer** to run as
```
Syntax:
   appletviewer filename.java
Eg:
   appletviewer SimpleApplet.java


```
### Running using __HTML__ file
In order to run applet program using **HTML** file, we use the same **appletviewer** command but this time instead of java file, we pass html file. And the appletcode is separated from java program.

**Place this code in HTML file and save it (say A.html)**
```
<applet code="SimpleApplet" width=60 height=100></applet>
```
**And java program separately**
```
public class SimpleApplet extends Applet {
    String message = "Welcome To AppletProgramming";
    int xPosition = 30, yPosition = 50;

    public void  paint(Graphics graphics){
        graphics.drawString( message, xPosition,yPosition );

    }
}
```
__After successful compilation we use appletviewer command to execute program as__
```
Syntax:
   appletviewer filename.html
Eg:
   appletviewer A.html


```

