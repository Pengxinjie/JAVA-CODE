//�ӷ�����
import java.util.Scanner;
public class Fun
{
	public static void main(String[] args)
	{
		int a=0,b=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("���������ĵ�һ������");
		a=sc.nextInt();
		System.out.print("���������ĵڶ�������");
		b=sc.nextInt();
		System.out.println(a+"+"+b+"�Ľ����"+Jia(a,b));
	}	
	public static int Jia(int a,int b)
	{
		return a+b;
	}
}