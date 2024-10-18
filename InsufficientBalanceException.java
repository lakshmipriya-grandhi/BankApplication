package exception_Handling;

public class InsufficientBalanceException extends RuntimeException
{
	public String toString()
	{
		return getClass()+": insufficient amount";
	}
}
