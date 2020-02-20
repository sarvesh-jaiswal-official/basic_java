import java.io.*;
class Account 
{
	int accno;
	String accname;
	double balance, new_bal;
	
	Account(int accno, String accname, double balance) 
	{
		this.accno = accno;
		this.accname = accname;
		this.balance = balance;
	}
	void deposite(double deposit_amount) 
	{
		balance = balance+deposit_amount;
		System.out.println("Your new available balance: "+balance);
	}
	void withdraw(double amount) 
	{
		if(balance >= amount) 
		{
			balance = balance-amount;
			System.out.println("Your current balance: "+balance);
		} 
		else 
		{
			System.out.println("Insufficient balance.");
		}
	}
	
	public static void main(String args[]) 
	{
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		Account a;
		double amount, bal;
		try 
		{
			System.out.println("\nEnter the account name, account number and balance");
			String a_name = bin.readLine();
			int a_no = Integer.parseInt(bin.readLine());
			bal = Double.parseDouble(bin.readLine());
			a = new Account(a_no, a_name, bal);
			System.out.println("\nEnter=>\n1.For depositing \n2.For withdrawal");
			int option = Integer.parseInt(bin.readLine());
			switch(option) 
			{
				case 1:
						System.out.println("Enter the amount to deposite");
						amount = Double.parseDouble(bin.readLine());
						a.deposite(amount);
						break;
				case 2:
						System.out.println("Enter the amount to withdraw");
						amount = Double.parseDouble(bin.readLine());
						a.withdraw(amount);
						break;
				default:
						System.out.println("Enter a valid option");
						break;
			}
		}
		catch(Exception e) 
		{
			System.out.println("Exception caught"+e);
		}
	}
}