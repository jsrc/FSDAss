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
public class RegisterPage extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPage frame = new RegisterPage();
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
	public RegisterPage() {
		setTitle("Register UserInfo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.MAGENTA);
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
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
		
		JLabel lbl4 = new JLabel("Gender:");
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl4.setBounds(10, 166, 95, 16);
		contentPane.add(lbl4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(83, 164, 116, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_1.getText().equals("") || textField_2.getText().equals("") || textField_3.getText().equals("")) {
					System.out.println("Please complete personal informaiton. thanks!");
				}else {
					AdvertiserService ads=new AdvertiserService();
					Advertiser ad=new Advertiser();
					ad.setUsername(textField_1.getText().trim());
					ad.setPassword(textField_2.getText().trim());
					ad.setEmail(textField_3.getText().trim());
					ad.setGender(textField_4.getText().trim());
					ads.createAdvertiser(ad);
					System.out.println("Customer with name "+ textField_1.getText()+" PassWord "+textField_2.getText()+ " email "+textField_3.getText() +"  is created");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(93, 205, 76, 25);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Customer is not created");
			}
		});
		btnCancel.setBounds(198, 206, 97, 25);
		contentPane.add(btnCancel);
	}
}

