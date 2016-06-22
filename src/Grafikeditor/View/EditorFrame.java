package Grafikeditor.View;

import Grafikeditor.Control.EditorControl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public final class EditorFrame extends JFrame {

    private EditorControl editorControl = new EditorControl();
    private JLabel position = new JLabel("Position: X: Y:");
    private JLabel action = new JLabel("Action: Nothing");
//    TODO    Add Rubberbanding effect:
//    private boolean mousePressed = false;

    public EditorFrame(int breite, int hoehe) {
        erzeugeUndSetzeEditorPanel();
        fensterEinmitten(breite, hoehe);
        setMinimumSize(new Dimension(800, 600));

        JMenuBar jMenuBar = new JMenuBar();
        jMenuBar.setPreferredSize(new Dimension(800, 20));
        jMenuBar.setBackground(Color.WHITE);

        JMenu jMenu = new JMenu("Menu");

        JMenuItem[] menuItems = new JMenuItem[3];

        menuItems[0] = new JMenuItem("CircleStub");
        menuItems[1] = new JMenuItem("Line");
        menuItems[2] = new JMenuItem("Circle");

        for (JMenuItem jMenuItem:menuItems) {
            jMenuItem.setBackground(Color.WHITE);
            jMenuItem.setBorderPainted(false);
            jMenuItem.setFocusPainted(false);
            jMenuItem.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    super.mouseEntered(e);
                    jMenuItem.setBackground(Color.LIGHT_GRAY);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    super.mouseExited(e);
                    jMenuItem.setBackground(Color.WHITE);
                }
            });
            jMenuItem.addActionListener(e -> {
                setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
                switch (jMenuItem.getText()){
                    case "CircleStub":
                        editorControl.setFigurTyp('r');
                        action.setText("Action: CircleStub");
                        break;

                    case "Line":
                        editorControl.setFigurTyp('l');
                        action.setText("Action: Line");
                        break;

                    case "Circle":
                        editorControl.setFigurTyp('c');
                        action.setText("Action: Circle");
                        break;
                }
            });
            jMenu.add(jMenuItem);
        }

        JMenuItem clear = new JMenuItem("Clear");
        clear.addActionListener(e -> {
            editorControl.clearFrame();
            repaint();
        });
        jMenu.add(clear);

        jMenuBar.add(jMenu);
        jMenuBar.add(new JLabel("   "));
        jMenuBar.add(action);
        jMenuBar.add(Box.createHorizontalGlue());
        jMenuBar.add(position);
        jMenuBar.add(new JLabel("   "));
        add(jMenuBar);

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                position.setText("  Position: X:"+e.getX()+" Y:"+e.getY());
            }
        });

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                editorControl.setP1(e.getPoint());
//                mousePressed = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
//                mousePressed = false;
                editorControl.erzeugeFigurMitZweitemPunkt(e.getPoint());
                repaint();
            }
        });

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));

                switch (e.getKeyChar()){
                    case 'r':
                        action.setText("Action: CircleStub");
                        break;

                    case 'l':
                        action.setText("Action: Line");
                        break;

                    case 'c':
                        action.setText("Action: Circle");
                        break;

                    case 'n':
                        editorControl.clearFrame();
                        repaint();
                        break;
                }
                editorControl.setFigurTyp(e.getKeyChar());
            }
        });
        setFocusable(true);
    }

    private void erzeugeUndSetzeEditorPanel() {
        JPanel panel = new EditorPanel(editorControl);
        setContentPane(panel);
    }

    private void fensterEinmitten(int breite, int hoehe) {
        Dimension bildschirmGroesse = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle fensterAusschnitt = new Rectangle();
        fensterAusschnitt.width = breite;
        fensterAusschnitt.height = hoehe;
        fensterAusschnitt.x = (bildschirmGroesse.width - fensterAusschnitt.width) / 2;
        fensterAusschnitt.y = (bildschirmGroesse.height - fensterAusschnitt.height) / 2;
        setBounds(fensterAusschnitt);
    }
}