public class StackDemo {
    static void showpush (Stack <Integer> st, int a){
        st.push(a);
        System.out.println("push("+ a + ")");
        System.out.println("stsck :" + st);
    }
    ststic void showpop(Stack <Integer> st) {
        System.out.print("pop ->");
        Integer a = st.pop ();
        System.out.println(a);
        System.out.println("stack: " + st);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack <Integer> ();
        System.out.println();
    }
    
}
