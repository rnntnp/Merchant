import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JLabel;


public class SellItem extends Item{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1971247576351755292L;
	private JButton btnNewButton;
	//ctor
	public SellItem(String name, int cost, Player player, JLabel costLabel,JLabel messageLabel,int itemKey) {
		super(name,cost,player,costLabel,messageLabel,itemKey);
		//sell button 
		btnNewButton = new JButton("Sell");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(player.gameclear) {
					return;
				}
				if (player.getPlayerItems()[itemKey]<1) {
					messageLabel.setText("You dont have any "+name+"!");
				}
				else {
					player.popItem(itemKey);
					System.out.println(Arrays.toString(player.getPlayerItems()));
					messageLabel.setText("Sold "+name+"(+"+cost+"G)");
					player.setFileData(player.getFileData()+"Sold "+name+"(+"+cost+"G)"+"\n");
					player.setCashAmount(player.getCashAmount()+cost); //add cost from cash amount
					costLabel.setText("Money: "+player.getCashAmount()+"G");//update cash amount on GUI
					player.setFileData(player.getFileData()+"Money: "+player.getCashAmount()+"G"+"\n");
					
					//game clear condition
					if(player.getCashAmount()>=100) {
						player.setFileData(player.getFileData()+"you won! ^_^ "+"\n");
						player.gameClear();
//						messageLabel.setText("You won! Check merchant.txt");
						TextEffect textEffect=new TextEffect(messageLabel);
						textEffect.execute();
						TextEffect textEffectPlayer=new TextEffect(player.lblMessage);
						textEffectPlayer.execute();
					}
					
				
				}
			}
		});
		btnNewButton.setBounds(386, 7, 75, 28);
		add(btnNewButton);
	}


}
