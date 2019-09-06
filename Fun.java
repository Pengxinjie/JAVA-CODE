//加法函数
import java.util.Scanner;
public class Fun
{
	public static void main(String[] args)
	{
		int a=0,b=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入您的第一个数：");
		a=sc.nextInt();
		System.out.print("请输入您的第二个数：");
		b=sc.nextInt();
		System.out.println(a+"+"+b+"的结果是"+Jia(a,b));
	}	
	public static int Jia(int a,int b)
	{
		return a+b;
	}
}