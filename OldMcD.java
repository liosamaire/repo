package nursery;

public class OldMcD

{

 private static String createVerse(String animal, String sound)
{
   return "\nOld MacDonald had a farm, E-I-E-I-O"
          + "\nAnd on this farm he had a " + animal + ", E-I-E-I-O"
          + "\nWith a " + sound + "-" + sound + " here and a " +
    sound + "-" + sound + " there"
          + "\nHere a " + sound + " there a " + sound + 
               " everywhere a " + sound + "-" + sound
          + "\nOld MacDonald had a farm, E-I-E-I-O\n";
}
 
 public static void main(String [] args)
 {
   String lyrics = createVerse("cow", "moo")
                   + createVerse("sheep", "baa")
                   + createVerse("duck", "quack")
                   + createVerse ("Lisa" ,"Marie");
                 
   System.out.println(lyrics);
 }


}