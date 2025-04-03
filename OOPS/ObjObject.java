
class A{
    int num;
    String str;
    public String toString(){  // it returns string representation of Objects generally classname+"@"+hashcode
        return "Hello";
    }

    public boolean equals(A that){
        if(this.str==that.str && this.num==that.num){
            return true;
        }
        else{
            return false;
        }
    }
}
public class ObjObject {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.num=7;
        obj1.str="Ronaldo";
        System.out.println(obj1); //By default it returns hashcode of the object but since the toString() method is overridden it returns Hello.

        A obj2 = new A();
        obj2.num=7;
        obj2.str="Ronaldo"; //try changing the values and you will get false as result.
        System.out.println(obj2);
        boolean b = obj2.equals(obj1);
        System.out.println(b);
    }
}
