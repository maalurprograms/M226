package Grafikeditor;

import java.awt.*;

class CircleFigure extends Figure{
	private int radius;
	
	CircleFigure(int x, int y, int radius){//, Color color, float strokeWidth) {
		super(x, y);//,color, strokeWidth);
		this.radius = radius;
	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.fillOval(x - radius, y - radius, radius*2, radius*2);

	}
}
