package Grafikeditor;

import java.awt.*;

abstract class Figure {
	int x,y;
//	protected Color color;
//	protected float strokeWidth;
	
	
	Figure(int x, int y){// Color color, float strokeWidth) {
		this.x = x;
		this.y = y;
//		this.color = color;
//		this.strokeWidth = strokeWidth;
	}

	public void move(int deltaX, int deltaY){
		this.x+=deltaX;
		this.y+=deltaY;
	}

	public abstract void draw(Graphics2D g2d);

}
