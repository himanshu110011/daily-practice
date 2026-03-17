
public class stack {
    int max,top;
    int a[];
   stack(int size){
    max=size;
    a=new int[max];
    top=-1;
   }
   void push(int x){
    if(top==max-1){
        System.out.println("stack overflow");
    }
    else{
        top++;
        a[top]=x;
    }
    
   }
   void pop(){
    if(top==-1){
        System.out.println("stack underflow");
    }
    else{
        System.out.println("deleted element : "+a[top]);
        top--;
    }
    }
    void peek(){
        if(top==-1){
            System.out.println("stack is empty");
        }
        else{
            System.out.println("top element: "+a[top]);
        }
    }
    void display(){
      if(top==-1){
        System.out.println("stack underflow");
      }
      else{
        for(int i=top;i>=0;i--){
            System.out.print(a[i]+" ");
        }
      }
    }
    public static void main(String[] args) {
        stack s=new stack(5);
        s.push(9);
        s.push(8);
        s.push(10);
        s.pop();
        s.display();
        s.peek();

    }
}
