public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Vijay";
        p1.address = "Rajkot";
        p1.contactNumber = "7894561230";
        p1.gender = "Male";
        p1.display();
        Student s1 = new Student();
        s1.name = "Rudra";
        s1.address = "Surat";
        s1.contactNumber = "7794561230";
        s1.gender = "Male";
        s1.enroll = "129";
        s1.dept = "ICT";
        s1.div = "A";
        s1.sem = 2;
        s1.display();
        Person p2 = new Student();
        p2.name = "Rudra";
        p2.address = "Surat";
        p2.contactNumber = "7794561230";
        p2.gender = "Male";
        // p2.enroll = "129";
        // p2.dept = "ICT";
        // p2.div = "A";
        // p2.sem = 2;
        p2.display();
    }
}

class Person {
    String name;//if attribute is private then it cannot be used it in child class , but if some member of parent class is
                //declared as protected , we will get copy in child class even if it is in package and that can be accessible
                // in other class in same package
    String address;
    String gender;
    String contactNumber;
    Person k = new Person();
    

    void display() {
        System.out.println(this.name + " " + this.address + " " + this.gender + " " + this.contactNumber);
        k.name = "Krish";
    }
}

class Student extends Person {
    String enroll;
    String dept;
    String div;
    int sem;

    @Override
    void display() {
        super.display();
        System.out.println(this.enroll + " " + this.dept
                + " " + this.div + " " + this.sem);
    }
}
