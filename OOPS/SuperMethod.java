//By default every constructor cotains a super method which calls the default constructor of the super class.
//Also, every classin java extends Object class
class A{
    public A(){
        System.out.println("In A");
    } 

    public A(int n){
        System.out.println("In A int");
    }
}  

class B extends A{
    public B(){
        System.out.println("In B");
    }

    public B(int n){
        //super();
        super(5); /*if we pass parameter inside super method it will call the parameterised constructor 
        of the super class which contains the same parameter type.*/ 
        System.out.println("In B int");
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        B ob = new B();
        B obj = new B(5);
    }
}
