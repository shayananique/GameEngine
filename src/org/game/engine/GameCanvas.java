/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.game.engine;

import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author Shayan
 */
public class GameCanvas extends JComponent {
    private final Game game;
 
    public GameCanvas (Game game) {
        this.game = game;
        addKeyListener(this.game);
        addMouseListener(this.game);
        addMouseMotionListener(this.game);
        requestFocus();
    }
   
    @Override
    public void paintComponent (Graphics g) {
        game.draw(g);
        
    }
}
