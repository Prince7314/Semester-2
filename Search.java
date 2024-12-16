import java.util.Scanner;
public class Search
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {2,4,6,8,10,12,14,16,18,20};
		System.out.print("Enter value you want to search : ");
		int n = sc.nextInt();
		int high = 9,low = 0;
		int i=0;
		int mid = (high+low)/2;
		System.out.println("Binary Search");
		while(high>low)
		{
			System.out.print("*");
			if(n>arr[mid])
			{
				low = mid;
				mid = (high+low)/2;
			}
			else if(n<arr[mid])
			{
				high = mid;
				mid = (high+low)/2;
			}
			else if(n==arr[mid])
			{
				System.out.println("The enetered value is at "+mid);
				System.out.print(" element");
				break;
			}
		}
		System.out.print("\n");
		System.out.println("Linear Search");
		for (i=0;i<10;i++)
		{
			System.out.print("*");
			if(n==arr[i])
			{
				System.out.println("The entered value is at "+i);
				System.out.print(" element");
				break;
			}
		}
		sc.close();
	}
}
