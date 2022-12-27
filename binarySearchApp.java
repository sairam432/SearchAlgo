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

public class binarySearchApp extends JFrame {

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
					binarySearchApp frame = new binarySearchApp();
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
	public binarySearchApp() {
		setTitle("Search");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BinarySearch");
		lblNewLabel.setFont(new Font("Snap ITC", Font.ITALIC, 16));
		lblNewLabel.setBounds(141, 11, 148, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("enter any in ascending order");
		lblNewLabel_1.setFont(new Font("Snap ITC", Font.ITALIC, 16));
		lblNewLabel_1.setBounds(10, 69, 279, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter key to find");
		lblNewLabel_2.setFont(new Font("Snap ITC", Font.ITALIC, 16));
		lblNewLabel_2.setBounds(10, 114, 197, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblKeyStatus = new JLabel("Key Status");
		lblKeyStatus.setFont(new Font("Snap ITC", Font.ITALIC, 16));
		lblKeyStatus.setBounds(10, 160, 148, 22);
		contentPane.add(lblKeyStatus);
		
		taa = new JTextField();
		taa.setBounds(115, 95, 288, 20);
		contentPane.add(taa);
		taa.setColumns(10);
		
		tbb = new JTextField();
		tbb.setColumns(10);
		tbb.setBounds(173, 140, 219, 20);
		contentPane.add(tbb);
		
		tcc = new JTextField();
		tcc.setColumns(10);
		tcc.setBounds(92, 193, 288, 20);
		contentPane.add(tcc);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String str=taa.getText();
				String key=tbb.getText();
				
				String []arr=str.split(" ");
				int low =0;
				int high=arr.length-1;
				
				while(low<=high)
				{
					int mid=(low+high)/2;
					if(Integer.valueOf(key)==Integer.valueOf(arr[mid]))
					{
						tcc.setText("Key Found at Index:"+mid);
						return;
					}
					 else if(Integer.valueOf(key)>Integer.valueOf(arr[mid]))
					{
						low=mid+1;
						high=high;
					}
					 else
					 {
						 high=mid-1;
						 low=low;
					 }
				}
				tcc.setText("Sorry Key Not Found ");
			}
		});
		btnNewButton.setBounds(152, 227, 89, 23);
		contentPane.add(btnNewButton);
	}
}
