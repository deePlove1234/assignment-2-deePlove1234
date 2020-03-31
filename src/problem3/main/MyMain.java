/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;

import java.util.Scanner;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MyPriorityQueue obj=new MyPriorityQueue();
        System.out.print("For Inserting press 1, for Dequeue press 2, for traversing press3, for print number of elements press 4:- ");
        int counter = sc.nextInt();
        while (counter!=0){
            switch( counter ){
                case 1:
                    System.out.print("Enter element you want to enter:- ");
                    obj.enqueue(sc.nextInt());
                    break;
                case 2:
                    Node result=obj.dequeue();
                    if(result!=null) {
                        System.out.println("The number is " + result.getData() + ". Your number is also deleted from Queue also");
                    }else{
                        System.out.println("The Queue is empty");
                    }
                    break;
                case 3:
                    obj.traversing();
                    break;
                case 4:
                    System.out.println("no of elements is "+obj.getSize());
                    break;
                default:
                    System.out.println("Please enter a valid option");
            }
            System.out.print("For Inserting press 1, for Dequeue press 2, for traversing press3, for print number of elements press 4, for exit press 0:- ");
            counter=sc.nextInt();
        }
    }
}
