package OOP_Project.view;

import javax.swing.*;
import javax.swing.border.Border;

//import OOP_Project.view.*;
import OOP_Project.controller.ProfilePageController;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class ProfilePage extends JFrame {
   private ProfilePageController controller;
   private Dimension screenSize;
   private ImageIcon logoIcon, patternTopRight, patternBottomLeft, blackIcon, profilePic;
   private JButton search, signOut;
   private JLabel title, word;
   private JLabel profile;
   private JLabel fullName, age, email;
   private JButton back;
   private JLabel black1, black2, black3;

   public static ImageIcon createImage(String path, int width, int height) {
      ImageIcon icon = new ImageIcon(Objects.requireNonNull(DashBoard.class.getResource(path)));
      return new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
  }
   
   public ProfilePage(String fullNameR, int ageR, String emailR) {
      Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
      setTitle("Milkipedia Milk Profile");
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      setSize(screenSize.width, screenSize.height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
      setExtendedState(JFrame.MAXIMIZED_BOTH);
      setLayout(new GridBagLayout());

      profilePic = createImage("images/nunez.png", 130, 130);
      logoIcon = createImage("images/logoBig.png", 65, 65); // cow image
      patternTopRight = createImage("images/patternRight.png", 320, 320);
      patternBottomLeft = createImage("images/patternLeft.png", 320, 320);
      blackIcon = createImage("images/blob2.png", 290, 290);
      setIconImage(logoIcon.getImage());

      black1 = new JLabel();
      black1.setBounds(2, 350, 300, 300);
      black1.setIcon(patternBottomLeft);

      black2 = new JLabel();
      black2.setBounds(1148, 0, 300, 300);
      black2.setIcon(patternTopRight);

      black3 = new JLabel();
      black3.setBounds(575, 550, 300, 300);
      black3.setIcon(blackIcon);
      
      title = new JLabel("MILKIPEDIA"); // milkipedia text
      title.setForeground(Color.BLACK);
		title.setFont(new Font("Monospaced", Font.BOLD, 90));
      title.setIcon(logoIcon);
      title.setVerticalAlignment(JLabel.CENTER);
      title.setHorizontalAlignment(JLabel.CENTER);
      title.setIconTextGap(10);
		title.setBounds(350, 50, 730, 100);
      
      word = new JLabel("Profile Page"); // search result text
      word.setForeground(Color.BLACK);
      word.setFont(new Font("Monospaced", Font.PLAIN, 40));    
      word.setBounds(480, 120, 500, 70);
      
      profile = new JLabel();
      profile.setBounds(410, 230, 135, 150);
      profile.setIcon(profilePic);
      profile.setHorizontalAlignment(JLabel.CENTER);
      profile.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
      
      fullName = new JLabel("Full Name: " + fullNameR);
      fullName.setForeground(Color.BLACK);
      fullName.setFont(new Font("Monospaced", Font.BOLD, 25));
      fullName.setBounds(565, 235, 1000, 30);
      
      age = new JLabel("Age: " + ageR);
      age.setForeground(Color.BLACK);
      age.setFont(new Font("Monospaced", Font.BOLD, 25));
      age.setBounds(565, 265, 250, 30);

      email = new JLabel("Email: " + emailR);
      email.setForeground(Color.BLACK);
      email.setFont(new Font("Monospaced", Font.BOLD, 25));
      email.setBounds(565, 300, 1000, 30);
      // email.setBorder(border);
      
      back = new JButton("BACK"); // back text
      back.setForeground(Color.WHITE);
      back.setFont(new Font("Monospaced", Font.BOLD, 30)); // back text size
      back.setBackground(Color.BLACK);
      back.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
      back.setBounds(1125, 570, 300, 60);
      back.setFocusable(false);
      back.addActionListener(controller = new ProfilePageController(this, signOut, back, search));

      back.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseEntered(MouseEvent e) { 
            back.setBackground(Color.WHITE); 
            back.setForeground(Color.BLACK);
         }
         
         @Override
         public void mouseExited(MouseEvent e) { 
            back.setBackground(Color.BLACK);
            back.setForeground(Color.WHITE);
         }
      });
      
      search = new JButton("Search");
      search.setFont(new Font("Monospaced", Font.BOLD, 20));
      search.setBounds(0, 0, 100, 40);
      search.setFocusable(false);
      search.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      search.setHorizontalAlignment(JLabel.CENTER);
      search.setBorder(border);
      search.setForeground(Color.WHITE);
      search.setBackground(Color.BLACK);
      search.addActionListener(controller = new ProfilePageController(this, signOut, back, search));
      search.setOpaque(true);

      search.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseEntered(MouseEvent e) {
            search.setForeground(Color.BLACK);
            search.setBackground(new Color(0xE5E4E2));
         }

         @Override
         public void mouseExited(MouseEvent e) {
            search.setForeground(Color.WHITE);
            search.setBackground(Color.BLACK);
         }
      });

      signOut = new JButton("Signout");
      signOut.setFocusable(false);
      signOut.setFont(new Font("Monospaced", Font.BOLD, 20));
      signOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      signOut.setBounds(100, 0, 100, 40);
      signOut.setHorizontalAlignment(JLabel.CENTER);
      signOut.setBorder(border);
      signOut.setBackground(Color.BLACK);
      signOut.setForeground(Color.WHITE);
      signOut.addActionListener(controller = new ProfilePageController(this, signOut, back, search));
      signOut.setOpaque(true);

      signOut.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseEntered(MouseEvent e) {
            signOut.setForeground(Color.BLACK);
            signOut.setBackground(new Color(0xE5E4E2));
         }

         @Override
         public void mouseExited(MouseEvent e) {
            signOut.setForeground(Color.WHITE);
            signOut.setBackground(Color.BLACK);
         }
      });

      JPanel mainPanel = new JPanel();
      mainPanel.setPreferredSize(new Dimension(1450, 650));
      mainPanel.setBackground(Color.WHITE);
      mainPanel.setLayout(null);
      mainPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
      mainPanel.add(search);
      mainPanel.add(signOut);
      mainPanel.add(back);
      mainPanel.add(black1);
      mainPanel.add(black2);
      mainPanel.add(black3);
      mainPanel.add(title);
      mainPanel.add(word);
      mainPanel.add(profile);
      mainPanel.add(fullName);
      mainPanel.add(age);
      mainPanel.add(email);

      add(mainPanel);
      setVisible(true);
   }
   
   public JButton getBack() {
      return back;
   }
   
   public JButton getSearch() {
      return search;
   }
   
   public JButton getSignOut() {
      return signOut;
   }
}