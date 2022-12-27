package my;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class linearSearch extends JFrame {

	private JPanel contentPane;
	private JTextField taa;
	private JTextField tbb;
	private JTextField tcc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					linearSearch frame = new linearSearch();
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
	public linearSearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Linear Search App");
		lblNewLabel.setFont(new Font("Snap ITC", Font.ITALIC, 17));
		lblNewLabel.setBounds(135, 11, 193, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterInAscending = new JLabel("Enter in Ascending");
		lblEnterInAscending.setFont(new Font("Snap ITC", Font.ITALIC, 17));
		lblEnterInAscending.setBounds(10, 70, 193, 14);
		contentPane.add(lblEnterInAscending);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter key to search");
		lblNewLabel_1_1.setFont(new Font("Snap ITC", Font.ITALIC, 17));
		lblNewLabel_1_1.setBounds(10, 118, 193, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("key Status");
		lblNewLabel_1_1_1.setFont(new Font("Snap ITC", Font.ITALIC, 17));
		lblNewLabel_1_1_1.setBounds(10, 165, 193, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		taa = new JTextField();
		taa.setBounds(242, 61, 182, 38);
		contentPane.add(taa);
		taa.setColumns(10);
		
		tbb = new JTextField();
		tbb.setColumns(10);
		tbb.setBounds(242, 109, 182, 38);
		contentPane.add(tbb);
		
		tcc = new JTextField();
		tcc.setColumns(10);
		tcc.setBounds(242, 158, 182, 35);
		contentPane.add(tcc);
		
		JButton btnNewButton = new JButton("Search Key");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String str=taa.getText();
				String []arr=str.split(" ");
				
				String key=tbb.getText();
				
				
				for(int i=0;i<=arr.length-1;i++)
				{
					if(Integer.valueOf(key)==Integer.valueOf(arr[i]))
					{
						
						tcc.setText("key found at index:"+i);
						return;	
					}
				}
              tcc.setText("Sorry Key Not Found !");
					
			}
		});
		btnNewButton.setBounds(157, 212, 141, 38);
		contentPane.add(btnNewButton);
	}
}
