package baekjoon;

public class P_원소들의곱과합 {
	
	//정수가 담긴 리스트 num_list가 주어질 때, 
	//모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
	
	  public static void main(String[] args) {
		
		 
			   int[] num_list = {5, 7, 8, 3};
			   int answer = 0;
		        int gop = 1;
		        int hap = 0;
		        
		       for(int i = 0; i<num_list.length; i++) {
		    	   gop *= num_list[i];
		    	   hap += num_list[i];
		    	   
		    	   
		    	   answer = (gop < hap * hap) ? 1 : 0;
		    	 
		    	   
		       }
		        
		       System.out.println(answer);
		    }
		  
		  
	}


