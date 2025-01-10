import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        System.out.println("Hello!!!");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the String:");
        String str = scan.nextLine();
        System.out.print("Enter the name:");
        String name = scan.next();
         
        System.out.println(str.replace("name", name));

        scan.close();
    }
}