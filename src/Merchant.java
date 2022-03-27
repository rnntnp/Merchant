import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Merchant extends Inventory {

	private static final long serialVersionUID = -6281651002504838295L;
	public JButton btnCallBuyMenu;
	public JButton btnCallSellMenu;
	public JPanel sellPane;
	public JButton btn;
	public boolean isBuyMenu=true;
	public JLabel lblIsBuyMenu;
	public JButton btnBack;
	public Player player;
	
	//ctor
	public Merchant(Player player,JFrame main ,String name) {
		super();
		this.player=player;
		Inventory merchant=this;
		lbTitle.setText(name);
		btn = new JButton("View My Items");
		btn.addActionListener(new ActionListener() {
			//open inventory
			public void actionPerformed(ActionEvent e) {
				merchant.setVisible(false);
				player.setLastScreen(merchant);
				player.setLocation(merchant.getLocation().x, merchant.getLocation().y);
				player.setVisible(true);
			}
		});
		btn.setBounds(39, 33, 207, 29);
		playerInfoPane.add(btn);
		
		sellPane = new JPanel();
		sellPane.setBounds(5, 119, 590, 346);
		getContentPane().add(sellPane);
		sellPane.setLayout(new GridLayout(7, 1, 0, 0));
		sellPane.setVisible(false);
		
		btnCallSellMenu = new JButton("Sell");
		btnCallSellMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//goto sell menu 
				//Executes only when buy menu is showing
				if(isBuyMenu) {
					buyPane.setVisible(false);
					sellPane.setVisible(true);
					lblIsBuyMenu.setText("sell items!");
					titlePane.setBackground(Color.magenta);
					isBuyMenu=false;
				}
				
			}
		});
		btnCallSellMenu.setBounds(386, 16, 75, 29);
		titlePane.add(btnCallSellMenu);
		
		btnCallBuyMenu = new JButton("Buy");
		btnCallBuyMenu.setBounds(299, 16, 75, 29);
		titlePane.add(btnCallBuyMenu);
		
		btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			//goto main 
			public void actionPerformed(ActionEvent e) {
				merchant.setVisible(false);
				main.setLocation(merchant.getLocation().x, merchant.getLocation().y);
				main.setVisible(true);
			}
		});
		btnBack.setBounds(470, 16, 75, 29);
		titlePane.add(btnBack);
		
		lblIsBuyMenu = new JLabel("buy items!");
		titlePane.setBackground(Color.green);
		lblIsBuyMenu.setBounds(64, 46, 106, 16);
		titlePane.add(lblIsBuyMenu);
		btnCallBuyMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//goto buymenu 
				//Executes only when sell menu is showing
				if(!isBuyMenu) {
					buyPane.setVisible(true);
					sellPane.setVisible(false);
					lblIsBuyMenu.setText("buy items!");
					titlePane.setBackground(Color.green);
					isBuyMenu=true;
				}
			}
		});
	}
	
	//update money
	public void onVisible() {
		lblMoney.setText("Money: "+player.getCashAmount()+"G");
		if(!player.gameclear) {
			lblMessage.setText("");
		}
		else {
			TextEffect textEffect=new TextEffect(lblMessage);
			textEffect.execute();
		}
	}
}
