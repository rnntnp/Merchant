import javax.swing.*;
public class TextEffect extends SwingWorker<Void,Void>{
	JLabel messageLabel;
	public TextEffect(JLabel messageLabel) {
		this.messageLabel=messageLabel;
	}
	
	@Override
	public Void doInBackground()
    {
        try
        {
            for(int i = 0 ; i < 100 ; i++)
            {
            	messageLabel.setText("You won! Check merchant.txt");
                Thread.sleep(100);
                messageLabel.setText("");
                Thread.sleep(100);
            }
        }catch(InterruptedException e)
        {
            System.out.println(e);
        }
    
	return null;
	}

}
