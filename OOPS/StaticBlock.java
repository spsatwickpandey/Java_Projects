class Mobile{
    static String name;
    public Mobile(){ //constructor runs automatically when the object of the class gets instantiated.
        String brand = "";
        int price = 200;
        System.out.println("In Constructor");
    }
    
    static{ //always executes first when the class loads
        name = "Phone";
        System.out.println("In Static Block");
    }
}

public class StaticBlock{
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Mobile");  //only class gets loaded
        Mobile obj = new Mobile(); //Constructor is called
    }
}