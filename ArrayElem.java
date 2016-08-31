public class ArrayElem {
	public ArrayElem() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array range and Element:");
		int range=s.nextInt();
		int arr[]=new int[range];
		int total=0;
		for(int i=0;i<range;i++)
		{
			arr[i]=s.nextInt();
			total+=arr[i];
		}
		int average=total/range;
		System.out.println(average);
	}
public static void main(String[] args) {
	ArrayElem ae=new ArrayElem();
}
}
