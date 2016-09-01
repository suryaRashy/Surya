public class Index{
	Scanner s=new Scanner(System.in);
	void IndexChecker()
	{
		int flag=0;
		System.out.println("Enter the range");
		int range=s.nextInt();
		System.out.println("Enter "+range+" element");
		int arr[]=new int[range];
		for(int i=0;i<range;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<range;i++)
		{
			if(i==arr[i])
			{
				System.out.println("Index and values are same:"+i);
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("no match");
		}
	}
public static void main(String[] args) {
	Guvi g=new Guvi();
	g.IndexChecker();
}
}
