package OOP_Project.controller;

import OOP_Project.view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ProfilePageController implements ActionListener {
    private ProfilePage pPage;
    private JButton signOut, back, search;
    public ProfilePageController(ProfilePage pPage, JButton signOut, JButton back, JButton search){
        this.pPage = pPage;
        this.signOut = signOut;
        this.back = back;
        this.search = search;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signOut){
            int result = JOptionPane.showConfirmDialog(null, "Are you sure?", "Signout", JOptionPane.YES_NO_OPTION);

            if(result == JOptionPane.YES_OPTION){
                pPage.dispose();
                new WelcomePage();
            }
        }
        else if (e.getSource() == back){
            pPage.dispose();
            new DashBoard();
        }
        else if (e.getSource() == search){
            pPage.dispose();
            new DashBoard();
        }
    }
}
