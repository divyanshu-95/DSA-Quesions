public class Main
{
	public static void main(String[] args) {
        int arr[]={5, 6, 7, 8, 9, 10, 1, 2, 3},g=-1;//g is for index
        for(int i=0;i<arr.length;i++){
            if(arr[i]==30){//key==30
                g=i;
                break;
            }
        }
        if(g==-1){
            System.out.println("not pr");
        }else{
            System.out.println("pr at "+g);
        }
	}
}
