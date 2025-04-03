//This() method is used inside a parameterised constructor to call the default constructor of the same class.
class A{
    public A(){
        System.out.println("In A");
    }

    public A(int n){
        this();
        System.out.println("In A int");
    }
}

public class ThisMethod {
    public static void main(String[] args) {
        A obj = new A(5);
    }
}
