import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonGUI extends JFrame implements ActionListener {

    private JRadioButton male, female, other;
    private JButton submit;
    private JLabel result;

    public RadioButtonGUI() {
        setTitle("Gender Selection");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Radio Buttons
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        other = new JRadioButton("Other");

        // Group (important!)
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);
        group.add(other);

        add(new JLabel("Select Gender:"));
        add(male);
        add(female);
        add(other);

        // Button
        submit = new JButton("Submit");
        add(submit);

        // Result Label
        result = new JLabel("");
        add(result);

        // Action
        submit.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (male.isSelected()) {
            result.setText("Selected: Male");
        } else if (female.isSelected()) {
            result.setText("Selected: Female");
        } else if (other.isSelected()) {
            result.setText("Selected: Other");
        } else {
            result.setText("Please select an option!");
        }
    }

    public static void main(String[] args) {
        new RadioButtonGUI();
    }
}