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
public class Teclinha extends Base{
    public void desenhar(Graphics g){
       g.setColor(teclinha);
       g.fillRect(x,y,largura,altura);
       g.setColor(Color.WHITE);
       g.drawRect(x,y,largura,altura);
    }
}
