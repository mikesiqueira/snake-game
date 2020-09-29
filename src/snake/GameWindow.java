package snake;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GameWindow extends JFrame implements KeyListener {

	private Renderer renderer;
	private Snake snake;

	public GameWindow(Snake snake) {
		this.snake = snake;
		renderer = new Renderer();
		
	

		setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
		setResizable(false);
		setTitle(Constants.WINDOW_TITLE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		addKeyListener(this);
		setVisible(true);

	}
	
	public Renderer getRenderer() {
		return renderer;
	}

	@Override
	public void paint(Graphics g) {
		renderer.render(g);

	}

	
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			snake.up();
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			snake.down();
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			snake.left();
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			snake.right();
		} else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			 System.exit(0);
		}
		   
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
