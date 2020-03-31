/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {
    Node front;
    Node rear;
    int size;
    public MyCircularQueue(){
        front=null;
        rear=null;
        size=0;
    }

    public boolean isEmpty(){
        boolean response=false;
        if(size==0){
            response=true;
        }
        return response;
    }

    public void enqueue(Student element){
        Node node=new Node(element);
        if(front==null){
            front=node;
            rear=node;
            rear.setNext(front);
            size++;
            System.out.println("Value successfully appended");
        }
        else{
            rear.setNext(node);
            rear=node;
            rear.setNext(front);
            size++;
            System.out.println("Value successfully appended");
        }
    }

    public Node dequeue(){
        Node response=null;
        if(front!=null){
            if(front.getNext()!=front){
                response=new Node(front.getData());
                front=front.getNext();
                rear.setNext(front);
                size--;
            }
            else{
                response=new Node(front.getData());
                front=null;
                rear=null;
                size--;
            }
        }
        return response;
    }

    public Node peek(){
        Node response=null;
        if(front!=null && rear!= null){
            response=new Node(front.getData());
        }
        return response;
    }
    public int size(){
        return size;
    }
}
