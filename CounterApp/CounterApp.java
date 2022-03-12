/**
 * GB Java. Homework 8
 *
 * @author Viktor A. Volkov
 * @version 12.3.2022
 */
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

class CounterApp extends JFrame{

    private int value;

    public static void main(String[] args){
        new CounterApp(0);
    }

    CounterApp(int intialValue) {
        setTitle("Simple Counter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 300);
        setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.BOLD, 56);

        value = intialValue;

        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setText(String.valueOf(value));
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value--;
                counterValueView.setText(String.valueOf(value));
            }
        });
        add(decrementButton, BorderLayout.WEST);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value++;
                counterValueView.setText(String.valueOf(value));
            }
        });
        add(incrementButton, BorderLayout.EAST);

        JButton decrementTenButton = new JButton("v");
        decrementTenButton.setFont(font);
        decrementTenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value-=10;
                counterValueView.setText(String.valueOf(value));
            }
        });
        add(decrementTenButton, BorderLayout.SOUTH);

        JButton incrementTenButton = new JButton("^");
        incrementTenButton.setFont(font);
        incrementTenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value+=10;
                counterValueView.setText(String.valueOf(value));
            }
        });
        add(incrementTenButton, BorderLayout.NORTH);

        setVisible(true);
    }
}