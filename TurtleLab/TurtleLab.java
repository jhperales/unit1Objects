import java.awt.Color;

public class TurtleLab
{
    public static void main(String[] args)
    {
        World turtleLab = new World();
        Turtle t1 = new Turtle(turtleLab);
        t1.setPenColor(Color.BLACK);
        Turtle t2 = new Turtle(turtleLab);
        t2.setPenColor(Color.RED);
        t1.setPenWidth(5);
        t2.setPenWidth(5);
        t1.penDown();
        t2.penDown();
        
        t2.turn(-90);
        t1.forward(50);
        t2.forward(50);
        
        //turtle 2 movement
        
        int x = 0;
        while (x < 25)
        {
           x += 1;
           t2.turn(-x);
           t2.forward(15);
        }
        
        t2.forward(15);
        t2.setPenWidth(3);
        
        x = 0;
        while (x < 25)
        {
           x += 1;
           t2.turn(-x);
           t2.forward(15);
        }
        
        t2.forward(25);
        t2.setPenWidth(0);
        x = 0;
        while (x < 40)
        {
           x += 1;
           t2.turn(x);
           t2.forward(15);
        }
        
        t2.forward(100);
        t2.setPenWidth(2);
        
        //turtle 1 movement
        
        x = 0;
        while (x < 40)
        {
           x += 1;
           t1.turn(x);
           t1.forward(15);
        }
        
        t1.forward(100);
        x = 0;
        while (x < 100)
        {   
            t1.forward(x);
            x += 1;
            t1.turn(90);
            t1.forward(x);
            x += 1;
            t1.turn(90);
            t1.forward(x);
            x += 1;
            t1.turn(90);
            t1.forward(x);
            x += 1;
            t1.turn(90);
        }
        
        t1.forward();
        t1.turn(90);
        t1.forward(200);
   }
}