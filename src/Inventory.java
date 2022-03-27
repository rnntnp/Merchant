import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Inventory extends JFrame {
	//base of Merchant, Inventory
	private static final long serialVersionUID = 1138895378428568750L;
	
	public JPanel contentPane;
	public JPanel titlePane;
	public JPanel headerPane;
	public JButton btnCallBuyMenu;
	public JButton btnCallSellMenu;
	public JPanel buyPane;
	public JPanel sellPane;
	public JLabel lbTitle;
	public JPanel playerInfoPane;
	public JLabel lblMoney;
	public JButton btn;
	public JLabel lbHeader1;
	public JLabel lbHeader2;
	public JPanel linePane;
	public boolean isBuyMenu=true;
	public JPanel messagePane;
	public JLabel lblIsBuyMenu;
	public JLabel lblMessage;
	public JLabel lblNewLabel;

	public Inventory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		titlePane = new JPanel();
		titlePane.setBackground(SystemColor.desktop);
		titlePane.setBounds(5, 6, 590, 68);
		contentPane.add(titlePane);
		titlePane.setLayout(null);
		
		lbTitle = new JLabel("Merchant 1");
		lbTitle.setBounds(64, 16, 278, 22);
		lbTitle.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lbTitle.setVerticalAlignment(SwingConstants.BOTTOM);
		titlePane.add(lbTitle);
		
		headerPane = new JPanel();
		headerPane.setBackground(UIManager.getColor("window"));
		headerPane.setBounds(5, 74, 590, 44);
		contentPane.add(headerPane);
		headerPane.setLayout(null);
		
		lbHeader1 = new JLabel("Item");
		lbHeader1.setForeground(SystemColor.controlHighlight);
		lbHeader1.setHorizontalAlignment(SwingConstants.CENTER);
		lbHeader1.setBounds(30, 1, 82, 46);
		headerPane.add(lbHeader1);
		
		lbHeader2 = new JLabel("Cost");
		lbHeader2.setHorizontalAlignment(SwingConstants.CENTER);
		lbHeader2.setForeground(SystemColor.controlHighlight);
		lbHeader2.setBounds(145, 1, 61, 46);
		headerPane.add(lbHeader2);
				
		playerInfoPane = new JPanel();
		playerInfoPane.setBackground(SystemColor.textHighlight);
		playerInfoPane.setBounds(5, 466, 590, 68);
		contentPane.add(playerInfoPane);
		playerInfoPane.setLayout(null);
		
		lblMoney = new JLabel("Money: "+"G");
		lblMoney.setBounds(45, 6, 243, 21);
		playerInfoPane.add(lblMoney);
		
		linePane = new JPanel();
		linePane.setBackground(UIManager.getColor("infoText"));
		linePane.setBounds(6, 115, 588, 5);
		contentPane.add(linePane);
		
		buyPane = new JPanel();
		buyPane.setBounds(5, 119, 590, 346);
		contentPane.add(buyPane);
		buyPane.setLayout(new GridLayout(7, 1, 0, 0));
		
		messagePane = new JPanel();
		messagePane.setBackground(new Color(255, 255, 0));
		messagePane.setBounds(5, 534, 589, 32);
		contentPane.add(messagePane);
		messagePane.setLayout(null);
		
		lblMessage = new JLabel("");
		lblMessage.setBounds(6, 6, 563, 16);
		messagePane.add(lblMessage);
		
		
		lblNewLabel = new JLabel("Earn 100G!");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel.setBounds(392, 23, 177, 37);
		playerInfoPane.add(lblNewLabel);
		
		this.setVisible(true);
		
	}
	
}
