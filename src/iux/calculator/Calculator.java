package iux.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JTextField display;
    private JButton[] buttons;
    private String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "M", "CE", "C"
    };

    private boolean modoNormal = true;

    public Calculator() {
        setTitle("Calculadora");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));

        buttons = new JButton[buttonLabels.length];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }

        add(panel, BorderLayout.CENTER);

        setSize(300, 400);
        setVisible(true);
    }
    public void actionPerformed(@org.jetbrains.annotations.NotNull ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("M")) {
            toggleMode();
            return;
        }

        if (modoNormal) {
            // Implementar lógica de la calculadora en modo normal
            // Aquí puedes implementar la lógica para cada botón
        } else {
            // Implementar lógica de la calculadora en modo extendido
            // Aquí puedes implementar la lógica para cada botón
        }
    }

    private void toggleMode() {
        modoNormal = !modoNormal;
        if (modoNormal) {
            display.setText("");
            for (int i = 0; i < buttons.length; i++) {
                if (!buttonLabels[i].equals("M")) {
                    buttons[i].setVisible(true);
                }
            }
        } else {
            display.setText("Modo extendido");
            for (int i = 0; i < buttons.length; i++) {
                if (!buttonLabels[i].equals("M")) {
                    buttons[i].setVisible(false);
                }
            }
        }
    }


    public static void start(){
        SwingUtilities.invokeLater(Calculator::new);
    }

}