import java.util.Scanner;
public class Switch 
{
	public static void main(String[] args)
	{
		int a=0;
		Scanner sc =new Scanner(System.in);
		System.out.print("�����룺");
		a=sc.nextInt();
		switch(a+1)
		{
			case 1:System.out.println("��һ");
			break;
			case 2:System.out.println("�ڶ�");
			break;
			case 3:System.out.println("����");
			break;
			default:System.out.println("����������");
		}
	}
}