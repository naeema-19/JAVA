import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class copy_file {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		char ch;
		int nl=0,nw=0;
		System.out.println("Enter the name of the file");
		String s = sc.next();
		FileInputStream fr = new FileInputStream(s);
		int n = fr.available();
		for(int i=0;i<n;i++)
		{
			ch=(char)fr.read();
			if(ch=='\n')
			{
				nl++;
			}
			else if(ch==' ')
			{
				nw++;
			}
		}
		System.out.println("No of Lines = " + nl);
		System.out.println("No of Words = " + nl + nw);
		System.out.println("No of haracters = " + n);
		
		


	}

}
