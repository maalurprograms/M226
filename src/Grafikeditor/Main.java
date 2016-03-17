package Grafikeditor;

import java.awt.Color;

public class Main {
	private static final Display display = new Display();
	
	public static void main(String[] args) {
		int x = 100;
		int y = 100;
		Group house = new Group(x, y, Color.RED, 10, new Figure[] {
				new Text(x + 350, y + 100, Color.BLUE, 10, "Group Element"),
				new Rectangle(x + 300, y + 200, Color.LIGHT_GRAY, 10, x + 200, y + 200),
				new Cricle(x + 420, y + 280, Color.BLACK, 10, 50),
				new Line(x + 500, y + 200, Color.YELLOW, 10, x + 550, y + 250),
				new Line(x + 500, y + 200, Color.RED, 10, x + 400, y + 150),
				new Line(x + 400, y + 150, Color.GREEN, 10, x + 300, y + 200),
				new Line(x + 300, y + 200, Color.GRAY, 10, x + 250, y + 250),
				new Rectangle(300, y + 300, Color.ORANGE, 10, x + 50, y + 100)
		});
		display.addFigure(house);

//		Rectangle rect = new Rectangle(100,100,Color.BLACK, 10, 100, 100);
//		rect.move(-100,-100);
////		display.addFigure(rect);
//
//		Line line = new Line(400,400,Color.BLACK,10,500,500);
//		line.move(-400,-400);
////		display.addFigure(line);
//
//		Line l = new Line(10,20,Color.BLACK,10,30,40);
//		l.move(10,10);
//		Figure f = new Line(10,20,Color.BLACK, 10, 30,40);
//		f.move(10,10);
	}
}
