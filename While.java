import java.util.Scanner;//引入扫描器功能
public class While
{
	public static void main(String[] args)
	{
	Scanner sc =new Scanner(System.in);	//创建一个扫描器

	System.out.print("请输入一个数值（<20）:");
	int a;//就代表键盘上输入的数值
	a=sc.nextInt();		
		while(true)//括号内只能填boolean值，true or flase，或者是表达式，表达式的结果为Boolean值；
		{	

			System.out.print(a++);
			if(a==20)
			break;//竟然和c一样！！！
		}
	}
}