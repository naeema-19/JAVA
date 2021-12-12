
import java.util.Scanner;

class bank_acc{
    Scanner sc = new Scanner(System.in);
    int acc_no;
    String acc_name;
    String acc_type;
    double acc_bal;
    
    void initial_val(){
        System.out.println("Welcome\nEnter the depositor name");
        acc_name = sc.next();
        System.out.println("Enter account number ");
        acc_no = sc.nextInt();
        System.out.println("Enter account type ");
        acc_type = sc.next();
        System.out.println("Enter account initial amount ");
        acc_bal = sc.nextInt();
    }
    
    void depo_amt(){
        double depo;
        System.out.println("Enter the amount to deposit");
        depo = sc.nextInt();
        acc_bal+=depo;
        System.out.println("New Balance =  " + acc_bal);
    }
    
    void with_amt(){
        double with;
        System.out.println("Balance =  "+ acc_bal);
        System.out.println("Enter the amount to withdraw ");
        with = sc.nextInt();
        if(acc_bal>=with){
            acc_bal -=with;
        System.out.println("New Balance =  " + acc_bal);
        }
        else{
            System.out.println("Out of Balance");
        }
    }
    
    void display(){
        System.out.println("Name of depositor : " +acc_name);
        System.out.println("Account type : " +acc_type);
	    System.out.println("Account number : "  +acc_no);
	    System.out.println("Balance : " +acc_bal);
    }
    
}


public class Main
{
	public static void main(String[] args) {
	    bank_acc bk = new bank_acc();
	    Scanner s= new Scanner(System.in);
	    int n;
	    do{
	        System.out.println("\n\n\nEnter what is to be done : ");
	    System.out.print("1.Assign Initil value\n2.Deposit amount\n3.Withdraw amount\n4.Display details\n5.Exit\n");
	    n= s.nextInt();
	        switch(n)
	        {
	        case 1:
	            bk.initial_val();
	            break;
	       
	        case 2:
	            bk.depo_amt();
	            break;
	            
	        case 3:
	            bk.with_amt();
	            break;
	            
	        case 4:
	            bk.display();
	            break;
	        }
	    }
	    while (n!=5);
	    
	    
	}
}
