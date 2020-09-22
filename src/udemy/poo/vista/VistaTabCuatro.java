/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JPanel;

/**
 *
 * @author Sou Akiyama
 */
public class VistaTabCuatro extends JPanel implements PropertyChangeListener{
    private int compartir;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D gg = (Graphics2D) g;
        gg.setColor(new Color(218, 118, 227, compartir));
        gg.fill3DRect(110, 50, compartir * 5/2, compartir, true);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("model.change")) {
            this.compartir = (int) evt.getNewValue();
            repaint();
        }
    }
    
}
