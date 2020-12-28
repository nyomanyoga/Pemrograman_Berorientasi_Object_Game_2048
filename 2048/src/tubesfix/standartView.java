package tubesfix;
import controller.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class standartView extends javax.swing.JFrame{
    private JButton[] board;
    int UP;
    game control;
    
    public standartView() {
        control = new standartGame();   
        initComponents();
        arena();
        control.setScore(0);
        control.random();
        refresh();
    }
    
    public void arena(){
        board = new javax.swing.JButton[16];
        for(int i = 0; i < 16; i++) {
            board[i] = new JButton();
            board[i].setFont(new java.awt.Font("Gill Sans MT", 1, 30));
            board[i].addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    if(evt.getKeyCode() == KeyEvent.VK_UP){
                        control.play(1);
                        if(!control.isOver()) {
                            refresh();
                        }
                        else{
                            gameOver();
                        }
                    }
                    else if(evt.getKeyCode() == KeyEvent.VK_DOWN){
                        control.play(2);
                        if(!control.isOver()) {
                            refresh();
                        }
                        else{
                            gameOver();
                        }
                    }
                    else if(evt.getKeyCode() == KeyEvent.VK_LEFT){
                        control.play(3);
                        if(!control.isOver()) {
                            refresh();
                        }
                        else{
                            gameOver();
                        }
                    }
                    else if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
                        control.play(4);
                        if(!control.isOver()) {
                            refresh();
                        }
                        else{
                            gameOver();
                        }
                    }
                }
            });
            papan.add(board[i]);
	}
    }
    
    public void refresh(){
        int[][] pan = control.getPan();
        for (int i = 0; i < 16; i++) {           
            if(pan[i/4][i%4] == 0){
                board[i].setText("");
            }
            else{
                int value = pan[i/4][i%4];
                board[i].setText(Integer.toString(value));
           }
        }
        for (int i = 0; i < 16; i++) {
            if(pan[i/4][i%4] == 2){
                board[i].setBackground(new java.awt.Color(255, 255, 255));
            }else if (pan[i/4][i%4] == 4){
                board[i].setBackground(new java.awt.Color(204,255,255));
            }else if (pan[i/4][i%4] == 8){
                board[i].setBackground(new java.awt.Color(255,204,204));
            }else if (pan[i/4][i%4] == 16){
                board[i].setBackground(new java.awt.Color(255,204,153));
            }else if (pan[i/4][i%4] == 32){
                board[i].setBackground(new java.awt.Color(255,204,0));
            }else if (pan[i/4][i%4] == 64){
                board[i].setBackground(new java.awt.Color(204,255,0));
            }else if (pan[i/4][i%4] == 128){
                board[i].setBackground(new java.awt.Color(153,255,0));
            }else if (pan[i/4][i%4] == 256){
                board[i].setBackground(new java.awt.Color(255,51,51));
            }else if (pan[i/4][i%4] == 512){
                board[i].setBackground(new java.awt.Color(0,204,153));
            }else if(pan[i/4][i%4] == 1024){
                board[i].setBackground(new java.awt.Color(102,255,153));
            }else if(pan[i/4][i%4] == 2048){
                board[i].setBackground(new java.awt.Color(153,255,153));
            }else if (pan[i/4][i%4] == 4096){
                board[i].setBackground(new java.awt.Color(204,255,204));
            }else if (pan[i/4][i%4] == 8192){
                board[i].setBackground(new java.awt.Color(204,204,255));
            }else if (pan[i/4][i%4] == 16384){
                board[i].setBackground(new java.awt.Color(255,255,204));
            }
        }
        for (int i = 0; i < 16; i++) {           
            if(pan[i/4][i%4] == 0){
                board[i].setBackground(new java.awt.Color(240,240,240));
            }
        }
        score.setText(Integer.toString(control.getScore()));
    }
    
    public void gameOver() {
        board[0].setText("");
	board[1].setText("");
	board[2].setText("");
	board[3].setText("");
	board[4].setText("G");
	board[5].setText("A");
	board[6].setText("M");
	board[7].setText("E");
	board[8].setText("O");
	board[9].setText("V");
	board[10].setText("E");
	board[11].setText("R");
	board[12].setText("");
	board[13].setText("");
	board[14].setText("");
	board[15].setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judul = new javax.swing.JPanel();
        judulLabel = new javax.swing.JLabel();
        papan = new javax.swing.JPanel();
        arah = new javax.swing.JPanel();
        up = new javax.swing.JButton();
        down = new javax.swing.JButton();
        left = new javax.swing.JButton();
        right = new javax.swing.JButton();
        petunjuk = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        save = new javax.swing.JButton();
        scoreLabel = new javax.swing.JLabel();
        score = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GAME 2048");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        judul.setBackground(new java.awt.Color(102, 153, 0));
        judul.setPreferredSize(new java.awt.Dimension(850, 105));

        judulLabel.setFont(new java.awt.Font("Gill Sans MT", 1, 60)); // NOI18N
        judulLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulLabel.setText("STANDART 2048");

        javax.swing.GroupLayout judulLayout = new javax.swing.GroupLayout(judul);
        judul.setLayout(judulLayout);
        judulLayout.setHorizontalGroup(
            judulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(judulLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        judulLayout.setVerticalGroup(
            judulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(judulLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
        );

        papan.setPreferredSize(new java.awt.Dimension(600, 600));
        papan.setLayout(new java.awt.GridLayout(4, 4));

        arah.setLayout(new java.awt.GridLayout(2, 2));

        up.setBackground(new java.awt.Color(255, 255, 51));
        up.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        up.setText("UP");
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        up.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                upKeyPressed(evt);
            }
        });
        arah.add(up);

        down.setBackground(new java.awt.Color(255, 255, 51));
        down.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        down.setText("DOWN");
        down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downActionPerformed(evt);
            }
        });
        arah.add(down);

        left.setBackground(new java.awt.Color(255, 255, 51));
        left.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        left.setText("LEFT");
        left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftActionPerformed(evt);
            }
        });
        arah.add(left);

        right.setBackground(new java.awt.Color(255, 255, 51));
        right.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        right.setText("RIGHT");
        right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightActionPerformed(evt);
            }
        });
        arah.add(right);

        petunjuk.setBackground(new java.awt.Color(0, 51, 51));

        backButton.setBackground(new java.awt.Color(0, 153, 204));
        backButton.setFont(new java.awt.Font("Gill Sans MT", 0, 30)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Gill Sans MT", 0, 30)); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        save.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                saveKeyPressed(evt);
            }
        });

        scoreLabel.setFont(new java.awt.Font("Gill Sans MT", 0, 45)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel.setText("SCORE");

        score.setFont(new java.awt.Font("Gill Sans MT", 0, 45)); // NOI18N
        score.setForeground(new java.awt.Color(255, 255, 255));
        score.setText("0");

        javax.swing.GroupLayout petunjukLayout = new javax.swing.GroupLayout(petunjuk);
        petunjuk.setLayout(petunjukLayout);
        petunjukLayout.setHorizontalGroup(
            petunjukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
            .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(score, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        petunjukLayout.setVerticalGroup(
            petunjukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(petunjukLayout.createSequentialGroup()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(score, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(papan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(petunjuk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(arah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(judul, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(papan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(petunjuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void downActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downActionPerformed
        control.play(2);
        if(!control.isOver()) {
            refresh();
        }
        else{
            gameOver();
        }
    }//GEN-LAST:event_downActionPerformed

    private void leftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftActionPerformed
        control.play(3);
        if(!control.isOver()) {
            refresh();
        }
        else{
            gameOver();
        }
    }//GEN-LAST:event_leftActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        stateView state = new stateView();
        state.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        saveScore sa = new saveScore();
        sa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_saveActionPerformed

    private void rightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightActionPerformed
        control.play(4);
        if(!control.isOver()) {
            refresh();
        }
        else{
            gameOver();
        }
    }//GEN-LAST:event_rightActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        control.play(1);
        if(!control.isOver()) {
            refresh();
        }
        else{
            gameOver();
        }
    }//GEN-LAST:event_upActionPerformed

    private void upKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upKeyPressed
        
    }//GEN-LAST:event_upKeyPressed

    private void saveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saveKeyPressed
       
    }//GEN-LAST:event_saveKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
    }//GEN-LAST:event_formKeyPressed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(standartView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(standartView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(standartView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(standartView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new standartView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel arah;
    private javax.swing.JButton backButton;
    private javax.swing.JButton down;
    private javax.swing.JPanel judul;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JButton left;
    private javax.swing.JPanel papan;
    private javax.swing.JPanel petunjuk;
    private javax.swing.JButton right;
    private javax.swing.JButton save;
    private javax.swing.JLabel score;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JButton up;
    // End of variables declaration//GEN-END:variables

}
