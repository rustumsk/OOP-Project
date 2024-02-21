package OOP_Project.controller;

import OOP_Project.model.Register;
import OOP_Project.view.RegistrationPage;
import OOP_Project.view.DashBoard;
import OOP_Project.view.TermsAndConditionsPage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;


public class RegistrationPageController implements ActionListener {
    private RegistrationPage rPage;
    private JButton submitButton;
    private JButton clearButton;
    private JCheckBox terms;
 

    public RegistrationPageController(RegistrationPage rPage, JCheckBox terms, JButton submitButton, JButton clearButton){
        this.rPage = rPage;
        this.terms = terms;
        this.submitButton = submitButton;
        this.clearButton = clearButton;
    }
    //JOptionPane.showMessageDialog(null, "Everything is empty nigga", "Warning", JOptionPane.WARNING_MESSAGE);
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == terms){
            new TermsAndConditionsPage();
        }
        else if (e.getSource() == submitButton){
            if (rPage.isEmpty()){
                JOptionPane.showMessageDialog(null, "Everything is empty!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if (rPage.getFName().getText().equals("First Name") || rPage.getFName().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please fill up your first name!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if (rPage.getLName().getText().equals("Last Name") || rPage.getLName().getText().equals("") ){
                JOptionPane.showMessageDialog(null, "Please fill up your last name!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if (rPage.getSuffix().getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(null, "Please choose a suffix option!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if (rPage.getMonth().getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(null, "Please choose a month!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if (rPage.getDay().getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(null, "Please choose a day!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if (rPage.getYear().getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(null, "Please choose a year!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if (rPage.getGender().getSelection() == null){
                JOptionPane.showMessageDialog(null, "Please choose a gender!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if (rPage.getEmail().getText().equals("Email") || (rPage.getEmail().getText().equals(""))){
                JOptionPane.showMessageDialog(null, "Please fill up your email!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if (rPage.getCEmail().getText().equals("Confirm Email") || (rPage.getEmail().getText().equals(""))){
                JOptionPane.showMessageDialog(null, "Please confirm your email!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if (!rPage.getEmail().getText().equals(rPage.getCEmail().getText())){
                JOptionPane.showMessageDialog(null, "Email doesnt match the confirmation email! please match it!!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if (TermsAndConditionsController.terms == true){
                JOptionPane.showMessageDialog(null, "Check and Accept!! Terms and Conditions!!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else {
                String mName = null;
                if (rPage.getMName().getText().equals("Middle Name") || rPage.getMName().getText().equals("")) mName = null;
                else mName = rPage.getMName().getText();
                Register user = new Register(rPage.getFName().getText(), rPage.getLName().getText(), mName, rPage.getSuffix().getSelectedItem().toString(), rPage.getMonth().getSelectedItem().toString()
                            ,  rPage.getDay().getSelectedItem().toString(),  rPage.getYear().getSelectedItem().toString(), rPage.getEmail().getText());
                Register.user.add(user);
                JOptionPane.showMessageDialog(null, "Welcome to MilkiPedia!", "Warning", JOptionPane.INFORMATION_MESSAGE);
                rPage.dispose();
                new DashBoard();
            }
        }
        else if (e.getSource() == clearButton){
            Reset();
        }
    }

    private void Reset(){
            rPage.setFName();
            rPage.setMName();
            rPage.setLName();
            rPage.getSuffix().setSelectedIndex(0);
            rPage.getGender().clearSelection();
            rPage.getYear().setSelectedIndex(0);
            rPage.getMonth().setSelectedIndex(0);
            rPage.getDay().setSelectedIndex(0);
            rPage.setEmail();
            rPage.setCEmail();
            rPage.getTerm().setSelected(false);
    }
}
