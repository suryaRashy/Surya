public class Pri {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int p=s.nextInt();
	int prime=0,k;
	//k=p/2;
	for(int i=2;i<p/2;i++)
	{
		if(p%i==0)
			prime=1;
	}
	if(prime==0)
		System.out.println("prime");
	else
		System.out.println("not a prime");
}
}
