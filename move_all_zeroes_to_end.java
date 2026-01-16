 import java.util.Scanner;

public class move_all_zeroes_to_end  {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
   for(int i=0;i<n-1;i++){
    boolean swap=false;
    for(int j=0;j<n-i-1;j++){
      if(arr[j]==0){
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
        swap=true;
      }
    }
      if(!swap){
        break;
      }
   }
   for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
   }
}
}

