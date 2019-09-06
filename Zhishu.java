import java.util.Scanner;
public class Zhishu
{
	public static boolean zs(int a)
	{
		if (a==1)
		{
			return false;
		}
		else
		{
			int i=0;
			for(i=a-1;i>1;i--)
			{
				int b=a%i;
				if (b==0)return false;
			}
			return true;
		}
	}
	public static void main(String[] args)
	{
		System.out.print("请输入一个数：");
		int b=0;
		Scanner sc =new Scanner(System.in);
		b=sc.nextInt();
		System.out.println(zs(b));
	}
}