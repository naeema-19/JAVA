package java_module1;

class thread1 implements Runnable{
	Thread t;
	thread1() {
		t = new Thread(this);
	}
		public void run() {
			System.out.println("\nOdd Nos");
			for(int i=3;i<=100;i++)
			{
				if(i%2 !=0)
				{
					System.out.println(i + " ");
				}
			}
			/*try {
				Thread.sleep(1);
			}
			catch(InterruptedException ex) {
				System.out.println(ex);
			}*/
		}
	}
	


class thread2 implements Runnable{
	Thread t;
	thread2() {
		t = new Thread(this);
	}
		public void run() {
			System.out.println("\nEven Nos");
			for(int i=2;i<=100;i++)
			{
				if(i%2 ==0)
				{
					System.out.println(i + " ");
				}
			}
			/*try {
				Thread.sleep(1);
			}
			catch(InterruptedException ex) {
				System.out.println(ex);
			}*/
		}
	}

public class string_token {

	public static void main(String[] args) {
		thread1 t1 = new thread1();
		thread1 t2 = new thread1();
		t1.t.setPriority(10);
		t2.t.setPriority(6);
		try {
			if(t1.t.getPriority() < t2.t.getPriority())
			{
				t2.t.start();
				t2.t.join();
				t1.t.start();
			}
			else
			{
				t1.t.start();
				t1.t.join();
				t2.t.start();
			}
		}
		catch(InterruptedException ex)
		{
			System.out.println(ex);
		}

	}

}
