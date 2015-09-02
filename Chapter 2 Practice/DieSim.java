import java.util.Random;

public class DieSim
{
    public static void main(String[] args)
    {
       Random dice = new Random();
       
       //Option A
       int dieValue = dice.nextInt(6); //returns [0, 1, 2, 3, 4, 5, 6]
       dieValue += 1; // returns {1, 2, 3, 4, 5, 6]
       System.out.println(dieValue);
       
       //Option B
       double dieValue2 = Math.random(); //returns [0,1)
       dieValue *=6; //returns {0.6)
       dieValue2 += 1; // returns [1,7);
       System.out.println( (int) dieValue2 ); 
    }
}
