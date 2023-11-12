import javax.swing.*;

import java.awt.*;

public class TextFieldTest extends JFrame {
    private JTextField smallField;
    private JPanel container;
    private    final  String  BUTTON_NAME = "button1";

    public TextFieldTest() {
        super("Zadanie 1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        container = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton button1 = new JButton();
        button1.setName(BUTTON_NAME);
        button1.setText("Zmień");
        button1.setMnemonic('Z');
        smallField = new JTextField(15);
        container.add(smallField);
        container.add(button1);

        SimpleAction simpleAction = new SimpleAction(smallField,container);
        button1.addActionListener(simpleAction);

        setContentPane(container);
        setSize(400, 130);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextFieldTest();
            }
        });
    }
}