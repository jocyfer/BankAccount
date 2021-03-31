package test;

public class BankAccount 
{
	private String Account_holder_name;
	private String BankName;
	private float available_balance;
	private int Account_no;
	
	BankAccount(String Account_holder_name,String BankName,float available_balance,int Account_no)
	{
		this.Account_holder_name = Account_holder_name;
		this.BankName = BankName ;
		if(available_balance<1000)
		{
			System.out.println("Minimum bal. cannot be less than Rs.1000");
		}
		else
		{
			this.available_balance=available_balance;
		}
		this.Account_no = Account_no;
	}
	
	void deposit(float a)
	{
		available_balance +=a;
		System.out.println("Deposit Successful");
	}
	
	void withdraw(float a)
	{
		if(a>5000)
		{
			System.out.println("Maximum withdrawal amount is Rs.5000");
		}
		else
		{
			available_balance-=a;
			System.out.println("Withdrawal Successful");
		}
	}
	void dispDetails()
	{
		System.out.println("Account Holder Name: "+Account_holder_name);
		System.out.println("Name Of Bank: "+BankName);
		System.out.println("Available Balance: "+available_balance);
		System.out.println("Account No: "+Account_no);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BankAccount obj= new BankAccount("Jovy Fernandes","Canara Bank",50000,19121);
		obj.dispDetails();

		
	}

}
