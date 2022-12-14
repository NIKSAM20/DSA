import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();

        System.out.print("Enter the size of ArrayList: ");
        int n= sc.nextInt();

        //Adding element at the end of the ArrayList using add function
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            int element=sc.nextInt();
            list.add(element);
        }

        //Getting element and print the ArrayList using get function
        System.out.println("Elements in the ArrayList are: ");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //Removing an element from a given index
        System.out.print("Enter the element index to remove: ");
        int remidx=sc.nextInt();
        list.remove(remidx);

        System.out.println(list);

        //Sorting the ArrayList
        Collections.sort(list);
        System.out.println("Sorted Arraylist: ");

        System.out.println(list);
    }
}        