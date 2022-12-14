/* Reverse of a Linked List using Iterative Method */

public class LinkedList3 {
    static Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next=null;
        }
    }


    //Insertion at the beginning
    public void insBeg(int data){
        Node fresh=new Node(data);
        if(head==null){
            head= fresh;
            return;
        }

        fresh.next= head;
        head= fresh;
    }


    //Insertion at the end
    public void insEnd(int data){
        Node fresh= new Node(data);
        if(head==null){
            head=fresh;
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next=fresh;
    }


    //Printing the list
    public void traverse(){
        if(head==null){
            System.out.println("No data in the list");
        }

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    //Reverse the Linked List
    public void reverse(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode =head;
        Node currNode =head.next;

        while(currNode != null){
            Node nextNode=currNode.next;
            currNode.next= prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;

        }
        head.next=null;
        head=prevNode;
    }

    public static void main(String args[]) {
        
        LinkedList3 list=new LinkedList3();
        
        list.insEnd(5);
        list.insEnd(10);
        list.insEnd(15);
        list.insEnd(20);

        System.out.println("Original LinkedList: ");
        list.traverse();

        list. reverse();
        System.out.println("Reversed LinkedList: ");
        list.traverse();
    }
}