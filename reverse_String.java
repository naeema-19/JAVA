import java.util.Scanner;
class fr_str
{ 
 public static void main(String args[])
  { 
   String s,r="";
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the string: ");
   s=sc.nextLine();
   int n=s.length();
   for(int i=n-1;i>=0;i--)
   {
     r=r+s.charAt(i);
   }
   System.out.print("Reversed string: " + r);
 }
}
