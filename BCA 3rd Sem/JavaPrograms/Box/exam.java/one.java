class Fruit {
    String name, taste;
    int size;

    // Constructor for base class
    Fruit(String name, String taste) {
        this.name = name;
        this.taste = taste;
    }

    void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

class Apple extends Fruit {
    Apple() {
        super("Apple", "sweet"); // calling parent constructor
    }

    @Override
    void eat() {
        super.eat(); // reuse parent method
    }
}

class Orange extends Fruit {
    Orange() {
        super("Orange", "sour"); // calling parent constructor
    }

    @Override
    void eat() {
        super.eat();
    }
}

public class FruitTest {
    public static void main(String[] args) {
        Fruit f;

        f = new Apple();
        f.eat();

        f = new Orange();
        f.eat();
    }
}