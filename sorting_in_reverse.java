import java.util.Scanner;

public class sorting_in_reverse {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<n-1;i++){
        boolean sorted=true;
        for(int j=0;j<n-i-1;j++){
            if(arr[j]<arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                sorted=false;
            }
        }
        if(sorted) break;
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}
}
