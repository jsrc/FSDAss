import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class DeleteAdvertisementPage extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteAdvertisementPage frame = new DeleteAdvertisementPage();
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
	public DeleteAdvertisementPage() {
		
		Advertisement ad = new Advertisement();
		Advertisement adv = new Advertisement();
		adv = ad.search();
		
		setTitle("Delete Advertisement");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 450);
		contentPane = new JPanel();
		contentPane.setForeground(Color.MAGENTA);
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("AdID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 26, 200, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblAdID = new JLabel(adv.toString());
		lblAdID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAdID.setBounds(83,24, 116, 22);
		contentPane.add(lblAdID);
		
		
		JLabel lblNewLabel_1 = new JLabel("Price:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 66, 95, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel textField_2 = new JLabel(adv.getPrice());
		textField_2.setBounds(83, 64, 116, 22);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(textField_2);
		
		JLabel lbl3 = new JLabel("Type:");
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl3.setBounds(10, 106, 95, 16);
		contentPane.add(lbl3);
		
		JLabel txtType = new JLabel("House");
		txtType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtType.setBounds(83, 106, 116, 22);
		contentPane.add(txtType);	
		
		JLabel lbl4 = new JLabel("bedrooms:");
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl4.setBounds(10, 146, 95, 16);
		contentPane.add(lbl4);
		
		JLabel txtbed = new JLabel("2");
		txtbed.setBounds(83, 146, 116, 22);
		txtbed.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(txtbed);
		
		JLabel lblbathroom = new JLabel("bathroom:");
		lblbathroom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblbathroom.setBounds(10, 186, 95, 16);
		contentPane.add(lblbathroom);
		
		JLabel txtbath = new JLabel("1");
		txtbath.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtbath.setBounds(83, 186, 116, 22);
		contentPane.add(txtbath);
		
		JLabel lblPark = new JLabel("park:");
		lblPark.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPark.setBounds(10, 226, 95, 16);
		contentPane.add(lblPark);
		
		JLabel txtpark = new JLabel("2");
		txtpark.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtpark.setBounds(83, 226, 116, 22);
		contentPane.add(txtpark);
		
		JLabel lblDesc = new JLabel("Description:");
		lblDesc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDesc.setBounds(10, 266, 95, 16);
		contentPane.add(lblDesc);
		
		JLabel txtdesc = new JLabel(adv.getDescription());
		txtdesc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtdesc.setBounds(83,266, 156, 22);
		contentPane.add(txtdesc);
		
		JLabel lblContract = new JLabel("Contract:");
		lblContract.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblContract.setBounds(10, 306, 95, 16);
		contentPane.add(lblContract);
		
		JLabel txtContract = new JLabel("Crixus");
		txtContract.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtContract.setBounds(83,306, 116, 22);
		contentPane.add(txtContract);
		
		JLabel lblphone = new JLabel("Phone:");
		lblphone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblphone.setBounds(10, 346, 95, 16);
		contentPane.add(lblphone);
		
		JLabel txtPhone = new JLabel("04520157825");
		txtPhone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPhone.setBounds(83,346, 116, 22);
		contentPane.add(txtPhone);
		
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ad.setID(2);
				ad.deleteAdvertisement();
				System.out.println("Advertisement with AdsID "+ lblAdID.getText()+" price "+textField_2.getText()+ " type "+txtType.getText() 
				+" bedrooms "+txtbed.getText()+ " bathrooms "+txtbath.getText() +" park "+txtpark.getText()+ " description "+txtdesc.getText() 
				+" contractname "+txtContract.getText()+ " phone "+txtPhone.getText() +"  is deleted");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 380, 76, 25);
		contentPane.add(btnNewButton);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Advertisement is not deleted");
			}
		});
		btnCancel.setBounds(100, 380, 97, 25);
		contentPane.add(btnCancel);
	}
}
