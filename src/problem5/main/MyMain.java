/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.node.Node;
import problem5.student.Student;

import java.util.Scanner;

//executable class
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue();
        Scanner sc=new Scanner(System.in);
        System.out.print("Press 1 for enqueue, press 2 for dequeue:- ");
        int counter=sc.nextInt();
        sc.nextLine();
        while(counter!=0) {
            switch (counter) {
                case 1:
                    System.out.print("Enter Name:- ");
                    String name = sc.nextLine();
                    System.out.print("Enter roll number:- ");
                    int roll = sc.nextInt();
                    System.out.print("Enter Backlog:- ");
                    int back = sc.nextInt();
                    Student stu = new Student(roll, name, back);
                    obj.enqueue(stu);
                    break;
                case 2:
                    if(obj.peek().getData().getBacklog()==0||obj.peek().getData().getCount()==2){
                       Node temp= obj.dequeue();
                        System.out.println("Removed Student Detail");
                        System.out.println("Name:-"+temp.getData().getName());
                        System.out.println("Roll no:-"+temp.getData().getRollno());
                    }
                    else{
                        System.out.println("Student detail can't be removed.it will be appended again");
                        Node temp=obj.dequeue();
                        temp.getData().getINX();
                        obj.enqueue(temp.getData());
                    }
                    break;

            }
            System.out.print("Press 1 for enqueue, press 2 for dequeue:- ");
            counter=sc.nextInt();
            sc.nextLine();
        }
    }
}
