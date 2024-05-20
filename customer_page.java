package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class customer_page extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField textField_3;
	private JTextField textField_4;
	private static int cid;
	private static String name;
	private static String mail;
	private static String phone;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer_page frame = new customer_page(cid);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	);
}

	/**
	 * Create the frame.
	 */
	public customer_page(int cid) {
		this.cid = cid;
		
		try(Connection con = DBCONNECTIO.getConnection()){
            String Query = "Select Cust_Name,Ph_no,Email from Customer where CID = ? ;";
            
            PreparedStatement pst = con.prepareStatement(Query);
            pst.setInt(1, cid);
            
            ResultSet rs = pst.executeQuery();
           if(rs.next()) {
                //MainFrame.setVisible(false);
                name = rs.getString(1);
                phone = rs.getString(2);
                mail = rs.getString(3);
                
               
           }
            else {
                JOptionPane.showMessageDialog(null,"Error");

            }

        }catch(SQLException E){
            System.out.println(E.getMessage());
        }
		
		
		
		
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
		panel_1.setBounds(-11, 573, 1381, 176);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Recharge");
		btnNewButton.setBounds(80, 64, 144, 42);
		panel_1.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 new Recharge_design(cid).setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 19));
		
		JButton btnAddTag = new JButton("Add Tag");
		btnAddTag.setBounds(322, 64, 144, 42);
		panel_1.add(btnAddTag);
		btnAddTag.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnAddTag.setBackground(Color.WHITE);
		
		JButton btnPaymentHistory = new JButton("Payment History");
		btnPaymentHistory.setBounds(541, 64, 202, 42);
		panel_1.add(btnPaymentHistory);
		btnPaymentHistory.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnPaymentHistory.setBackground(Color.WHITE);
		
		JButton btnStartDriving = new JButton("Start Driving");
		btnStartDriving.setBounds(825, 64, 202, 42);
		panel_1.add(btnStartDriving);
		btnStartDriving.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnStartDriving.setBackground(Color.WHITE);
		
		JButton btnRechargeHistory = new JButton("Recharge History");
		btnRechargeHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				 new Recharge_history(cid).setVisible(true);
				
			}
		});
		btnRechargeHistory.setBounds(1115, 64, 202, 42);
		panel_1.add(btnRechargeHistory);
		btnRechargeHistory.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnRechargeHistory.setBackground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\photo\\i8.png"));
		lblNewLabel.setBounds(35, 173, 74, 66);
		contentPane.add(lblNewLabel);
		
		
		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(117, 188, 178, 40);
		lblNewLabel_4.setText(name);
		contentPane.add(lblNewLabel_4);
		
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(35, 385, 61, 66);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("     Profile");
		lblNewLabel_7.setFont(new Font("Verdana", Font.BOLD, 25));
		lblNewLabel_7.setBounds(80, 108, 246, 40);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel();
		lblNewLabel_8.setIcon(new ImageIcon("D:\\photo\\email_3178165.png"));
		lblNewLabel_8.setBounds(35, 291, 83, 54);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_4_2 = new JLabel(mail);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_2.setBounds(117, 301, 178, 40);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_2_1 = new JLabel();
		lblNewLabel_2_1.setIcon(new ImageIcon("D:\\photo\\phone-call_455705.png"));
		lblNewLabel_2_1.setBounds(35, 413, 61, 66);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel(phone);
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4_1_1.setBounds(119, 427, 178, 40);
		contentPane.add(lblNewLabel_4_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(13, 13, 255));
		panel_2.setBounds(0, 36, 1370, 40);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Registered Vehicle ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBackground(new Color(192, 192, 192));
		lblNewLabel_1.setBounds(768, 121, 203, 48);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(544, 173, 666, 320);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBackground(new Color(192, 192, 192));
		 table.setModel(new DefaultTableModel(
	                new Object[][]{},
	                new String[]{}
	        ));
		 loadVehicle(cid);
		
	}
	
private void loadVehicle(int cid) {
    	
        try (Connection con =  DBCONNECTIO.getConnection()) {
            String query = "select vehicle.veh_type,vehicle.veh_no,tag.wallet_bal "
            		+ "from tag join vehicle where vehicle.tag_id = tag.tag_id and vehicle.cid = ?;";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, cid);
            ResultSet rs = pst.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int cols = rsmd.getColumnCount();
            String[] colNames = new String[cols];
            for (int i = 0; i < cols; i++) {
                colNames[i] = rsmd.getColumnName(i + 1);
            }
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setColumnIdentifiers(colNames);

            while (rs.next()) {
                String[] row = new String[cols];
                for (int i = 0; i < cols; i++) {
                    row[i] = rs.getString(i + 1);
                    System.out.println(row[i]) ;                   //System.out.println(i);
                }
                model.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

