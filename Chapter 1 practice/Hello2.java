import javax.swing.JOptionPane;

public class Hello2
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("What is thy name?");
        System.out.println(name);
    }
}