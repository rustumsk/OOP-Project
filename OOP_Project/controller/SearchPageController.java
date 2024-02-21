package OOP_Project.controller;

import OOP_Project.view.ProfilePage;
import OOP_Project.model.Milk;
import OOP_Project.model.Register;
import OOP_Project.model.SearchData;
import OOP_Project.view.DashBoard;
import OOP_Project.view.SearchResultPage;
import OOP_Project.view.WelcomePage;

import java.awt.event.*;

//import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class SearchPageController implements ActionListener {
    private DashBoard sPage;
    private JButton submit,clear,signOut,profile;
    public SearchPageController(DashBoard sPage, JButton submit,JButton clear, JButton signOut,JButton profile){
        this.sPage = sPage;
        this.submit = submit;
        this.signOut = signOut;
        this.profile = profile;
        this.clear = clear;
    }
    
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == signOut){
            int result = JOptionPane.showConfirmDialog(null, "Are you sure?", "Signout", JOptionPane.YES_NO_OPTION);

            if(result == JOptionPane.YES_OPTION){
                sPage.dispose();
                new WelcomePage();
            }
        }
        else if (e.getSource() == profile){
            sPage.dispose();
            new ProfilePage(Register.user.get(0).getfName(), Register.user.get(0).getAge(), Register.user.get(0).getEmail());
        }
        else if (e.getSource() == clear)
            clear();
        else {
            sPage.dispose();
            Milk.makeData();
            SearchData.createData();
            new SearchData(sPage.getSelectedGender(), sPage.getAge().getSelectedItem().toString(), sPage.getStatus().getSelectedItem().toString(),
                    sPage.getCondition().getSelectedItem().toString(), sPage.getLevel().getSelectedItem().toString());
            new SearchResultPage();
            
        }
    }

    public void clear(){
        sPage.getGender().clearSelection();
        sPage.getAge().setSelectedIndex(0);
        sPage.getStatus().setSelectedIndex(0);
        sPage.getCondition().setSelectedIndex(0);
        sPage.getLevel().setSelectedIndex(0);
    }
}
