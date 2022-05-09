import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[]={4,4,5,6,7,9},a=0,b=0;
	    Arrays.sort(arr);
	    for(int i=0;i<arr.length-1;i++){
	        if(arr[i]==arr[i+1]){
	            a=arr[i];
	        }
	    }
	    System.out.println(a);
	    for(int i=0;i<arr.length-1;i++){
	        int c=arr[i];
	        int d=arr[i+1];
	        if(c!=(d-1)){
	            b=d-1;
	        }
	    }
	    System.out.println(b);
	    int arr1[]={a,b};
	    for(int i=0;i<arr1.length;i++){
	        System.out.println(arr1[i]);
	    }
	}
}
