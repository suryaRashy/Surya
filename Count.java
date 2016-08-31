public class Count {
	public void countString()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		String str1[]=str.split(" ");
		int count=0;
		for(int i=0;i<str1.length;i++)
		{
			count++;
		}
		System.out.println(count);
	}
public static void main(String[] args) {
	Count c=new Count();
	c.countString();
}
}
