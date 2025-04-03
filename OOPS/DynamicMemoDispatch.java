//Superclass reference variable containing subclass object.
//including Run-time Polymorphism (method overriding)
class A{
    public void show(){
        System.out.println("In A Show");
    }
}
class B extends A{
    public void show(){
        System.out.println("In B Show");
    }
}
class C extends B{
    public void show(){
        System.out.println("In C Show");
    }
}
public class DynamicMemoDispatch{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();  //reference variable obj is of type A class but contains object memory address of class B.
        obj.show();

        obj = new C();
        obj.show();
    }
}