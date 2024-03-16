package iux.calculator;

import op.calculator.*;
import javax.swing.*;
import java.awt.*;


public class Calculator extends JFrame {
    private JTextField display;
    public Calculator(){
        setTitle("Calculadora");
        setSize(300, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());

        display = new JTextField();
        display.setEditable(true);
        display.setHorizontalAlignment(JTextField.RIGHT);
        panel.add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 4, 4, 4));
        String[] buttonLabels = {
                "M", "C", "CE","%",
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(e -> {
                JButton clickedButton = (JButton) e.getSource();
                String buttonText = clickedButton.getText();
                if (buttonText.equals("=")) {
                    // Realizar la operación aquí si lo deseas
                } else {
                    display.setText(display.getText() + buttonText);
                }
            });
            buttonPanel.add(button);
        }

        panel.add(buttonPanel, BorderLayout.CENTER);
        add(panel);

        setVisible(true);
    }
    public void start(){
        SwingUtilities.invokeLater(Calculator::new);
    }

}
