package logical;

import java.util.Scanner;

public class ArrayTarget {
	public ArrayTarget() {
		Scanner s=new Scanner(System.in);
	System.out.println("Enter the range");
	int range=s.nextInt();
	int arr[]=new int[range];
	System.out.println("Enter "+range+"Element:");
	for(int i=0;i<range;i++)
	{
		arr[i]=s.nextInt();
	}
	System.out.println("Enter the target");
	int target=s.nextInt();
	String str="";
	for(int i=0;i<range;i++)
	{
		for(int j=i+1;j<range;j++)
		{
			if((arr[i]+arr[j])==target)
			{
				str=arr[i]+" "+arr[j];
			}
		}
	}
	System.out.println(str);
	}
public static void main(String[] args) {
	ArrayTarget at=new ArrayTarget();
}
}
