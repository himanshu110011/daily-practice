public class Queue {
    int f,r,max;
    int a[];
    Queue (int size){
     max=size;
     a=new int[size];
     f=-1;r=-1;
    }
    void enqueue(int d){
        if(r==max-1){
            System.out.println("queue is full");
            return; 
        }
        if(f==-1){
            f=r=0; 
        }
        else r++;
        a[r]=d;
       
    }
    void dequeue(){
      if(f==-1){
        System.out.println("queue is empty");
        return;
      }
      System.out.println("deleted element is : "+a[f]);
      if(f==r){
        f=r=-1;
      }
      else f++;
    }
    void display(){
        if(f==-1){
        System.out.println("queue is empty");
        return;
      }
      else {
        for(int i=f;i<=r;i++){
        System.out.print(a[i]+" ");
      }
    }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.display();
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(0);
        
        q.dequeue();
        q.display();

    }
}
