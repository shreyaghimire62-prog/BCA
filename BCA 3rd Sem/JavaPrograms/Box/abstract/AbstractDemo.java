// package abstract;

public class AbstractDemo {
    abstract void callme();
    //concrete methods are still allowed in abstract classes
    void callmetoo(){
        System.out.println("This is a concrete method. ");
    }
}
class B extends A {
    void callme(){
        System.out.println("B's implementation of callme.");
    }
}
class AbstractDemo {
    public static void main 
}
