import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleAction implements ActionListener {
    private JTextField smallField;
    private JPanel container;
    public SimpleAction(JTextField smallField,JPanel container){
        this.container = container;
        this.smallField = smallField;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (smallField.getText().equalsIgnoreCase("Green") ||
                smallField.getText().equalsIgnoreCase("Blue") ||
                smallField.getText().equalsIgnoreCase("Red"))  {
            btn.setEnabled(false);
            if(smallField.getText().equalsIgnoreCase("Green")){
                container.setBackground(Color.GREEN);
            }
            if(smallField.getText().equalsIgnoreCase("Blue")){
                container.setBackground(Color.BLUE);
            }
            if(smallField.getText().equalsIgnoreCase("Red")){
                container.setBackground(Color.RED);
            }

        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Niepoprawna nazwa koloru: " + smallField.getText());
        }

    }
}
