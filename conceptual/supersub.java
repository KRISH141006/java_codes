
// package is a folder which have all logical related folder inside it
// overriding is concept of polymorphism in which we are modfying the definition of given method which we derive from parent class or base class
class Super{
     String name="Krish";
     String email;
     String height;
     String weight;
     String address;
     
     void display(){
         System.out.println("Name: "+name);
         System.out.println("Email: "+email);
         System.out.println("Height: "+height);
         System.out.println("Weight: "+weight);
         System.out.println("Address: "+address);
     }
     

}
class Sub extends Super{
    String enroll;
    String college;
    String branch;
    int sem ;
    String name;
    Sub obg2 = new Sub();
    Super obg1 = new Super();
    ;

}
public class supersub{
    public static void main(String[] args) {
        Sub s = new Sub();
        s.name = "Krish";
        System.out.println(s.name);
        System.out.println(s.email);
        System.out.println(s.height);
        System.out.println(s.weight);
        System.out.println(s.address);
        System.out.println(s.enroll);
        System.out.println(s.college);
        System.out.println(s.branch);
        System.out.println(s.sem);
    }
}

