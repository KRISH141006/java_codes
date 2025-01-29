/** wajp to find addition of two instance */
// t1:hh=12 mm=50 ss=40
// t2:hh=10 mm=20 ss=30
// t3:hh=23 mm=11 ss=10
public class Time {
    int hh,mm,ss;
    String display(){
        return hh + ":" + mm + ":" + ss;
    }
    void addTime(Time t1,Time t2){
        this.ss = t1.ss + t2.ss;
        
        
        if(this.ss>=60){
            this.mm+=this.ss/60;
            this.ss=this.ss%60;
        }
        this.mm = +(t1.mm + t2.ss);
        if(this.mm>=60){
            this.hh+=this.mm/60;
            this.mm=this.mm%60;
        } 
        this.hh = +(t1.hh + t2.hh);  
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

        // t3.ss = t1.ss + t2.ss;
        // t3.mm = t1.mm + t2.ss;
        // t3.hh = t1.hh + t2.hh;  
        // if(t3.ss>=60){
        //     t3.mm=t3.ss/60;
        //     t3.ss=this.ss%60;
        // }
        // if(this.mm>=60){
        //     t3.hh=t3.mm/60;
        //     t3.mm=this.mm%60;
        // } 

        t3.addTime(t1,t2);
        Time t4 = new Time();
        t4.addTime(t1,t3);

        System.out.println(t1.display());
        System.out.println(t2.display());
        System.out.println(t3.display());
        System.out.println(t4.display());
    }
}
