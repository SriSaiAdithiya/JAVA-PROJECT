package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class customer_page extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		setBounds(100, 100, 709, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  Customer Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(242, 11, 176, 45);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("   Recharge");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(84, 67, 176, 52);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("   Add Tag");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_1.setBounds(84, 157, 182, 45);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("   Recharge History");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1_2.setBounds(84, 231, 187, 52);
		contentPane.add(btnNewButton_1_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(376, 61, 307, 255);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("  Name :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(21, 11, 77, 35);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Balance : ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(31, 81, 77, 35);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Acc No : ");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(31, 150, 77, 35);
		panel.add(lblNewLabel_1_2);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(130, 11, 122, 35);
		panel.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(130, 81, 122, 35);
		panel.add(textPane_1);
		
		JTextPane textPane_1_1 = new JTextPane();
		textPane_1_1.setBounds(130, 150, 122, 35);
		panel.add(textPane_1_1);
	}
}
