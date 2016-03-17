package Grafikeditor;

import java.awt.Color;

public class Group extends Figure{
	private Figure[] parts;
	
	public Group(int x, int y, Color color, float strokeWidth, Figure[] parts) {
		super(x, y,color, strokeWidth);
		this.parts = parts;
	}
	
	public Figure[] getParts(){
		return parts;
	}
	
}
