class Human{
    int age;
    String name;

    public Human(int age,String name){ //parameterised Constructor
        this.age=age;
        this.name=name;
    }

}

public class ParaConstructor {
    public static void main(String[] args) {
        Human obj = new Human(21,"Satwick"); //parameterised Constructor calling
        System.out.println(obj.name+" : "+obj.age);
    }
}
