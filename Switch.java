import java.util.Scanner;
public class Switch 
{
	public static void main(String[] args)
	{
		int a=0;
		Scanner sc =new Scanner(System.in);
		System.out.print("请输入：");
		a=sc.nextInt();
		switch(a+1)
		{
			case 1:System.out.println("第一");
			break;
			case 2:System.out.println("第二");
			break;
			case 3:System.out.println("第三");
			break;
			default:System.out.println("请重新输入");
		}
	}
}