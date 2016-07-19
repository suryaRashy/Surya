public class Pyramid1 {

	 public static void main(String[] args)
	 {
	Scanner scr=new Scanner(System.in);
	int num=scr.nextInt();
	int x=1,y=0;
	for(int i=1;i<=num;i++){
		y=x;
		for(int j=i;j<num;j++){
			System.out.print("  ");
		}
		for(int k=1;k<=i;k++){
			System.out.print(y);
			y++;
			if(y>9){
				y=0;
			}
		}
		x=y;
		y--;
		for(int m=1;m<i;m++){
			y--;
			if(y<0){
				y=9;
			}System.out.print(y);
		}
		System.out.println();
	}
	
	
	 }
