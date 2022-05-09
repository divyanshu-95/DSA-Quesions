public class Main
{
	public static void main(String[] args) {
	    int arr[]={7,6,4,3,1};
	    int max=0,min=arr[0];
	    for(int i=0;i<arr.length;i++){
	        min=Math.min(min,arr[i]);
	        int profit=arr[i]-min;
	        max=Math.max(max,profit);
	    }
        System.out.println(max);
	}
}
