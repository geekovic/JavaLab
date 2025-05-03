import java.awt.*;
import java.awt.event.*;

public class AWTEventHandling extends Frame implements ActionListener {

    Button button;
    Label label;

    // Constructor
    AWTEventHandling() {
        // Create components
        button = new Button("Click Me");
        label = new Label("Waiting for click...");

        // Set layout and component positions
        setLayout(null);

        button.setBounds(100, 100, 80, 30);
        label.setBounds(100, 150, 200, 30);

        // Add components to frame
        add(button);
        add(label);

        // Add event listener
        button.addActionListener(this);

        // Frame settings
        setTitle("AWT Event Handling");
        setSize(300, 250);
        setVisible(true);

        // Window close handling
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    // Action event handling
    public void actionPerformed(ActionEvent e) {
        label.setText("Button clicked!");
    }

    // Main method
    public static void main(String[] args) {
        new AWTEventHandling();
    }
}
