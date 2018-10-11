package view;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerLogin {

	private JFrame frmCustomerLogin;
	private JTextField tf_userName;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */

	public void run() {
		try {
			new CustomerLogin().frmCustomerLogin.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 */
	public CustomerLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCustomerLogin = new JFrame();
		frmCustomerLogin.setTitle("Customer Login");
		frmCustomerLogin.setBounds(100, 100, 595, 503);
		frmCustomerLogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCustomerLogin.getContentPane().setLayout(null);
		
		JLabel lblAccountNumber = new JLabel("User name:");
		lblAccountNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAccountNumber.setBounds(58, 97, 163, 32);
		frmCustomerLogin.getContentPane().add(lblAccountNumber);
		
		tf_userName = new JTextField();
		tf_userName.setBounds(231, 106, 192, 22);
		frmCustomerLogin.getContentPane().add(tf_userName);
		tf_userName.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:\r\n");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(58, 181, 163, 32);
		frmCustomerLogin.getContentPane().add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(231, 191, 192, 22);
		frmCustomerLogin.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCustomerLogin.dispose();
				new CustomerWindow(tf_userName.getText().trim()).run();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(176, 286, 225, 57);
		frmCustomerLogin.getContentPane().add(btnNewButton);
		
		JButton btnBackToMain = new JButton("Back to Main menu");
		btnBackToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCustomerLogin.dispose();
				new MainMenu().run();
			}
		});
		btnBackToMain.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBackToMain.setBounds(176, 381, 225, 57);
		frmCustomerLogin.getContentPane().add(btnBackToMain);
	}

}