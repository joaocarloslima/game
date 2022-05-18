import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Game extends JFrame{
	
	private static final long serialVersionUID = 1L;
	JTabbedPane abas = new JTabbedPane();

	public static void main(String[] args) {
		new Game().config();
	}

	private void config() {
		
		init();
		
	}

	private void init() {
		add(abas);
		setSize(500,250);
		setTitle("Game");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
