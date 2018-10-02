/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Dino
 */
public class Teclas extends Base{
    
    public void desenhar(Graphics g){
        g.setColor(tecla);
        g.fillRect(x, y, largura, altura);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, largura, altura);
    }
    
    public void mudaCor(Graphics g){
        g.setColor(Color.RED);
    }
}
