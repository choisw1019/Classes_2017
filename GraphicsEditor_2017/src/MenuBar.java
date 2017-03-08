import javax.swing.JMenuBar;

public class MenuBar extends JMenuBar {
	private static final long serialVersionUID = 1L;
	private FileMenu fileMenu;
	private FileMenu editMenu;
	
	public MenuBar() {
		super();
		this.fileMenu = new FileMenu();
		this.add(this.fileMenu);
		this.editMenu = new FileMenu();
		this.add(this.editMenu);

	}

}
