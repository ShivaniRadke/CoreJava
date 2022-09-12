package oops;

public class BOABank extends Bank
{
	public int CreditCardNum;
	
	public void CCBalance()
	{
		System.out.println("Inside CCBalance");
		
		this.CreditCardNum=1000;
		super.AccountNum=2772;
		this.AccountNum=3242;
	}
}
