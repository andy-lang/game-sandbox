import java.awt.EventQueue;
import javax.swing.JFrame;

public class ImageExample extends JFrame {
	public ImageExample() {
		initUI();
	}

	private void initUI() {
		add(new Board());
		pack();
		setTitle("derp.jpg");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				ImageExample im = new ImageExample();
				im.setVisible(true);
			}
		});
	}
}
