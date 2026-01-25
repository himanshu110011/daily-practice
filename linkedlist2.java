class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
public class linkedlist2{
    Node head=null;
    void addFirst(int d){
     Node newNode=new Node(d);
     if(head==null){
        head=newNode;
        return;
     }
     newNode.next=head;
     head=newNode;
        }
    void display(){
     if(head==null){
        System.out.println("no element in the list");
        return;
     }
     Node temp=head;
     while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
     }
    }
    void addMid(int d,int ele){
        Node newNode=new Node(d);
     if(head==null){
        head=newNode;
        return;
     }
     Node temp=head;
     while(temp.data!=ele && temp.next!=null){
        temp=temp.next;
     }
     if(temp.data==ele && temp!=null){
        newNode.next=temp.next;
        temp.next=newNode;
     }
     else{
        System.out.println("element not found");
     }
    }
    void addLast(int d){
     Node newNode=new Node(d);
     if(head==null){
        head=newNode;
        return;
     }
     Node temp=head;
     while(temp.next!=null){
        temp=temp.next;
     }
     temp.next=newNode;
    }
    public static void main(String[] args) {
        linkedlist2 l=new linkedlist2();
        l.addFirst(5);
        l.addFirst(20);
        l.addLast(5);
        l.addMid(4,20);
        l.display();
    }
}
