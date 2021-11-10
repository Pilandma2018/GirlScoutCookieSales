package LYT.GirlScout;
import java.util.*;
public class CookieSales {
	public static void main( String[] args ) {
		
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of girl scout members: ");
		i=sc.nextInt();
		int[] boxArray = new int[i];
		int[] categoryArray = new int[5];
		System.out.println("Enter the amount of boxes sold: ");
		for(int j=0; j<i; j++)
			{
			boxArray[j] = sc.nextInt();
	if((boxArray[j]>=0) && (boxArray[j]<=10)) {
		categoryArray[0]++;
		System.out.println("Boxes sold between 0 and 10: " + categoryArray[0]);
	}else if(boxArray[j] <=20) {
		categoryArray[1]++;
		System.out.println("Boxes sold between 11 and 20: " + categoryArray[1]);
	}else if(boxArray[j] <=30) {
		categoryArray[2]++;
		System.out.println("Boxes sold between 21 and 30: " + categoryArray[2]);
	}else if(boxArray[j] <= 40) {
		categoryArray[3]++;
		System.out.println("Boxes sold between 31 and 40: " + categoryArray[3]);
	}else if (boxArray[j] >=41) {
		categoryArray[4]++;
		System.out.println("Boxes sold over 40: " + categoryArray[4]);
	}
	
			

}
	}
}

