# JAVA-PROJECT

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
public class User_Login
{
    User_Login()
    {
        JFrame MainFrame = new JFrame("Login Page");

        JLabel imglabel = new JLabel();
        imglabel.setIcon(new ImageIcon(new ImageIcon("D:\\TCS\\FasTagimg.jpg").getImage().getScaledInstance(1300,650,Image.SCALE_SMOOTH)
        ));
        MainFrame.setContentPane(imglabel);


        MainFrame.setLayout(null);
        MainFrame.setSize(1300,650);

        JPanel mypanel = new JPanel();
        mypanel.setLayout(null);
        MainFrame.add(mypanel);
        mypanel.setBounds(400,180,500,300);
        mypanel.setBackground(new Color(166,165,153,125));




        JLabel name = new JLabel("User Name :");
        name.setBounds(80,110,130,25);
        name.setFont(new Font("Gadugi",Font.BOLD,18));

        JLabel password = new JLabel("Password :");
        password.setBounds(80,150,130,25);
        password.setFont(new Font("Gadugi",Font.BOLD,18));

        JTextField username = new JTextField();
        username.setBounds(230,110,200,25);
        username.setFont(new Font("HP Simplified",Font.BOLD,16));


        JPasswordField pass = new JPasswordField();
        pass.setBounds(230,150,200,25);
        pass.setFont(new Font("HP Simplified",Font.BOLD,16));

        JButton reset = new JButton("Reset");
        reset.setBounds(360,250,70,20);
        reset.setFont(new Font("HP Simplified",Font.BOLD,12));
        reset.setBackground(new Color(250,250,250));

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                username.setText("");
                pass.setText("");

            }
        });

        JCheckBox showpass = new JCheckBox("Show password");
        showpass.setBounds(310,200,115,20);
        showpass.setFont(new Font("HP Simplified",Font.BOLD,12));

        showpass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(showpass.isSelected())
                {
                    pass.setEchoChar((char)0);
                }
                else {
                    pass.setEchoChar('*');
                }
            }
        });

        JButton login = new JButton("Log in");
        login.setBounds(230,250,70,20);
        login.setFont(new Font("HP Simplified",Font.BOLD,12));
        login.setBackground(new Color(250,250,250));
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(username.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"-- User Name cannot be empty --");
                }
                if(pass.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"-- Password cannot be empty --");
                }

            }
        });

        MainFrame.setLocationRelativeTo(null);
        mypanel.add(name);
        mypanel.add(password);
        mypanel.add(username);
        mypanel.add(pass);
        mypanel.add(reset);
        mypanel.add(login);
        mypanel.add(showpass);
        MainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MainFrame.setLayout(null);




//        MainFrame.addWindowListener(new WindowAdapter()
//        {
//            public void windowClosing(WindowEvent e)
//            {
//                System.exit(0);
//            }
//        });

        MainFrame.setVisible(true);
    }
    public static void main(String[] args) {
        new User_Login();
    }

}
