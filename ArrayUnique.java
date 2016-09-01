import java.util.ArrayList;
import java.util.Scanner;

public class ArrayUnique {
	public ArrayUnique() {
	Scanner s=new Scanner(System.in);
    System.out.println("Enter the range");
    int range=s.nextInt();
    int arr[]=new int[range];
    ArrayList<Integer> al1=new ArrayList<Integer>();
    System.out.println("Enter "+range+" Element");
    for(int i=0;i<range;i++)
    {
    	arr[i]=s.nextInt();
    	al1.add(arr[i]);
    }
    int count=0;
    ArrayList<Integer> al=new ArrayList<Integer>();
    for(int i=0;i<al1.size();i++)
    {
    	count=0;
    	for(int j=i+1;j<al1.size();j++)
    	{
   		   if(al1.get(i)==al1.get(j))
   		   {
   			count++;
   			al1.remove(j);
   		   }
    	}
    	al.add(count);
    }
    int min=0;
    System.out.println(al);
    for(int i=0;i<al.size();i++)
    {
    	if(al.get(i)==0)
    	{
    		min=al1.get(i);
    		break;
    	}
    }
    System.out.println(min);
	}
public static void main(String[] args) {
	ArrayUnique au=new ArrayUnique();
}
}
