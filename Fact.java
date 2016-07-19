public class Fact {
public static void main(String[] args) {
	int limit;
	long k=1;
	Scanner s=new Scanner(System.in);
	limit=s.nextInt();
	for(int i=1;i<=limit;i++)
	{
		 k=k*i;
	}
	System.err.println(k);
}
}
