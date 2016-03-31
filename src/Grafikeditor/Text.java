package Grafikeditor;

import java.awt.*;

public class Text extends Figure{
	private String text;
	
	public Text(int x, int y, Color color, float strokeWidth, String text) {
		super(x, y,color, strokeWidth);
		this.text = text;
	}

	@Override
	public void draw(Graphics2D g2d) {
		g2d.drawString(text, x, y);
	}
}
