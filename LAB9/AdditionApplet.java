import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="AdditionApplet" width="400" height="300">
</applet>
*/

public class AdditionApplet extends Applet implements ActionListener {

    TextField num1, num2;
    Button addButton;
    int sum = 0;
    boolean calculated = false;

    public void init() {
        // Set layout and background
        setLayout(null);
        setBackground(Color.lightGray);

        // Create components
        Label l1 = new Label("Enter First Number:");
        Label l2 = new Label("Enter Second Number:");
        num1 = new TextField(10);
        num2 = new TextField(10);
        addButton = new Button("Add");

        // Set bounds
        l1.setBounds(30, 50, 150, 20);
        num1.setBounds(200, 50, 100, 20);
        l2.setBounds(30, 90, 150, 20);
        num2.setBounds(200, 90, 100, 20);
        addButton.setBounds(150, 140, 80, 30);

        // Add components
        add(l1); add(num1);
        add(l2); add(num2);
        add(addButton);

        // Register listener
        addButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(num1.getText());
            int b = Integer.parseInt(num2.getText());
            sum = a + b;
            calculated = true;
            repaint(); // Calls paint() method
        } catch (NumberFormatException ex) {
            sum = 0;
            calculated = false;
            showStatus("Please enter valid integers.");
        }
    }

    public void paint(Graphics g) {
        if (calculated) {
            g.setColor(Color.blue);
            g.drawString("Sum is: " + sum, 150, 200);
        }
    }
}
