package OOP_Project.view;

import OOP_Project.controller.TermsAndConditionsController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TermsAndConditionsPage extends JFrame {
    private TermsAndConditionsController controller;
    private ImageIcon logoIcon1;
    private JTextArea termsArea;
    private JScrollPane scrollPane;
    private JScrollBar scrollBar;
    private JPanel buttonPanel;
    private JButton agree;
    private JButton disagree;

    public TermsAndConditionsPage() {
        setTitle("Milkipedia Terms And Conditions");
        setBounds(500, 150, 400, 400);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
        setResizable(true);
        
        logoIcon1 = new ImageIcon("images/logoOrig.png");
        setIconImage(logoIcon1.getImage());

        termsArea = new JTextArea();
        termsArea.setForeground(Color.BLACK);
        termsArea.setFont(new Font("Courier", Font.PLAIN, 15));
        termsArea.setText("Welcome to Milkipedia!\n\n" +
                "By registering, you agree to the following terms and conditions:\n\n" +
                "1. Milkipedia is a recommendation site that provides suggestions on various milks.\n" +
                "2. Users are responsible for the accuracy and appropriateness of their recommendations.\n" +
                "3. Respect the privacy of other users and do not engage in abusive behavior.\n" +
                "4. Milkipedia reserves the right to moderate content and suspend accounts violating the terms.\n" +
                "5. By registering, you agree to receive occasional emails and updates from Milkipedia.\n\n" +
                "Thank you for joining Milkipedia!");

        termsArea.setEditable(false);
        termsArea.setLineWrap(true);
        termsArea.setWrapStyleWord(true);

        scrollPane = new JScrollPane(termsArea);

        scrollBar = scrollPane.getVerticalScrollBar();
        scrollBar.setValue(0);
        scrollPane.add(scrollBar);
        
        buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.WHITE);

        agree = new JButton(" I AGREE ");
        agree.setForeground(Color.BLACK);
        agree.setFont(new Font("Courier", Font.BOLD, 13));
        agree.setBackground(Color.WHITE);
        agree.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        agree.setFocusable(false);
        agree.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        agree.addActionListener(controller = new TermsAndConditionsController(this, disagree, agree));
        agree.addMouseListener(new MouseAdapter() {
      
        @Override
        public void mouseEntered(MouseEvent e) {          
            agree.setBackground(Color.BLACK);
            agree.setForeground(Color.WHITE);
        }
            
        @Override
        public void mouseExited(MouseEvent e) {
            agree.setBackground(Color.WHITE);
            agree.setForeground(Color.BLACK);
        }
        });

        disagree = new JButton(" I DISAGRE ");
        disagree.setForeground(Color.BLACK);
        disagree.setFont(new Font("Courier", Font.BOLD, 13));
        disagree.setBackground(Color.WHITE);
        disagree.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        disagree.setFocusable(false);
        disagree.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        disagree.addActionListener(controller = new TermsAndConditionsController(this, disagree, agree));
        disagree.addMouseListener(new MouseAdapter() {
      
        @Override
        public void mouseEntered(MouseEvent e) {          
            disagree.setBackground(Color.BLACK);
            disagree.setForeground(Color.WHITE);
        }
            
        @Override
        public void mouseExited(MouseEvent e) {
            disagree.setBackground(Color.WHITE);
            disagree.setForeground(Color.BLACK);
        }
        });

        buttonPanel.add(agree);
        buttonPanel.add(disagree);

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}