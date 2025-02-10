// wajp to understand the concept of static keyword
public class staticKey {
    static int num = 20;
    int add(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    public static void main(String[] args) {
        int a = new staticKey().add(5,9);
        int b = new staticKey().sub(95,90);
        int c = staticKey.sub(9,5);
        int d = sub(8,0);
        System.out.println(new staticKey().num);
        new staticKey().num = 30;
        System.out.println(new staticKey().num);
        new staticKey().num = 40;
        System.out.println(new staticKey().num);



        System.out.println("a="+a+"\nb="+b+"\nc="+c+"\nd="+d);
    }
}
