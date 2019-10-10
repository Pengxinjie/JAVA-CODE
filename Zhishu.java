import java.util.Scanner;
public class Zhishu
{
	public static void main(String[] args)
	{
		//System.out.println("判断一个数是否为质数（false不是,true是）");
		int a;
		//System.out.print("请输入一个大于0的整数：");
		System.out.println("判断1到1000的整数是否为质数");
		Scanner sc=new Scanner(System.in);

		for(a=1;a<=1000;a++)
		{
			System.out.println(a+"是质数吗？（false不是，true是）                   "+zs(a));
		}
	}

	public static Boolean zs(int a)
	{
		Scanner sc=new Scanner(System.in);
		/*while(true)
		{
			if (a>=1)break;
			System.out.print("输入无效，请重新输入：");
			a=sc.nextInt();
		}*/
		if(a==1)return false;
		if(a!=1)
		{
			for (int i=2;i<a;i++)
			{
				if(a%i==0)return false;
			}
			return true;
		}
		else 
		{
			System.out.println("输入无效！");
			return false;
		}
	}
}