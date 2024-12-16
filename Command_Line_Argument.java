public class Command_Line_Argument
{
	public static void main(String[] args)
	{
		String s = new String();
		for(int i=0;i<args.length;i++)
		{
			s += args[i];
		}
		System.out.println(s);
	}
}
