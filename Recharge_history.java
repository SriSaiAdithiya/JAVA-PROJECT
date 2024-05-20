package login;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.SystemColor;
import javax.swing.table.DefaultTableModel;

public class Recharge_history extends JFrame {

    static final long serialVersionUID = 1L;
    public JPanel contentPane;
    public JTextField textField;
    public JTextField textField_1;
    public JTextField textField_2;
    public JPasswordField textField_3;
    public JTextField textField_4;
    private static int cid;

    String email;
    private JTable table;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Recharge_history frame = new Recharge_history(cid);
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
    public Recharge_history(int cid) {
    	Recharge_history.cid = cid;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1500, 1000);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1370, 40);
        panel.setBackground(new Color(14,132,248));
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel_3 = new JLabel("DPPS");
        lblNewLabel_3.setFont(new Font("Gadugi", Font.BOLD, 17));
        lblNewLabel_3.setBounds(10, 5, 104, 35);
        panel.add(lblNewLabel_3);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(0, 658, 1370, 91);
        panel_1.setBackground(new Color(14,132,248));
        contentPane.add(panel_1);
        panel_1.setLayout(null);
        
        JPanel panel_2 = new JPanel();
        panel_2.setLayout(null);
        panel_2.setBackground(new Color(13, 13, 255));
        panel_2.setBounds(0, 36, 1370, 40);
        contentPane.add(panel_2);
        
        JLabel lblNewLabel = new JLabel("    Recharge History ");
        lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 24));
        lblNewLabel.setBounds(671, 101, 272, 50);
        contentPane.add(lblNewLabel);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(395, 179, 965, 468);
        contentPane.add(scrollPane);
        
        table = new JTable();
        scrollPane.setViewportView(table);
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        	}
        ));
        
        try(Connection con = DBCONNECTIO.getConnection()){
			 //System.out.println(2);\
            String Query = "select * from Recharge where cid = ? ;";
            PreparedStatement pst = con.prepareStatement(Query);
            pst.setInt(1, cid);
            ResultSet rs = pst.executeQuery(Query);
            ResultSetMetaData rsmd = rs.getMetaData();
            int cols = rsmd.getColumnCount();
            String[] colName = new String[cols];
            for (int i=0;i<cols;i++) {
            	colName[i] = rsmd.getColumnName(i + 1);
            	DefaultTableModel model = (DefaultTableModel)table.getModel();
            	model.setColumnIdentifiers(colName);
            	String cust_name,Rtimestamp,veh_no,
            	 cid1,amount;
            	while(rs.next()) {
            		cid1 = rs.getString(1);
            		cust_name = rs.getString(2);
            		Rtimestamp = rs.getString(3);
            		veh_no = rs.getString(4);
            		amount = rs.getString(5);
            		String[] row = {cid1,cust_name,Rtimestamp,veh_no,amount};
            		model.addRow(row);
            	}
            }
            pst.close();
            con.close(); 
            }
        
        catch(SQLException E){
            E.printStackTrace();
            System.out.println(E.getMessage());
        }

    }

	private String parseInt(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}


