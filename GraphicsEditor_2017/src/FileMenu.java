import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FileMenu extends JMenu {
	private static final long serialVersionUID = 1L;
	public FileMenu() {
		super("File");
		
		JMenuItem newItem = new JMenuItem("New");
		this.add(newItem);
		JMenuItem openItem = new JMenuItem("Open");
		this.add(openItem);
	}
}
