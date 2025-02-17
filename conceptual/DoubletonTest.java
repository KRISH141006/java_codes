public class DoubletonTest {
    public static void main(String[] args) {
        DataConnect objs1 = DataConnect.getInstance();
        objs1.setName("a");
        System.out.println(objs1.getName());

        DataConnect objs2 = DataConnect.getInstance();
        objs2.setName("b");
        System.out.println(objs2.getName());

        DataConnect objs3 = DataConnect.getInstance();
        objs3.setName("c");
        System.out.println(objs3.getName());

        DataConnect objs4 = DataConnect.getInstance();
        objs4.setName("x");
        System.out.println(objs4.getName());

        DataConnect objs5 = DataConnect.getInstance();
        objs5.setName("bcd");
        System.out.println(objs5.getName());

        System.out.println("===================================");
        System.out.println(objs1.getName());
        System.out.println(objs2.getName());
        System.out.println(objs3.getName());
        System.out.println(objs4.getName());
        System.out.println(objs5.getName());
        System.out.println(objs1);
        System.out.println(objs1);
        System.out.println(objs1);
        System.out.println(objs1);
        System.out.println(objs1);        


    }
}
class DataConnect{
    private static DataConnect obj[] = new DataConnect[2];
    public String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public static DataConnect getInstance(){
        if(obj[0]==null){
            obj[0] = new DataConnect();
            return obj[0];
        }
        else if(obj[1]==null)
            obj[1] = new DataConnect();
            return obj[1];  
        
                  
    }
}