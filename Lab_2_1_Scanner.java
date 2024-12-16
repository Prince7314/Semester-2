import java.util.Scanner;
public class Lab_2_1_Scanner
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Sum = "+(a+b));
		sc.close();
	}
}
