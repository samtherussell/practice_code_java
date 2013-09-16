import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class guitwo extends JFrame{
	private JLabel item1;
	
	public guitwo(){
		super("the title");
		setLayout(new FlowLayout());
			item1 = new JLabel("this is dsf");
			item1.setToolTipText("thisiojsoj");
			add(item1);
	}

}
