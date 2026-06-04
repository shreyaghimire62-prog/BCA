class Box {
    double width;
    double height;
    double depth;
    //construct clone of an object
    Box (box ob) { // pass object to constructer
    weith = ob.width;
    height= ob.height;
    depth = ob.depth;
    }
    
    box (double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

}

class DemoBoxWeight extends Box {
        double weight ;
        BoxWidth ( Double w, double h, double d, double m){
            weith = w;
            height = h;
            depth = d;
            weight = m;
        }
    }
    class DemoBoxWeight {
        public static void main (String[] args){
            BoxWidth mybox1 = new BoxWidth (10, 20, 15, 34, 3);
            BoxWidth mybox2 = new  BoxWidth (2, 3, 4, 0.076);
            double vol;
            vol = mybox1.volume();
            System.out.println("Volume of mybox1 is" +vol);
            System.out.println("Volumeof mybox2" + mybox1.weith);
            System.out.println();
            vol = mybox2.volume ();
            System.out.println("Volume of mybox2 is " + vol);
            System.out.println("Volume of mybox2 is" + mybox2.weith);
            weight 
        }
    }