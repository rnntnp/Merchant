import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PlayerItem extends JPanel{
	
	private static final long serialVersionUID = 8121042225725020380L;
	
	private JLabel lblName;
	private JLabel lblCost;
	private int itemKey;
	//ctor
	public PlayerItem(String name, int cost, Player player, JLabel costLabel, JLabel messageLabel, int itemKey) {
		setLayout(null);
		//item name
		lblName = new JLabel(name);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(30, 2, 82, 37);
		add(lblName);
		//item cost
		lblCost = new JLabel(cost+"G");
		lblCost.setHorizontalAlignment(SwingConstants.CENTER);
		lblCost.setBounds(145, 2, 61, 37);
		add(lblCost);
	}
	
	//getters and setters
	public JLabel getLblName() {
		return lblName;
	}
	
	public void setLblName(JLabel lblName) {
		this.lblName = lblName;
	}
	
	public JLabel getLblCost() {
		return lblCost;
	}
	
	public void setLblCost(JLabel lblCost) {
		this.lblCost = lblCost;
	}
	
	public int getItemKey() {
		return itemKey;
	}

	public void setItemKey(int itemKey) {
		this.itemKey = itemKey;
	}

}
