package Grafikeditor.Control;

import Grafikeditor.Model.Figure;
import Grafikeditor.Parser.FigurFileDAO;
import Grafikeditor.Parser.FigurParser;

import java.util.List;

public final class Grafikeditor {

    public static void main(String[] args) {
        new Grafikeditor();
    }

    private Grafikeditor() {
        @SuppressWarnings("unused")
        FigurFileDAO figurFileDAO = new FigurFileDAO();
        FigurParser figurParser = new FigurParser(figurFileDAO);
        List<Figure> figuren = figurParser.parse();
        for (Figure figure:figuren) {
            System.out.println(figure.toString());
        }
        figurFileDAO.close();
//        EditorFrame frame = new EditorFrame(800, 600);
    }
}