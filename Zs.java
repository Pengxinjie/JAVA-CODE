import java.util.Scanner;

public class Zs
{
	public static boolean ZS(int a)
	{
		if (a==1)return false;
		else
		{
			int i=2;
			int b=0;
			while(i<a)
			{
				b=a%i;
				if (b==0)
				{
					return false;
				} 
				i++;
			}
			if (b!=0);
			{
				return true;
			}
		}
	}
	public static void main(String[] args)
	{
		boolean d=true;
		for(int s=1;s<=100;s++)
		{
			System.out.print(s);
			d=ZS(s);
			System.out.print("\t");
			System.out.println(d);
		}
	}
}