package Grafikeditor.Tests.Rectangle;

import java.awt.*;

/**
 * Created by Jonas Cosandey on 20.06.2016.
 */
public class GraphicsStub extends ConcreteGraphics{

    int numberOfDrawRectCalls = 0;
    int x;
    int height;
    int width;
    int y;

    @Override
    public void drawRect(int x, int y, int width, int height) {
        numberOfDrawRectCalls++;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
