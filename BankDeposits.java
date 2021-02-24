import java.io.*;
class Bank
{
	String accno,name;
	int bal;
	Bank(String n,String actno,int b)
	{
		name=n;
		accno=actno;
		bal=b;
	}
	void deposit(int amt)
	{
		bal=bal+amt;
		System.out.println("amount deposited");
	}
	void withdraw(int amt)
	{
	if((bal-amt)<1000)
	{
		System.out.println("withdraw deined");
	}
	else
	{
		bal=bal-amt;
		System.out.println("withdraw successful");
	}
	}
	void display()
	{
		System.out.println("account details");
		System.out.println("account holder name:"+name);
		System.out.println("account number:"+accno);
		System.out.println("account balance"+bal);
	}
}
class BankDeposits
{
	public static void main(String args[])throws IOException
	{
		String actno,name;
		int ch,bamt;
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("enter the account holder name:");
		name=in.readLine();
		System.out.println("enter the account number");
		actno=in.readLine();
		System.out.println("enter the intial balance");
		bamt=Integer.parseInt(in.readLine());
		Bank obj=new Bank(name,actno,bamt);
		do
		{
			int a,b;
			System.out.println("**********MENU*************");
			System.out.println("1.Deposits");
			System.out.println("2.Withdraw");
			System.out.println("3.Display");
			System.out.println("enter your choices");
			ch=Integer.parseInt(in.readLine());
			switch(ch)
			{
				case 1:System.out.println("amount desposited");
					a=Integer.parseInt(in.readLine());
					obj.deposit(a);
					break;
				case 2:System.out.println("amount withdraw");
					b=Integer.parseInt(in.readLine());
					obj.withdraw(b);
					break;
				case 3:obj.display();
					break;
			}
		}while(ch>=0&&ch<=4);
	}
}

				

