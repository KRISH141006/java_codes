import java.util.Scanner;

class fibbonacci{
    public void atFibo(int n){
        int a=0,b=1;
        // for(int i=0;i<n;i++){
        //     System.out.print("\t"+a);
        //     int sum = a+b;
        //     a=b;
        //     b=sum;
        // }
        int sum=0;
        for(int i=0;sum<n;i++){
            System.out.print("\t"+a);
            sum = a+b;
            a=b;
            b=sum;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number at which upto you want to print fibonacci number:-");
        int n = scan.nextInt();
        new fibbonacci().atFibo(n);

        scan.close();
    }
}