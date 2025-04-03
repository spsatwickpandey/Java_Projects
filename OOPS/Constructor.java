class Human{
    public Human(){
        System.out.println("In Constructor");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Human obj1 = new Human();
        Human obj2 = new Human();  //Number of Times the object is created, the constructor gets called out.
    }
}
