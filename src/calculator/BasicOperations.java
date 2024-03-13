package calculator;

import java.util.ArrayList;
import java.util.List;

public class BasicOperations {

    private double result;
    private List<Double> numbersOne = new ArrayList<Double>();
    private List<Double> numbersTwo = new ArrayList<Double>();
    private List<Character> operators = new ArrayList<Character>();

    public BasicOperations(){}

    public double DataManagement(String operation) {
        char[] operationStringArray = operation.toCharArray();
        for(char data :operationStringArray){
            if(this.numbersTwo.isEmpty() && this.operators.isEmpty()){
                if(Character.isDigit(data) || data == '.'){
                    String num = ""+data;
                    numbersOne.add(Double.parseDouble(num));
                }
            }

            if(data == '+' || data == '-' || data == '*' || data == '/' || data == '%'){
                this.calculated_operation();
                this.operators.add(data);
            }
            else if(!this.operators.isEmpty() && !this.numbersOne.isEmpty()){
                if(Character.isDigit(data) || data == '.'){
                    String num = ""+data;
                    this.numbersTwo.add(Double.parseDouble(num));
                }
            }
        }
        this.calculated_operation();
        return this.result;
    }

    private void calculated_operation() {
        if(!this.numbersOne.isEmpty() && !this.numbersTwo.isEmpty()){
            this.result = this.calculated(this.numbersOne, this.operators, this.numbersTwo);
            this.numbersOne.clear();
            this.numbersOne.add((double) result);
            this.numbersTwo.clear();
            this.operators.clear();
        }
    }

    private double calculated(List<Double>numbersOneC, List<Character>operatorsC,List<Double>numbersTwoC){
        String numberOneString = String.join("", this.cleanedid(numbersOneC));
        String numberTwoString = String.join("", this.cleanedid(numbersTwoC));

        double numberOneC = Double.parseDouble(numberOneString);
        double numberTwoC = Double.parseDouble(numberTwoString);
        char operator = operatorsC.getFirst();
        switch (operator){
            case '+':
                return numberOneC + numberTwoC;
            case '-':
                return numberOneC - numberTwoC;
            case '*':
                return numberOneC * numberTwoC;
            case '/':
                return numberOneC / numberTwoC;
            case '%':
                return numberOneC % numberTwoC;
            default:
                return 0.0;
        }
    }

    private  <T> String cleanedid(List<T> list ) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }

}

