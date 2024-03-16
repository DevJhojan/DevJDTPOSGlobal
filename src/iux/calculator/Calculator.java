package iux.calculator;

import op.calculator.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Calculator extends JFrame {
    private JTextField txtOperation;
    private JLabel lbDescription;
    private JButton btnChangeMode;
    public JPanel jpCalculatorMain;
    private JButton btnErase;
    private JButton btnFour;
    private JButton btnOne;
    private JButton btn0;
    private JButton btnSeven;
    private JButton btnClean;
    private JButton btnEight;
    private JButton btnFive;
    private JButton btnTwo;
    private JButton btn00;
    private JButton btnModule;
    private JButton btnNine;
    private JButton btnSix;
    private JButton btnThree;
    private JButton btnPoint;
    private JButton btnSplit;
    private JButton btnMultiply;
    private JButton btnRest;
    private JButton btnSum;
    private JButton btnEqual;

    public Calculator(){
        this.actionsKey(this);
    }

    private boolean mode = false;

    private void actionsKey(Calculator calculator){
        txtOperation.addKeyListener(new KeyListener() {
            private String operation;
            private final BasicOperations basicOperations = new BasicOperations();
            @Override
            public void keyTyped(KeyEvent e) {

            }
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) txtOperation.setText(Double.toString(this.basicOperations.DataManagement(txtOperation.getText())));
            }
            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        btnChangeMode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sizeCalculator(calculator, !mode);
            }
        });
    }
    private void sizeCalculator(Calculator calculator, boolean mode1){
        if(!mode1){
            calculator.setSize(400, 200);
            this.mode = false;
            lbDescription.setText("Calculator in NumPad");
            hiddenButtons();
        }
        else {
            calculator.setSize(300, 600);
            this.mode = true;
            lbDescription.setText("Calculator Normal");
            showButtons();
        }
    }
    public void start(){
        Calculator calculator = new Calculator();
        calculator.setContentPane(calculator.jpCalculatorMain);
        sizeCalculator(calculator, false);
        calculator.setTitle("Calculator");
        calculator.setVisible(true);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void hiddenButtons(){
        btn0.setVisible(!this.mode);
        btn00.setVisible(!this.mode);
        btnOne.setVisible(!this.mode);
        btnTwo.setVisible(!this.mode);
        btnThree.setVisible(!this.mode);
        btnFour.setVisible(!this.mode);
        btnFive.setVisible(!this.mode);
        btnSix.setVisible(!this.mode);
        btnSeven.setVisible(!this.mode);
        btnEight.setVisible(!this.mode);
        btnNine.setVisible(!this.mode);
        btnPoint.setVisible(!this.mode);
        btnSum.setVisible(!this.mode);
        btnRest.setVisible(!this.mode);
        btnMultiply.setVisible(!this.mode);
        btnSplit.setVisible(!this.mode);
        btnModule.setVisible(!this.mode);
        btnEqual.setVisible(!this.mode);
        btnClean.setVisible(!this.mode);
        btnErase.setVisible(!this.mode);
    }
    public void showButtons(){
        btn0.setVisible(this.mode);
        btn00.setVisible(this.mode);
        btnOne.setVisible(this.mode);
        btnTwo.setVisible(this.mode);
        btnThree.setVisible(this.mode);
        btnFour.setVisible(this.mode);
        btnFive.setVisible(this.mode);
        btnSix.setVisible(this.mode);
        btnSeven.setVisible(this.mode);
        btnEight.setVisible(this.mode);
        btnNine.setVisible(this.mode);
        btnPoint.setVisible(this.mode);
        btnSum.setVisible(this.mode);
        btnRest.setVisible(this.mode);
        btnMultiply.setVisible(this.mode);
        btnSplit.setVisible(this.mode);
        btnModule.setVisible(this.mode);
        btnEqual.setVisible(this.mode);
        btnClean.setVisible(this.mode);
        btnErase.setVisible(this.mode);
    }
}
