class A{
    static class B{
        public void show(){
            System.out.println("In B Show");
        }
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
        A.B obj = new A.B();
        obj.show();
    }
}
