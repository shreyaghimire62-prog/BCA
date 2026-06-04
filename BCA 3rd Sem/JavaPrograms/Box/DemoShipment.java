package multi;
class Shipment extends BoxWeight {
    double cost;
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }
    Shipment (double w, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }
    Shipment(){
        super ();
        cost = -1;
    }
    Shipment(double len)
}
class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10,20,15,10,3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        vol = shipment1.Volume();
        System.out.println("Volume of shipment1 is"+ vol);
        System.out.println("Weight of shipment1 is"+ shipment1.Weight);
        System.out.println("Shipping cost: $" + shipment1.cost);
    }
}