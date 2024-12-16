import java.util.Scanner;
public class MaxOf3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 3 numbers");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		if(i>j)
		{
			if(i>k)
			{
				System.out.println("Maximum = "+i);
			}
			else
			{
				System.out.println("Maximum = "+k);
			}
		}
		else if(j>k)
		{
			System.out.println("Maximum = "+j);
		}
		else
		{
			System.out.println("Maximum = "+k);
		}
		sc.close();
	}
}
