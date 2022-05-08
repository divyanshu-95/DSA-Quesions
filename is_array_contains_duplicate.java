import java.util.*;
public class Main
{
	public static void main(String[] args) {
        int arr[]={1,2,3,4};
        Arrays.sort(arr);
        int c=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                c++;
            }
        }
        if(c>0){
            System.out.println("duplicate exist");
        }else{
            System.out.println("duplicate not exist");
        }
	}
}
