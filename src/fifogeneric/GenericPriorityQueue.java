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
public class GenericPriorityQueue<E> {

    private java.util.LinkedList<E> list = new java.util.LinkedList<>();
    private java.util.LinkedList<Integer> priorityList = new java.util.LinkedList<>();

    public int getSize() {
        return list.size();
    }

    public void enqueue(E o, Integer p) {
        list.add(o);
        priorityList.add(p);
    }

    public E Dequeue() {
        Integer min = priorityList.get(0);
        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            if (min.compareTo(priorityList.get(i)) > 0) {
                min = priorityList.get(i);
                index = i;
            }
        }
        E o = list.get(index);
        priorityList.remove(index);
        list.remove(index);
        return o;
    }

    @Override
    public String toString() {
        return "Queue : " + list;
    }

}
