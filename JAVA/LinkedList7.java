/* Checking if a LinkedList is Pallindrome */

import java.util.*;

public class LinkedList7 {
    static Node head;    

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
            this.next=null;
        }
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

    public Node reverse(Node head){
        Node prev=null;
        Node curr= head;

        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public Node findMiddle(Node head){
        Node hare=head;
        Node turtle=head;
        
        while(hare.next!=null || hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;        
        }
        return turtle;
    }

    public boolean isPalindrome(Node head){
        if(head== null || head.next==null){
            return true;
        }
        Node middle= findMiddle(head); //end of first half
        Node secondHalfStart= reverse(middle.next);
        
        Node firstHalfStart= head;
        while(secondHalfStart!= null){
            if(firstHalfStart.data!= secondHalfStart.data){
            return false;
            }

            firstHalfStart=firstHalfStart.next;
            secondHalfStart=secondHalfStart.next;
        }
        return true;
    }
  
    
    public static void main(String args[]) {

        Scanner sc= new Scanner(System.in);
        LinkedList7 list=new LinkedList7();
        
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();

        System.out.println("Enter the elements: ");
        while(n>0){
            int element = sc.nextInt();

            list.insEnd(element);
            n--;
        }
        list.traverse();
        if(list.isPalindrome(head)==true){
            System.out.println("LinkedList is pallindrome");
        }
    }
}