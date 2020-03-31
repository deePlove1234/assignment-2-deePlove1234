/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyBinarySearchTree bst = new MyBinarySearchTree();
        System.out.print("For inserting data in BST press1, for printing left nodes and nodes which who doesn't have left child press2:- ");
        int counter = sc.nextInt();
        while (counter != 0) {
            switch (counter) {
                case 1:
                    System.out.print("Enter number:- ");
                    bst.insert(sc.nextInt());
                    break;
                case 2:
                    bst.traverseLevelOrder(bst.getRoot());
                    break;
                default:
                    System.out.println("Please enter a valid option!!!");
            }
            System.out.print("For inserting data in BST press1, for printing left nodes and nodes which who doesn't have left child press2, for exit press0:- ");
            counter = sc.nextInt();
        }
        System.out.println("Thank you. Have a nice day!");
    }
}
