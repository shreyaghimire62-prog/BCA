package Demo;

public class DoubleDemo {
    public static void main(String[] args) {
        Double d1 = Double.valueOf(3.14159);
        double d2 = Double.valueOf("314159-5");
        System.out.println(d1+ "=" + d2 + " ->"+ d1.equals (d2));
    }
    
}
