import java.util.Scanner;
public class Zs
{
	public static void main(String[] args)
	{
		System.out.println("�ж�1��100�е������Ƿ�Ϊ������");
		//System.out.print("������һ����������");
		Scanner sc=new Scanner(System.in);
		//a=sc.nextInt();
		for(int a=1;a<=100;a++)
		{
			System.out.println(a+"�ǲ���������        ��true �ǣ�false ���ǣ�"+zs(a));
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
