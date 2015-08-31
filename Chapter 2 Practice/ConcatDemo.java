public class ConcatDemo
{
   public static void main(String[] args)
   {
      String animal1 = " quick brown fox";
      String animal2 = " lazy dog";
      String article = " the";
      String action = " jumps over";
      String animals = article.concat(animal1);
      String other = action.concat(article);
      String other2 = other.concat(animal2);
     
      String message = animals.concat(other2);
      System.out.println(message);
   }
}
