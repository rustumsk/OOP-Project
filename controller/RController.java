package OOP_Project.controller;

import OOP_Project.view.*;
import OOP_Project.model.Register;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class RController implements ActionListener {
    private RegistrationPage rPage;
    private JButton submitButton;
    private JButton clearButton;
    private String firstN;
    private String lastN;
    private String middleN;

    public RController(RegistrationPage rPage, JButton submitButton, JButton clearButton){
        this.rPage = rPage;
        this.submitButton = submitButton;
        this.clearButton = clearButton;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == submitButton){
            JOptionPane.showMessageDialog(null, "Registered", "User", JOptionPane.INFORMATION_MESSAGE);
            rPage.dispose();
            firstN = rPage.getFName().toString();
            middleN = rPage.getMName().toString();
            new SearchPage();
        }
        if (e.getSource() == clearButton){
            Reset();
        }
    }
    
    private void Reset(){
            rPage.getFName().setText("");
            rPage.getLName().setText("");
            rPage.getMName().setText("");
            rPage.getSuffix().setSelectedIndex(0);
            rPage.getGender().setSelected(true);
            rPage.getYear().setSelectedIndex(0);
            rPage.getMonth().setSelectedIndex(0);
            rPage.getDay().setSelectedIndex(0);
            rPage.getSuffix().setSelectedIndex(0);
            rPage.getCountry().setSelectedIndex(0);
            rPage.getEmail().setText("");
            rPage.getTerm().setSelected(false);
    }
}
