import calculator.BasicOperations;
import calculator.MyPi;
public class Main {
    public static void main(String[] args) {
        BasicOperations calculated = new BasicOperations();
        MyPi myPi = new MyPi();
        System.out.println(calculated.DataManagement("(5+3+4)/3"));
        System.out.println(myPi.PI);
    }
}
