/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Dino
 */
public abstract class Base {
    protected int x;
    protected int y;
  public Color tecla = Color.WHITE;
    protected Color teclinha = Color.BLACK;
    protected ImageIcon img;
    protected int largura=30,altura=30;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getTecla() {
        return tecla;
    }

    public void setTecla(Color tecla) {
        this.tecla = tecla;
    }

    public Color getTeclinha() {
        return teclinha;
    }

    public void setTeclinha(Color teclinha) {
        this.teclinha = teclinha;
    }

    public ImageIcon getImg() {
        return img;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void desenhar(Graphics g){
        
    }
    public void mudaCor(Graphics g){
        
    }
    
}
