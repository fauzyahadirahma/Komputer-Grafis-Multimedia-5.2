/*
 * Nama     : Fauzyah Hadirahma
 * NPM      : 20191310070
 * Materi   : Transformasi - Rotasi
 * Tanggal  : 6 Agustus 2021
 */
package grafika2;

/**
 *
 * @author Fauzyah
 */

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Surface extends JPanel {
    private void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        
        g2d.setPaint(new Color(252, 192, 203));
        /*koordinat object - awal 0*/
        String s = "Object ke-0";
        g2d.drawString(s, 15, 15);
        g2d.fillRect(20, 20, 80, 50);
        
        g2d.setPaint(new Color(221, 160, 221));
        /*koordinat object - awal 1*/
        s = "Object ke-1";
        g2d.drawString(s, 180, 50);
        g2d.translate(180, -50); //posisi rotasi
        g2d.rotate(Math.PI/4);
        g2d.fillRect(80, 80, 80, 50);
        
        g2d.setPaint(new Color(135, 206, 235));
        /*koordinat object - awal 2*/
        s = "Object ke-2";
        g2d.drawString(s, 180, 75);
        g2d.translate(270, -50); //posisi rotasi
        g2d.rotate(Math.PI/4);
        g2d.fillRect(80, 80, 80, 50);
        
        g2d.dispose();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
}
