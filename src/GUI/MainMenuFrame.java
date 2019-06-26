package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuFrame extends JFrame{
    private JButton createPlayerButton;
    private JPanel mainMenuPanel;
    private JButton startButton;

    public MainMenuFrame() {

        createPlayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreatePlayerFrame cPF = new CreatePlayerFrame() ;
                cPF.setContentPane(new CreatePlayerFrame().getCreatePlayerPanel() );
                cPF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                cPF.pack();
                cPF.setVisible(true);
            }
        });
    }

    public JPanel getMainMenuPanel(){
        return mainMenuPanel;
    }
}
