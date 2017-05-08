package word.in.news;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


class PictureBox extends Thread{
    JPanel panel;
    ArrayList<news> news = new ArrayList<>();
    boolean isRunning;
    int frontNewsNumber = 0;
    JLabel frontNewsLabel;
    
    PictureBox(JPanel panel) {
        this.panel = panel;
        isRunning = false;
        JLabel defaultNews = new JLabel(new ImageIcon("‪C:\\Users\\Me\\Desktop\\u1.png"));
        frontNewsLabel = defaultNews;
        panel.add(defaultNews);
        defaultNews.setBounds(0, 0, panel.getWidth(), panel.getHeight());
        defaultNews.setVisible(true);
    }
    
    public void setNews(ArrayList<news> news){
        this.news = news;
        isRunning = true;
    }
    
    @Override
    public void run(){
        while (isRunning){
            try { 
                sleep(7000); 
            } catch (InterruptedException ex) { Logger.getLogger(PictureBox.class.getName()).log(Level.SEVERE, null, ex); }
            
            JLabel nextNews = new JLabel(new ImageIcon(news.get(frontNewsNumber).image));
            panel.add(nextNews);
            nextNews.setBounds(0, 0, panel.getWidth(), panel.getHeight());
            nextNews.setVisible(true);
            panel.remove(frontNewsLabel);
            frontNewsLabel.removeAll();
            frontNewsLabel = nextNews;
        }
    }
}