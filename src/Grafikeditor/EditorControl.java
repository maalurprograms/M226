package Grafikeditor;

import java.awt.Graphics;
import java.awt.Point;

final class EditorControl {
    private Drawing zeichnung = new Drawing();
    private char figurTyp;
    private Point ersterPunkt;

    void allesNeuZeichnen(Graphics g) {
        //TODO: Ergänzen
        zeichnung.drawFigure(g);
    }

    void setFigurTyp(char figurTyp) {
        this.figurTyp = figurTyp;
    }

    void setErsterPunkt(Point ersterPunkt) {
        this.ersterPunkt = ersterPunkt;
    }

    void erzeugeFigurMitZweitemPunkt(Point zweiterPunkt) {
        int xSize = zweiterPunkt.x - ersterPunkt.x;
        int ySize = zweiterPunkt.y - ersterPunkt.y;
        if (figurTyp == 'c'){
            int radius = (int)Math.sqrt(Math.pow(xSize,2) + Math.pow(ySize, 2));
            zeichnung.addFigure(new CircleFigure(ersterPunkt.x, ersterPunkt.y, radius));
        } else if (figurTyp == 'l'){
            zeichnung.addFigure(new LineFigure(ersterPunkt.x, ersterPunkt.y, zweiterPunkt.x, zweiterPunkt.y));
        } else if (figurTyp == 'r'){
            if (ersterPunkt.y > zweiterPunkt.y&& ersterPunkt.x < zweiterPunkt.x){
                int ersterPunkty = ersterPunkt.y;
                ersterPunkt.y = zweiterPunkt.y;
                zweiterPunkt.y = ersterPunkty;
                zeichnung.addFigure(new RectangleFigure(ersterPunkt.x, ersterPunkt.y, zweiterPunkt.x - ersterPunkt.x, zweiterPunkt.y - ersterPunkt.y));
            } else if (ersterPunkt.x > zweiterPunkt.x && ersterPunkt.y > zweiterPunkt.y){
                zeichnung.addFigure(new RectangleFigure(zweiterPunkt.x, zweiterPunkt.y, ersterPunkt.x - zweiterPunkt.x, ersterPunkt.y - zweiterPunkt.y));
            } else if (ersterPunkt.x > zweiterPunkt.x && ersterPunkt.y < zweiterPunkt.y){
                int ersterPunktx = ersterPunkt.x;
                ersterPunkt.x = zweiterPunkt.x;
                zweiterPunkt.x = ersterPunktx;
                zeichnung.addFigure(new RectangleFigure(ersterPunkt.x, ersterPunkt.y, zweiterPunkt.x - ersterPunkt.x, zweiterPunkt.y - ersterPunkt.y));
            } else {
                zeichnung.addFigure(new RectangleFigure(ersterPunkt.x, ersterPunkt.y, xSize, ySize));
            }
        }
    }
}