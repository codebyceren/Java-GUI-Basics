
import javax.swing.*; // Import GUI components
import java.awt.*; // Import layout managers

public class MyFirstGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("My First GUI"); // Create the main window

        JPanel panel = new JPanel(); // Create a panel to hold components

        panel.setLayout(new FlowLayout()); // Arrange components horizontally

        JLabel label = new JLabel("Enter your name:"); // Create a text label

        JTextField textField = new JTextField(15); // Create a text input field

        JButton button = new JButton("Click Me"); // Create a button

        JLabel result = new JLabel(" "); // Create an empty result label

        panel.add(label); // Add the label to the panel
        panel.add(textField); // Add the text field to the panel
        panel.add(button); // Add the button to the panel
        panel.add(result); // Add the result label to the panel

        button.addActionListener(e -> { // Listen for button clicks

            String name = textField.getText(); // Get the entered name

            result.setText("Hello, " + name); // Display the result

        });

        frame.add(panel); // Add the panel to the window

        frame.setSize(400, 150); // Set the window size

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the window is closed

        frame.setLocationRelativeTo(null); // Center the window on the screen

        frame.setVisible(true); // Make the window visible
    }
}
