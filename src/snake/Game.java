package snake;

public class Game {
	private GameWindow gameWindow;
	private Renderer renderer;
	private Snake snake;

	public void start() {
		snake = new Snake();
		gameWindow = new GameWindow(snake);		
		renderer = gameWindow.getRenderer();
		
		addElementsToScreen();
		run();
		
	}
	
	private void addElementsToScreen() {
		renderer.add(new Background());
		renderer.add(snake);
				
	}
	
	public void run() {
		do {
			gameWindow.repaint();	
			snake.move();
			GameUtils.sleep(30);		
						
		} while (!isGameOver());	
		
		gameWindow.dispose();
		
	}
	
	private boolean isGameOver() {
		return snake.collidesWithItself();
	}
}
