// Base class
class Box {
    double width;
    double height;
    double depth;

    // Constructor using dimensions
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Copy constructor
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Method to calculate volume
    double volume() {
        return width * height * depth;
    }
}

// Derived class
class BoxWeight extends Box {
    double weight;

    // Constructor
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // call Box constructor
        weight = m;
    }
}

// Main class
public class DemoBoxWeight {
    public static void main(String[] args) {

        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);

        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
    }
}
