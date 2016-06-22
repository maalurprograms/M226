package Grafikeditor.Tests.DrawingMock;

import Grafikeditor.Model.CircleFigure;
import Grafikeditor.Model.Drawing;
import Grafikeditor.Model.LineFigure;
import Grafikeditor.Model.RectangleFigure;
import org.junit.Test;

import java.awt.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by Jonas Cosandey on 22.06.2016.
 */
public class DrawingTest {
    private Graphics g = mock(Graphics.class);

    @Test
    public void drawFigure() throws Exception {
        int width, height, radius, xend, yend, x, y;
        x = 100;
        y = 200;
        radius = 30;
        xend = 200;
        yend = 300;
        width = 50;
        height = 50;
        Drawing d = new Drawing();
        d.addFigure(new CircleFigure(x,y,radius));
        d.addFigure(new RectangleFigure(x,y,width,height));
        d.addFigure(new LineFigure(x,y,xend,yend));
        d.drawFigure(g);
        verify(g, times(1)).drawOval(x-radius,y-radius,radius*2,radius*2);
        verify(g, times(1)).drawRect(x,y,width,height);
        verify(g, times(1)).drawLine(x,y,xend,yend);

    }

}