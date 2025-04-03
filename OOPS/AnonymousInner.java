class A{
    public void show(){
        System.out.println("In Show");
    }
}
public class AnonymousInner {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("In new Show");
            }
        };
        obj.show();
    }
}
/* 
....................~~~~~~~~~~~~~~~~~~~~~~......................~~~~~~~~~~~~~~~~~~~~~~~......................~~~~~~~~~~~~~~~~~~~~~~~~.......................
*/
//Abstract Anonymous Class


//Helps in abstraction, without extending abstract classes to some other class.
//Implementation of abstract class is done using anonymous class.

/*abstract class A{
    public abstract void show();
    public abstract void display();
}
public class AnonymousInner{
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("In Show");
            }
            public void display(){
                System.out.println("In Display");
            }
        };
        obj.show();
        obj.display();
    }
}*/