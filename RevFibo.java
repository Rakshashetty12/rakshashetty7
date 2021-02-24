import java.io.*;
public class RevFibo
{
	public static  void main(String args[])throws IOException
	{
		int ch;
		DataInputStream in=new DataInputStream(System.in);
	do
	{
		System.out.println("\n*****MENU*****\n");
		System.out.println("\n 1. Reverse and sum digit\n");
		System.out.println("\n 2.Fibonacci\n");
		System.out.println("\n 3.Exit\n");
		System.out.println("enter your choices");
		ch=Integer.parseInt(in.readLine());
		switch(ch)
		{
		case 1:int num,rem,dsum,rev;
			rev=0;
			dsum=0;
			System.out.println("enter the number");
			num=Integer.parseInt(in.readLine());
			while(num > 0)
			{
				rem=num%10;
				rev=rev*10+rem;
				dsum=dsum+rem;
				num=num/10;
			}
			System.out.println("\n sum of digit:\n"+dsum);
			System.out.println("\n reverse of a number:\n"+rev);
			break;
		case 2:int n1,n2,n3,count;
			n1=0;
			n2=1;
			System.out.println("Enter the number of element in the series");
			count=Integer.parseInt(in.readLine());
			if(count<0)
				System.out.println("invalid entry");
			else if(count==1)
				System.out.println("Fibonacci series:"+n1);
			    else
			    {
				System.out.print("fibonacci series:"+n1+"\t"+n2);
				for(int i=2;i<count;i++)
				{
					n3=n1+n2;
					System.out.print("\t"+n3);
					n1=n2;
					n2=n3;
				}
			    }
			break;
		case 3:return;
			default:System.out.println("please enter valid input");
		}
	}
	while(ch>=1&&ch<=4);
	}
}	
	                                                                                                                                                                                  