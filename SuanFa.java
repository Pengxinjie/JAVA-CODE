//  计算m加到x的值;

import java.util.Scanner;
public class SuanFa
{
	public static void main(String[] args)
	{
		int a=1;
		int sum=0;
		int x=0;
		int m=0;		
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入您的初始数字：");
		m=sc.nextInt();
		System.out.print("请输入您想要加到的数字：");
		x=sc.nextInt();
		for (a=m;a<=x;a++)
		{
			sum=sum+a;
		}
		System.out.println("从"+m+"加到"+x+"的值为"+sum);
	}
} 