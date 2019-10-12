import java.util.Scanner;
public class Zs
{
	public static void main(String[] args)
	{
		System.out.println("判断1到100中的整数是否为质数；");
		//System.out.print("请输入一个正整数：");
		Scanner sc=new Scanner(System.in);
		//a=sc.nextInt();
		for(int a=1;a<=100;a++)
		{
			System.out.println(a+"是不是质数？        （true 是；false 不是）"+zs(a));
		}
		//System.out.println(a);
	}
	public static Boolean zs(int a)
	{
		if(a==1)return false;
		else 
		{
			for(int i=2;i<a;i++)
			{
				if(a%i==0)return false;
			}
		}
		return true;
	}
}
