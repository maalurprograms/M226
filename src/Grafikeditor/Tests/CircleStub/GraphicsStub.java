package Grafikeditor.Tests.CircleStub;

/**
 * Created by Jonas Cosandey on 20.06.2016.
 */
public class GraphicsStub extends ConcreteGraphics{

    int numberOfDrawCircCalls = 0;
    int x;
    int height;
    int width;
    int y;

    @Override
    public void drawOval(int x, int y, int width, int height) {
        numberOfDrawCircCalls++;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
