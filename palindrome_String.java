import java.util.Scanner;
 
class Palindrome
{
   public static void main(String args[])
   {
      String s, r = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      s = sc.nextLine();
 
      int l = s.length();
 
      for ( int i = l - 1; i >= 0; i-- )
         r = r + s.charAt(i);
 
      if (s.equalsIgnoreCase(r))
         System.out.println(s+" is a palindrome");
      else
         System.out.println(s+" is not a palindrome");
 
   }
}
