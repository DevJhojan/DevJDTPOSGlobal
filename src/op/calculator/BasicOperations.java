package op.calculator;
import java.util.ArrayList;
import java.util.List;
public class BasicOperations {
    private double result;
    private final List<String> numbersOne = new ArrayList<String>();
    private final List<String> numbersTwo = new ArrayList<String>();
    private final List<Character> operators = new ArrayList<Character>();
    private String num;
    public BasicOperations(){}
    public double DataManagement(String operation) {
        try{
            char[] operationStringArray = operation.toCharArray();
            for(char data :operationStringArray){
                if(this.numbersTwo.isEmpty() && this.operators.isEmpty()){
                    if(Character.isDigit(data) || data == '.'){
                        this.num = ""+data;
                        numbersOne.add(this.num);
                    }
                }
                if(data == '+' || data == '-' || data == '*' || data == '/' || data == '%'){
                    this.calculated_operation();
                    this.operators.add(data);
                }
                else if(!this.operators.isEmpty() && !this.numbersOne.isEmpty()){
                    if(Character.isDigit(data) || data == '.'){
                        this.num = ""+data;
                        this.numbersTwo.add(this.num);
                    }
                }
            }
            this.calculated_operation();
            return this.result;
        }catch (Exception ex){
            System.out.println("Error: "+ ex);
            return 0.0;
        }
    }

    private void calculated_operation() {
        if(!this.numbersOne.isEmpty() && !this.numbersTwo.isEmpty()){
            this.result = this.calculated(this.numbersOne, this.operators, this.numbersTwo);
            this.numbersOne.clear();
            this.num = ""+ result;
            this.numbersOne.add(this.num);
            this.numbersTwo.clear();
            this.operators.clear();
        }
    }
    private double calculated(List<String>numbersOneC, List<Character>operatorsC,List<String>numbersTwoC){
        String numberOneString = String.join("", numbersOneC);
        String numberTwoString = String.join("", numbersTwoC);
        double numberOneC = Double.parseDouble(numberOneString);
        double numberTwoC = Double.parseDouble(numberTwoString);
        char operator = operatorsC.getFirst();
        return switch (operator) {
            case '+' -> numberOneC + numberTwoC;
            case '-' -> numberOneC - numberTwoC;
            case '*' -> numberOneC * numberTwoC;
            case '/' -> numberOneC / numberTwoC;
            case '%' -> numberOneC % numberTwoC;
            default -> 0.0;
        };
    }
}

