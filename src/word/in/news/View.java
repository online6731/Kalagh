package word.in.news;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class View extends javax.swing.JFrame {

    public View() {
        initComponents();
        sportButton.addActionListener((ActionEvent e) -> {
            show("http://www.varzesh3.com/rss/all");
        });
        politicButton.addActionListener((ActionEvent e) -> {
            show("http://namehnews.ir/fa/rss/2");
        });
        econemyButton.addActionListener((ActionEvent e) -> {
            show("http://namehnews.ir/fa/rss/3");
        });
        technologyButton.addActionListener((ActionEvent e) -> {
            show("http://namehnews.ir/fa/rss/3");
        });
        photoButton.addActionListener((ActionEvent e) -> {
            show("https://www.tasnimnews.com/fa/rss/feed/8/163/0/عکس");
        });
        musicButton.addActionListener((ActionEvent e) -> {
            show("http://musiceiranian.ir/feed");
        });
    }
    void show (String url){
        String data = "";
        try {
            data = WordInNews.getPage(url);
        } catch (IOException ex) { Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex); }

        System.out.println(data);

        ArrayList<news> allNews = WordInNews.getNews(data);

        DefaultListModel listModel = new DefaultListModel();
        for (news i : allNews) {
            listModel.addElement(i.title);
        }

        newsList.addMouseListener(new MouseAdapter() {
            JFrame jFramel;
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int selected = newsList.getSelectedIndex();
                    try {
                        java.awt.Desktop.getDesktop().browse(new URI(allNews.get(selected).link));
                    } catch (URISyntaxException | IOException ex) {
                        Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                int selected = newsList.getSelectedIndex();
                try {
                    if (allNews.get(selected).image != null){
                        jFramel = new JFrame();
                        jFramel.setVisible(true);
                        jFramel.add(new JLabel(new ImageIcon(allNews.get(selected).image)));
                        jFramel.setBounds(500, 0, new ImageIcon(allNews.get(selected).image).getIconWidth(), new ImageIcon(allNews.get(selected).image).getIconHeight());
                        jFramel.setVisible(true);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            @Override
            public void mouseExited(MouseEvent e) {
                jFramel.setVisible(false);
            }
        });
        newsList.setModel(listModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        newsList = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        politicButton = new javax.swing.JButton();
        econemyButton = new javax.swing.JButton();
        technologyButton = new javax.swing.JButton();
        sportButton = new javax.swing.JButton();
        photoButton = new javax.swing.JButton();
        musicButton = new javax.swing.JButton();
        photoButton1 = new javax.swing.JButton();
        technologyButton3 = new javax.swing.JButton();
        technologyButton1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setViewportView(newsList);

        politicButton.setText("politic");
        politicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                politicButtonActionPerformed(evt);
            }
        });

        econemyButton.setText("econemy");

        technologyButton.setText("technology");

        sportButton.setText("sport");
        sportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportButtonActionPerformed(evt);
            }
        });

        photoButton.setText("photo");

        musicButton.setText("music");
        musicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicButtonActionPerformed(evt);
            }
        });

        photoButton1.setText("photo");

        technologyButton3.setText("technology");

        technologyButton1.setText("technology");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sportButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(politicButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(econemyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(technologyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(photoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(musicButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(technologyButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(photoButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(technologyButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(technologyButton1)
                        .addComponent(photoButton1)
                        .addComponent(technologyButton3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sportButton)
                        .addComponent(politicButton)
                        .addComponent(econemyButton)
                        .addComponent(technologyButton)
                        .addComponent(photoButton)
                        .addComponent(musicButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportButtonActionPerformed
        
        
      
    }//GEN-LAST:event_sportButtonActionPerformed

    private void politicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_politicButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_politicButtonActionPerformed

    private void musicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musicButtonActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton econemyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton musicButton;
    private javax.swing.JList<String> newsList;
    private javax.swing.JButton photoButton;
    private javax.swing.JButton photoButton1;
    private javax.swing.JButton politicButton;
    private javax.swing.JButton sportButton;
    private javax.swing.JButton technologyButton;
    private javax.swing.JButton technologyButton1;
    private javax.swing.JButton technologyButton3;
    // End of variables declaration//GEN-END:variables
}
