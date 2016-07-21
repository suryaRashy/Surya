public class Flow1 {
	Scanner s=new Scanner(System.in);
	void palindrome()
	{
		int digit,reverse=0;
		System.out.println("Enter the Number");
		int num=s.nextInt();
		int num1=num;
			while(num>0)
			{
				digit=num%10;
				num=num/10;
				reverse=digit*10+digit;
			}
			if(num1==reverse)
			{
          System.out.println("palindrome");
			}
		else
			System.out.println("Not a Palindrome");
	}
	public static void main(String[] args) {
Flow1 f=new Flow1();
f.palindrome();
	}

}
