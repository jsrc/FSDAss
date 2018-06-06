import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class AdvertisementInfoPage extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdvertisementInfoPage frame = new AdvertisementInfoPage();
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
	public AdvertisementInfoPage() {
		setTitle("AddAdvertisement");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setForeground(Color.MAGENTA);
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Address:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 26, 200, 16);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(83,24, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Price:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 66, 95, 16);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(83, 64, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lbl3 = new JLabel("Type:");
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl3.setBounds(10, 106, 95, 16);
		contentPane.add(lbl3);
		
		JTextField txtType = new JTextField();
		txtType.setBounds(83, 106, 116, 22);
		contentPane.add(txtType);
		txtType.setColumns(10);		
		
		JLabel lbl4 = new JLabel("bedrooms:");
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl4.setBounds(10, 146, 95, 16);
		contentPane.add(lbl4);
		
		JTextField txtbed = new JTextField();
		txtbed.setBounds(83, 146, 116, 22);
		contentPane.add(txtbed);
		txtbed.setColumns(10);
		
		JLabel lblbathroom = new JLabel("bathroom:");
		lblbathroom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblbathroom.setBounds(10, 186, 95, 16);
		contentPane.add(lblbathroom);
		
		JTextField txtbath = new JTextField();
		txtbath.setBounds(83, 186, 116, 22);
		contentPane.add(txtbath);
		txtbath.setColumns(10);
		
		JLabel lblPark = new JLabel("park:");
		lblPark.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPark.setBounds(10, 226, 95, 16);
		contentPane.add(lblPark);
		
		JTextField txtpark = new JTextField();
		txtpark.setBounds(83, 226, 116, 22);
		contentPane.add(txtpark);
		txtpark.setColumns(10);
		
		JLabel lblDesc = new JLabel("Description:");
		lblDesc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDesc.setBounds(10, 266, 95, 16);
		contentPane.add(lblDesc);
		
		JTextField txtdesc = new JTextField();
		txtdesc.setBounds(83,266, 156, 22);
		contentPane.add(txtdesc);
		textField_2.setColumns(10);
		
		JLabel lblContract = new JLabel("Contract:");
		lblContract.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblContract.setBounds(10, 306, 95, 16);
		contentPane.add(lblContract);
		
		JTextField txtContract = new JTextField();
		txtContract.setBounds(83,306, 116, 22);
		contentPane.add(txtContract);
		txtContract.setColumns(10);
		
		JLabel lblphone = new JLabel("Phone:");
		lblphone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblphone.setBounds(10, 346, 95, 16);
		contentPane.add(lblphone);
		
		JTextField txtPhone = new JTextField();
		txtPhone.setBounds(83,346, 116, 22);
		contentPane.add(txtPhone);
		txtPhone.setColumns(10);
		
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Advertisement ad = new Advertisement();
				ad.setAddress(textField_1.getText());
				ad.setPrice(textField_2.getText());
				ad.addAdvertisement();
				System.out.println("Advertisement with address "+ textField_1.getText()+" price "+textField_2.getText()+ " type "+txtType.getText() 
				+" bedrooms "+txtbed.getText()+ " bathrooms "+txtbath.getText() +" park "+txtpark.getText()+ " description "+txtdesc.getText() 
				+" contractname "+txtContract.getText()+ " phone "+txtPhone.getText() +"  is created");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 380, 76, 25);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("EXIT");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnCancel.setBounds(100, 380, 97, 25);
		contentPane.add(btnCancel);
	}
}
