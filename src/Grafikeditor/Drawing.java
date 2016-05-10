package Grafikeditor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jonas on 09.05.16.
 */
public class Drawing {

    private List<Figure> figures = new ArrayList<>();

    public void addFigure(Figure figure) {
        figures.add(figure);
    }

    public void drawFigure(Graphics g) {

        Graphics2D g2d = (Graphics2D)g;

        for (Figure figure : figures) {
            figure.draw(g2d);
        }
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
//    public void deleteAll() {
//        figures.clear();
//    }
}
