//  ����m�ӵ�x��ֵ;

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
		System.out.print("���������ĳ�ʼ���֣�");
		m=sc.nextInt();
		System.out.print("����������Ҫ�ӵ������֣�");
		x=sc.nextInt();
		for (a=m;a<=x;a++)
		{
			sum=sum+a;
		}
		System.out.println("��"+m+"�ӵ�"+x+"��ֵΪ"+sum);
	}
} 