package iux.calculator;

import op.calculator.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                    txtOperation.setText(Double.toString(this.basicOperations.DataManagement(txtOperation.getText())));
            }
            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        btnChangeMode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }
    private void sizeCalculator(Calculator calculator, boolean mode){
        if(!mode) calculator.setSize(400, 200);
        else calculator.setSize(300, 600);
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
