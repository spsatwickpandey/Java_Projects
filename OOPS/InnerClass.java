class A{
    int a;

    public void display(){
        System.out.println("In a");
    }

    class B{
        public void show(){
            System.out.println("In B Show");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    
        A.B obj1 = obj.new B();   //Object of Inner Class
        obj1.show();
    }
}
