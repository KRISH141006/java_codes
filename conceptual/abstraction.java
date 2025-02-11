//wajp to represent abstract class with example
// in abstraction , we can achieve 0 - 100 % absrtaction.
// using interface , you will achieve 100 % abstraction.
// in type of abrtact class , we can use abract and non abstract 
public class abstraction {
    public static void main(String[] args) {
        Shape t = new Triangle(10, 20);
        Shape s = new Square(25);
        System.out.println(t.area());
        t.display();
        System.out.println(s.area());
        s.display();
    }
}

abstract class MyObjects {
    abstract void display();
}

abstract class Shape extends MyObjects {
    String type;

    Shape(String type) {
        this.type = type;
    }

    abstract double area();
    // double area(){
    //     return 0;
    // }

    // @Override
    // void display() {
    //     System.out.println("from shape " + type);
    // }
}

class Car extends MyObjects {

    @Override
    void display() {
        System.out.println("from car");
    }

}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }
    @Override
    void display() {
        System.out.println("from shape " + type);
    }

    @Override
    double area() {
        return base * height * 0.5;
    }
}

class Square extends Shape {
    double height;

    Square(double height) {
        super("Square");
        this.height = height;
    }

    @Override
    double area() {
        return height * height;
    }
    @Override
    void display() {
        System.out.println("from shape " + type);
    }

}
