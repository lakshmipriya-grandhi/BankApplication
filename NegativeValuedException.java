package exception_Handling;

public class NegativeValuedException extends RuntimeException
{
	public String toString()
	{
		return getClass()+" : you entered invalid deposit amount";
	}
}
