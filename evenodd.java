import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        
    
     Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(  int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ec=0;//even-count
        int oc=0;//odd-count
        for(int i:arr){
            if(i%2==0) ec++;
            else oc++;
        }
        System.out.println("total even numbers are: "+ec);
        System.out.println("total odd numbers are: "+oc);
}
}
