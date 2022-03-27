import javax.swing.*;

public class Item extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6308527405833385336L;
	private JLabel lblName;
	private JLabel lblCost;
	private JLabel lblStock;
	private JLabel costLabel;
	private int itemKey;
	private String name;
	private int stock;

	// ctor
	public Item(String name, int cost, Player player, JLabel costLabel, JLabel messageLabel, int itemKey) {
		setLayout(null);
		this.itemKey=itemKey;
        this.name=name;
		this.costLabel = costLabel;
		// item name
		lblName = new JLabel(name);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(30, 2, 82, 37);
		add(lblName);
		// item cost
		lblCost = new JLabel(cost + "G");
		lblCost.setHorizontalAlignment(SwingConstants.CENTER);
		lblCost.setBounds(145, 2, 61, 37);
		add(lblCost);
	}

	public Item(String name, int itemKey , int stock) {
		setLayout(null);
		setName(name);
		setStock(stock);
		setItemKey(itemKey);
		// item name
		lblName = new JLabel(name);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(30, 2, 82, 37);
		add(lblName);
		//show stock
		lblStock = new JLabel(stock+"");
		lblStock.setHorizontalAlignment(SwingConstants.CENTER);
		lblStock.setBounds(145, 2, 61, 37);
		add(lblStock);
	}
	

	// getters and setters
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public JLabel getCostLabel() {
		return costLabel;
	}

	public void setCostLabel(JLabel costLabel) {
		this.costLabel = costLabel;
	}

	public JLabel getLblStock() {
		return lblStock;
	}

	public void setLblStock(JLabel lblStock) {
		this.lblStock = lblStock;
	}
	
	
	
	
	

}
