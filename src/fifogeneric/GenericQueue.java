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
public class GenericQueue<E> {

    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    public int getSize() {
        return list.size();
    }

    public E peek() {
        return list.get(0);
    }

    public void push(E o) {
        list.add(o);
    }

    public E pop() {
        E o = list.get(0);
        list.remove(o);
        return o;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "Queue: " + list.toString();
    }
}
