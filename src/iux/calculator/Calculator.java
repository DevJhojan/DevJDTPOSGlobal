package iux.calculator;

import op.calculator.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Calculator extends JFrame {
    private JTextField txtOperation;
    private JLabel description;
    private JButton btnChangeMode;
    public JPanel jpCalculatorMain;
    public Calculator(){
        this.actionsKey();
    }
    private void actionsKey(){
        txtOperation.addKeyListener(new KeyListener() {
            private String operation;
            private final BasicOperations basicOperations = new BasicOperations();
            @Override
            public void keyTyped(KeyEvent e) {

            }
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    this.operation= txtOperation.getText();
                    System.out.println(this.operation);
                    txtOperation.setText(Double.toString(this.basicOperations.DataManagement(operation)));
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
    public void start(){
        Calculator calculator = new Calculator();
        calculator.setContentPane(calculator.jpCalculatorMain);
        calculator.setTitle("Calculator");
        calculator.setSize(400, 200);
        calculator.setVisible(true);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
