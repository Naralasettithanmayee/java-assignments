import java.util.regex.Pattern;
class StringReverse 
{
   public static void main(String args[])
 {
      String str = "sun rises in the east";
      Pattern p = Pattern.compile("\\s");
      System.out.println("The original string is: " + str);
      String[] temp = p.split(str);
      String rev = " ";
      for (int i = 0; i < temp.length; i++)
 {
         if (i == temp.length - 1)
         rev = temp[i] + rev;
         else
         rev = " " + temp[i] + rev;
      }
      System.out.println("The reversed string is: " + rev);
   }
}