class Test {
    int a;          // default access
    public int b;   // public access
    private int c;  // private access

    // method to set c
    void setc(int i) {
        c = i;
    }

    // method to get c
    int getc() {
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();

        ob.a = 10;
        ob.b = 30;
        ob.setc(100); 

        System.out.println("a, b and c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
