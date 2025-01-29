import java.util.Scanner;

public class Fac {

    int fact(int n){
        if(n<2){
            return 1;
        }
        int ans = n*fact(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number :-");
        int n = scan.nextInt();
        System.out.println("Factorial is " + new Fac().fact(n));
    }
    
}
