
public class cn_array {
	
	public static void main(String[]args) {
		int arr[]= {1,2,0,2,0,8};
        int temp=0;
        int k =0;
       	for(int i=0; i<arr.length; i++) {
       		if(arr[i]!=0){
                 temp=arr[k];
                 arr[k]=arr[i];
                 arr[i]=temp;
                 k=k+1;
            }
        }
        for (int elements:arr) {
        	System.out.print(elements);
        }
	}

}
