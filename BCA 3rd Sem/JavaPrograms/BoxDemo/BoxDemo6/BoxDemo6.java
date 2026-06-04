class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    Box() {
        width = 10;
        height = 10;
        depth = 10;
    }
}

public class BoxDemo6 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);

        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is " + vol);
    }
}
