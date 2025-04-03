public class WrapperClasses {
    public static void main(String[] args) {
        int num = 7;
        
        Integer num1 = num; //AutoBoxing: Changing primitive var to Object var.
        System.out.println(num1);

        int num2 = num1; //Auto-UnBoxing: Changing Object var to primitive var
        System.out.println(num2);

        String str = "12";
        int n = Integer.parseInt(str); //changes to Integer datatype.
        System.out.println(n*2);

    }
}
