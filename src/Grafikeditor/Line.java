package Grafikeditor;

import java.awt.*;

public class Line extends Figure{
	private int xEnd, yEnd;
	
	public Line(int x, int y, Color color, float strokeWidth, int xEnd, int yEnd) {
		super(x, y,color, strokeWidth);
		this.xEnd = xEnd;
		this.yEnd = yEnd;
	}
	
	public int getXEnd(){
		return xEnd;
	}
	
	public int getYEnd(){
		return yEnd;
	}

	@Override
	public void move(int deltaX, int deltaY) {
		super.move(deltaX, deltaY);
		this.xEnd += deltaX;
		yEnd += deltaY;
	}

	@Override
	public void zeichen(Graphics2D g2d) {
		g2d.drawLine(x, y, xEnd, yEnd);
	}
}
