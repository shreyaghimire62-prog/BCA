class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    void method(Test o) {
        o.a *= 2;
        o.b /= 2;
    }
}

public class PassOBjRef {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);

        System.out.println("Before call: a = " + ob.a + " b = " + ob.b);
        ob.method(ob);
        System.out.println("After call:  a = " + ob.a + " b = " + ob.b);
    }
}
