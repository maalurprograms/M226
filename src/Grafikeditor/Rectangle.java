package Grafikeditor;

import java.awt.*;

public class Rectangle extends Figure{
	private int width, heigth;
	
	public Rectangle(int x, int y, int width, int heigth){//, Color color, float strokeWidth) {
		super(x, y);//,color, strokeWidth);
		this.width = width;
		this.heigth = heigth;
	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.fillRect(x, y, width, heigth);
	}
}
