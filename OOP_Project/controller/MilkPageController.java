package OOP_Project.controller;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import OOP_Project.view.SearchResultPage;
import java.awt.event.*;
import OOP_Project.view.MilkPage;

public class MilkPageController implements ActionListener {
    private MilkPage mPage;
    private JButton back,done;
    public  MilkPageController (MilkPage mPage, JButton back, JButton done){
        this.mPage = mPage;
        this.back = back;
        this.done = done;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back){
            mPage.dispose();
            new SearchResultPage();
        }
        else{
            JOptionPane.showMessageDialog(null, "Thank you for using MilkiPedia!");
            mPage.dispose();
        }
    }
}
