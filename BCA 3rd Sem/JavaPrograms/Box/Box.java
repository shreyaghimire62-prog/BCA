public class Box {
    double width;
    double height;
    double depth;
}

public class Box{
    public static void main(String[] args) {
            Box myBox = new Box();
            double vol;
            myBox.width = 20;
            myBox.height = 40;
            myBox.depth = 10;

            vol = myBox.height*myBox.width*myBox.depth;
            System.out.println("Volume is " +vol);
    }
}
