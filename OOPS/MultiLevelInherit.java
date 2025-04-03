class Calculator{
    public int add(int n1 , int n2){
        return n1+n2;
    }

    public int sub(int n1 , int n2){
        return n1-n2;
    }
}

class AdvanceCalculator extends Calculator{ //inherits Calculator Class
    public int multi(int n1,int n2){
        return n1*n2;
    }
    public double div(double n1,double n2){ //inherits AdvanceCalculator Class
        return n1/n2;
    }
}

class VeryAdvanceCalculator extends AdvanceCalculator{
    public int power(int n1,int n2){
        return (int)Math.pow(n1,n2);
    }
}

public class MultiLevelInherit {
    public static void main(String[] args) {
        VeryAdvanceCalculator obj = new VeryAdvanceCalculator();
        int r1 = obj.add(3,4);
        int r2 = obj.sub(5,3);
        int r3 = obj.multi(5,3);
        double r4 = obj.div(15.0,4.0);
        int r5 = obj.power(2,3);
        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
    }
}
