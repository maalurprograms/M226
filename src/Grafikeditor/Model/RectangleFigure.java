package Grafikeditor.Model;

import java.awt.*;

public class RectangleFigure extends Figure {
	private int width, heigth;
	
	public RectangleFigure(int x, int y, int width, int heigth){//, Color color, float strokeWidth) {
		super(x, y);//,color, strokeWidth);
		this.width = width;
		this.heigth = heigth;
	}

	@Override
	public void draw(Graphics g) {
		g.drawRect(x, y, width, heigth);
	}
}
