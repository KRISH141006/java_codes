public class PracticalFive {
    public static void main(String[] args) {
        Person firstObj = new Person();
        Person secObj = new Person("Krish", "Sondagar");
        firstObj.display();
        firstObj.display(true);
        firstObj.display(false);
        secObj.display();
        secObj.display(true);
        secObj.display(false);
    }
}

class Person {
    private String fname = "Krish";
    private String lname = "Sondagar";
    private String fullName = fname + " " + lname;

    // default constructor
    Person() {
        fname = "";
    }

    // parameterized constructor (constructor overloading)
    Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
        fullName = this.fname + " " + this.lname;
    }

    // to display fname and lname only
    void display() {
        System.out.println(this.fname + " " + this.lname);
    }

    // based on b display along with fullName
    void display(boolean b) {
        // if (b)
        // System.out.println(this.fname + " " + this.lname + " " + this.fullName);
        // else
        // System.out.println(this.fname + " " + this.lname);
        System.out.println(this.fname + " " + this.lname + (b ? " " + fullName : ""));

    }
}