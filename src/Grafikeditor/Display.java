package Grafikeditor;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")

public class Display extends JFrame {


	private List<Figure> figures = new ArrayList<Figure>();


	public Display() {
		Dimension windowSize = new Dimension(800, 600);

		setSize(windowSize);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		int windowPositionX = (screenSize.width - windowSize.width) / 2;

		int windowPositionY = (screenSize.height - windowSize.height) / 2;

		Point windowPosition = new Point(windowPositionX, windowPositionY);

		setLocation(windowPosition);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		createAndAddDrawingPanel();

		setVisible(true);

	}

	private void createAndAddDrawingPanel() {

		add(new JPanel() {

			@Override

			protected void paintComponent(Graphics g) {

				super.paintComponent(g);

				drawFigure(g);

			}
		});
	}

	public void addFigure(Figure figure) {

		figures.add(figure);

		repaint();

	}

	private void drawFigure(Graphics g) {
		
		Graphics2D g2d = (Graphics2D)g;
		
		for (Figure figure : figures) {
			figure.draw(g2d);
		}
	}

	public void deleteAll() {

		figures.clear();

		repaint();

	}

}
