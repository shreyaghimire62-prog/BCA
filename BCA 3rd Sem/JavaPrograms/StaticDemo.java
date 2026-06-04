class StaticByName {
    static int  a = 42;
     static int b = 82;


    int x =10;
    static void callme (){
        System.out.println(" a= " +a);


    }
}
public class StaticDemo{
    public static void main(String[] args) {
        StaticByName.callme();
        System.out.println(" b = " + StaticByName.b);
    }
}
