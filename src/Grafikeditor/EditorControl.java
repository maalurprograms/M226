package Grafikeditor;

import java.awt.Graphics;
import java.awt.Point;

final class EditorControl {
    private Drawing zeichnung = new Drawing();
    private char figurTyp;
    private Point ersterPunkt;

    public void allesNeuZeichnen(Graphics g) {
        //TODO: Ergänzen
        zeichnung.drawFigure(g);
    }

    public void setFigurTyp(char figurTyp) {
        this.figurTyp = figurTyp;
    }

    public void setErsterPunkt(Point ersterPunkt) {
        this.ersterPunkt = ersterPunkt;
    }

    public void erzeugeFigurMitZweitemPunkt(Point zweiterPunkt) {
        //TODO: Ergänzen
        int xSize = zweiterPunkt.x - ersterPunkt.x;
        int ySize = zweiterPunkt.y - ersterPunkt.y;
        if (figurTyp == 'k'){
            int radius = (int)Math.sqrt(Math.pow(xSize,2) + Math.pow(ySize, 2));
            zeichnung.addFigure(new CircleFigure(ersterPunkt.x, ersterPunkt.y, radius));
        } else if (figurTyp == 'l'){
            zeichnung.addFigure(new Grafikeditor.LineFigure(ersterPunkt.x, ersterPunkt.y, zweiterPunkt.x, zweiterPunkt.y));
        } else if (figurTyp == 'r'){
            zeichnung.addFigure(new Rectangle(ersterPunkt.x, ersterPunkt.y, xSize, ySize));
        }
    }
}