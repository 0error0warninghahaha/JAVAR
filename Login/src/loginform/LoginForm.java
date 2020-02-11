package loginform;

import java.awt.EventQueue;

import javax.swing.JFrame;

import userdao.UserDao;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm {

	private JFrame frame;
	
	private UserDao dao;
	private JTextField textField;
	private JTextField textField_1;

	public LoginForm() {
		init();
	}

	public void init() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("用户名：");
		label.setBounds(69, 63, 54, 15);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("密  码：");
		label_1.setBounds(69, 114, 54, 15);
		frame.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setBounds(145, 56, 166, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(145, 107, 166, 30);
		frame.getContentPane().add(textField_1);
		
		JButton button = new JButton("登录");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validate();				
			}
		});
		button.setBounds(145, 195, 93, 23);
		frame.getContentPane().add(button);
		display();
	}

	public void display() {
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void validate() {
		String userName = textField.getText();
		String userPassword = textField_1.getText();
		boolean findUser = dao.findUser(userName, userPassword);
		if(findUser) {
			JOptionPane.showMessageDialog(null,"登陆成功");
		}else {
			JOptionPane.showMessageDialog(null,"用户名或密码错误");
		}
	}
}
