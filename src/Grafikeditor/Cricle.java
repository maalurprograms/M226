package Grafikeditor;

import java.awt.Color;

public class Cricle extends Figure{
	private int radius;
	
	public Cricle(int x, int y, Color color, float strokeWidth, int radius) {
		super(x, y,color, strokeWidth);
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
}
