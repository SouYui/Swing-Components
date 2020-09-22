/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author Sou Akiyama
 */
public class FondoDialogImagen extends JPanel{
    private Image imagen = null;
    private MediaTracker tracker;
    private final int maximo = 255;
    private int transparencia = maximo;
    private boolean cambio = false;

    public FondoDialogImagen(Component componente, String archivo) {
        try {
            tracker = new MediaTracker(componente);
            Toolkit hr = Toolkit.getDefaultToolkit();
            imagen = hr.getImage(getClass().getResource("/udemy/poo/recursos/" + archivo));
            tracker.addImage(imagen, 1);
            tracker.waitForAll();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.drawImage(imagen, 0, 0, this.getSize().width, this.getSize().height,null);
        g.setFont(new Font("Times New Roman", Font.PLAIN, 40));
        g.setColor(new Color(110, 184, 181, transparencia));
        g.drawString("I don't care", 10, 30);
        this.calculos();
    }
    
    private void calculos() {
        if (cambio) {
            transparencia ++;
            if (transparencia == maximo) {
                cambio = false;
            }
        } else {
            transparencia --;
            if (transparencia == 0) {
                cambio = true;
            }
        }
    }
}