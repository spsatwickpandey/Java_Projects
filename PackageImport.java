import CalculatorPackage.*;

public class PackageImport {
    public static void main(String[] args) {
        VeryAdvanceCalculator obj = new VeryAdvanceCalculator();
        int r1 = obj.add(3,4);
        int r2 = obj.subtract(5,3);
        int r3 = obj.multiply(5,3);
        double r4 = obj.divide(15.0,4.0);
        int r5 = obj.power(3,4);
        int r6 = obj.remainder(15,4);
        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5+" "+r6);
    }
}
