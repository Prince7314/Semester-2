import java.util.Scanner;
public class Extra_HeronFormula
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter sides of triangle : ");
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double c = sc.nextDouble();
	Formula triangle = new Formula(a,b,c);
	if(c<(a+b) && a<(b+c) && b<(a+c))
		{
			System.out.println("Triangle is possible");
			triangle.area();
		}	
		else{
			System.out.println("Triangle is not possible");
			
		}
		sc.close();
	}
}
class Formula{
	static double a,b,c,s;
	Formula(double a,double b,double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.s = s;
		s = (a+b+c)/2.0;
	}
	public void area()
	{
		double area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
		System.out.println("Area = "+area+"units");
	}



}
