import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        int x = 1;
        while (true)
        {   
            turtle.forward(x);
            x += 1;
            turtle.turn(90);
            turtle.forward(x);
            x += 1;
            turtle.turn(90);
            turtle.forward(x);
            x += 1;
            turtle.turn(90);
            turtle.forward(x);
            x += 1;
            turtle.turn(90);
          
            
            
       
    }
}
}