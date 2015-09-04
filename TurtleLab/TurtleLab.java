import java.awt.Color;

public class TurtleLab
{
    public static void main(String[] args)
        throws InterruptedException
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
        Thread.sleep(10);
        t2.forward(50);
        
       
       //Algorithm for creating boxes
       int x = 0;
       x = 0;
        while (x < 100)
        {   
            t2.forward(x);
            x += 1;
            t2.turn(90);
            t2.setPenColor(Color.RED);
            Thread.sleep(10);
            t2.forward(x);
            x += 1;
            t2.turn(90);
            t2.setPenColor(Color.BLACK);
            t2.forward(x);
            Thread.sleep(10);
            x += 1;
            t2.turn(90);
            t2.setPenColor(Color.YELLOW);
            t2.forward(x);
            Thread.sleep(10);
            x += 1;
            t2.turn(90);
            t2.setPenColor(Color.GREEN);
        }
        t2.forward(15);
        Thread.sleep(10);
        t2.setPenWidth(3);
        
        //algorithm for curved turns
        x = 0;
        while (x < 25)
        {
           x += 1;
           t2.turn(-x);
           t2.forward(15);
           Thread.sleep(10);
        }
        
       x = 0;
        while (x < 100)
        {   
            t2.forward(x);
            x += 1;
            t2.turn(90);
            t2.setPenColor(Color.BLUE);
            Thread.sleep(10);
            t2.forward(x);
            x += 1;
            t2.turn(90);
            t2.setPenColor(Color.MAGENTA);
            t2.forward(x);
            Thread.sleep(10);
            x += 1;
            t2.turn(90);
            t2.setPenColor(Color.RED);
            t2.forward(x);
            Thread.sleep(10);
            x += 1;
            t2.turn(90);
            t2.setPenColor(Color.BLACK);
        }
        
        x = 0;
        while (x < 40)
        {
           x += 1;
           t2.turn(x);
           t2.forward(15);
           Thread.sleep(10);
        }
        
        t2.forward(200);
        Thread.sleep(10);
        t2.setPenWidth(2);
        
       
        
        x = 0;
        while (x < 100)
        {   
            t2.forward(x);
            x += 1;
            t2.turn(90);
            t2.setPenColor(Color.YELLOW);
            Thread.sleep(10);
            t2.forward(x);
            x += 1;
            t2.turn(90);
            t2.setPenColor(Color.GREEN);
            t2.forward(x);
            Thread.sleep(10);
            x += 1;
            t2.turn(90);
            t2.setPenColor(Color.BLUE);
            t2.forward(x);
            Thread.sleep(10);
            x += 1;
            t2.turn(90);
            t2.setPenColor(Color.MAGENTA);
        }
        
        t1.forward(100);
        Thread.sleep(10);
        x = 0;
        while (x < 100)
        {   
            t1.forward(x);
            x += 1;
            t1.turn(90);
            t1.setPenColor(Color.RED);
            Thread.sleep(10);
            t1.forward(x);
            x += 1;
            t1.turn(90);
            t1.setPenColor(Color.BLACK);
            t1.forward(x);
            Thread.sleep(10);
            x += 1;
            t1.turn(90);
            t1.setPenColor(Color.YELLOW);
            t1.forward(x);
            Thread.sleep(10);
            x += 1;
            t1.turn(90);
            t1.setPenColor(Color.GREEN);
        }
        
        t1.setPenColor(Color.BLUE);
        t1.forward();
        Thread.sleep(10);
        t1.turn(90);
        t1.forward(200);
        Thread.sleep(10);
        
        
        t1.setPenColor(Color.MAGENTA);
        t1.turnToFace(544, 544);
        Thread.sleep(10);
        t1.forward(200);
        Thread.sleep(10);
        t1.turn(-90);
        
        x = 0;
        while (x < 100)
        {   
            t1.forward(x);
            x += 1;
            t1.turn(90);
            t1.setPenColor(Color.RED);
            Thread.sleep(10);
            t1.forward(x);
            x += 1;
            t1.turn(90);
            t1.setPenColor(Color.BLACK);
            t1.forward(x);
            Thread.sleep(10);
            x += 1;
            t1.turn(90);
            t1.setPenColor(Color.YELLOW);
            t1.forward(x);
            Thread.sleep(10);
            x += 1;
            t1.turn(90);
            t1.setPenColor(Color.GREEN);
        }
        
        
        x = 0;
        while (x < 40)
        {
           x += 1;
           t1.turn(x);
           t1.forward(15);
           Thread.sleep(10);
        }
        
        x = 0;
        while (x < 100)
        {   
            t1.forward(x);
            x += 1;
            t1.turn(90);
            t1.setPenColor(Color.BLUE);
            Thread.sleep(10);
            t1.forward(x);
            x += 1;
            t1.turn(90);
            t1.setPenColor(Color.MAGENTA);
            t1.forward(x);
            Thread.sleep(10);
            x += 1;
            t1.turn(90);
            t1.setPenColor(Color.RED);
            t1.forward(x);
            Thread.sleep(10);
            x += 1;
            t1.turn(90);
            t1.setPenColor(Color.BLACK);
        }
    }
}