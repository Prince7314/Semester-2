import java.util.Scanner;
public class Prime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean flag=true;
		System.out.print("Enter an integer : ");
		int a = sc.nextInt();
		int i;
		for(i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Is Prime");
		}
		else
		{
			System.out.println("Is not Prime");
		}
		sc.close();
	}
}
