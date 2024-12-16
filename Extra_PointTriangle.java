import java.util.Scanner;
public class Extra_PointTriangle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coordinates of point 1 : ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter coordinates of point 2 : ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		System.out.println("Enter coordinates of point 3 : ");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		System.out.println("Enter coordinates of point you want to find : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		Triangle a1 = new Triangle(x,y,x1,y1,x2,y2);
		Triangle a2 = new Triangle(x,y,x1,y1,x3,y3);
		Triangle a3 = new Triangle(x,y,x2,y2,x3,y3);
		Triangle a = new Triangle(x1,y1,x2,y2,x3,y3);
		if((a1.Area()+a2.Area()+a3.Area())==a.Area())
		{
			return 1;
		}
		else{
			return 0;
		}

	}
}
class Triangle{
	int x1,y1,x2,y2,x3,y3;
	double dist;
	public Triangle(int x1,int y1,int x2,int y2,int x3,int y3)
	{
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}
	public double Area()
	{
		double area = 0.5*Math.abs((x1*(y2-y3)-x2*(y3-y1)+x3*(y1-y2)));
		return area;
	}
}
