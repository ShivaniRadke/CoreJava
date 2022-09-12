package oops;

public class RunnerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
        Employee E1 = new Employee();
		
		E1.Name = "Mike";
		E1.EmpId = 1000;
		E1.Department = "HR";
		E1.Display();
		
		Employee E2 = new Employee("Jack", 1001, "Finance");
		E2.Display();
		
		Bank B = new Bank();
		
		B.DisplayBalance();
		int Bal = B.GetBalance();
		B.AccountNum = 500;
		
		System.out.println("The Balance is " + B.GetBalance());
		System.out.println("The Balance is " + Bal);
		
		BOABank B1 = new BOABank();
		
		B1.CCBalance();
		B1.DisplayBalance();
		B1.AccountNum =100;
		
		//Overloading Example
		
		OverLoadingExample obj =new OverLoadingExample();
		
		int RecArea = obj.GetArea(3, 4);
		
		int SqArea = obj.GetArea(4);
		
		System.out.println("Area of Rectangle = "+ RecArea);

		System.out.println("Area of Square = "+ SqArea);
		
		//Overriding Example
		
		B1.CloseAccount(45354);
		B.CloseAccount(66677);
		
		////////
		
		Chrome ch=new Chrome();
		ch.openBrowser();
		ch.show();
		
		Browser Br=new Chrome();
		Br.openBrowser();
		Br.closeBrowser();
		Br.displayName();
		
		//Interface Example
		
		HondaCar car1= new HondaCar();
		CarInterface car2=new HondaCar();
		
		//Encapsulation Example
		
		EncapsulationEx En =new EncapsulationEx();
		En.setBalance(1872);
		System.out.println(En.getBalance());

	}

}
