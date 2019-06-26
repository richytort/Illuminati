package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component ;

public class CreatePlayerFrame extends JFrame {
    private JButton buttonMsg;
    private JPanel createPlayerPanel;
    private JTextField firstPlayerName;
    private JTextField secondPlayerName;
    private JButton saveButton;
    private JButton cancelButton;

    public CreatePlayerFrame() {

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent click) {
                Component b = (Component) click.getSource();
                JFrame c = (JFrame) SwingUtilities.getRoot(b);
                c.setVisible(false);
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent click) {
                Component b = (Component) click.getSource();
                JFrame c = (JFrame) SwingUtilities.getRoot(b);
                c.setVisible(false);

                System.out.println(firstPlayerName.getText());
                System.out.println(secondPlayerName.getText());
            }
        });
    }

    public JPanel getCreatePlayerPanel(){
        return createPlayerPanel;
    }
}
