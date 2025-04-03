class Human{
    private int age;
    private String name;

    public void setname(String s){
        this.name = s;
    }
    public String getname(){
        return name;
    }
    public void setage(int n){
        this.age=n;
    }
    public int getage(){
        return age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setname("Satwick");
        obj.setage(21);
        System.out.println(obj.getname());
        System.out.println(obj.getage());
    }
}
