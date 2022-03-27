import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;


public class Player extends Inventory {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3753728440879740409L;
	public boolean gameclear=false;
	private int cashAmount;
	private int[] playerItemStock=new int[10];
	private Item[] itemPanels=new Item[10];
	private JButton btngoBack;
	private JFrame lastScreen;//Polymorphism
	
	private FileOutputStream fileObject;
	private PrintWriter dataWriter;
	
	private String fileData="";

	//ctor
	public Player() {
		super();
		this.setVisible(false);
		lbTitle.setText("My Inventory");
		titlePane.setBackground(Color.cyan);
		lbHeader2.setText("stock");
		Player player=this;
		//go back button
		btngoBack = new JButton("Back");
		btngoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.setVisible(false);
				lastScreen.setLocation(player.getLocation().x,player.getLocation().y);
				lastScreen.setVisible(true);
			}});
		btngoBack.setBounds(299, 16, 75, 29);
		titlePane.add(btngoBack);
		cashAmount=10; //initialize with amount of money=10G
		lblMoney.setText("Money: "+cashAmount+"G");//update cash amount on GUI

	}
	public void addItem(Item newItem) {
		int itemKey=newItem.getItemKey();
		lblMoney.setText("Money: "+cashAmount+"G");//update cash amount on GUI
		if(playerItemStock[itemKey]==0) {
			playerItemStock[itemKey]++;
			System.out.println(newItem.getName());
			Item clonedNewItem=new Item(newItem.getName(),itemKey,playerItemStock[itemKey]);
			buyPane.add(clonedNewItem);
			itemPanels[itemKey]=clonedNewItem;
		}
		else {
			playerItemStock[itemKey]++;
			itemPanels[itemKey].getLblStock().setText(playerItemStock[itemKey]+"");
		}
		
	}
	
	public void popItem(int itemKey) {
		lblMoney.setText("Money: "+cashAmount+"G");//update cash amount on GUI
		if(playerItemStock[itemKey]>0) {
			playerItemStock[itemKey]--;
			itemPanels[itemKey].getLblStock().setText(playerItemStock[itemKey]+"");
			if(playerItemStock[itemKey]==0) {
				buyPane.remove(itemPanels[itemKey]);
			}
		}
		else {
			System.err.println("already 0 item!");
		}
	}
	
	public void gameClear() {
		//set gameclear
		gameclear=true;
		//file output
		try {
			fileObject = new FileOutputStream("merchant.txt");
			dataWriter = new PrintWriter(fileObject);
			dataWriter.print(fileData);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		dataWriter.close();
	}
	
	//getters and setters
	public int getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(int cashAmount) {
		this.cashAmount = cashAmount;
	}

	public int[] getPlayerItems() {
		return playerItemStock;
	}

	public JFrame getLastScreen() {
		return lastScreen;
	}

	public void setLastScreen(JFrame lastScreen) {
		this.lastScreen = lastScreen;
	}

	public String getFileData() {
		return fileData;
	}

	public void setFileData(String fileData) {
		this.fileData = fileData;
	}
	
	public void onVisible() {
		if(!gameclear) {
		lblMessage.setText("");//clear message
		}
		else {
			TextEffect textEffect=new TextEffect(lblMessage);
			textEffect.execute();
		}
	}
	
	
}
