package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreatePlayerFrame extends JFrame {
    private JButton buttonMsg;
    private JPanel createPlayerPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton saveButton;
    private JButton cancelButton;

    public CreatePlayerFrame() {

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
    }

    public JPanel getCreatePlayerPanel(){
        return createPlayerPanel;
    }
}
