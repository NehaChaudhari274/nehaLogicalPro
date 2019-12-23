package PrimeNo;

public class CheckprimeorNotWhileLoop 
{
public static void main(String[] args) 
{
 int num=1,i=2;
 boolean flag=false;
 while(i<=num/2)//  2/2 =1
 {
	if(num%i==0) // 33%1==0 % sign gives reminder
	{
		flag=true;
		break;
	}
 ++i;//i=2
 }
 if(!flag)// false flag
 {
	 System.out.println(num+" is prime");
 }
 else
 {
	 System.out.println(num+"is not prime");
 }
}
}
