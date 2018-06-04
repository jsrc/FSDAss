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
public class PaymentPage extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentPage frame = new PaymentPage();
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
	public PaymentPage() {
		setTitle("Register UserInfo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.MAGENTA);
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdID = new JLabel("AdID:");
		lblAdID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAdID.setBounds(10, 6, 200, 16);
		contentPane.add(lblAdID);
		
		JLabel lblID = new JLabel("1");
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblID.setBounds(83,6, 116, 16);
		contentPane.add(lblID);
		
		JLabel lblConctract = new JLabel("Conctract:");
		lblConctract.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblConctract.setBounds(10, 46, 200, 16);
		contentPane.add(lblConctract);
		
		JLabel lblContract = new JLabel("Crixus");
		lblContract.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblContract.setBounds(83,46, 116, 16);
		contentPane.add(lblContract);
		
		JLabel lblphone = new JLabel("Phone:");
		lblphone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblphone.setBounds(10, 86, 95, 16);
		contentPane.add(lblphone);
		
		JTextField txtPhone = new JTextField();
		txtPhone.setBounds(83,86, 116, 22);
		contentPane.add(txtPhone);
		txtPhone.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Price:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 126, 95, 16);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(83, 126, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		
		JLabel lblBankAccout = new JLabel("BankAccout:");
		lblBankAccout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBankAccout.setBounds(10, 166, 95, 16);
		contentPane.add(lblBankAccout);
		
		textField_3 = new JTextField();
		textField_3.setBounds(83, 166, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Pay");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Advertisement with AdID "+ lblID.getText()+" contractname "+ lblContract.getText()+" price "+textField_2.getText()+ " bankaccountno "+textField_3.getText()+" phone "+txtPhone.getText() +"  is paied");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(93, 205, 76, 25);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("advertisement is not paied");
			}
		});
		btnCancel.setBounds(198, 206, 97, 25);
		contentPane.add(btnCancel);
	}
}