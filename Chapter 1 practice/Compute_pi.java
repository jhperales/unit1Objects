public class Compute_pi
{
    public static void main(String[] args)
    {
        int x = 1;
        double pi = 0;
        
        while (x < 100)
        {
            pi += 4.0/x;
            x += 2;
            System.out.println(pi);
            pi -= 4.0/x;
            x += 2;
            System.out.println(pi);
        }
    }
}
           