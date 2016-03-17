package Grafikeditor;

import java.awt.Color;

public class Figure {
	protected int x,y;
	protected Color color;
	protected float strokeWidth;
	
	
	public Figure(int x, int y, Color color, float strokeWidth) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.strokeWidth = strokeWidth;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public Color getColor(){
		return color;
	}
	
	public float getStrokeWidth(){
		return strokeWidth;
	}

	public void move(int deltaX, int deltaY){
		this.x+=deltaX;
		this.y+=deltaY;
	}

}
