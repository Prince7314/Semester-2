import java.util.Scanner;
public class Time{
	int hour;
	int minute;
	public Time(int hour,int minute)
	{
			this.hour = hour;
			this.minute = minute;
	}
	public Time add(Time time2)
	{
		int sumHour = this.hour+time2.getHour();
		int sumMinute = this.minute+time2.getMinute();
		if(sumMinute>=60)
		{
			sumHour+=sumMinute/60;
			sumMinute%=60;
		}
		return new Time(sumHour,sumMinute);
	}
	public int getHour()
	{
		return hour;
	}
	public int getMinute()
	{
		return minute;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hour of t1 : ");
		int hour1 = sc.nextInt();
		System.out.println("Enter minute of t1 : ");
		int minute1 = sc.nextInt();
		System.out.println("Enter hour of t2 : ");
		int hour2 = sc.nextInt();
		System.out.println("Enter minute of t2 : ");
		int minute2 = sc.nextInt();
		Time t1 = new Time(hour1,minute1);
		Time t2 = new Time(hour2,minute2);
		Time t3 = t1.add(t2);
		System.out.println("Sum =  "+t3.getHour()+" hours, "+t3.getMinute()+" minutes");
		sc.close();
	}
}
