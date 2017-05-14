package word.in.news;

import java.awt.GridLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainView extends javax.swing.JFrame {

    public MainView() {
        initComponents();
        PictureBox pictureBox = null;
        try {
            pictureBox = new PictureBox(pictureBoxPanel);
        } catch (IOException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pictureBox.setNews(WordInNews.getNews(WordInNews.getPage("https://www.tasnimnews.com/fa/rss/feed/8/163/0/عکس")));
        } catch (IOException ex) { Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);}
        pictureBox.start();

        GridLayout layout = new GridLayout(3, 3);
        subjectPanel.setLayout(layout);
        /*
        try {
            subjectBox sport = new subjectBox(subjectPanel, "ورزشی");
            sport.setNews(WordInNews.getNews(WordInNews.getPage("http://www.varzesh3.com/rss/all")));
            sport.start();
            
        } catch (IOException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        for (int i = 0; i < 5; i++){
            try {
            subjectBox sport = new subjectBox(subjectPanel, "ورزشی");
            sport.setNews(WordInNews.getNews(WordInNews.getPage("https://www.tasnimnews.com/fa/rss/feed/8/163/0/عکس")));
            sport.start();
            
            } catch (IOException ex) {
                Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pictureBoxPanel = new javax.swing.JPanel();
        subjectPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pictureBoxPanel.setPreferredSize(new java.awt.Dimension(300, 150));

        javax.swing.GroupLayout pictureBoxPanelLayout = new javax.swing.GroupLayout(pictureBoxPanel);
        pictureBoxPanel.setLayout(pictureBoxPanelLayout);
        pictureBoxPanelLayout.setHorizontalGroup(
            pictureBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );
        pictureBoxPanelLayout.setVerticalGroup(
            pictureBoxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout subjectPanelLayout = new javax.swing.GroupLayout(subjectPanel);
        subjectPanel.setLayout(subjectPanelLayout);
        subjectPanelLayout.setHorizontalGroup(
            subjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        subjectPanelLayout.setVerticalGroup(
            subjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subjectPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pictureBoxPanel, 288, 288, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pictureBoxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(subjectPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pictureBoxPanel;
    private javax.swing.JPanel subjectPanel;
    // End of variables declaration//GEN-END:variables
}
