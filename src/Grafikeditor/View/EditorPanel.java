package Grafikeditor.View;

import Grafikeditor.Control.EditorControl;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public  final class EditorPanel extends JPanel {
    private EditorControl editorControl;

    EditorPanel(EditorControl control) {
        editorControl = control;
    }

    // Die paintComponent()-Methode wird automatisch aufgerufen, wenn irgendwer die repaint()-
    // Methode beim EditorFrame oder beim EditorPanel aufruft.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        editorControl.allesNeuZeichnen(g);
    }
}
