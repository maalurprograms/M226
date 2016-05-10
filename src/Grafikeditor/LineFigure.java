package Grafikeditor;

import java.awt.*;

class LineFigure extends Figure{
	private int xEnd, yEnd;
	
	LineFigure(int x, int y, int xEnd, int yEnd){//, Color color, float strokeWidth) {
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
	public void draw(Graphics2D g2d) {
		g2d.drawLine(x, y, xEnd, yEnd);
	}
}
