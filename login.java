//ģ���½ϵͳ��

import java.util.Scanner;
public class Login
{
	public static void main(String[] args)
	{
		int a=750740;
		Scanner sc=new Scanner(System.in);
		System.out.print("���������룺");
		int n=4;
		while(true)
		{
			a=sc.nextInt();
			if (a==750740)
			{
				System.out.println("��½�ɹ���");
				break;
			}
			else
			{
				n--; 
				if(n==0)break;
				System.out.print("���벻��ȷ������������(ʣ��"+n+"�λ���)��");					
			}
		}
		if(n==0)
		{
			System.out.println("���մ�����ʹ����!");
		}
	}
}