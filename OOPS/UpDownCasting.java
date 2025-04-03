// This Upcasting and Downcasting is done of reference variables. It has nothing to do with the object's type.
class A{
    public void show1(){
        System.out.println("In A Show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("In B Show");
    }
}
public class UpDownCasting {
    public static void main(String[] args) {
        A obj1 = (A) new B(); //Upcasting it happens by default implicitly
        obj1.show1();
      //obj1.show2();  This line will show error as obj is of type A(Superclass) so cannot access Subclass method.
      // To overcome this problem we need to downcast the same object into type B(Subclass).
        B obj2 = (B) obj1;  //DownCasting obj1 
        obj2.show1();
        obj2.show2();
    }
}
