import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int t=sc.nextInt();
    int flag=0;
    int index=-1;
    for(int i=0;i<n;i++){
        if(arr[i]==t){
            flag=1;
            index=i;
            break;
        }
    }
    if(flag==1){
        System.out.println(index);
    }
    else System.out.println("Not found");
}
}