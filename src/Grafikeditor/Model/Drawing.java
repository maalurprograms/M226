package Grafikeditor.Model;

import java.awt.*;
import java.util.ArrayList;

public class Drawing {

    private ArrayList<Figure> figures = new ArrayList<>();

    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    public void drawFigure(Graphics g) {

        for (Figure figure : figures) {
            figure.draw(g);

        }
    }

    public void deleteAll() {
        figures.clear();
    }

//    public Drawing(List<Figure> figures) {
//        this.figures = figures;
//    }
//
//    public void move(Graphics g) {
//
//        Graphics2D g2d = (Graphics2D)g;
//
//        for (Figure figure : figures) {
//            figure.move();
//        }
//    }
//
}
