package OOP_Project.view;

import OOP_Project.controller.RegistrationPageController;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.util.Objects;

public class RegistrationPage extends JFrame {
   public JTextField middleNameInput, firstNameInput, lastNameInput, emailInput, confirmEmailInput;
   public RegistrationPageController controller;
   private Dimension screenSize;
   private JLabel firstNameLabel, middleNameLabel, lastNameLabel , confirmEmailLabel, emailLabel;
   public JLabel suff;
   public JComboBox<String> suffix;
	public JLabel gender;
	public JRadioButton male, female;
	public ButtonGroup genderGrp;
	public JLabel birthday;
	public JComboBox<String> month, date, year;
   public JLabel emaiLabel;
	public JCheckBox terms;
	private JButton submit, reset;
   
   public String suffixes[] 
      = { "Suffix", "None", "Jr.", "Sr.", "III", "IV", "V", "VI" };
      
	private String months[]
		= {"month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
         
	private String dates[]
		= {"day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
			"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", 
         "29", "30", "31"};
  
	public String years[]
		= {"year", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", 
         "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013",
         "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023"};
   
   public static ImageIcon createImage(String path, int width, int height) {
      ImageIcon icon = new ImageIcon(Objects.requireNonNull(RegistrationPage.class.getResource(path)));
      return new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
   }
   
	public RegistrationPage() {

      ImageIcon patternTopRightIcon = createImage("images/patternRight.png", 250, 250);
      ImageIcon patternBottomLeftIcon = createImage("images/patternLeft.png", 250, 250);

      Border border2 = BorderFactory.createLineBorder(Color.BLACK, 2);

		setTitle("Milkipedia Registration");
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      setSize(screenSize.width, screenSize.height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);  
      setExtendedState(JFrame.MAXIMIZED_BOTH);
      setLayout(new GridBagLayout());
      getContentPane().setBackground(new Color(0xFFC0CB));

      firstNameInput = createTxtField("First Name");
      firstNameInput.setPreferredSize(new Dimension(200, 33));
      firstNameInput.setBorder(null);
      firstNameInput.setFont(new Font ("Monospaced", Font.BOLD, 20));

      firstNameLabel = new JLabel();
      firstNameLabel.setPreferredSize(new Dimension(285, 80));
      firstNameLabel.setBorder(border2);
      firstNameLabel.setBackground(new Color(0xffffff));
      firstNameLabel.setOpaque(true);
      firstNameLabel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 7));
      firstNameLabel.add(firstNameInput);

      lastNameInput = createTxtField("Last Name");
      lastNameInput.setPreferredSize(new Dimension(200, 33));
      lastNameInput.setBorder(null);
      lastNameInput.setBackground(new Color(0xffffff));
      lastNameInput.setFont(new Font ("Monospaced", Font.BOLD, 20));
      
      lastNameLabel = new JLabel();
      lastNameLabel.setPreferredSize(new Dimension(285, 33));
      lastNameLabel.setBackground(Color.WHITE);
      lastNameLabel.setBorder(border2);
      lastNameLabel.setOpaque(true);
      lastNameLabel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 8));
      lastNameLabel.setVerticalAlignment(JLabel.CENTER);
      lastNameLabel.add(lastNameInput);

      JLabel firstGrid = new JLabel();
      firstGrid.setLayout(new GridLayout(1, 2, 10, 10));
      firstGrid.add(firstNameLabel);
      firstGrid.add(lastNameLabel);

      middleNameInput = createTxtField("Middle Name (Optional)");
      middleNameInput.setPreferredSize(new Dimension(320, 33));
      middleNameInput.setBorder(null);
      middleNameInput.setBackground(new Color(0xffffff));
      middleNameInput.setFont(new Font ("Monospaced", Font.BOLD, 20));

      middleNameLabel = new JLabel();
      middleNameLabel.setBackground(Color.WHITE);
      middleNameLabel.setBorder(border2);
      middleNameLabel.setOpaque(true);
      middleNameLabel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 7));
      middleNameLabel.add(middleNameInput);

      suffix = new JComboBox<String>(suffixes);
		suffix.setForeground(Color.BLACK);
      suffix.setFont(new Font("Monospaced", Font.BOLD, 20));
      suffix.setBackground(Color.WHITE);
      suffix.setBorder(border2);
      suffix.setFocusable(false);
		suffix.setBounds(690, 310, 70, 21);
      suffix.setFocusable(false);

      JLabel secondGrid = new JLabel();
      secondGrid.setLayout(new GridLayout(1, 2, 10, 5));
      secondGrid.add(suffix);
      secondGrid.add(middleNameLabel);

      birthday = new JLabel("Birthday: ");
		birthday.setForeground(Color.BLACK);
      birthday.setFont(new Font("Monospaced", Font.BOLD, 20));
		birthday.setPreferredSize(new Dimension(200, 50));
      birthday.setVerticalAlignment(JLabel.CENTER);
      birthday.setHorizontalAlignment(JLabel.CENTER);
      birthday.setBorder(border2);

      month = new JComboBox<String>(months);
		month.setForeground(Color.BLACK);
      month.setFont(new Font("Monospaced", Font.BOLD, 20));
      month.setBackground(Color.WHITE);
      month.setBorder(border2);
      month.setFocusable(false);

		date = new JComboBox<String>(dates);
		date.setForeground(Color.BLACK);
      date.setFont(new Font("Monospaced", Font.BOLD, 20));
      date.setBackground(Color.WHITE);
      date.setBorder(border2);
      date.setFocusable(false);

		year = new JComboBox<String>(years);
		year.setForeground(Color.BLACK);
      year.setFont(new Font("Monospaced", Font.BOLD, 20));
      year.setBackground(Color.WHITE);
		year.setPreferredSize(new Dimension(100, 50));
      year.setBorder(border2);
      year.setFocusable(false);

      JLabel thirdGrid = new JLabel();
      thirdGrid.setLayout(new GridLayout(1, 4, 8, 0));
      thirdGrid.add(birthday);
      thirdGrid.add(month);
      thirdGrid.add(date);
      thirdGrid.add(year);

      female = new JRadioButton("Female");
      female.setBorder(border2);
		female.setForeground(Color.BLACK);
      female.setFont(new Font("Monospaced", Font.BOLD, 20));
		female.setSelected(false);
      female.setBackground(Color.WHITE);
      female.setFocusable(false);

      JLabel femaleLabel = new JLabel();
      femaleLabel.setBorder(border2);
      femaleLabel.setLayout(new GridLayout());
      femaleLabel.add(female);

      male = new JRadioButton("Male");
      male.setBorder(border2);
		male.setForeground(Color.BLACK);
      male.setBackground(Color.WHITE);
      male.setFont(new Font("Monospaced", Font.BOLD, 20));
		male.setSelected(false);
      male.setFocusable(false);

      JLabel maleLabel = new JLabel();
      maleLabel.setBorder(border2);
      maleLabel.setLayout(new GridLayout());
      maleLabel.add(male);

      gender = new JLabel("Gender: ");
		gender.setForeground(Color.BLACK);
      gender.setFont(new Font("Monospaced", Font.BOLD, 20));
      gender.setHorizontalAlignment(JLabel.CENTER);
      gender.setBorder(border2);
      
      genderGrp = new ButtonGroup();
      genderGrp.add(male);
      genderGrp.add(female);

      JLabel fourthGrid = new JLabel();
      fourthGrid.setLayout(new GridLayout(1, 4, 8, 0));
      fourthGrid.add(gender);
      fourthGrid.add(femaleLabel);
      fourthGrid.add(maleLabel);
      fourthGrid.add(new JLabel());		

      emailInput = createTxtField("Email");
      emailInput.setPreferredSize(new Dimension(320, 33));
      emailInput.setBorder(null);
      emailInput.setBackground(new Color(0xffffff));
      emailInput.setFont(new Font ("Monospaced", Font.BOLD, 20));
      
      emailLabel = new JLabel();
      emailLabel.setBackground(Color.WHITE);
      emailLabel.setOpaque(true);
      emailLabel.setBorder(border2);
      emailLabel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 7));
      emailLabel.add(emailInput);

      JLabel fifthGrid = new JLabel();
      fifthGrid.setLayout(new GridLayout(1, 1, 8, 0));
      fifthGrid.add(emailLabel);

      confirmEmailInput = createTxtField("Confirm Email");
      confirmEmailInput.setPreferredSize(new Dimension(320, 33));
      confirmEmailInput.setBorder(null);
      confirmEmailInput.setBackground(new Color(0xffffff));
      confirmEmailInput.setFont(new Font ("Monospaced", Font.BOLD, 20));
      
      JLabel confirmEmailLabel = new JLabel();
      confirmEmailLabel.setBackground(Color.WHITE);
      confirmEmailLabel.setOpaque(true);
      confirmEmailLabel.setBorder(border2);
      confirmEmailLabel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 7));
      confirmEmailLabel.add(confirmEmailInput);
      
      JLabel sixthGrid = new JLabel();
      sixthGrid.setLayout(new GridLayout(1, 1, 8, 0));
      sixthGrid.add(confirmEmailLabel);

      terms = new JCheckBox("Accept Terms And Conditions.");
		terms.setForeground(Color.BLACK);
      terms.setFont(new Font("Monospaced", Font.BOLD, 20));
      terms.setFocusable(false);
      terms.addActionListener(controller = new RegistrationPageController(this,terms, submit, reset));
      terms.setBackground(Color.WHITE);

      JLabel termsLabel = new JLabel();
      termsLabel.setLayout(new GridLayout());
      termsLabel.setBorder(border2);
      termsLabel.add(terms);
      termsLabel.setVerticalAlignment(JLabel.CENTER);

      JLabel seventhGrid = new JLabel();
      seventhGrid.setLayout(new GridLayout(1, 1));
      seventhGrid.add(termsLabel);

      submit = new JButton("SUBMIT");
		submit.setForeground(Color.WHITE);
      submit.setFont(new Font("Monospaced", Font.BOLD, 20));
      submit.setBackground(new Color(0x00000));
      submit.setBorder(border2);
      submit.setFocusable(false);
      submit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      submit.addActionListener(controller = new RegistrationPageController(this,terms, submit,reset));

      submit.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseEntered(MouseEvent e) {          
         submit.setBackground(Color.white);
         submit.setForeground(Color.BLACK);
      }
            
      @Override
      public void mouseExited(MouseEvent e) {
         submit.setBackground(new Color(0x00000));
         submit.setForeground(Color.WHITE);
      }
      });

      reset = new JButton("RESET");
      reset.setForeground(Color.BLACK);
		reset.setFont(new Font("Monospaced", Font.BOLD, 20));
      reset.setBackground(new Color(0xffffff));
      reset.setBorder(border2);
      reset.setFocusable(false);
      reset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      reset.addActionListener(controller = new RegistrationPageController(this,terms,submit,reset));
      reset.addMouseListener(new MouseAdapter() {
      
      @Override
      public void mouseEntered(MouseEvent e) {          
         reset.setBackground(Color.BLACK);
         reset.setForeground(Color.WHITE);
      }
            
      @Override
      public void mouseExited(MouseEvent e) {
         reset.setBackground(Color.WHITE);
         reset.setForeground(Color.BLACK);
      }
      });

      JLabel Grid8 = new JLabel();
      Grid8.setLayout(new GridLayout(1, 4, 8, 0));
      Grid8.add(submit);
      Grid8.add(reset);
      Grid8.add(new JLabel());

      JPanel userForm = new JPanel();
      userForm.setBackground(Color.WHITE);
      userForm.setBounds(250, 110, 700, 500);
      userForm.setLayout(new GridLayout(8, 1, 10 ,10));
      userForm.add(firstGrid);
      userForm.add(secondGrid);
      userForm.add(thirdGrid);
      userForm.add(fourthGrid);
      userForm.add(fifthGrid);
      userForm.add(sixthGrid);
      userForm.add(seventhGrid);
      userForm.add(Grid8);

      JLabel patternTopRight = new JLabel();
      patternTopRight.setBounds(950, 0, 250, 200);
      patternTopRight.setIcon(patternTopRightIcon);

      JLabel patternBottomLeft = new JLabel();
      patternBottomLeft.setBounds(0, 500, 250, 200);
      patternBottomLeft.setIcon(patternBottomLeftIcon);


      JPanel mainPanel = new JPanel(); 
      mainPanel.setPreferredSize(new Dimension(1200, 700));
      mainPanel.setLayout(null);
      mainPanel.setBackground(Color.WHITE);
      mainPanel.add(patternTopRight);
      mainPanel.add(patternBottomLeft);
      mainPanel.add(userForm);

      add(mainPanel);
      /*
      
		terms = new JCheckBox("Accept Terms And Conditions.");
		terms.setForeground(Color.BLACK);
      terms.setFont(new Font("Courier", Font.ITALIC, 17));
		terms.setBounds(550, 520, 350, 30);
      terms.setFocusable(false);
		con.add(terms);

		submit = new JButton("SUBMIT");
		submit.setForeground(Color.BLACK);
      submit.setFont(new Font("Courier", Font.BOLD, 18));
      submit.setBackground(Color.WHITE);
      submit.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		submit.setBounds(550, 580, 110, 30);
      submit.setFocusable(false);
      submit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      submit.addMouseListener(new MouseAdapter() {
      
      @Override
      public void mouseEntered(MouseEvent e) {          
         submit.setBackground(Color.BLACK);
         submit.setForeground(Color.WHITE);
      }
            
      @Override
      public void mouseExited(MouseEvent e) {
         submit.setBackground(Color.WHITE);
         submit.setForeground(Color.BLACK);
      }
      });
      
		con.add(submit);

		reset = new JButton("RESET");
      reset.setForeground(Color.BLACK);
		reset.setFont(new Font("Courier", Font.BOLD, 18));
      reset.setBackground(Color.WHITE);
      reset.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		reset.setBounds(750, 580, 110, 30);
      reset.setFocusable(false);
      reset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      reset.addMouseListener(new MouseAdapter() {
      
      @Override
      public void mouseEntered(MouseEvent e) {          
         reset.setBackground(Color.BLACK);
         reset.setForeground(Color.WHITE);
      }
            
      @Override
      public void mouseExited(MouseEvent e) {
         reset.setBackground(Color.WHITE);
         reset.setForeground(Color.BLACK);
      }
      });
      
		con.add(reset);
      */
		setVisible(true);
	}

   public JCheckBox getTerms() {
      return terms;
   }

   public JButton getSubmit() {
      return submit;
   }
   
   public JButton getReset() {
      return reset;
   }
   public void setFName(){
      firstNameInput.setText("First Name");
      firstNameInput.setForeground(Color.gray);
   }
   public JTextField getFName(){
      return firstNameInput;
   }
   public JTextField getLName(){
      return lastNameInput;
   }
   public void setMName(){
      middleNameInput.setText("Middle Name (Optional)");
      middleNameInput.setForeground(Color.gray);
   }
    public JTextField getMName(){
      return middleNameInput;
   }
   public void setLName(){
      lastNameInput.setText("Last Name");
      lastNameInput.setForeground(Color.gray);
   }
   public JComboBox<String> getSuffix(){
      return suffix;
   }
   public JComboBox<String> getMonth(){
      return month;
   }
   public JComboBox<String> getDay(){
      return date;
   }
   public JComboBox<String> getYear(){
      return year;
   }
   public ButtonGroup getGender(){
      return genderGrp;
   }
   public void setEmail(){
      emailInput.setText("Email");
      emailInput.setForeground(Color.gray);
   }
   public JTextField getEmail(){
      return emailInput;
   }
   public void setCEmail(){
      confirmEmailInput.setText("Confirm Email");
      confirmEmailInput.setForeground(Color.gray);
   }
   public JTextField getCEmail(){
      return confirmEmailInput;
   }
   public JCheckBox getTerm(){
      return terms;
   }
   public void setTerm(){
      terms.setSelected(false);;
   }
   public boolean isEmpty() {
      return (
              (firstNameInput.getText().equals("First Name") || firstNameInput.getText().equals("")) &&
              (lastNameInput.getText().equals("Last Name") || lastNameInput.getText().equals("")) &&
              suffix.getSelectedIndex() == 0 &&
              date.getSelectedIndex() == 0 &&
              month.getSelectedIndex() == 0 &&
              genderGrp.getSelection() == null &&
              year.getSelectedIndex() == 0 &&
              (emailInput.getText().equals("Email") || emailInput.getText().equals("")) &&
              (confirmEmailInput.getText().equals("Confirm Email") || confirmEmailInput.getText().equals(""))
      );
   }
   
   public static JTextField createTxtField(String placeholder) {
      JTextField textField = new JTextField();
      textField.setForeground(Color.GRAY);
      textField.setText(placeholder);
      textField.setFocusable(false);

      textField.addFocusListener(new FocusAdapter() {
         @Override
         public void focusGained(FocusEvent e) {
            if (textField.getText().equals(placeholder)) {
                  textField.setText("");
                  textField.setForeground(Color.BLACK);
            }
         }

         @Override
         public void focusLost(FocusEvent e) {
            if (textField.getText().isEmpty()) {
               textField.setText(placeholder);
               textField.setForeground(Color.GRAY);
            }
         }
      });

      textField.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            if (textField.getText().equals(placeholder)) {
               textField.setText("");
               textField.setForeground(Color.BLACK);
            }
               textField.setFocusable(true);
               textField.requestFocusInWindow();
         }
      });

      return textField;
  }

}