package Demo;

import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector <Integer> (3, 2);
        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " +
            v.capacity());
            v.addElement(1);
            v.addElement(2);
            v.addElement(3);
            v.addElement(4);
            System.out.println("Capacity after four additions : "+
            v.capacity());
            v.addElement(5);
            System.out.println("Current capacity ; " + 
            v.addElement(10));
            System.out.println(Current capacity : +
            v.capacity());
            v.addElement(11);
            v.addElement(12);
            System.out.println("First element: "+ v.firstElement());
            System.out.println("First element: "+ v.lastElement());
    }
    
}
