import java.util.Scanner;
class fr_str
{ 
 public static void main(String args[])
  { 
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the string: ");
   String s=sc.nextLine();
   String s1=s.toLowerCase();
   System.out.println("Enter the character whose frequency is to be determined  : ");
   char ch=sc.next().charAt(0);
   int f=0;
   for(int i=0;i<s1.length();i++)
   { 
    if(ch==s1.charAt(i))
     f++;
   }
   System.out.println("The frequency of "+ch+" = "+f);
  }
}
