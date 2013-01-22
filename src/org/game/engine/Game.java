/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.game.engine;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author Shayan
 */
public abstract class Game implements KeyListener, MouseListener, MouseMotionListener {

    protected boolean over;
    protected int delay = 30;
    protected int width = 400;
    protected int height = 300;
    protected String title = "Game";
    
    
    public String getTitle() { return title; }
    public long getDelay() {return delay;}
    public int getWidth() { return width; } 
    public int getHeight() { return height; }
   
   abstract public void init(); 
   abstract public void update();
   abstract public void draw(Graphics g);
    
   public boolean isOver() {
        return over;
    }

    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
    
}
