/** wajp to find addition of two instance */
// t1:hh=12 mm=50 ss=40
// t2:hh=10 mm=20 ss=30
// t3:hh=23 mm=11 ss=10
public class Time {
    int hh,mm,ss;
    String display(){
        return hh + ":" + mm + ":" + ss;
    }

    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();

        t1.hh=12;
        t1.mm=50;
        t1.ss=40;

        t2.hh=10;
        t2.mm=20;
        t2.ss=30;

        t3.hh=t1.hh + t2.hh;
        t3.mm=t1.mm + t2.mm;
        t3.ss=t1.ss + t2.ss;

        if(t3.ss>60){
            int k = t3.ss/60;
            t3.mm+=k;
            t3.ss=t3.ss-k*60;
        }
        if(t3.mm>60){
            int k = t3.mm/60;
            t3.hh+=k;
            t3.mm-=k*60;
        }

        System.out.println(t1.display());
        System.out.println(t2.display());
        System.out.println(t3.display());
    }
}
