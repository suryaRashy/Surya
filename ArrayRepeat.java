import java.util.Scanner;

public class ArrayRepeat {
	public ArrayRepeat() {
	Scanner s=new Scanner(System.in);
	System.out.println("ENter the range");
	int range=s.nextInt();
	int arr[]=new int[range];
	System.out.println("Enter "+range+" Element");
	for(int i=0;i<range;i++)
	{
		arr[i]=s.nextInt();
	}
	int min=0;
	for(int i=0;i<range;i++)
	{
		for(int j=i+1;j<range;j++)
		{
			if(arr[i]==arr[j])
			{
				min=arr[i];
			}
		}
		if(min!=0)
			break;
	}
	System.out.println(min);
	}
public static void main(String[] args) {
	ArrayRepeat ar=new ArrayRepeat();
}
}
