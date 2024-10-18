package exception_Handling;


class ATM implements Bank
{
	int accbal=2000;
	@Override
	public  void deposit(int amount)
	{
		
		
		//System.out.println("Enter amount to deposit");
	    
		if(amount>0)
		{
			amount=amount+accbal;
			System.out.println(" deposited amount: "+amount);
			System.out.println("successfully deposited");
		}
		else
		{
			//System.out.println("enter valid amount");
			try
			{
				throw new NegativeValuedException();
			}
			catch(NegativeValuedException e)
			{
				System.out.println("enter valid amount");
			}
		}
	}
	@Override
	
		public void withDraw(int amount)
		{
		//System.out.println("Enter withdraw amount");
		
		if(amount<accbal)
		{
			amount=accbal-amount;
			System.out.println("the withdrawal amount : "+amount);
			System.out.println("the remaining balance "+amount);
		}
		else
		{
			//System.out.println("withdrawal not possible");
			try
			{
				throw new InsufficientBalanceException();
			}
			catch(InsufficientBalanceException e)
			{
				System.out.println("Enter valid amount to withdraw");
			}
		}
		
			
		}
	
	@Override
	public void showBalance() {
		System.out.println(accbal);
		// TODO Auto-generated method stub
		
	}
}



