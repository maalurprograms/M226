package Grafikeditor;

import java.awt.Graphics;
import java.awt.Point;

final class EditorControl {
    private Drawing zeichnung = new Drawing();
    private char figurTyp;
    private Point p1;

    void allesNeuZeichnen(Graphics g) {
        //TODO: Ergänzen
        zeichnung.drawFigure(g);
    }

    void setFigurTyp(char figurTyp) {
        this.figurTyp = figurTyp;
    }

    void setP1(Point p1) {
        this.p1 = p1;
    }

    void erzeugeFigurMitZweitemPunkt(Point p2) {

        int xSize = p2.x - p1.x;
        int ySize = p2.y - p1.y;

        if (figurTyp == 'c'){
            int radius = (int)Math.sqrt(Math.pow(xSize,2) + Math.pow(ySize, 2));
            zeichnung.addFigure(new CircleFigure(p1.x, p1.y, radius));
        } else if (figurTyp == 'l'){
            zeichnung.addFigure(new LineFigure(p1.x, p1.y, p2.x, p2.y));
        } else if (figurTyp == 'r'){
//          Damit Rechtecke in jede richtung gezeichnet werden:
            if (p1.y > p2.y&& p1.x < p2.x){
                int p1y = p1.y;
                p1.y = p2.y;
                p2.y = p1y;
                zeichnung.addFigure(new RectangleFigure(p1.x, p1.y, p2.x - p1.x, p2.y - p1.y));
            } else if (p1.x > p2.x && p1.y > p2.y){
                zeichnung.addFigure(new RectangleFigure(p2.x, p2.y, p1.x - p2.x, p1.y - p2.y));
            } else if (p1.x > p2.x && p1.y < p2.y){
                int p1x = p1.x;
                p1.x = p2.x;
                p2.x = p1x;
                zeichnung.addFigure(new RectangleFigure(p1.x, p1.y, p2.x - p1.x, p2.y - p1.y));
            } else {
                zeichnung.addFigure(new RectangleFigure(p1.x, p1.y, xSize, ySize));
            }
        } else if (figurTyp == 'n'){
            zeichnung.deleteAll();
        }
    }
}