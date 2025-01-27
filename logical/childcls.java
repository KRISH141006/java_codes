public class childcls {
    public static void main(String[] args) {
        parentcls person1 = new parentcls("prince","vaghasiya","Male","Mavdi,rajkot","9723702488","prince@gmail.com");
        parentcls person2 = new parentcls("Akshat","Shah","Male","Kalawad-road,rajkot","8780129176","Akshat@gmail.com");
        parentcls person3 = new parentcls("taksh","Amrutiya","Male","Nana-mauva,rajkot","7698504770","taksh@gmail.com");

        System.out.println(person1.toString());
        System.out.println(person2.firstName);
        person3.setFirstName("Krish");
        System.out.println(person3.firstName);
        person3.firstName = "Taksh";
        System.out.println(person3.firstName);
    }

   

}
