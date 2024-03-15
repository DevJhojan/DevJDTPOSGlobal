import op.calculator.BasicOperations;
import op.calculator.MyPi;

import iux.calculator.Calculator;
public class Main {
    public static void main(String[] args) {
        BasicOperations calculated = new BasicOperations();
//        MyPi myPi = new MyPi();
        System.out.println(calculated.DataManagement("5.2+8.4"));
//        System.out.println(myPi.PI);
        Calculator calculator = new Calculator();
        calculator.start();
    }
}
