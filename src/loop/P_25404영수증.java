package loop;

import java.util.Scanner;

public class P_25404영수증 {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);

	        int total =  sc.nextInt();
	        int count = sc.nextInt();

	        for(int i = 0; i< count; i++){
	            int price = sc.nextInt();
	            int num = sc.nextInt();

	            total = total - (price * num);
	          
	        }
	        System.out.println(count);
	        
	        /*
	        if(total == 0) System.out.println("Yes");
	        else System.out.println("No");
*/

	    }
}
