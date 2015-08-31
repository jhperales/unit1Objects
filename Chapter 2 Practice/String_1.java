public class String_1
{
    public static void main( String[] args )
    {
        String greeting = "Hello, World!";
        int n = greeting .length();
        System.out.println( n );
        
        String river = "Mississippi";
        String bigRiver = river.toUpperCase();
        String s = river.concat("river: ");
        System.out.println(s);
        //System.out.println( "river: " + river + " bigRiver: " + bigRiver );
    }
}