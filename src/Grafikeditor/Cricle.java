package Grafikeditor;

import java.awt.*;

public class Cricle extends Figure{
	private int radius;
	
	public Cricle(int x, int y, Color color, float strokeWidth, int radius) {
		super(x, y,color, strokeWidth);
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	@Override
	public void zeichen(Graphics2D g2d) {
		g2d.fillOval(x - radius, y - radius, radius, radius);
	}
}
