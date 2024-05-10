package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class customer_page extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer_page frame = new customer_page();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public customer_page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(14,132,248));
		panel.setBounds(0, 0, 1370, 40);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("DPPS");
		lblNewLabel_3.setFont(new Font("Gadugi", Font.BOLD, 17));
		lblNewLabel_3.setBounds(10, 5, 104, 35);
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(14,132,248));
		panel_1.setBounds(0, 446, 1370, 315);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Recharge");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton.setBounds(61, 224, 144, 42);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setIcon(new ImageIcon("D:\\photo\\i4.png"));
		lblNewLabel_5_1.setBounds(293, 34, 196, 179);
		panel_1.add(lblNewLabel_5_1);
		
		JButton btnAddTag = new JButton("Add Tag");
		btnAddTag.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnAddTag.setBackground(Color.WHITE);
		btnAddTag.setBounds(314, 224, 144, 42);
		panel_1.add(btnAddTag);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("");
		lblNewLabel_5_1_1.setIcon(new ImageIcon("D:\\photo\\i3.png"));
		lblNewLabel_5_1_1.setBounds(583, 34, 196, 198);
		panel_1.add(lblNewLabel_5_1_1);
		
		JButton btnPaymentHistory = new JButton("Payment History");
		btnPaymentHistory.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnPaymentHistory.setBackground(Color.WHITE);
		btnPaymentHistory.setBounds(570, 224, 202, 42);
		panel_1.add(btnPaymentHistory);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("");
		lblNewLabel_5_1_1_1.setIcon(new ImageIcon("D:\\photo\\i2.png"));
		lblNewLabel_5_1_1_1.setBounds(852, 11, 196, 200);
		panel_1.add(lblNewLabel_5_1_1_1);
		
		JButton btnStartDriving = new JButton("Start Driving");
		btnStartDriving.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnStartDriving.setBackground(Color.WHITE);
		btnStartDriving.setBounds(846, 224, 202, 42);
		panel_1.add(btnStartDriving);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("D:\\photo\\i11.png"));
		lblNewLabel_5.setBounds(72, 50, 232, 144);
		panel_1.add(lblNewLabel_5);
		
		JButton btnRechargeHistory = new JButton("Recharge History");
		btnRechargeHistory.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnRechargeHistory.setBackground(Color.WHITE);
		btnRechargeHistory.setBounds(1139, 224, 202, 42);
		panel_1.add(btnRechargeHistory);
		
		JLabel lblNewLabel_5_1_1_2 = new JLabel("");
		lblNewLabel_5_1_1_2.setIcon(new ImageIcon("D:\\photo\\i3.png"));
		lblNewLabel_5_1_1_2.setBounds(1145, 23, 196, 198);
		panel_1.add(lblNewLabel_5_1_1_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\photo\\i8.png"));
		lblNewLabel.setBounds(419, 159, 74, 66);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\photo\\i9.png"));
		lblNewLabel_1.setBounds(74, 110, 320, 315);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\photo\\i10.png"));
		lblNewLabel_2.setBounds(776, 159, 61, 66);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("      Name");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(503, 174, 178, 40);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("        Balance");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_1.setBounds(891, 174, 178, 40);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(790, 253, 61, 66);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("     Profile");
		lblNewLabel_7.setFont(new Font("Verdana", Font.BOLD, 25));
		lblNewLabel_7.setBounds(96, 72, 246, 40);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("D:\\photo\\email_3178165.png"));
		lblNewLabel_8.setBounds(419, 266, 83, 54);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_4_2 = new JLabel("    E-mail");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_2.setBounds(503, 279, 178, 40);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("D:\\photo\\phone-call_455705.png"));
		lblNewLabel_2_1.setBounds(776, 266, 61, 66);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("       Phone");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_1_1.setBounds(891, 279, 178, 40);
		contentPane.add(lblNewLabel_4_1_1);
		
	}
}
