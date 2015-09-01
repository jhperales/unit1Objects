import java.util.Random;

public class DieSim
{
    public static void main(String[] args)
    {
       Random dice = new Random();
       int y = 0;
       while (y < 10)
       {
           int x = dice.nextInt(1,6);
           System.out.println(x);
           y += 1;
        }
    }
}