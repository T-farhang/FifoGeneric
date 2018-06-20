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
        GenericQueue<String> qString = new GenericQueue<>();
        qString.push("American");
        qString.push("English");
        qString.push("Iranian");
        qString.push("British");
        System.out.println(qString);
        System.out.println(qString.getSize());

        qString.pop();
        System.out.println(qString);
        System.out.println(qString.getSize());
        qString.push("Australian");
        System.out.println(qString);
        qString.pop();
        qString.pop();
        qString.peek();
        System.out.println(qString);

        GenericQueue<Integer> qInt = new GenericQueue<>();
        qInt.push(12);
        qInt.push(2);
        qInt.push(8);
        System.out.println(qInt);
        qString.pop();
        qString.pop();
        System.out.println(qInt);
    }
}
