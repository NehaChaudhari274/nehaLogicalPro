package PrimeNo;

public class CheckPrimeOrNotForLoop 
{
public static void main(String[] args) {
	int number=28;
	boolean flag=false;
	for(int i=2;i<=number/2;i++)
	{
	 
		if(number % i==0)
		{
			 flag=true;
			break;
		}
	}
		if(flag=false)//or you write as if (!flag)
	
			System.out.println(number+"number is prime");
		
		else
		
			System.out.println(number+"number is not prime");
		
	
	//System.out.println("hi");
}
	
}
