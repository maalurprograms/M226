package Grafikeditor.Tests.Rectangle;

import Grafikeditor.Model.RectangleFigure;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by Jonas Cosandey on 20.06.2016.
 */
public class RectangleFigureTest {
    private GraphicsStub g = new GraphicsStub();

    @Test
    public void draw(){
        RectangleFigure r = new RectangleFigure(10,20,30,40);
        r.draw(g);
        assertEquals(1, g.numberOfDrawRectCalls);
        assertEquals(10, g.x);
        assertEquals(20, g.y);
        assertEquals(30, g.width);
        assertEquals(40, g.height);
    }
}