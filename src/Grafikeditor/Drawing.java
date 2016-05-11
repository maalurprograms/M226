package Grafikeditor;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class Drawing {

    private List<Figure> figures = new ArrayList<>();

    void addFigure(Figure figure) {
        figures.add(figure);
    }

    void drawFigure(Graphics g) {

        Graphics2D g2d = (Graphics2D)g;

        for (Figure figure : figures) {
            figure.draw(g2d);

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
