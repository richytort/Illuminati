package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreatePlayerFrame extends JFrame {
    private JButton buttonMsg;
    private JPanel createPlayerPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;

    public CreatePlayerFrame() {

    }

    public JPanel getCreatePlayerPanel(){
        return createPlayerPanel;
    }
}
