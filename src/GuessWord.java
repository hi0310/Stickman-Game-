
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shotarohariu
 */
public class GuessWord extends javax.swing.JFrame {
    String Findwords = "bye";
   
    int incorrect = 0;
    int correct = 0;
    /**
     * Creates new form GuessWord
     */
    public GuessWord() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aLetter = new javax.swing.JTextField();
        inCorrect = new javax.swing.JLabel();
        MyMessage = new javax.swing.JLabel();
        tryLetter = new javax.swing.JButton();
        imagedisplay = new javax.swing.JButton();
        Quit = new javax.swing.JButton();
        Restart = new javax.swing.JButton();
        Char0 = new javax.swing.JLabel();
        Char1 = new javax.swing.JLabel();
        Char2 = new javax.swing.JLabel();
        Char3 = new javax.swing.JLabel();
        Char4 = new javax.swing.JLabel();
        Char5 = new javax.swing.JLabel();
        Char6 = new javax.swing.JLabel();
        Char7 = new javax.swing.JLabel();
        Char8 = new javax.swing.JLabel();
        Char9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guess The Word Game");

        aLetter.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        aLetter.setText("e");
        aLetter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aLetterActionPerformed(evt);
            }
        });

        inCorrect.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        inCorrect.setText(" 0");

        MyMessage.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        MyMessage.setText("  Look Here");

        tryLetter.setText("Try Letter");
        tryLetter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tryLetterActionPerformed(evt);
            }
        });

        imagedisplay.setText("imageDisplay");
        imagedisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagedisplayActionPerformed(evt);
            }
        });

        Quit.setText("Quit");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });

        Restart.setText("Restart");
        Restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartActionPerformed(evt);
            }
        });

        Char0.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Char0.setText("X");

        Char1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Char1.setText("X");

        Char2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Char2.setText("X");

        Char3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Char3.setText("X");

        Char4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Char4.setText("X");

        Char5.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Char5.setText("X");

        Char6.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Char6.setText("X");

        Char7.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Char7.setText("X");

        Char8.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Char8.setText("X");

        Char9.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        Char9.setText("X");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MyMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tryLetter, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inCorrect)
                            .addComponent(aLetter, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Char0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Char1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Char2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Char3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Char4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Char5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Char6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Char7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Char8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Char9)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(imagedisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(Quit, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(Restart, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Char0)
                            .addComponent(Char1)
                            .addComponent(Char2)
                            .addComponent(Char3)
                            .addComponent(Char4)
                            .addComponent(Char5)
                            .addComponent(Char6)
                            .addComponent(Char7)
                            .addComponent(Char8)
                            .addComponent(Char9))
                        .addGap(21, 21, 21)
                        .addComponent(aLetter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inCorrect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MyMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tryLetter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Quit)
                            .addComponent(Restart))
                        .addGap(18, 18, 18)
                        .addComponent(imagedisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aLetterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aLetterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aLetterActionPerformed

    private void tryLetterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tryLetterActionPerformed
 
    int charPos = 4;
   
   
    String letter = aLetter.getText();
    charPos = Findwords.indexOf(letter);
    MyMessage.setText("Position is " +charPos);
    
    int length = Findwords.length(); // Putting the word length into a variable
    
     if (length == 0){
    Char0.setVisible(false);
    Char1.setVisible(false);
    Char2.setVisible(false);
    Char3.setVisible(false);
    Char4.setVisible(false);
    Char5.setVisible(false);
    Char6.setVisible(false);
    Char7.setVisible(false);
    Char8.setVisible(false);
    Char9.setVisible(false);
    }
    
    if (length == 1){
    Char0.setVisible(false);
    Char1.setVisible(false);
    Char2.setVisible(false);
    Char3.setVisible(false);
    Char4.setVisible(false);
    Char5.setVisible(false);
    Char6.setVisible(false);
    Char7.setVisible(false);
    Char8.setVisible(false);
    Char9.setVisible(false);
    }
    if (length == 2){
    Char0.setVisible(false);
    Char1.setVisible(false);
    Char2.setVisible(false);
    Char3.setVisible(false);
    Char4.setVisible(false);
    Char5.setVisible(false);
    Char6.setVisible(false);
    Char7.setVisible(false);
    Char8.setVisible(false);
    Char9.setVisible(false);
    }
    
    if (length == 3){
    Char0.setVisible(true);
    Char1.setVisible(true);
    Char2.setVisible(true);
    Char3.setVisible(false);
    Char4.setVisible(false);
    Char5.setVisible(false);
    Char6.setVisible(false);
    Char7.setVisible(false);
    Char8.setVisible(false);
    Char9.setVisible(false);
    }
    
    if (length == 4){
    Char0.setVisible(true);
    Char1.setVisible(true);
    Char2.setVisible(true);
    Char3.setVisible(true);
    Char4.setVisible(false);
    Char5.setVisible(false);
    Char6.setVisible(false);
    Char7.setVisible(false);
    Char8.setVisible(false);
    Char9.setVisible(false);
    }
    
     if (length == 5){
    Char0.setVisible(true);
    Char1.setVisible(true);
    Char2.setVisible(true);
    Char3.setVisible(true);
    Char4.setVisible(true);
    Char5.setVisible(false);
    Char6.setVisible(false);
    Char7.setVisible(false);
    Char8.setVisible(false);
    Char9.setVisible(false);
    }
     
    if (length == 6){
    Char0.setVisible(true);
    Char1.setVisible(true);
    Char2.setVisible(true);
    Char3.setVisible(true);
    Char4.setVisible(true);
    Char5.setVisible(true);
    Char6.setVisible(false);
    Char7.setVisible(false);
    Char8.setVisible(false);
    Char9.setVisible(false);
    }
    
    if (length == 7){
    Char0.setVisible(true);
    Char1.setVisible(true);
    Char2.setVisible(true);
    Char3.setVisible(true);
    Char4.setVisible(true);
    Char5.setVisible(true);
    Char6.setVisible(true);
    Char7.setVisible(false);
    Char8.setVisible(false);
    Char9.setVisible(false);
    }
    
    if (length == 8){
    Char0.setVisible(true);
    Char1.setVisible(true);
    Char2.setVisible(true);
    Char3.setVisible(true);
    Char4.setVisible(true);
    Char5.setVisible(true);
    Char6.setVisible(true);
    Char7.setVisible(true);
    Char8.setVisible(false);
    Char9.setVisible(false);
    }
    
    if (length == 9){
    Char0.setVisible(true);
    Char1.setVisible(true);
    Char2.setVisible(true);
    Char3.setVisible(true);
    Char4.setVisible(true);
    Char5.setVisible(true);
    Char6.setVisible(true);
    Char7.setVisible(true);
    Char8.setVisible(true);
    Char9.setVisible(false);
    }
    
    if (length == 10){
    Char0.setVisible(true);
    Char1.setVisible(true);
    Char2.setVisible(true);
    Char3.setVisible(true);
    Char4.setVisible(true);
    Char5.setVisible(true);
    Char6.setVisible(true);
    Char7.setVisible(true);
    Char8.setVisible(true);
    Char9.setVisible(true);
    }
    
    
    if (charPos == 0){
        Char0.setText(letter);
        correct++;
    }
    
    if (charPos == 1){
        Char1.setText(letter);
        correct++;
    }
    if (charPos == 2){
        Char2.setText(letter);
        correct++;
    }
    
    if (charPos == 3){
        Char3.setText(letter);
        correct++;
    }
    
    if (charPos == 4){
        Char4.setText(letter);
        correct++;
    }
   
    if (charPos == 5){
        Char5.setText(letter);
        correct++;
    }
    
    if (charPos == 6){
        Char6.setText(letter);
        correct++;
    }
    
    if (charPos == 7){
        Char7.setText(letter);
        correct++;
    }
    
    if (charPos == 8){
        Char8.setText(letter);
        correct++;
    }
   
    if (charPos == 9){
        Char9.setText(letter);
        correct++;
    }
   
   
      if (charPos == -1){
        incorrect++;
    inCorrect.setText(Integer.toString(incorrect));
    }
    charPos = Findwords.indexOf(letter, charPos +1);
    
    if (charPos == 1){
        Char1.setText(letter); 
        correct++;
    }
    if (charPos == 2){
        Char2.setText(letter);
        correct++;
    }
    if (charPos == 0)
    {
        Char0.setText(letter);
        correct++;
    }
    if (charPos == 3){
        Char3.setText(letter);
        correct++;
    }
    if (charPos == 4){
        Char4.setText(letter);
        correct++;
    }
    if (charPos == 5){
        Char5.setText(letter);
        correct++;
    }
    if (charPos == 6){
        Char6.setText(letter);
        correct++;
    }
    
    if (charPos == 7){
        Char7.setText(letter);
        correct++;
    }
    
    if (charPos == 8){
        Char8.setText(letter);
        correct++;
    }
   
    if (charPos == 9){
        Char9.setText(letter);
        correct++;
    }
  
    if (correct == Findwords.length()){
        MyMessage.setText("Game Won!");
    }
    else{
    imagedisplayActionPerformed(evt);
    }
    
    }//GEN-LAST:event_tryLetterActionPerformed

    private void imagedisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagedisplayActionPerformed
    
        if (incorrect == 1){
        imagedisplay.setIcon(new javax.swing.ImageIcon("n1.png"));  
     }
          if (incorrect == 2){
        imagedisplay.setIcon(new javax.swing.ImageIcon("n2.png"));  
     }
          if (incorrect == 3){
        imagedisplay.setIcon(new javax.swing.ImageIcon("n3.png"));  
     }
          if (incorrect == 4){
        imagedisplay.setIcon(new javax.swing.ImageIcon("n4.png"));  
     }
          if (incorrect == 5){
        imagedisplay.setIcon(new javax.swing.ImageIcon("n5.png"));  
          }
          if (incorrect == 6){
        imagedisplay.setIcon(new javax.swing.ImageIcon("n6.png"));  
     }
          if (incorrect == 7){
        imagedisplay.setIcon(new javax.swing.ImageIcon("n7.png"));  
     }
          if (incorrect == 8){
        imagedisplay.setIcon(new javax.swing.ImageIcon("n8.png"));  
     }
          if (incorrect == 9){
        imagedisplay.setIcon(new javax.swing.ImageIcon("n9.png"));  
     }
          if (incorrect == 10){
        imagedisplay.setIcon(new javax.swing.ImageIcon("n10.png")); 
          }
          if (incorrect == 11){
        imagedisplay.setIcon(new javax.swing.ImageIcon("n11.png"));  
     }
     if (incorrect >= 11){
     MyMessage.setText("Game Over!");
     }
    }//GEN-LAST:event_imagedisplayActionPerformed

    private void QuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuitActionPerformed
    this.dispose();
       System.exit(0);
    }//GEN-LAST:event_QuitActionPerformed

    private void RestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartActionPerformed
   
            
    
    
    }//GEN-LAST:event_RestartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuessWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuessWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuessWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuessWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuessWord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Char0;
    private javax.swing.JLabel Char1;
    private javax.swing.JLabel Char2;
    private javax.swing.JLabel Char3;
    private javax.swing.JLabel Char4;
    private javax.swing.JLabel Char5;
    private javax.swing.JLabel Char6;
    private javax.swing.JLabel Char7;
    private javax.swing.JLabel Char8;
    private javax.swing.JLabel Char9;
    private javax.swing.JLabel MyMessage;
    private javax.swing.JButton Quit;
    private javax.swing.JButton Restart;
    private javax.swing.JTextField aLetter;
    private javax.swing.JButton imagedisplay;
    private javax.swing.JLabel inCorrect;
    private javax.swing.JButton tryLetter;
    // End of variables declaration//GEN-END:variables
}
