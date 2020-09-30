package snake;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

public class Food extends Rect {
	
	public Food(Rectangle drawingArea) {
		setColor(Color.GREEN);
		setDimension(new Dimension(Constants.FOOD_SIZE , Constants.FOOD_SIZE));	
		setRandomLocation (drawingArea);	
	}
	
	public void setRandomLocation(Rectangle drawingarea) {
		int offset = 3;
		
		int minX = (int) drawingarea.getMinX() + offset;		
		int minY = (int) drawingarea.getMinY() + offset;
		
		int maxX = (int) drawingarea.getMaxX() - Constants.FOOD_SIZE - offset;		
		int maxY = (int) drawingarea.getMaxY() - Constants.FOOD_SIZE - offset;
		
		int randomX = GameUtils.random(minX, maxX);
		int randomY = GameUtils.random(minY, maxY);
		
		setLocation(new Point(randomX, randomY));		
	
	}
}
