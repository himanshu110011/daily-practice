import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(  int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pos=sc.nextInt();
        int val=sc.nextInt();
        int arrn[]=new int[n+1];
        for(int i=0;i<pos;i++){
            arrn[i]=arr[i];
        }
        arrn[pos]=val;
        for(int i=pos;i<n;i++){
            arrn[i+1]=arr[i];
        }
        for(int i=0;i<n+1;i++){
            System.out.print(arrn[i]+" ");
        }

    }
}
