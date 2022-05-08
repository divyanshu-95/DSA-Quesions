import java.util.*;
public class Main
{
	public static void main(String[] args) {
        int arr[]={3, 4, 1, 9, 56, 7, 9, 12},m=5;//m:students,arr:packets
        Arrays.sort(arr);//1,3,4,7,9,9,12,56
        int min=Integer.MAX_VALUE;//represent the students
        for(int i=0;i+m-1<arr.length;i++){//kitne students hai jahaa tak deni hai
            int diff=arr[i+m-1]-arr[i];//jese 3,4,7,9,9-->9-3=6
            if(diff<min){
                min=diff;
            }
        }
        System.out.println(min);
	}
}
