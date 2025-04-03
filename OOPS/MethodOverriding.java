class Hindi{
    public void greet(){
        System.out.println("Namaste");
    }
}
class English extends Hindi{
    public void greet(){ //This method overrides the above greet method.
        System.out.println("Hello");
    }
}
public class MethodOverriding{
    public static void main(String[] args) {
        English eng = new English();
        eng.greet(); //it calls subclass method
    }
}