package exception_Handling;
import java.util.Scanner;

public class MainApp1 
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		Bank b=new ATM();
		boolean start=true;
		while(start)
		{
			System.out.println("Enter the choice: \n 1.Deposit\n 2.Withdraw \n 3.show balance \n 4.exit");
			int ch=s.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.println("enter the amount");
				int amount=s.nextInt();
				b.deposit(amount);
			}
			break;
			case 2:
			{
				System.out.println("enter the amount");
				int amount=s.nextInt();
				b.withDraw(amount);
			}
			break;
			case 3:
			{
				System.out.println("Account balance");
				b.showBalance();
			}
			break;
			case 4:
			{
				start=false;
				System.out.println("Thank You");
			}
			break;
			default:System.out.println("Enter valid choice");
			}
		}
	}
}

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
				
			
		
	

