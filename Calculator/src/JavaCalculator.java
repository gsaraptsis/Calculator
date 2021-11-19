import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {

    private double total1 =0.0;
    private double total2 =0.0;
    private char math_operator;

    private JPanel JavaCalculator;
    private JTextField textDisplay1;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a7Button;
    private JButton deleteButton;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton divideButton;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton multiplyButton;
    private JButton plusButton;
    private JButton minusButton;
    private JButton enterButton;
    private JButton a0Button;
    private JButton infoButton;
    private JTextField textDisplay2;

    private void getOperator (String textButton) {
        math_operator = textButton.charAt(0);
        total1 = total1 + Double.parseDouble(textDisplay1.getText());
        textDisplay1.setText("");
    }

    public JavaCalculator() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a1ButtonText = textDisplay1.getText() + a1Button.getText();
                textDisplay1.setText(a1ButtonText);
                a1ButtonText = textDisplay2.getText() + a1Button.getText();
                textDisplay2.setText(a1ButtonText);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a2ButtonText = textDisplay1.getText() + a2Button.getText();
                textDisplay1.setText(a2ButtonText);
                a2ButtonText = textDisplay2.getText() + a2Button.getText();
                textDisplay2.setText(a2ButtonText);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a3ButtonText = textDisplay1.getText() + a3Button.getText();
                textDisplay1.setText(a3ButtonText);
                a3ButtonText = textDisplay2.getText() + a3Button.getText();
                textDisplay2.setText(a3ButtonText);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a4ButtonText = textDisplay1.getText() + a4Button.getText();
                textDisplay1.setText(a4ButtonText);
                a4ButtonText = textDisplay2.getText() + a4Button.getText();
                textDisplay2.setText(a4ButtonText);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a5ButtonText = textDisplay1.getText() + a5Button.getText();
                textDisplay1.setText(a5ButtonText);
                a5ButtonText = textDisplay2.getText() + a5Button.getText();
                textDisplay2.setText(a5ButtonText);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a6ButtonText = textDisplay1.getText() + a6Button.getText();
                textDisplay1.setText(a6ButtonText);
                a6ButtonText = textDisplay2.getText() + a6Button.getText();
                textDisplay2.setText(a6ButtonText);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a7ButtonText = textDisplay1.getText() + a7Button.getText();
                textDisplay1.setText(a7ButtonText);
                a7ButtonText = textDisplay2.getText() + a7Button.getText();
                textDisplay2.setText(a7ButtonText);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a8ButtonText = textDisplay1.getText() + a8Button.getText();
                textDisplay1.setText(a8ButtonText);
                a8ButtonText = textDisplay2.getText() + a8Button.getText();
                textDisplay2.setText(a8ButtonText);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a9ButtonText = textDisplay1.getText() + a9Button.getText();
                textDisplay1.setText(a9ButtonText);
                a9ButtonText = textDisplay2.getText() + a9Button.getText();
                textDisplay2.setText(a9ButtonText);
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a0ButtonText = textDisplay1.getText() + a0Button.getText();
                textDisplay1.setText(a0ButtonText);
                a0ButtonText = textDisplay2.getText() + a0Button.getText();
                textDisplay2.setText(a0ButtonText);
            }
        });
        infoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Calculator \n ΔιΠαΕ \n \n Γεώργιος Σαραπτσής - Βενέτης, 4610");
            }
        });
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = plusButton.getText();
                getOperator(button_text);
                button_text = textDisplay2.getText() + plusButton.getText();
                textDisplay2.setText(button_text);
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = minusButton.getText();
                getOperator(button_text);
                button_text = textDisplay2.getText() + minusButton.getText();
                textDisplay2.setText(button_text);
            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = divideButton.getText();
                getOperator(button_text);
                button_text = textDisplay2.getText() + divideButton.getText();
                textDisplay2.setText(button_text);
            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = multiplyButton.getText();
                getOperator(button_text);
                button_text = textDisplay2.getText() + multiplyButton.getText();
                textDisplay2.setText(button_text);
            }
        });
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator) {
                    case '+':
                        total2 = total1 + Double.parseDouble(textDisplay1.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(textDisplay1.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(textDisplay1.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(textDisplay1.getText());
                        break;
                }
                textDisplay1.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textDisplay1.setText("");
                textDisplay2.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

