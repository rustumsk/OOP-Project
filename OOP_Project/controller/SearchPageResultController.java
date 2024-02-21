package OOP_Project.controller;

import OOP_Project.model.Milk;
import OOP_Project.model.SearchData;

import OOP_Project.view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class SearchPageResultController implements ActionListener{
    private SearchResultPage sRPage;
    private JButton back, profile,milk, search,signOut;

    public SearchPageResultController(SearchResultPage sRPage, JButton back,JButton milk,  JButton signOut, JButton profile,JButton search){
        this.sRPage = sRPage;
        this.back = back;
        this.milk = milk;
        this.profile = profile;
        this.signOut = signOut;
        this.search = search;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == back){
            sRPage.dispose();
            SearchData.milkNames.clear();
            Milk.milks.clear();
            new DashBoard();
        }
        else if (e.getSource() == profile){
            sRPage.dispose();
            SearchData.milkNames.clear();
            Milk.milks.clear();
            new ProfilePage(" ", 0, " ");
        }
        else if (e.getSource() == milk){
            for (int i = 0; i < Milk.milks.size(); i++){//this iterates through the ArrayList(which is in the milk class)
                if (milk.getText().equals(Milk.milks.get(i).getMName())){//checks if the milkbutton's text matches the milkname in the milk object within the arraylist
                    sRPage.dispose();
                    new MilkPage(Milk.milks.get(i));//if it checks, then passes the , milk object as an arguement to instantiate a milkpage class.
                }
            }
        }
        else if (e.getSource() == signOut){
            int result = JOptionPane.showConfirmDialog(null, "Are you sure?", "Signout", JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION){
                sRPage.dispose();
                new WelcomePage();
            }
        }
        else if (e.getSource() == search){
            sRPage.dispose();
            SearchData.milkNames.clear();
            Milk.milks.clear();
            new DashBoard();
        }
    }      
}
