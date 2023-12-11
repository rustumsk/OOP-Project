package OOP_Project.view;

import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame {
    private Dimension screenSize;
    private JTextField fNameT;
    private Container con;

    public LoginPage(){
        this.setTitle("Milkipedia Registration");
		this.screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(true);

        con = getContentPane();
		con.setLayout(null);

        fNameT = new JTextField();
        fNameT.setForeground(Color.BLACK);
        fNameT.setText("");
        fNameT.setFont(new Font("Courier", Font.PLAIN, 15));
        fNameT.setBackground(Color.WHITE);
        fNameT.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
	    fNameT.setBounds(690, 205, 130, 21);
		con.add(fNameT);

        this.setVisible(true);
    }
}
