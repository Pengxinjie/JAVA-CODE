import java.util.Scanner;//����ɨ��������
public class While
{
	public static void main(String[] args)
	{
	Scanner sc =new Scanner(System.in);	//����һ��ɨ����

	System.out.print("������һ����ֵ��<20��:");
	int a;//�ʹ���������������ֵ
	a=sc.nextInt();		
		while(true)//������ֻ����booleanֵ��true or flase�������Ǳ��ʽ�����ʽ�Ľ��ΪBooleanֵ��
		{	

			System.out.print(a++);
			if(a==20)
			break;//��Ȼ��cһ��������
		}
	}
}