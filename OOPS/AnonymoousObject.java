class A{
    public A(){
        System.out.println("Object Created");
    }

    public void show(){
        System.out.println("In show method");
    }
}

public class AnonymoousObject {
    public static void main(String[] args) {
        new A(); //Anonymous Object Created
        new A().show(); //Twice created an object
    }
}
