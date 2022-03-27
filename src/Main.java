import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private static final long serialVersionUID = -1873086322001919595L;
	
	public static Player player;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private static Merchant merchant1;
	private static Merchant merchant2;
	private static Merchant merchant3;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					Main frame = new Main();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		Player player = new Player();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();

		new JFrame();

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JFrame main = this;
		contentPane.setLayout(null);

		lblNewLabel = new JLabel("click buttons to trade with merchants");
		lblNewLabel.setBounds(136, 46, 307, 21);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel);

		btnNewButton = new JButton("Merchant1");
		btnNewButton.setBounds(238, 129, 110, 29);
		btnNewButton.addActionListener(new ActionListener() {
			//open merchant1 window
			public void actionPerformed(ActionEvent e) {
				main.setVisible(false);
				if (merchant1 == null) {
					merchant1 = new Merchant(player, main, "merchant1");
	
					Item buyItem1 = new BuyItem("potion", 1, player, merchant1.lblMoney, merchant1.lblMessage, 0);
					Item buyItem2 = new BuyItem("flower", 2, player, merchant1.lblMoney, merchant1.lblMessage, 1);
					Item buyItem3 = new BuyItem("hat", 3, player, merchant1.lblMoney, merchant1.lblMessage, 2);
					merchant1.buyPane.add(buyItem1);
					merchant1.buyPane.add(buyItem2);
					merchant1.buyPane.add(buyItem3);
					
					Item sellItem1 = new SellItem("knife", 5, player, merchant1.lblMoney, merchant1.lblMessage, 3);
					Item sellItem2 = new SellItem("pen", 10, player, merchant1.lblMoney, merchant1.lblMessage, 6);
					Item sellItem3 = new SellItem("cup", 3, player, merchant1.lblMoney, merchant1.lblMessage, 5);
					merchant1.sellPane.add(sellItem1);
					merchant1.sellPane.add(sellItem2);
					merchant1.sellPane.add(sellItem3);

				}
				merchant1.setLocation(main.getLocation().x, main.getLocation().y);
				merchant1.onVisible();
				merchant1.setVisible(true);
			}
		});
		getContentPane().add(btnNewButton);

		btnNewButton_1 = new JButton("Merchant2");
		btnNewButton_1.setBounds(238, 222, 110, 29);
		btnNewButton_1.addActionListener(new ActionListener() {
			//open merchant2 window
			public void actionPerformed(ActionEvent e) {
				main.setVisible(false);
				if (merchant2 == null) {
					merchant2 = new Merchant(player, main, "merchant2");

					Item buyItem1 = new BuyItem("knife", 4, player, merchant2.lblMoney, merchant2.lblMessage, 3);
					Item buyItem2 = new BuyItem("pin", 5, player, merchant2.lblMoney, merchant2.lblMessage, 4);
					Item buyItem3 = new BuyItem("cup", 6, player, merchant2.lblMoney, merchant2.lblMessage, 5);
					merchant2.buyPane.add(buyItem1);
					merchant2.buyPane.add(buyItem2);
					merchant2.buyPane.add(buyItem3);

					Item sellItem1 = new SellItem("potion", 2, player, merchant2.lblMoney, merchant2.lblMessage, 0);
					Item sellItem2 = new SellItem("book", 6, player, merchant2.lblMoney, merchant2.lblMessage, 7);
					Item sellItem3 = new SellItem("wand", 9, player, merchant2.lblMoney, merchant2.lblMessage, 8);
					merchant2.sellPane.add(sellItem1);
					merchant2.sellPane.add(sellItem2);
					merchant2.sellPane.add(sellItem3);
				}
				merchant2.setLocation(main.getLocation().x, main.getLocation().y);
				merchant2.onVisible();
				merchant2.setVisible(true);

			}
		});
		getContentPane().add(btnNewButton_1);

		btnNewButton_2 = new JButton("Merchant3");
		btnNewButton_2.setBounds(238, 311, 110, 29);
		btnNewButton_2.addActionListener(new ActionListener() {
			//open merchant3 window 
			public void actionPerformed(ActionEvent e) {
				main.setVisible(false);
				if (merchant3 == null) {
					merchant3 = new Merchant(player, main, "merchant3");
					
					Item buyItem1 = new BuyItem("pen", 7, player, merchant3.lblMoney, merchant3.lblMessage, 6);
					Item buyItem2 = new BuyItem("book", 8, player, merchant3.lblMoney, merchant3.lblMessage, 7);
					Item buyItem3 = new BuyItem("wand", 9, player, merchant3.lblMoney, merchant3.lblMessage, 8);
					merchant3.buyPane.add(buyItem1);
					merchant3.buyPane.add(buyItem2);
					merchant3.buyPane.add(buyItem3);

					Item sellItem1 = new SellItem("hat", 5, player, merchant3.lblMoney, merchant3.lblMessage, 2);
					Item sellItem2 = new SellItem("pin", 8, player, merchant3.lblMoney, merchant3.lblMessage, 4);
					Item sellItem3 = new SellItem("flower", 1, player, merchant3.lblMoney, merchant3.lblMessage, 1);
					merchant3.sellPane.add(sellItem1);
					merchant3.sellPane.add(sellItem2);
					merchant3.sellPane.add(sellItem3);
				}
				merchant3.setLocation(main.getLocation().x, main.getLocation().y);
				merchant3.onVisible();
				merchant3.setVisible(true);
			}
		});
		getContentPane().add(btnNewButton_2);

	}
}
