package Tester;

import GUI.MainMenuFrame;

import javax.swing.*;

public class MainMenuTester {
    public static void main(String[] args) {
        MainMenuFrame frame = new MainMenuFrame();
        frame.setContentPane(new MainMenuFrame().getMainMenuPanel() );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
