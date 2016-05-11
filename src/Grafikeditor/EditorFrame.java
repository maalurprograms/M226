package Grafikeditor;

import java.awt.*;
import java.awt.Rectangle;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
final class EditorFrame extends JFrame {

    private EditorControl editorControl = new EditorControl();
    private JLabel position = new JLabel("  Position: X: Y:");
    private JLabel action = new JLabel("Action: Nothing");
    private boolean mousePressed = false;

    EditorFrame(int breite, int hoehe) {
        erzeugeUndSetzeEditorPanel();
        fensterEinmitten(breite, hoehe);

        JMenuBar jMenuBar = new JMenuBar();
        jMenuBar.setPreferredSize(new Dimension(800, 20));
        jMenuBar.setBackground(Color.WHITE);

        JButton[] menuItems = new JButton[3];

        menuItems[0] = new JButton("Rectangle");
        menuItems[1] = new JButton("Line");
        menuItems[2] = new JButton("Circle");

        for (JButton jButton:menuItems) {
            jButton.setBackground(Color.WHITE);
            jButton.setBorderPainted(false);
            jButton.setFocusPainted(false);
            jButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    super.mouseEntered(e);
                    jButton.setBackground(Color.LIGHT_GRAY);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    super.mouseExited(e);
                    jButton.setBackground(Color.WHITE);
                }
            });
            jButton.addActionListener(e -> {
                if (jButton.getText().equals("Rectangle")){
                    editorControl.setFigurTyp('r');
                    action.setText("Action: Rectangle");
                }  else if (jButton.getText().equals("Line")) {
                    editorControl.setFigurTyp('l');
                    action.setText("Action: Line");
                } else if (jButton.getText().equals("Circle")) {
                    editorControl.setFigurTyp('c');
                    action.setText("Action: Circle");
                }
            });
            jMenuBar.add(jButton);
        }

        jMenuBar.add(new JLabel("                           "));
        jMenuBar.add(action);
        jMenuBar.add(Box.createHorizontalGlue());
        jMenuBar.add(position);
        jMenuBar.add(new JLabel("  "));
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
                mousePressed = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                mousePressed = false;
                editorControl.erzeugeFigurMitZweitemPunkt(e.getPoint());
                repaint();
            }
        });

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (e.getKeyChar() == 'r'){
                    action.setText("Action Rectangle");
                } else if (e.getKeyChar() == 'l'){
                    action.setText("Action Line");
                } else if (e.getKeyChar() == 'c'){
                    action.setText("Action Circle");
                } else if (e.getKeyChar() == 'n'){
                    editorControl.setFigurTyp(e.getKeyChar());
                    repaint();
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