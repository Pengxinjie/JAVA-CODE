import java.util.Scanner;
public class Zhishu
{
	public static void main(String[] args)
	{
		//System.out.println("�ж�һ�����Ƿ�Ϊ������false����,true�ǣ�");
		int a;
		//System.out.print("������һ������0��������");
		System.out.println("�ж�1��1000�������Ƿ�Ϊ����");
		Scanner sc=new Scanner(System.in);

		for(a=1;a<=1000;a++)
		{
			System.out.println(a+"�������𣿣�false���ǣ�true�ǣ�                   "+zs(a));
		}
	}

	public static Boolean zs(int a)
	{
		Scanner sc=new Scanner(System.in);
		/*while(true)
		{
			if (a>=1)break;
			System.out.print("������Ч�����������룺");
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
			System.out.println("������Ч��");
			return false;
		}
	}
}