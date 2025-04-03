class Mobile{
    static String name;
    String brand;
    String price;

    public static void show(Mobile obj){ // static method inputs object of class
        name = "Smartphone"; //helps to instantiate the value of static variable only once.
        System.out.println(Mobile.name+" : "+obj.brand+" : "+obj.price);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.brand="Apple";
        obj.price="$1500";
        Mobile.show(obj); //static variables are called w.r.t class not object
    }
}
