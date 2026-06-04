
class Box {

    double width;
    double height;
    double depth;

    double volume() {
        return width*height*depth;
    }
    void setDimension(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo5  {

    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.setDimension(10, 20, 15);

         mybox1.width = 10;
         mybox1.height = 20;
         mybox1.depth = 15;
         mybox2.setDimension(4, 5, 2);

        mybox2.width = 4;
         mybox2.height = 5;
         mybox2.depth = 2;

        vol = mybox1.volume();
        System.out.println("Volume is " +vol);

         vol = mybox2.volume();
        System.out.println("Volume is " +vol);
    }
}
