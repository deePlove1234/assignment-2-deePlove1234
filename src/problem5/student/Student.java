/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
    private int rollno;
    private String name;
    private int backlog;
    private int count;
    //Constructor
    public Student(int rollno, String name, int backlog) {
        this.rollno = rollno;
        this.name = name;
        this.backlog = backlog;
        count=0;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBacklog() {
        return backlog;
    }

    public void setBacklog(int backlog) {
        this.backlog = backlog;
    }

    public int getCount(){
        return count;
    }

    public void getINX(){
        count++;
    }
}
