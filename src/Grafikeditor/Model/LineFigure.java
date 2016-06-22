package Grafikeditor.Model;

import java.awt.*;

public class LineFigure extends Figure {
	private int xEnd, yEnd;

	public LineFigure(int x, int y, int xEnd, int yEnd){//, Color color, float strokeWidth) {
		super(x, y);//,color, strokeWidth);
		this.xEnd = xEnd;
		this.yEnd = yEnd;
	}
	
//	public int getXEnd(){
//		return xEnd;
//	}
//
//	public int getYEnd(){
//		return yEnd;
//	}

	@Override
	public void move(int deltaX, int deltaY) {
		super.move(deltaX, deltaY);
		this.xEnd += deltaX;
		yEnd += deltaY;
	}

	@Override
	public void draw(Graphics g) {
		g.drawLine(x, y, xEnd, yEnd);
	}
}
