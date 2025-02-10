// create class staff inherites from person and using person variable dynamically allow user to create instance of staff and student
public class TestPerson {
    public static void main(String[] args) {
        disciple d1 = new disciple();
        d1.name = "Krish";
        d1.address = "mavdi ,Rajkot";
        d1.age = 18;
        d1.branch = "ICT";
        d1.marks = 90;
        d1.num = "9924035130";
        d1.sem = 2;
    }
}
class MainPerson{
    String name;
    int age;
    String address;
    String num;
}
class Staff extends MainPerson{
    String company;
    double salary;
    int workHour;
}
class disciple extends MainPerson{
    String branch;
    int sem;
    double marks;
}