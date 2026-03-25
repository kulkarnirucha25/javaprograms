import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterGUI extends JFrame implements ActionListener {

    private int count = 0;
    private JTextField textField;
    private JButton btnUp, btnDown, btnReset;

    public CounterGUI() {
        setTitle("Counter");
        setSize(300, 120);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label
        add(new JLabel("Counter"));

        // Text Field
        textField = new JTextField("0", 5);
        textField.setEditable(false);
        add(textField);

        // Buttons
        btnUp = new JButton("Count Up");
        btnDown = new JButton("Count Down");
        btnReset = new JButton("Reset");

        add(btnUp);
        add(btnDown);
        add(btnReset);

        // Action Listeners
        btnUp.addActionListener(this);
        btnDown.addActionListener(this);
        btnReset.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnUp) {
            count++;
        } else if (e.getSource() == btnDown) {
            count--;
        } else if (e.getSource() == btnReset) {
            count = 0;
        }
        textField.setText(String.valueOf(count));
    }

    public static void main(String[] args) {
        new CounterGUI();
    }
}