import java.util.*;

public class binarysearch {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    int t=sc.nextInt();
    int low=0;
    int high=n-1;
    int flag=0;
    int index=-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(arr[mid]==t){
            flag=1;
            index=mid;
            break;
        }
        if(t<arr[mid]){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    if(flag==1){
        System.out.println(index);
    }
    else
        System.out.println("Not found");
    
}
}

