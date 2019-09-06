//模拟登陆系统；

import java.util.Scanner;
public class Login
{
	public static void main(String[] args)
	{
		int a=750740;
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入密码：");
		int n=4;
		while(true)
		{
			a=sc.nextInt();
			if (a==750740)
			{
				System.out.println("登陆成功！");
				break;
			}
			else
			{
				n--; 
				if(n==0)break;
				System.out.print("密码不正确，请重新输入(剩余"+n+"次机会)：");					
			}
		}
		if(n==0)
		{
			System.out.println("今日次数已使用完!");
		}
	}
}