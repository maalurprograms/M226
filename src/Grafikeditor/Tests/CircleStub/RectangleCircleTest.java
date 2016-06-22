package Grafikeditor.Tests.CircleStub;

import Grafikeditor.Model.CircleFigure;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jonas Cosandey on 20.06.2016.
 */
public class RectangleCircleTest {
    private GraphicsStub g = new GraphicsStub();

    @Test
    public void draw(){
        int height, width, radius;
        height = 100;
        width = 200;
        radius = 30;
        CircleFigure r = new CircleFigure(height,width,radius);
        r.draw(g);
        assertEquals(1, g.numberOfDrawCircCalls);
        assertEquals(height-radius, g.x);
        assertEquals(width-radius, g.y);
        assertEquals(radius*2, g.width);
        assertEquals(radius*2, g.height);
    }
}