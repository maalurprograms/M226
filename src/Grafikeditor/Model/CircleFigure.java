package Grafikeditor.Model;

import java.awt.*;

public class CircleFigure extends Figure {
	private int radius;

	public CircleFigure(int x, int y, int radius){//, Color color, float strokeWidth) {
		super(x, y);//,color, strokeWidth);
		this.radius = radius;
	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.drawOval(x - radius, (y-25) - radius, radius*2, radius*2);

	}
}
