package OOP_Project.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MilkPage extends JFrame {
   private Dimension screenSize;
   private ImageIcon logoIcon1, logoIcon2, logoIcon3a, logoIcon3b;
   private Container con3;
   private JMenuBar bar;
   private JMenuBar barLine;
   private JMenu menu;
   private JMenuItem profile, search, signOut;
   private JLabel logo, title, word;
   private JButton done;
   private JLabel black1, black2;
   
   public MilkPage() {
      setTitle("Milkipedia Milk Profile");
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      setSize(screenSize.width, screenSize.height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
      
      logoIcon1 = new ImageIcon("logoOrig.png");
      setIconImage(logoIcon1.getImage());
      logoIcon2 = new ImageIcon("logoOrig1.png");
      logoIcon3a = new ImageIcon("black.png");
      logoIcon3b = new ImageIcon("blackRev.png");
      
      con3 = getContentPane();
		con3.setLayout(null);
      
      barLine = new JMenuBar();
      barLine.setBounds(0, 0, screenSize.width-15, 35);
      barLine.setBackground(Color.BLACK);
      
      bar = new JMenuBar();
      bar.setBounds(screenSize.width-126, 0, 110, 33);
      bar.add(Box.createHorizontalGlue());
      bar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
      
      menu = new JMenu(" MENU ");
      menu.setForeground(Color.BLACK);
      menu.setFont(new Font("Courier", Font.BOLD, 29));
      menu.setFocusable(false);
      menu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      menu.addMouseListener(new MouseAdapter() {
      
      @Override
      public void mouseEntered(MouseEvent e) {          
         menu.setBackground(Color.BLACK);
         menu.setForeground(Color.WHITE);
      }
            
      @Override
      public void mouseExited(MouseEvent e) {
         menu.setBackground(Color.WHITE);
         menu.setForeground(Color.BLACK);
      }
      });
            
      profile = new JMenuItem("Profile");
      profile.setForeground(Color.BLACK);
      profile.setFont(new Font("Courier", Font.BOLD, 20));
      profile.setSize(80, 30);
      profile.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
      profile.setBackground(Color.WHITE);
      profile.setFocusable(false);
      menu.add(profile);
      
      search = new JMenuItem("Search");
      search.setForeground(Color.BLACK);
      search.setFont(new Font("Courier", Font.BOLD, 20));
      search.setSize(80, 30);
      search.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
      search.setBackground(Color.WHITE);
      search.setFocusable(false);
      menu.add(search);
      
      signOut = new JMenuItem("Sign Out");
      signOut.setForeground(Color.BLACK);
      signOut.setFont(new Font("Courier", Font.BOLD, 20));
      signOut.setSize(80, 30);
      signOut.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
      signOut.setBackground(Color.WHITE);
      signOut.setFocusable(false);
      menu.add(signOut);
      bar.add(menu);
      con3.add(bar);
      con3.add(barLine);
      
      logo = new JLabel();
      logo.setBounds(260, 30, 150, 200);
      logo.setIcon(logoIcon2);
      con3.add(logo);
      
      title = new JLabel("MILKIPEDIA");
      title.setForeground(Color.BLACK);
		title.setFont(new Font("Courier", Font.BOLD, 120));
		title.setBounds(410, 70, 1000, 90);
		con3.add(title);
      
      word = new JLabel("Cow Milk");
      word.setForeground(Color.BLACK);
      word.setFont(new Font("Courier", Font.BOLD, 40));
      word.setBounds(410, 160, 400, 50);
      con3.add(word);
      
      done = new JButton("DONE");
      done.setForeground(Color.BLACK);
      done.setFont(new Font("Courier", Font.BOLD, 25));
      done.setBackground(Color.WHITE);
      done.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
      done.setBounds(825, 600, 150, 30);
      done.setFocusable(false);
      done.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      done.addMouseListener(new MouseAdapter() {
      
      @Override
      public void mouseEntered(MouseEvent e) {          
         done.setBackground(Color.BLACK);
         done.setForeground(Color.WHITE);
      }
            
      @Override
      public void mouseExited(MouseEvent e) {
         done.setBackground(Color.WHITE);
         done.setForeground(Color.BLACK);
      }
      });
      
      con3.add(done);
      
      black1 = new JLabel();
      black1.setIcon(logoIcon3a);
      black1.setBounds(-230, -10, 500, 500);
      con3.add(black1);
      
      black2 = new JLabel();
      black2.setIcon(logoIcon3b);
      black2.setBounds(1082, 280, 500, 500);
      con3.add(black2);
      
      setVisible(true);
   }
   
   public JButton getDone() {
      return done;
   }
   
   public JMenuItem getProfile() {
      return profile;
   }
   
   public JMenuItem getSearch() {
      return search;
   }
   
   public JMenuItem getSignOut() {
      return signOut;
   }
}