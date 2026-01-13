import java.util.*;

public class linearsearchArraylist {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       ArrayList <Integer>arr=new ArrayList<>();
       int n=sc.nextInt();
       for(int i=0;i<n;i++){
        arr.add(sc.nextInt());
       } 
       int t=sc.nextInt();
       int r=arr.indexOf(t);
       if(r==-1){
        System.out.println("Not found");
       }
       else 
        System.out.println(r);
       
    }
}
