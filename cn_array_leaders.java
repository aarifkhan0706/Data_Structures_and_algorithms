
public class cn_array_leaders {
	public static void main(String[] args) {
	   int[] input= {3,12,34,2,0,-1};
	   int max_from_right=input[input.length-1];
       System.out.print(max_from_right+" ");
       for(int i=input.length-2; i>=0; i--){
           if (max_from_right<=input[i]){
           	   max_from_right=input[i];
               System.out.print(max_from_right+" ");
           }
       }

	}

}
