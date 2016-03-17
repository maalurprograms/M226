package Grafikeditor;

import java.awt.Color;

public class Rectangle extends Figure{
	private int width, heigth;
	
	public Rectangle(int x, int y, Color color, float strokeWidth, int width, int heigth) {
		super(x, y,color, strokeWidth);
		this.width = width;
		this.heigth = heigth;
	}
	
	public int getHeigth(){
		return heigth;
	}
	
	public int getWidth(){
		return width;
	}
}
