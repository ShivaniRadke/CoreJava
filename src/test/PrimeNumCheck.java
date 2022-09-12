package test;

public class PrimeNumCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int num = 12;
		boolean flag=true;
		
		for(int index=2;index<num;index++) 
		{
			
			int rem = num%index;
			
			if(rem==0) 
			{
				
				System.out.println("Num is not Prime");
				flag = false;
				break;
            }

        }
    }
}
