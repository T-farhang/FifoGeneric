/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifogeneric;

/**
 *
 * @author Totia
 */
public class FifoGeneric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        GenericQueue<String> qString = new GenericQueue<>();
//        qString.enqueue("American");
//        qString.enqueue("English");
//        qString.enqueue("Iranian");
//        qString.enqueue("British");
//        System.out.println(qString);
//        System.out.println(qString.getSize());
//
//        qString.dequeue();
//        System.out.println(qString);
//        System.out.println(qString.getSize());
//        qString.enqueue("Australian");
//        System.out.println(qString);
//        qString.dequeue();
//        qString.dequeue();
//        qString.peek();
//        System.out.println(qString);
//
//        GenericQueue<Integer> qInt = new GenericQueue<>();
//        qInt.enqueue(12);
//        qInt.enqueue(2);
//        qInt.enqueue(8);
//        System.out.println(qInt);
//        qInt.dequeue();
//        qInt.dequeue();
//        System.out.println(qInt);

        GenericPriorityQueue<Integer> qListInt = new GenericPriorityQueue<>();
        qListInt.enqueue(6, 9);
        qListInt.enqueue(12, 4);
        qListInt.enqueue(4, 6);
        qListInt.enqueue(6, 3);
        qListInt.enqueue(1, 7);
        System.out.println(qListInt);

        qListInt.Dequeue();
        System.out.println(qListInt);
        qListInt.Dequeue();
        System.out.println(qListInt);
        qListInt.Dequeue();
        System.out.println(qListInt);

    }
}
