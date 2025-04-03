abstract class Car{                   //Abstract Class
    public abstract void drive();     //Abstract Method Declaration
    
    public void playMusic(){          //Normal Method
        System.out.println("Playing Music...");
    }
}
class WagonR extends Car{             //class extending Abstract Class
    public void drive(){              //Abstract method Definition
        System.out.println("Driving...");
    }
}
public class AbstractClass{
    public static void main(String[] args) {
        Car obj = new WagonR();       //Object of class extending Abstract Method..because object of abstract class cannot be created but its reference variable can be created.
        obj.playMusic();
        obj.drive();                  //called Abstract Method
    }
}