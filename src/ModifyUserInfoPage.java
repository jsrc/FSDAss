import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
public class ModifyUserInfoPage extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModifyUserInfoPage frame = new ModifyUserInfoPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public ModifyUserInfoPage() {
		setTitle("Register UserInfo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.MAGENTA);
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserID = new JLabel("UserID:");
		lblUserID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUserID.setBounds(10, 6, 200, 16);
		contentPane.add(lblUserID);
		
		JLabel lblID = new JLabel("1");
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblID.setBounds(83,6, 116, 16);
		contentPane.add(lblID);
		
		JLabel lblNewLabel = new JLabel("UserName:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 46, 200, 16);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(83,44, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PassWord:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 86, 95, 16);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(83, 84, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lbl3 = new JLabel("Email:");
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl3.setBounds(10, 126, 95, 16);
		contentPane.add(lbl3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(83, 124, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Modify");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_1.getText().equals("") || textField_2.getText().equals("") || textField_3.getText().equals("")) {
					System.out.println("Please complete personal informaiton. thanks!");
				}else {
					System.out.println("Customer with UserId "+ lblID.getText()+" name "+ textField_1.getText()+" PassWord "+textField_2.getText()+ " email "+textField_3.getText() +"  is modified");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(93, 205, 76, 25);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("UserInfo is not modified");
			}
		});
		btnCancel.setBounds(198, 206, 97, 25);
		contentPane.add(btnCancel);
	}
}

