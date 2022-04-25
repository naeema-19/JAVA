public class command {

	public static void main(String[] args) {
		int count,i=0;
		String s;
		count = args.length;
		System.out.println("No of arguments = " + count);
		while(i<count)
		{
			s=args[i];
			i=i+1;
			System.out.println("Java is "+ s);
		}
		
	}

}
