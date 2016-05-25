package Grafikeditor.Model;//package Grafikeditor;
//
//import java.awt.*;
//
//public class Group extends Figure{
//	private Figure[] parts;
//
//	public Group(int x, int y, Figure[] parts){//, Color color, float strokeWidth) {
//		super(x, y);//,color, strokeWidth);
//		this.parts = parts;
//	}
//
//	@Override
//	public void move(int deltaX, int deltaY) {
//		super.move(deltaX, deltaY);
//		for (Figure part : parts) {
//			part.move(deltaX, deltaY);
//		}
//	}
//
//	@Override
//	public void draw(Graphics2D g2d) {
//		for (Figure figure:parts) {
//			figure.draw(g2d);
//		}
//	}
//}
