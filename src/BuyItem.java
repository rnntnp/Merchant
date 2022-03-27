import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class BuyItem extends Item{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4025983513924470681L;
	private JButton btnNewButton;
	//ctor
	public BuyItem(String name, int cost, Player player, JLabel costLabel,JLabel messageLabel,int itemKey) {
		super(name,cost,player,costLabel,messageLabel,itemKey);
		Item item=this;
		costLabel.setText("Money: "+player.getCashAmount()+"G");//update cash amount on GUI
		//buy button 
		btnNewButton = new JButton("Buy");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player.gameclear) {
					return;
				}
				if (player.getCashAmount()<cost) {
					messageLabel.setText("You don't have enough money!");				
				}
				else {
					player.setCashAmount(player.getCashAmount()-cost); //negate cost from cash amount
					player.addItem(item);
					messageLabel.setText("Bought "+name+"(-"+cost+"G)");
					player.setFileData(player.getFileData()+("Bought "+name+"(-"+cost+"G)"+"\n"));
					costLabel.setText("Money: "+player.getCashAmount()+"G");//update cash amount on GUI
					player.setFileData(player.getFileData()+"Money: "+player.getCashAmount()+"G"+"\n");
					System.out.println(Arrays.toString(player.getPlayerItems()));		
							
				}
			}
		});
		btnNewButton.setBounds(299, 7, 75, 28);
		add(btnNewButton);
	}


}
