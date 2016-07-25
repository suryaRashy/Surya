import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the String:");
String str=s.next();
String str1=" ";
for( int i = str.length() - 1 ; i >= 0 ; i-- )
{
	str1=str1+str.charAt(i);
}
str1=str1.trim();
System.out.println(str1);
	}

}
