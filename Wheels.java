package nursery;

public class Wheels

{

 private static String createVerse(String object, String sound)
{
   return "\nThe " + object + " on the bus go " + sound + ", " + sound +", "+ sound +
   "\nThe " + object + " on the bus go " + sound + " all day long. \n";
}
 
 public static void main(String [] args)
 {
   String lyrics = createVerse("Wheels", "Round and Round")
                   + createVerse("Wipers", "Swish Swish Swish")
                   + createVerse("Doors", "Open and Shut")
                   + createVerse ("Babies" ,"Wah! Wah! Wah!")
                   + createVerse ("Lisa Marie" ,"Happy days!");
                 
   System.out.println(lyrics);
 }


}
