
class Box {

    double width;
    double height;
    double depth;

    void volume() {
        System.out.println("Volume is ");
        System.out.println(width * height * depth);
    }
}

public class BoxDemo3 {

    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 4;
        mybox2.height = 5;
        mybox2.depth = 2;

        mybox1.volume();
        mybox2.volume();
    }
}
