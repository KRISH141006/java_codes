// Total = amt + amt * gst * 0.01
// igst = amt * gst * 0.01
// sgst = cgst = igst/2

// case 1:
// i/p = amt , gst
// o/o = total , igst , sgst , cgst

// case 2:
// i/p = total , gst
// o/p = amt , igst , sgst , cgst
import java.util.Scanner;

public class gst_calc {
   
    public static void main(String[] args) {
        double amt;
        double gst;
        double total;
        int ask;
        Scanner scan = new Scanner(System.in);

        System.out.println("if you need to print gst,type 1. if reverse then type 0.");
        ask = scan.nextInt();

        if(ask==1){
            System.out.print("Enter the amount :-");
            amt = scan.nextDouble();

            System.out.print( "Enter the gst :-");
            gst = scan.nextDouble();

            new gst_calc().printGst(amt,gst);   
        }
        else if(ask==0){
            System.out.print("Enter the total :-");
            total = scan.nextDouble();

            System.out.print("Enter the gst :-");
            gst = scan.nextDouble();

            new gst_calc().printRevGst(total,gst);
        }
        else{
            System.out.println("Print a valid number");
        }

    }
    void printGst(double amt , double gst){

        double igst = amt*gst*0.01;
        double total = amt+igst;
        double sgst = igst/2;
        double cgst = sgst;

       System.out.println("Amount = " + amt);
       System.out.println("total = " + total); 
       System.out.println("igst = " +  igst);
       System.out.println("sgst = " + sgst);
       System.out.println("cgst = " + cgst );
    }
    void printRevGst(double total , double gst){

        double amount = total/(1+gst*0.01);
        double igst = total - amount;


        System.out.println("amount  = " +amount );
        System.out.println("igst = " + igst);
        System.out.println("cgst = " + igst/2);
        System.out.println("sgst = " + igst/2 );
    }

}

