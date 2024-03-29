package OOP_Project.view;

import OOP_Project.controller.SearchPageController;
import javax.swing.*;
import java.awt.*;
import java.util.Enumeration;
import java.util.Objects;

public class DashBoard extends JFrame {
    private SearchPageController controller;
    private Dimension screenSize;
    private JLabel logo1, logo2, logo3,logo4,logo5,logo6,logo7,logo8,logo9,logo10,logo11;
    private JLabel title;
    private JPanel mainPanel;
    private JLabel gender, ageStage, dietStatus, healthCondition, sugarLevel, search;
    private JComboBox<String> age, status, condition, level;
    private JRadioButton male,female;
    private ButtonGroup gButton;
    private JPanel radioPanel;
    private ImageIcon logoSmall,rightLogo,leftLogo,bottomRight,exitIcon,profileIcon,icon,black1,black2,black3,black4,nigga;
    private JButton signOut, profile, clear, sButton ;
    private JPanel menu;

    public String stages[] 
        = {"All", "Infancy (Birth to 2 years old)", "Early Childhood (3 to 5 years old)", 
         "Middle Childhood (6 to 11 years old)", "Adolescence (12 to 18 years old)",
         "Early Adulthood (19 to 39 years old)", "Middle Adulthood (40 to 64 years old)", 
         "Late Adulthood (65+ years old)"};
   

    public String statuses[]
        = {"Unidentified", "Non-vegetarian", "Lacto-ovo vegetarian", "Lacto-vegetarian", "Ovo-vegetarian", "Vegan"};

    public String conditions[]
        = {"None", "Arsenic Concerns", "Coconut Allergy", "Diabetic", "High Cholesterol", "Kidney Issues", 
         "Lactose Intolerance", "Milk Allergy", "Nut Allergy", "Nutritional Deficiencies", "Oat Allergy", 
         "Rice Allergy", "Soy Allergy", "Thyroid Issues"};

    public String levels[]
        = {"All Sugar Levels", "Unsweetened (0%)", "Low Sugar (less than 5%)", "Moderate Sugar (5% to 15%)", "High Sugar (15% to 25%)", "Very High Sugar (25% or more)"};
        
    public static ImageIcon createImage(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(Objects.requireNonNull(DashBoard.class.getResource(path)));
        return new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
    }

    public DashBoard() {
        logoSmall = createImage("images/logoSmall.png", 64, 58);
        rightLogo = createImage("images/patternRight.png", 300, 280);
        leftLogo = createImage("images/patternLeft.png", 400, 300);
        bottomRight = createImage("images/patternBottomRight.png", 500, 400);
        exitIcon = createImage("images/exit.png", 10, 10);
        profileIcon = createImage("images/profilePic.png", 10, 10);
        icon = createImage("images/milki.png", 500, 500);
        black1 = createImage("images/black.png", 130, 130);
        black2 = createImage("images/blob.png", 60, 60);
        black3 = createImage("images/blackRev.png", 100, 100);
        black4 = createImage("images/blob2.png", 90, 90);
        nigga = createImage("images/logoOrig.png", 50, 50);
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        this.setSize(screenSize.width, screenSize.height);
        this.setLayout(new GridBagLayout());
        getContentPane().setBackground(new Color(0xFFC0CB));
        this.setIconImage(nigga.getImage());
        setTitle("DashBoard");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        JPanel mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(1200, 800));
        mainPanel.setLayout(null);
        //mainPanel.setBackground(new Color(0xFFC0CB));
        mainPanel.setBackground(new Color(0xFCFBF4));
        
        menu = new JPanel();
        menu.setLayout(new GridLayout(1,1));
        menu.setBounds(0,0,200,20);

        signOut = new JButton("Sign Out");
        signOut.setIcon(exitIcon);
        signOut.setFont(new Font ("Arial", Font.BOLD, 10));
        signOut.setForeground(Color.BLACK);
        signOut.setBackground(new Color(0xFCFBF4));
        signOut.setBorder(BorderFactory.createEmptyBorder());
        signOut.addActionListener(controller = new SearchPageController(this, sButton, clear,signOut,profile));
        signOut.setFocusable(false);

        profile = new JButton("Profile");
        profile.setBackground(new Color(0xFCFBF4));
        profile.setForeground(Color.BLACK);
        profile.setIcon(profileIcon);
        profile.setFont(new Font ("Arial", Font.BOLD, 10));
        profile.setBorder(BorderFactory.createEmptyBorder());
        profile.addActionListener(controller = new SearchPageController(this, sButton, clear,signOut,profile));
        profile.setFocusable(false);

        menu.add(signOut);
        menu.add(profile);

        sButton = new JButton("Submit");
        sButton.setFont(new Font("Courier", Font.BOLD, 15));
        sButton.setForeground(Color.BLACK);
        sButton.setBackground(new Color(0xFCFBF4));
        sButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        sButton.setFocusable(false);
        sButton.setBounds(360,480,90,25);
        sButton.addActionListener(controller = new SearchPageController(this, sButton, clear,signOut,profile));
        mainPanel.add(sButton);

        clear = new JButton("Clear");
        clear.setFont(new Font("Courier", Font.BOLD, 15));
        clear.setBackground(new Color(0xFCFBF4));
        clear.setForeground(Color.BLACK);
        clear.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        clear.setFocusable(false);
        clear.setBounds(230,480,90,25);
        clear.addActionListener(controller = new SearchPageController(this, sButton, clear,signOut,profile));
        mainPanel.add(clear);

        male = new JRadioButton("Male");
        male.setFont(new Font("Monospaced", Font.BOLD, 22));
        male.setFocusable(false);
        male.setForeground(Color.black);
        male.setBorder(BorderFactory.createEmptyBorder());
        male.setBackground(new Color(0xFCFBF4));

        female = new JRadioButton("Female");
        female.setFont(new Font("Monospaced", Font.BOLD, 22));
        female.setForeground(Color.black);
        female.setFocusable(false);
        female.setBorder(BorderFactory.createEmptyBorder());
        female.setBackground(new Color(0xFCFBF4));

        gender = new JLabel("Gender");
        gender.setFont(new Font("Courier", Font.BOLD, 22));
        gender.setForeground(Color.BLACK);
        gender.setBounds(160,75,400,200);

        ageStage = new JLabel("Age Stage");
        ageStage.setFont(new Font("Courier", Font.BOLD, 22));
        ageStage.setForeground(Color.BLACK);
        ageStage.setBounds(160,125,400,200);

        dietStatus = new JLabel("Diet Status");
        dietStatus.setFont(new Font("Courier", Font.BOLD, 22));
        dietStatus.setForeground(Color.BLACK);
        dietStatus.setBounds(160,185,400,200);

        healthCondition = new JLabel("Health Condition");
        healthCondition.setFont(new Font("Courier", Font.BOLD, 22));
        healthCondition.setForeground(Color.BLACK);
        healthCondition.setBounds(160,245,400,200);

        sugarLevel = new JLabel("Sugar Level");
        sugarLevel.setFont(new Font("Courier", Font.BOLD, 22));
        sugarLevel.setForeground(Color.BLACK);
        sugarLevel.setBounds(160,313,400,200);

        gButton = new ButtonGroup();
        gButton.add(male);
        gButton.add(female);
  
        radioPanel = new JPanel();
        radioPanel.setLayout(new FlowLayout());
        radioPanel.setBackground(new Color(0xFCFBF4));
        //radioPanel.setBackground(Color.white);
        radioPanel.setBounds(320,154,300,50);
        radioPanel.add(male);
        radioPanel.add(female);

        logo1 = new JLabel();
        logo1.setIcon(rightLogo);
        logo1.setBounds(900,0,500,200);

        logo2 = new JLabel();
        logo2.setIcon(leftLogo);
        logo2.setBounds(0,500,700,300);
        
        logo3 = new JLabel();
        logo3.setIcon(bottomRight);
        logo3.setBounds(700,500,500,330);

        logo4 = new JLabel();
        logo4.setIcon(icon);
        logo4.setBounds(650,150,500,500);

        logo5 = new JLabel();
        logo5.setIcon(black1);
        logo5.setBounds(700,600,200,200);

        logo6 = new JLabel();
        logo6.setIcon(black2);
        logo6.setBounds(700,500,100,100);

        logo7 = new JLabel();
        logo7.setIcon(black2);
        logo7.setBounds(700,150,200,200);

        logo8 = new JLabel();
        logo8.setIcon(black2);
        logo8.setBounds(35,300,200,200);

        logo9 = new JLabel();
        logo9.setIcon(black4);
        logo9.setBounds(830,60,200,200);

        logo10 = new JLabel();
        logo10.setIcon(black4);
        logo10.setBounds(200,570,200,200);

        logo11 = new JLabel();
        logo11.setIcon(black3);
        logo11.setBounds(400,300,200,200);

        title = new JLabel("MILKIPEDIA");
        title.setIcon(logoSmall);
        title.setFont(new Font("Monospaced", Font.BOLD, 80));
        title.setForeground(Color.BLACK);
        title.setBounds(120, 30, 700, 100);

        search = new JLabel("Dashboard");
        search.setFont(new Font("Monospaced", Font.BOLD, 30));
        search.setForeground(Color.BLACK);
        search.setBounds(665, -28, 300, 200);
        
        age = new JComboBox<>(stages);
        age.setBackground(new Color(0xFCFBF4));
        age.setForeground(Color.BLACK);
        age.setFont(new Font("Courier", Font.BOLD, 15));
        age.setFocusable(false);
        age.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        age.setBounds(355, 210, 260, 30);

        status = new JComboBox<>(statuses);
        status.setBackground(new Color(0xFCFBF4));
        status.setForeground(Color.BLACK);
        status.setFont(new Font("Courier", Font.BOLD, 15));
        status.setFocusable(false);
        status.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        status.setBounds(355, 270, 260, 30);

        condition = new JComboBox<>(conditions);
        condition.setBackground(new Color(0xFCFBF4));
        condition.setForeground(Color.BLACK);
        condition.setFont(new Font("Courier", Font.BOLD, 15));
        condition.setFocusable(false);
        condition.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        condition.setBounds(355, 330, 260, 30);
        
        level = new JComboBox<>(levels);
        level.setBackground(new Color(0xFCFBF4));
        level.setForeground(Color.BLACK);
        level.setFont(new Font("Courier", Font.BOLD, 15));
        level.setFocusable(false);
        level.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        level.setBounds(355, 400, 260, 30);

        mainPanel.add(condition);
        mainPanel.add(ageStage);
        mainPanel.add(sugarLevel);
        mainPanel.add(dietStatus);
        mainPanel.add(healthCondition);
        mainPanel.add(age);
        mainPanel.add(level);
        mainPanel.add(status);
        mainPanel.add(radioPanel);
        mainPanel.add(menu);
        mainPanel.add(gender);
        mainPanel.add(logo1);
        mainPanel.add(logo2);
        mainPanel.add(logo3);
        mainPanel.add(logo4);
        mainPanel.add(logo5);
        mainPanel.add(logo6);
        mainPanel.add(logo7);
        mainPanel.add(logo8);
        mainPanel.add(logo9);
        mainPanel.add(logo10);
        mainPanel.add(logo11);
        mainPanel.add(search);
        mainPanel.add(title);
        this.add(mainPanel);
        this.setVisible(true);
    }
    
    public ButtonGroup getGender(){
        return gButton;
    }
    public JComboBox<String> getAge(){
        return age;
    }
    public JComboBox<String> getStatus(){
        return status;
    }
    public JComboBox<String> getLevel(){
        return level;
    }
    public JComboBox<String> getCondition(){
        return condition;
    }
    public String getSelectedGender() {
    Enumeration<AbstractButton> buttons = gButton.getElements();
    
    while (buttons.hasMoreElements()) {
        AbstractButton button = buttons.nextElement();
        if (button.isSelected()) {
            return button.getText();
        }
    }
    
    return null;  // No button is selected
}
    
    public static void main(String[] args) {
        new DashBoard();
    }
}