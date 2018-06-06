
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
//TODO Main page
public class MainPage extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public MainPage() {
		setTitle("Mainpage");
		//setTitle("CurrentUserName"+"Visitor/Admin/RegisteredUser");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		JPanel contentPane = new JPanel();
		contentPane.setForeground(Color.MAGENTA);
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CurrentUserName\"+\"Visitor/Admin/RegisteredUser");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(20, 10, 500, 30);
		contentPane.add(lblNewLabel);
		
		JTextField txtSearch=new JTextField();
		txtSearch.setBounds(20, 84, 150, 30);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnAddad = new JButton("AddAdvertisement");
		btnAddad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAddad.setBounds(10, 380, 150, 30);
		contentPane.add(btnAddad);
		btnAddad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdvertisementInfoPage frame = new AdvertisementInfoPage();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton btnModifyad = new JButton("ModifyAdvertisement");
		btnModifyad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnModifyad.setBounds(180, 380, 150, 30);
		contentPane.add(btnModifyad);
		btnModifyad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModifyAdvertisementPage frame = new ModifyAdvertisementPage();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton btnRegister = new JButton("RegisterUserInfo");
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRegister.setBounds(10, 420, 150, 30);
		contentPane.add(btnRegister);
		
		JButton btnModifyUser = new JButton("ModifyUserInfo");
		btnModifyUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnModifyUser.setBounds(180, 420, 150, 30);
		contentPane.add(btnModifyUser);
		
		JButton btnQuery = new JButton("Search");
		btnQuery.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnQuery.setBounds(180, 84, 80, 30);
		contentPane.add(btnQuery);
		btnQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("success");
			}
		});
		
		
	}
	

}
