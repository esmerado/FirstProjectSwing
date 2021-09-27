/*
 * Javier Esmerado Vela - Prueba Swing
 */
package com.mycompany.swingfirsttest;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author esmer
 */
public class App extends JFrame{
    
    public App () {
        super("Titulo de ventana");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        GridLayout gl = new GridLayout(4,3);
        gl.setHgap(5);
        gl.setVgap(5);
        cp.setLayout(gl);
        for(int i = 1; i < 9; i++) {
            cp.add(new JButton(String.valueOf(i)));
        }
        cp.add(new JButton("*"));
        cp.add(new JButton("0"));
        cp.add(new JButton("#"));

    }
    
    public static void main(String[] args) {
        
        App app = new App();
        
    }
    
}
