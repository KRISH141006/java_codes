//wajp to implement interface using extends keyword
//interface is the keyword by which we will inetrface ,
//abstract method-methos without definition
//method available inside interface are abstract methods , interface are required to provide a standard structure
//abstract classes are also used to impement inerface
//interface will extends interface and class will extends class
//packge is a group of classes which are logically related
public class InterfaceAbstraction {
    public static void main(String[] args) {
        EnggStudent estu = new EnggStudent();
        Faculty f = new Faculty();
        Person pstu = new EnggStudent();
        Person pf = new Faculty();
        
    }
}
interface Person {
    void getName();
}

interface Student {
    void calcResult();
}

interface Staff {
    void calcSalary();
}

class EnggStudent implements  Student, Person {

    @Override
    public void getName() {

    }

    @Override
    public void calcResult() {

    }

}

class Faculty implements Staff, Person {
    @Override
    public void getName() {

    }

    @Override
    public void calcSalary() {

    }
}//wajp to create user defined package import package and use its functionality in another javafile