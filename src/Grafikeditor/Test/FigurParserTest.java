package Grafikeditor.Test;

import Grafikeditor.Model.Figure;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by jonas on 16.06.16.
 */
public class FigurParserTest {

    private FigurDAO dao;
    private FigurParser fp;

    @org.junit.Before
    public void setUp() throws Exception {
        dao = new FigurDAOStub();
        fp = new FigurParser(dao);
    }

    @org.junit.Test
    public void parse(){
        List<Figure> figures = fp.parse();
        assertEquals(2, figures.size());
        assertEquals("class Grafikeditor.Model.RectangleFigure 100 100", figures.get(0).toString());
        assertEquals("class Grafikeditor.Model.CircleFigure 150 150", figures.get(1).toString());
    }

}