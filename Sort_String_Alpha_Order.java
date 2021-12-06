import java.util.Scanner;
class Main
{ 
 public static void main(String args[])
  { 
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of strings");
  int n=sc.nextInt();
  String s[]=new String[n];
  System.out.println("Enter the "+n+" strings");
  for(int i=0;i<n;i++)
  {
    s[i]=sc.next();  
  }
   
   String temp;
   for(int i=0;i<n;i++)
   {
    for(int j=i+1;j<n;j++)
    {
   	    if(s[i].compareTo(s[j])>0)
   	    { 
   	    temp=s[i];
   	    s[i]=s[j];
   	    s[j]=temp;
   	    }
    }
   }
   System.out.println("The sorted array is:");
   for(int i=0;i<n;i++)
   {
     System.out.println(s[i]);  
   }
   
  }
}
