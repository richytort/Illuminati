package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Game.Player;

public class MainMenuFrame extends JFrame{
    private JButton createPlayerButton;
    private JPanel mainMenuPanel;
    private JButton startButton;
    private JLabel title;
    private JButton quitButton;

    static protected Player one ;
    static protected Player two ;

    public MainMenuFrame() {
        one = new Player();
        two = new Player();

        createPlayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreatePlayerFrame cPF = new CreatePlayerFrame() ;
                cPF.setContentPane(new CreatePlayerFrame().getCreatePlayerPanel() );
                cPF.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                cPF.pack();
                cPF.setVisible(true);
            }
        });
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent click) {

            }
        });
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
    }

    public JPanel getMainMenuPanel(){
        return mainMenuPanel;
    }


}
