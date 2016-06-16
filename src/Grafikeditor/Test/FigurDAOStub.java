package Grafikeditor.Test;

/**
 * Created by jonas on 16.06.16.
 */
public class FigurDAOStub implements FigurDAO {
    private String[] testFiguren = {
            "Rechteck 100 100 100 100",
            "Kreis 150 150 200"
    };
    private int currentFigure = 0;

    @Override
    public String[] readNextFigurData() {
        if (currentFigure < testFiguren.length) {
            String[] figureData = testFiguren[currentFigure].split(" ");
            currentFigure++;
            return figureData;
        }
        return null;
    }
}
