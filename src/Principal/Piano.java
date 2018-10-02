
package Principal;

import com.sun.glass.events.KeyEvent;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Dino
 */
public class Piano extends javax.swing.JFrame implements Runnable{
     
    public Graphics g ;
     public ArrayList<Base> listat = new ArrayList();
     public ArrayList<Base> listatc = new ArrayList();
    private boolean ts,td,tf,tg,th,tj,tk,tl,te,tr,ty,tu,ti;
   
    /**
     * Creates new form Piano
     */
    public Piano() {
        initComponents();
        createBufferStrategy(2);
        Thread t = new Thread(this);
        t.start();
    }
      
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(380, 390));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_S){
           try{
               AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Dino\\Documents\\NetBeansProjects\\Piano\\src\\sounds\\C.wav"));
               Clip clip = AudioSystem.getClip();
               clip.open(audio);
               clip.start();
               ts=true;
           }catch(Exception ex){
               
           }
   
       }
       if(evt.getKeyCode() == KeyEvent.VK_D){
          try{
               AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Dino\\Documents\\NetBeansProjects\\Piano\\src\\sounds\\D.wav"));
               Clip clip = AudioSystem.getClip();
               clip.open(audio);
               clip.start();
               td=true;
           }catch(Exception ex){
               
           }
   
       }
       if(evt.getKeyCode() == KeyEvent.VK_F){
          try{
               AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Dino\\Documents\\NetBeansProjects\\Piano\\src\\sounds\\E.wav"));
               Clip clip = AudioSystem.getClip();
               clip.open(audio);
               clip.start();
                tf=true;
           }catch(Exception ex){
               
           }
   
       }
        if(evt.getKeyCode() == KeyEvent.VK_G){
          try{
               AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Dino\\Documents\\NetBeansProjects\\Piano\\src\\sounds\\F.wav"));
               Clip clip = AudioSystem.getClip();
               clip.open(audio);
               clip.start();
               tg=true;
           }catch(Exception ex){
               
           }
   
       }
        if(evt.getKeyCode() == KeyEvent.VK_H){
          try{
               AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Dino\\Documents\\NetBeansProjects\\Piano\\src\\sounds\\G.wav"));
               Clip clip = AudioSystem.getClip();
               clip.open(audio);
               clip.start();
               th=true;
           }catch(Exception ex){
               
           }
   
       }
        if(evt.getKeyCode() == KeyEvent.VK_J){
          try{
               AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Dino\\Documents\\NetBeansProjects\\Piano\\src\\sounds\\A.wav"));
               Clip clip = AudioSystem.getClip();
               clip.open(audio);
               clip.start();
               tj=true;
           }catch(Exception ex){
               
           }
   
       }
         if(evt.getKeyCode() == KeyEvent.VK_K){
         try{
               AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Dino\\Documents\\NetBeansProjects\\Piano\\src\\sounds\\B.wav"));
               Clip clip = AudioSystem.getClip();
               clip.open(audio);
               clip.start();
               tk=true;
           }catch(Exception ex){
               
           }
   
       }
       if(evt.getKeyCode() == KeyEvent.VK_L){
           try{
               AudioInputStream audio = AudioSystem.getAudioInputStream(
                       new File("C:\\Users\\Dino\\Documents\\NetBeansProjects\\Piano\\src\\sounds\\C1.wav")
               );
               Clip clip = AudioSystem.getClip();
               clip.open(audio);
               clip.start();
              tl=true;
           }catch(Exception ex){}
       }
           
       
     
       if(evt.getKeyCode() == KeyEvent.VK_E){
         try{
               AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Dino\\Documents\\NetBeansProjects\\Piano\\src\\sounds\\C_s.wav"));
               Clip clip = AudioSystem.getClip();
               clip.open(audio);
               clip.start();
               te=true;
           }catch(Exception ex){
               
           }
   
       }
        if(evt.getKeyCode() == KeyEvent.VK_R){
         try{
               AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Dino\\Documents\\NetBeansProjects\\Piano\\src\\sounds\\D_s.wav"));
               Clip clip = AudioSystem.getClip();
               clip.open(audio);
               clip.start();
               tr=true;
           }catch(Exception ex){
               
           }
   
       }
        if(evt.getKeyCode() == KeyEvent.VK_Y){
         try{
               AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Dino\\Documents\\NetBeansProjects\\Piano\\src\\sounds\\F_s.wav"));
               Clip clip = AudioSystem.getClip();
               clip.open(audio);
               clip.start();
               ty=true;
           }catch(Exception ex){
               
           }
   
       }
       if(evt.getKeyCode() == KeyEvent.VK_U){
         try{
               AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Dino\\Documents\\NetBeansProjects\\Piano\\src\\sounds\\G_s.wav"));
               Clip clip = AudioSystem.getClip();
               clip.open(audio);
               clip.start();
               tu=true;
           }catch(Exception ex){
               
           }
   
       } 
       if(evt.getKeyCode() == KeyEvent.VK_I){
         try{
               AudioInputStream audio = AudioSystem.getAudioInputStream(new File("C:\\Users\\Dino\\Documents\\NetBeansProjects\\Piano\\src\\sounds\\A.wav"));
               Clip clip = AudioSystem.getClip();
               clip.open(audio);
               clip.start();
               ti=true;
           }catch(Exception ex){
               
           }
   
       }
       
       
    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_S){
            ts=false;
        }
        if(evt.getKeyCode() == KeyEvent.VK_D){
            td=false;
        }
        if(evt.getKeyCode() == KeyEvent.VK_F){
            tf=false;
        }
        if(evt.getKeyCode() == KeyEvent.VK_G){
            tg=false;
        }
        if(evt.getKeyCode() == KeyEvent.VK_H){
            th=false;
        }
        if(evt.getKeyCode() == KeyEvent.VK_J){
            tj=false;
        }
        if(evt.getKeyCode() == KeyEvent.VK_K){
            tk=false;
        }
        if(evt.getKeyCode() == KeyEvent.VK_L){
            tl=false;
        }
        if(evt.getKeyCode() == KeyEvent.VK_E){
            te=false;
        }
        if(evt.getKeyCode() == KeyEvent.VK_R){
            tr=false;
        }
        if(evt.getKeyCode() == KeyEvent.VK_Y){
            ty=false;
        }
        if(evt.getKeyCode() == KeyEvent.VK_U){
            tu=false;
        }
        if(evt.getKeyCode() == KeyEvent.VK_I){
            ti=false;
        }
    }//GEN-LAST:event_formKeyReleased

    public static void main(String args[]) {
   
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Piano().setVisible(true);
            }
        });
    }
    
    @Override
    public void run() {
       
      
       
       
       int altura = 0;
       
       int xt=-39;
       Random r = new Random();
       for(int i=0; i<8; i++){
            Teclas t = new Teclas();
            t.setAltura(getHeight()-130);
            altura = t.getAltura();
            t.setLargura(40);
            t.setX(xt+=t.getLargura()+5);
            t.setY(getHeight() - t.getAltura());
            listat.add(t);
       }
       
       int xc;
       for(int i=0; i<2;i++){
          // xc = listat.get(i).getLargura()+listat.get(i).getX();
           Teclinha tc = new Teclinha();
           tc.setAltura(150);
           tc.setLargura(20);
           tc.setX(listat.get(i).getX()+30);
           tc.setY(listat.get(0).getY());
           listatc.add(tc);
       }
       for(int i=4; i<=6; i++){
           //xc=listat.get(i).getLargura()+listat.get(i).getX();
           Teclinha tc = new Teclinha();
           tc.setAltura(150);
           tc.setLargura(20);
           tc.setX(listat.get(i).getX()+30);
           tc.setY(listat.get(0).getY());
           listatc.add(tc);
       }
       
           
       while(true){
           g=getBufferStrategy().getDrawGraphics();
           
            // g.drawLine(10, 10, 20, 20);
             g.setColor(Color.DARK_GRAY);
           g.fillRect(0,0,getWidth(), getHeight());
         
           
           if(ts){
             listat.get(0).tecla =Color.darkGray;
           }else{
               listat.get(0).tecla = Color.WHITE;
           }
           if(td){
               listat.get(1).tecla = Color.DARK_GRAY;
           }else{
                listat.get(1).tecla = Color.WHITE;
           }
           if(tf){
               listat.get(2).tecla = Color.DARK_GRAY;
           }else{
               listat.get(2).tecla = Color.WHITE;
           }
           if(tg){
               listat.get(3).tecla = Color.DARK_GRAY;
           }else{
               listat.get(3).tecla = Color.WHITE;
           }
           if(th){
               listat.get(4).tecla = Color.DARK_GRAY;
           }else{
               listat.get(4).tecla = Color.WHITE;
           }
           if(tj){
               listat.get(5).tecla = Color.DARK_GRAY;
           }else{
               listat.get(5).tecla = Color.WHITE;
           }
           if(tk){
               listat.get(6).tecla = Color.DARK_GRAY;
           }else{
               listat.get(6).tecla = Color.WHITE;
           }
           if(tl){
               listat.get(7).tecla = Color.DARK_GRAY;
           }else{
               listat.get(7).tecla = Color.WHITE;
           }
           
           if(te){
               listatc.get(0).teclinha=Color.LIGHT_GRAY;
           }else{
               listatc.get(0).teclinha = Color.BLACK;
           }
           if(tr){
               listatc.get(1).teclinha=Color.LIGHT_GRAY;
           }else{
               listatc.get(1).teclinha = Color.BLACK;
           }
           
           if(ty){
               listatc.get(2).teclinha=Color.LIGHT_GRAY;
           }else{
               listatc.get(2).teclinha = Color.BLACK;
           }
           if(tu){
               listatc.get(3).teclinha=Color.LIGHT_GRAY;
           }else{
               listatc.get(3).teclinha = Color.BLACK;
           }
           if(ti){
               listatc.get(4).teclinha=Color.LIGHT_GRAY;
           }else{
               listatc.get(4).teclinha = Color.BLACK;
           }
           
           
           for(Base b :listat){
               b.desenhar(g);
           }
           for(Base b : listatc){
               b.desenhar(g);
           }
           
           
           g.dispose();
           getBufferStrategy().show();
           
       }
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
