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

                MainMenuFrame.one.setName(firstPlayerName.getText());
                MainMenuFrame.two.setName(secondPlayerName.getText());

                System.out.println(MainMenuFrame.one.getName());
                System.out.println(MainMenuFrame.two.getName());
            }
        });
    }

    public JPanel getCreatePlayerPanel(){
        return createPlayerPanel;
    }
}
