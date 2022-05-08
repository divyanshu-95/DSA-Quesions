public class Main
{
	public static void main(String[] args) {
        int arr[]={5,4,-1,7,8};
        int max=Integer.MIN_VALUE;
        int curr=0;
        for(int i:arr){
            if(curr<0){
                curr=0;
            }
            curr+=i;
            max=Math.max(max,curr);
        }
        System.out.println(max);
	}
}
