package OOP_Project.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import OOP_Project.controller.MilkPageController;
import OOP_Project.model.*;

public class MilkPage extends JFrame {
   private MilkPageController controller;
   private Milk milk;
   private Dimension screenSize;
   private JPanel mainPanel;
   private JLabel title,bTitle,bLTitle,aName,nutrients,nutrients1,sName,logo1,logo2,logo3,logo4,logo5,logo6,logo7,logo8,logo9,logo10,logo11,dash,dash2,dash3,dash5,bFit,bFor,brandName1,
   brandName2,brandName3,brandLink1,brandLink2,brandLink3;
   private JTextArea description,bFit2,mName,milkDescription,bestF;
   private ImageIcon patternRight, patternBottom,icon,pic,pic1,pic2,pic3,pic4,pic5,pic6,pic7,pic8,pic9,pic10,pic11;
   private JButton back,done;

   public static ImageIcon createImage(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(Objects.requireNonNull(MilkPage.class.getResource(path)));
        return new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
   }

   public MilkPage(Milk milk)
	{  
      String[] benefits = milk.getBenefits();
      String[] mNutrients = milk.getNutrients();
      String[] bestFor = milk.getBest();
      String[] brand1 = milk.getBrand1();
      String[] brand2 = milk.getBrand2();
      String[] brand3 = milk.getBrand3();

      patternRight = createImage("images/patternRight.png", 150, 150);
      patternBottom = createImage("images/patternBottomRight.png", 250, 250);
      icon = createImage("images/logoSmall.png",40,40);
      pic = createImage(milk.getImage(), 270, 130);
      pic1 = createImage(brand1[1],150,160);
      pic2 = createImage(brand2[1],200,160);
      pic3 = createImage(brand3[1],200,160);
      pic4 = createImage("images/black.png", 100, 100);
      pic5 = createImage("images/blob.png", 250,250);
      pic6 = createImage("images/black.png", 80, 80);
      pic7 = createImage("images/blob.png", 80, 80);
      pic8 = createImage("images/blackRev.png", 200, 200);
      pic9 = createImage("images/back.png", 20, 20);
      pic10 = createImage("images/check.png", 20, 20);
      pic11 = createImage("images/logoOrig.png", 50, 50);

      this.milk = milk;
      screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      this.setSize(screenSize);
      this.setLayout(new GridBagLayout());
      this.setIconImage(pic11.getImage());
      this.setTitle("Milk Page");
      this.getContentPane().setBackground(new Color(0xFFC0CB));

      mainPanel = new JPanel();
      mainPanel.setPreferredSize(new Dimension(1200,750));
      mainPanel.setBackground(Color.WHITE);
      //mainPanel.setBackground(new Color(0xF5ECEE));
      mainPanel.setLayout(null);

      logo1 = new JLabel();
      logo1.setIcon(patternRight);
      logo1.setBounds(1049,-24,300,200);
      mainPanel.add(logo1);

      logo2 = new JLabel();
      logo2.setIcon(patternBottom);
      logo2.setBounds(955,570,300,180);
      mainPanel.add(logo2);

      logo3 = new JLabel();
      logo3.setIcon(pic);
      logo3.setBounds(80,60,600,300);
      mainPanel.add(logo3);

      logo4 = new JLabel();
      logo4.setIcon(pic1);
      logo4.setBounds(650,150,220,170);
      mainPanel.add(logo4);

      logo5 = new JLabel();
      logo5.setIcon(pic2);
      logo5.setBounds(650,330,180,170);
      mainPanel.add(logo5);

      logo6 = new JLabel();
      logo6.setIcon(pic3);
      logo6.setBounds(650,510,180,170);
      mainPanel.add(logo6);

      logo7 = new JLabel();
      logo7.setIcon(pic4);
      logo7.setBounds(150,30,100,100);
      mainPanel.add(logo7);

      logo8 = new JLabel();
      logo8.setIcon(pic5);
      logo8.setBounds(-5,650,250,250);
      mainPanel.add(logo8);

      logo10 = new JLabel();
      logo10.setIcon(pic7);
      logo10.setBounds(900,65,80,80);
      mainPanel.add(logo10);

      logo11 = new JLabel();
      logo11.setIcon(pic8);
      logo11.setBounds(640,638,250,250);
      mainPanel.add(logo11);

      JPanel menu = new JPanel();
        menu.setLayout(new GridLayout(1,1));
        menu.setBackground(Color.RED);
        menu.setBounds(0,0,150,27);

        back = new JButton("Back");
        back.setIcon(pic9);
        back.setBackground(Color.WHITE);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(controller = new MilkPageController(this,back,done));
        back.setFocusable(false);

        done = new JButton("Done");
        done.setBackground(Color.WHITE);
        done.setIcon(pic10);
        done.setBorder(BorderFactory.createEmptyBorder());
        done.addActionListener(controller = new MilkPageController(this,back,done));
        done.setFocusable(false);

        menu.add(back);
        menu.add(done);
        mainPanel.add(menu);

      title = new JLabel("Milkipedia");
      title.setIcon(icon);
      title.setFont(new Font("MonoSpaced",Font.BOLD, 50));
      title.setForeground(Color.BLACK);
      title.setBounds(400,30,350,60);
      mainPanel.add(title);

      bTitle = new JLabel(milk.getMName());
      bTitle.setFont(new Font("MonoSpaced", Font.BOLD,20));
      bTitle.setForeground(Color.BLACK);
      bTitle.setBounds(407,88,250,25);
      mainPanel.add(bTitle);

      bLTitle = new JLabel("DETAILS");
      bLTitle.setFont(new Font("MonoSpaced", Font.PLAIN,30));
      bLTitle.setForeground(Color.BLACK);
      bLTitle.setBounds(635,82,230,35);
      mainPanel.add(bLTitle);

      aName = new JLabel(milk.getName());
      aName.setFont(new Font("MonoSpaced", Font.BOLD, 15));
      aName.setForeground(Color.black);
      aName.setBounds(78,240,130,100);
      mainPanel.add(aName);

      sName = new JLabel(milk.getSName());
      sName.setFont(new Font("MonoSpaced", Font.BOLD, 15));
      sName.setForeground(Color.black);
      sName.setBounds(195,240,235,100);
      mainPanel.add(sName);

      dash = new JLabel("-");
      dash.setFont(new Font("MonoSpaced", Font.PLAIN, 40));
      dash.setForeground(Color.black);
      dash.setBounds(78,270,140,100);
      mainPanel.add(dash);

      int dashCB = 3;
      int xXX = 38;
      int xXY = 490;
      for (int xXI = 0; xXI < dashCB; xXI++){
         dash2 = new JLabel("-");
         dash2.setFont(new Font("MonoSpaced", Font.PLAIN, 40));
         dash2.setForeground(Color.black);
         dash2.setBounds(xXX,xXY,140,100);
         mainPanel.add(dash2);

         xXY += 50;
      }

      int dashC = 3;
      int xD = 220;
      int xY = 492;
      for (int xI = 0; xI < dashC; xI++){
         dash3 = new JLabel("-");
         dash3.setFont(new Font("MonoSpaced", Font.PLAIN, 40));
         dash3.setForeground(Color.black);
         dash3.setBounds(xD,xY,140,100);
         mainPanel.add(dash3);

         xY += 45;
      }

      description = new JTextArea(milk.getDescription());
      description.setFont(new Font("MonoSpaced", Font.PLAIN, 15));
      description.setForeground(Color.black);
      description.setBackground(Color.WHITE);
      description.setLineWrap(true);
      description.setEditable(false);
      description.setWrapStyleWord(true);
      description.setBounds(105,310,250,180);
      mainPanel.add(description);
      
      bFit = new JLabel("BENEFITS:");
      bFit.setFont(new Font("MonoSpaced", Font.BOLD, 23));
      bFit.setForeground(Color.black);
      bFit.setBounds(48,472,150,65);
      mainPanel.add(bFit);

      int bB = 65;
      int bY = 530;
      for (int iB = 0; iB < benefits.length; iB++){
         bFit2 = new JTextArea(benefits[iB]);
         bFit2.setFont(new Font("MonoSpaced", Font.PLAIN, 12));
         bFit2.setForeground(Color.black);
         bFit2.setBackground(Color.white);
         bFit2.setLineWrap(true);
         bFit2.setEditable(false);
         bFit2.setWrapStyleWord(true);
         bFit2.setBounds(bB,bY,140,47);
         mainPanel.add(bFit2);

         bY += 42;
      }

      bFor = new JLabel("BEST FOR:");
      bFor.setFont(new Font("MonoSpaced", Font.BOLD, 23));
      bFor.setForeground(Color.black);
      bFor.setBounds(235,472,150,65);
      mainPanel.add(bFor);

      int x = 255;
      int y = 530;
      for (int i = 0; i < bestFor.length; i++){
         bestF = new JTextArea(bestFor[i]);
         bestF.setFont(new Font("MonoSpaced", Font.PLAIN, 12));
         bestF.setForeground(Color.black);
         bestF.setBackground(Color.WHITE);
         bestF.setLineWrap(true);
         bestF.setEditable(false);
         bestF.setWrapStyleWord(true);
         bestF.setBounds(x,y,140,50);
         mainPanel.add(bestF);

         y += 50;
      }

      mName = new JTextArea(milk.getMName());
      mName.setFont(new Font("MonoSpaced", Font.BOLD, 40));
      mName.setForeground(Color.black);
      mName.setBackground(Color.white);
      mName.setLineWrap(true);
      mName.setEditable(false);
      mName.setWrapStyleWord(true);
      mName.setBounds(430,145,185,150);
      mainPanel.add(mName);

      dash5 = new JLabel("-");
      dash5.setFont(new Font("MonoSpaced", Font.PLAIN, 40));
      dash5.setForeground(Color.black);
      dash5.setBounds(410,270,75,75);
      mainPanel.add(dash5);

      milkDescription = new JTextArea(milk.getMilkDescription());
      milkDescription.setFont(new Font("MonoSpaced", Font.PLAIN, 15));
      milkDescription.setForeground(Color.black);
      milkDescription.setBackground(Color.white);
      milkDescription.setLineWrap(true);
      milkDescription.setEditable(false);
      milkDescription.setWrapStyleWord(true);
      milkDescription.setBounds(440,298,185,190);
      mainPanel.add(milkDescription);
      
      nutrients = new JLabel("Milk Nutrients:");
      nutrients.setFont(new Font("MonoSpaced", Font.BOLD, 23));
      nutrients.setForeground(Color.black);
      nutrients.setBounds(420,460,250,100);
      mainPanel.add(nutrients);

      int nX = 430;
      int nY = 495;
      for (int nI = 0; nI < mNutrients.length; nI++){
         nutrients1 = new JLabel(mNutrients[nI]);
         nutrients1.setFont(new Font("MonoSpaced", Font.PLAIN, 15));
         nutrients1.setForeground(Color.black);
         nutrients1.setBounds(nX,nY,250,100);
         mainPanel.add(nutrients1);

         nY += 35;
      }

      brandName1 = new JLabel(brand1[0]);
      brandName1.setFont(new Font("MonoSpaced", Font.BOLD, 15));
      brandName1.setForeground(Color.black);
      brandName1.setBounds(850,150,400,40);
      mainPanel.add(brandName1);

      int bLX = 850;
      int bLY = 190;
      for (int bLI = 2; bLI < brand1.length; bLI++){
         brandLink1 = createClickableLinkLabel(brand1[bLI], brand1[bLI]);
         brandLink1.setFont(new Font("MonoSpaced", Font.PLAIN, 13));
         brandLink1.setForeground(Color.BLACK);
         brandLink1.setBounds(bLX, bLY, 250, 35);
         mainPanel.add(brandLink1);

         bLY += 35;
      }

      brandName2 = new JLabel(brand2[0]);
      brandName2.setFont(new Font("MonoSpaced", Font.BOLD, 15));
      brandName2.setForeground(Color.black);
      brandName2.setBounds(850,325,400,40);
      mainPanel.add(brandName2);

      int bLX2 = 850;
      int bLY2 = 365;
      for (int bLI2 = 2; bLI2 < brand2.length; bLI2++){
         brandLink2 = createClickableLinkLabel(brand2[bLI2], brand2[bLI2]);
         brandLink2.setFont(new Font("MonoSpaced", Font.PLAIN, 13));
         brandLink2.setForeground(Color.BLACK);
         brandLink2.setBounds(bLX2, bLY2, 250, 35);
         mainPanel.add(brandLink2);

         bLY2 += 35;
      }

      brandName3 = new JLabel(brand3[0]);
      brandName3.setFont(new Font("MonoSpaced", Font.BOLD, 15));
      brandName3.setForeground(Color.black);
      brandName3.setBounds(850,500,400,40);
      mainPanel.add(brandName3);

      int bLX3 = 850;
      int bLY3 = 540;
      for (int bLI3 = 2; bLI3 < brand2.length; bLI3++){
         brandLink3 = createClickableLinkLabel(brand3[bLI3], brand3[bLI3]);
         brandLink3.setFont(new Font("MonoSpaced", Font.PLAIN, 13));
         brandLink3.setForeground(Color.BLACK);
         brandLink3.setBounds(bLX3, bLY3, 250, 35);
         mainPanel.add(brandLink3);

         bLY3 += 35;
      }

      this.add(mainPanel);
      this.setVisible(true);
	}
   private JLabel createClickableLinkLabel(String text, String url) {
      JLabel linkLabel = new JLabel("<html><u>" + text + "</u></html>");
      linkLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));

      linkLabel.addMouseListener(new MouseAdapter() {
          @Override
          public void mouseClicked(MouseEvent e) {
              openWebpage(url);
          }

          @Override
          public void mouseEntered(MouseEvent e) {
              linkLabel.setText("<html><u><font color='blue'>" + text + "</font></u></html>");
          }

          @Override
          public void mouseExited(MouseEvent e) {
              linkLabel.setText("<html><u>" + text + "</u></html>");
          }
      });

      return linkLabel;
  }

  private void openWebpage(String url) {
      try {
          Desktop.getDesktop().browse(new URI(url));
      } catch (IOException | URISyntaxException e) {
          e.printStackTrace();
      }
  }
   
   public static void main(String[] args) {
      new SearchResultPage();
   }
}