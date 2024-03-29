package OOP_Project.controller;

import OOP_Project.view.WelcomePage;
import java.awt.event.*;
import javax.swing.JButton;

import OOP_Project.view.RegistrationPage;
public class WelcomePageController implements ActionListener {
    private WelcomePage wPage;
    private JButton registerButton;
    public WelcomePageController(WelcomePage wPage, JButton registerButton) {
        this.wPage = wPage;
        this.registerButton = registerButton;
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton){
            wPage.dispose();
            new RegistrationPage();
        }
    }
}

